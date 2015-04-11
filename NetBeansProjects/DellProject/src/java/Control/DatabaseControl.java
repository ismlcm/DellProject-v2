/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import static Control.DBConnectorNew.JDBC_DRIVER;
import Entity.Project.Project;
import Entity.User;
import Entity.UserType.Partner;
import Interface.DatabaseInterface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ismail Cam
 */
public class DatabaseControl implements DatabaseInterface
{

    public static void main( String[] args ) throws SQLException
    {

        DatabaseControl d = new DatabaseControl();

        d.connect();
        
        d.updateValue("USERS", "1000", "usertype", "ismail");
        
//        ArrayList<String> list = new ArrayList();
//        
//        list.add( "1009" );
//        list.add( "password" );
//        list.add( "new" );
//        list.add( "type" );
//        
//        d.insertToTabel( "USERS", list);

//        ArrayList<String> list = new ArrayList();
//        
//        list.add( "2" );
//        list.add( "2");
//        list.add( "title" );
//        list.add( "descr" );
//        list.add( "100,00" );
//        list.add( "2003-01-30" );
//        list.add( "2003-02-14" );
//        list.add( "status" );
        //System.out.println( str3 );
        // VALUES ('654', '123456789', 'password', 'status', 'usertype')
//        d.insertToTabel("projects", list );
        //d.updateTabel();
        //System.out.println( ProjectControl.projects.size() );
        //ArrayList<String> a = d.getFromTable("Projects", "Status", "new");
        //int i = a.size() - 1; // 16
        //String j = a.get( a.size()-1);
        //int j2 = Integer.parseInt( j );
        /// System.out.println( a.size());
//        for ( String arg : a )
//        {
//            System.out.println( arg );
//        }
//        System.out.println( "::::::::::::::::::::::::::::::::::::" );
//
//        //System.out.println( ProjectControl.projects.size() );
//        HashMap<String, ArrayList<String>> map = d.getFromTable( "PROJECTS", "STATUS", "new" );
//
//        System.out.println( map.get( "USERNAME" ).size() );
        //d.setFromTable( 8, ProjectControl.projects);
        // System.out.println( ProjectControl.projects.size() );
        //System.out.println( ProjectControl.projects.size() );
    }


    
    /****************************************************************
    *   CONNECTION INFORMATION
    *****************************************************************/
    // JDBC driver name and database URL
    static final String JDBC_DRIVER     = "oracle.jdbc.driver.OracleDriver";
    static final String URL             = "jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat";

    // DatabaseInterface user details
    static final String USERNAME        = "cphfp59";
    static final String PASSWORD        = "cphfp59";

    
    
    /****************************************************************
    *   START
    *****************************************************************/
    static Connection CONNECTION        = null;
    static Statement STATEMENT          = null;


    
    /****************************************************************
    *   CONNECTION TO DATABASE
    *****************************************************************/
    @Override
    public void connect()
    {
        try
        {
            // Register JDBC driver
            Class.forName( JDBC_DRIVER );

            // Open connection
            CONNECTION = DriverManager.getConnection( URL, USERNAME, PASSWORD );
            System.out.println( "Connected to " + CONNECTION.getSchema() + " successfully..." );
        }
        catch (SQLException se)
        {
            // Errors for JDBC
            se.printStackTrace();
        }
        catch (Exception e)
        {
            // Errors for Class.forName
            e.printStackTrace();
        }
    }

    
    /****************************************************************
    *   INSERT VALUES TO TABLE
    *****************************************************************/
    @Override
    public void insertValue( String tabel, ArrayList<String> list )
    {
        
        String value        = "";
        String value_list   = "";

        for ( int i = 0; i < list.size(); i++ )
        {
            // Dont set comma to the last value
            if ( i == (list.size() - 1) )
            {
                value       = "'" + list.get( i ) + "'";
                value_list += value;
            }
            else
            {
                value       = "'" + list.get( i ) + "', ";
                value_list += value;
            }
        }

        // SQL Value ready
        String values = "VALUES (" + value_list + ")";

        // Execute command
        try
        {
            // Create statement
            STATEMENT = CONNECTION.createStatement();
            
            // SQL String ready
            String sql = "INSERT INTO cphfp59." + tabel + " " + values;
            
            // Execute SQL
            STATEMENT.executeUpdate( sql );

            // Success message to output
            System.out.println( "Inserted records into the table..." );
        }
        catch (SQLException se)
        {
            se.printStackTrace();
        }
        finally
        {
            // Finally block used to close resources
            try
            {
                if ( STATEMENT != null || CONNECTION != null ) CONNECTION.close();
            }
            
            catch (SQLException se) 
            {
                se.printStackTrace();
            }
        }
    }

    
    /****************************************************************
    *   UPDATE VALUE
    *****************************************************************/
    @Override
    public void updateValue(String table, String primaryKey, String columnName, String newValue)
    {
        
        // Select table
        String query = "SELECT * FROM " + table;

        try
        {
            // Create statement
            STATEMENT = CONNECTION.createStatement();
            
            // Create resultset
            ResultSet rs = STATEMENT.executeQuery(query);
            
            // Get metadata
            ResultSetMetaData rsmd = rs.getMetaData();
            
            // Select first column name
            String primaryColumnName = rsmd.getColumnName(1);

            // SQL ready
            String sql = "UPDATE " + table + "\n" + "SET " + columnName + " = '" + newValue + "'" + "\n" + "WHERE " + primaryColumnName + " = '" + primaryKey + "'";

            // Execute SQL
            STATEMENT.executeUpdate( sql );
        }

        catch (SQLException se)
        {
            se.printStackTrace();
        }
        finally
        {
            // Finally block used to close resources
            try
            {
                if ( STATEMENT != null || CONNECTION != null ) CONNECTION.close();
            }
            
            catch (SQLException se) 
            {
                se.printStackTrace();
            }
        }
    }

    
    /****************************************************************
    *   GET TABLE ROWS WITH SPECIFIC VALUE
    *****************************************************************/
    @Override
    public HashMap getFromTable( String table, String colName, String value )
    {
        // HashMap
        HashMap<String, ArrayList<String>> map = new HashMap();
        
        // SQL ready
        String sql = "SELECT * FROM " + table + " WHERE " + colName + " = '" + value + "'";

        try
        {
            // Create statement
            STATEMENT = CONNECTION.createStatement();

            // Create resultset
            ResultSet rs = STATEMENT.executeQuery( sql );
            
            // Get metadata
            ResultSetMetaData md = rs.getMetaData();
            
            // Get column count
            int columns = md.getColumnCount();

            
            for ( int i = 1; i <= columns; ++i )
            {
                // Put in HashMap & new ArrayList
                map.put( md.getColumnName( i ), new ArrayList() );
            }
            while ( rs.next() )
            {
                for ( int i = 1; i <= columns; ++i )
                {
                    // Get in HashMap & add to ArrayList
                    map.get( md.getColumnName( i ) ).add( rs.getString( i ) );
                }
            }
        }

        catch (SQLException se)
        {
            se.printStackTrace();
        }
        finally
        {
            // Finally block used to close resources
            try
            {
                if ( STATEMENT != null || CONNECTION != null ) CONNECTION.close();
            }
            
            catch (SQLException se) 
            {
                se.printStackTrace();
            }
        }

        return map;
    }

} // Class END
