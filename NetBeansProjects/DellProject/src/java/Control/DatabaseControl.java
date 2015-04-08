/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import static Control.DBConnectorNew.JDBC_DRIVER;
import Entity.User;
import Interface.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ismail Cam
 */
public class DatabaseControl implements Database
{

    public static void main( String[] args )
    {
        DatabaseControl d = new DatabaseControl();

        d.connect();
        d.insertToTabel("users");
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
    public void insertToTabel(String tabelname)
    {

        //STEP 4: Execute a query
        System.out.println( "Inserting records into the table..." );
        try
        {
            stmt = conn.createStatement();

            String sql = "INSERT INTO cphfp59." + tabelname + " "
                    + "VALUES (5, 123456789, 'password', 'status', 'usertype')";
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
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
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

}
