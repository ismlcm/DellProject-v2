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
import Interface.Database;
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
public class DatabaseControl implements Database
{

    public static void main( String[] args ) throws SQLException
    {

        
        DatabaseControl d = new DatabaseControl();

        d.connect();

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
        
        System.out.println( "::::::::::::::::::::::::::::::::::::" );
        
        //System.out.println( ProjectControl.projects.size() );
        
        HashMap<String, ArrayList<String>> map = d.getFromTable( "PROJECTS", "STATUS", "new");
        
        System.out.println( map.get( "USERNAME" ).get( 0 ) );
        
        //d.setFromTable( 8, ProjectControl.projects);
        
       // System.out.println( ProjectControl.projects.size() );
        
        //System.out.println( ProjectControl.projects.size() );
    }

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String DB_URL = "jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat";

    //  Database credentials
    static final String USER = "cphfp59";
    static final String PASS = "cphfp59";

    static Connection conn = null;
    static Statement stmt = null;

    @Override
    public void connect()
    {
        try
        {
            //STEP 2: Register JDBC driver
            Class.forName( JDBC_DRIVER );

            //STEP 3: Open a connection
            System.out.println( "Connecting to a selected database..." );
            conn = DriverManager.getConnection( DB_URL, USER, PASS );
            System.out.println( "Connected database successfully..." );
        }
        catch (SQLException se)
        {
            //Handle errors for JDBC
            se.printStackTrace();
        }
        catch (Exception e)
        {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }

    @Override
    public void insertToTabel( String tabelname, ArrayList<String> list )
    {

        String str = "";
        String str2 = "";

        for ( int i = 0; i < list.size(); i++ )
        {
            if ( i == (list.size() - 1) )
            {
                str = "'" + list.get( i ) + "'";
                str2 += str;
            }
            else
            {
                str = "'" + list.get( i ) + "', ";
                str2 += str;
            }

        }

        String str3 = "VALUES (" + str2 + ")";

        //STEP 4: Execute a query
        System.out.println( "Inserting records into the table..." );
        try
        {
            stmt = conn.createStatement();

            String sql = "INSERT INTO cphfp59." + tabelname + " "
                    + str3;
            stmt.executeUpdate( sql );

            System.out.println( "Inserted records into the table..." );
        }
        catch (SQLException ex)
        {
            Logger.getLogger( DatabaseControl.class.getName() ).log( Level.SEVERE, null, ex );
        }
        finally
        {
            //finally block used to close resources
            try
            {
                if ( stmt != null )
                {
                    conn.close();
                }
            }
            catch (SQLException se)
            {
            }// do nothing
            try
            {
                if ( conn != null )
                {
                    conn.close();
                }
            }
            catch (SQLException se)
            {
                se.printStackTrace();
            }//end finally try
        }//end try
    }

    @Override
    public void createDatabase()
    {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteDatabase()
    {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateDatabase()
    {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getDatabaseName()
    {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void creatTabel()
    {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteTabel()
    {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateTabel()
    {

        try
        {
            stmt = conn.createStatement();

            String sql = "UPDATE CPHFP59.USERS" + "\n"
                    + "SET password = 'cam'" + "\n"
                    + "WHERE id = '4'";

            stmt.executeUpdate( sql );
        }

        catch (SQLException ex)
        {
            Logger.getLogger( DatabaseControl.class.getName() ).log( Level.SEVERE, null, ex );
        }
        finally
        {
            //finally block used to close resources
            try
            {
                if ( stmt != null )
                {
                    conn.close();
                }
            }
            catch (SQLException se)
            {
            }// do nothing
            try
            {
                if ( conn != null )
                {
                    conn.close();
                }
            }
            catch (SQLException se)
            {
                se.printStackTrace();
            }//end finally try
        }//end try
    }

    @Override
    public void orderTabel()
    {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getColumn()
    {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getRow()
    {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getCount()
    {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getSum()
    {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

//    public void getFromTable(String table, String colName, String select)
//    {
//        try
//        {
//            String query = "SELECT * FROM "+ table +" WHERE "+ colName +" = '"+ select +"'";
//            stmt = conn.createStatement();
//
//            ResultSet rs = stmt.executeQuery( query );
//            ResultSetMetaData rsmd = rs.getMetaData();
//
//            int numberOfColumns = rsmd.getColumnCount();
//
//            // Print Content
//            while ( rs.next() )
//            {
//                    
//                    int id              = Integer.parseInt( rs.getString( 1 ) );
//                    int cvr             = Integer.parseInt( rs.getString( 2 ) );
//                    String title        =                   rs.getString( 3 );
//                    String desc         =                   rs.getString( 4 );
//                    int cost            = Integer.parseInt( rs.getString( 5 ) );
//                    String startdate    =                   rs.getString( 6 );
//                    String enddate      =                   rs.getString( 7 );
//                    String status       =                   rs.getString( 8 );
//                    
//                    
//                    Project p = new Project(id  , cvr, title, cost, desc, startdate, enddate, status );
//                    
//                    ProjectControl.projects.put( id, p);
//
//            }
//
//        }
//
//        catch (SQLException ex)
//        {
//            Logger.getLogger( DatabaseControl.class.getName() ).log( Level.SEVERE, null, ex );
//        }
//        finally
//        {
//            //finally block used to close resources
//            try
//            {
//                if ( stmt != null )
//                {
//                    conn.close();
//                }
//            }
//            catch (SQLException se)
//            {
//            }// do nothing
//            try
//            {
//                if ( conn != null )
//                {
//                    conn.close();
//                }
//            }
//            catch (SQLException se)
//            {
//                se.printStackTrace();
//            }//end finally try
//        }//end try
//    }
//    public ArrayList<Object> getFromTable( String table, String colName, String select )
//    {
//        ArrayList<String> list = new ArrayList();
//        
//        try
//        {
//            String query = "SELECT * FROM " + table + " WHERE " + colName + " = '" + select + "'";
//            stmt = conn.createStatement();
//
//            ResultSet rs = stmt.executeQuery( query );
//            ResultSetMetaData rsmd = rs.getMetaData();
//
//            int numberOfColumns = rsmd.getColumnCount();
//
//            // Print Content
//            while ( rs.next() )
//            {
//
//                for ( int i = 1; i <= numberOfColumns; i++ )
//                {
//                    
//                    list.add( rs.getString( i ) );
//                }
//            }
//
//            list.add( Integer.toString( numberOfColumns ) );
//
//        }
//
//        catch (SQLException ex)
//        {
//            Logger.getLogger( DatabaseControl.class.getName() ).log( Level.SEVERE, null, ex );
//        }
//        finally
//        {
//            //finally block used to close resources
//            try
//            {
//                if ( stmt != null )
//                {
//                    conn.close();
//                }
//            }
//            catch (SQLException se)
//            {
//            }// do nothing
//            try
//            {
//                if ( conn != null )
//                {
//                    conn.close();
//                }
//            }
//            catch (SQLException se)
//            {
//                se.printStackTrace();
//            }//end finally try
//        }//end try
//
//        return list;
//    }
    
//    public void setFromTable(int col, HashMap map)
//    {
//        ArrayList<String> a = getFromTable( "PROJECTS", "STATUS", "new" );
//        int listSize = a.size() - 1;
//        int innerlistSize = listSize / col;
//        
//        String[] ar = new String[col];
//        
//        Project p = null;
//        
//        for ( int i = 0; i <= innerlistSize; i++ )
//        {
//            for ( int j = 0; j <= 8; j++ )
//            {
//                
//                ar[i] = a.get( j );
//
//            }
//            
//            p = new Project(Integer.parseInt( ar[0] ), 
//                                Integer.parseInt( ar[1] ), 
//                                ar[2], 
//                                ar[3], 
//                                Integer.parseInt( ar[4] ), 
//                                ar[5], 
//                                ar[6], 
//                                ar[7]);
//            map.put( Integer.parseInt( ar[0] ), p);   
//        }
//    }
    
  public HashMap getFromTable( String table, String colName, String select )
    {
        ArrayList<String> list = new ArrayList();
        
        try
        {
            String query = "SELECT * FROM " + table + " WHERE " + colName + " = '" + select + "'";
            stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery( query );
            ResultSetMetaData rsmd = rs.getMetaData();

            int numberOfColumns = rsmd.getColumnCount();

            // Print Content
//            while ( rs.next() )
//            {
//
//                for ( int i = 1; i <= numberOfColumns; i++ )
//                {
//                    
//                    list.add( rs.getString( i ) );
//                }
//            }
//
//            list.add( Integer.toString( numberOfColumns ) );

            return resultSetToArrayList( rs );

        }

        catch (SQLException ex)
        {
            Logger.getLogger( DatabaseControl.class.getName() ).log( Level.SEVERE, null, ex );
        }
        finally
        {
            //finally block used to close resources
            try
            {
                if ( stmt != null )
                {
                    conn.close();
                }
            }
            catch (SQLException se)
            {
            }// do nothing
            try
            {
                if ( conn != null )
                {
                    conn.close();
                }
            }
            catch (SQLException se)
            {
                se.printStackTrace();
            }//end finally try
        }//end try
        
        return null;
        
    }
  
private HashMap<String, ArrayList<String>> resultSetToArrayList(ResultSet rs) throws SQLException {
    ResultSetMetaData md = rs.getMetaData();
    int columns = md.getColumnCount();
    HashMap<String, ArrayList<String>> map = new HashMap();
    for (int i = 1; i <= columns; ++i) {
        map.put(md.getColumnName(i), new ArrayList());
    }
    while (rs.next()) {
        for (int i = 1; i <= columns; ++i) {
            map.get(md.getColumnName(i)).add(rs.getString(i));
        }
    }

    return map;
}

}
