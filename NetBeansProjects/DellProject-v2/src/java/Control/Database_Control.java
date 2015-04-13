/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Interface.Database_Interface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ismail Cam
 */
public class Database_Control implements Database_Interface
{
    
    public static void main( String[] args )
    {
        Database_Interface db = new Database_Control();
        
        db.open_connection();
        db.close_connection();
    }

    /**
     * **************************************************************
     * CONNECTION INFORMATION
     ****************************************************************
     */
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String URL = "jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat";

    // DatabaseInterface user details
    static final String USERNAME = "cphic34";
    static final String PASSWORD = "cphic34";

    /**
     * **************************************************************
     * START
     ****************************************************************
     */
    static Connection CONNECTION = null;
    static Statement STATEMENT = null;

    /**
     * **************************************************************
     * OPEN CONNECTION
     ****************************************************************
     */
    @Override
    public void open_connection()
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

    @Override
    public void close_connection()
    {
        try
        {
            if ( STATEMENT != null || CONNECTION != null )
            {
                CONNECTION.close();
            }
        }
        catch (Exception se)
        {
            se.printStackTrace();
        }
    }

    @Override
    public void getCompanies()
    {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
