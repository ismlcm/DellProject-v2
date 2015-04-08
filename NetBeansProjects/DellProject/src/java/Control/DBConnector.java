package Control;

import java.sql.* ;  // for standard JDBC programs
import java.math.* ; // for BigDecimal and BigInteger support

// Encapsulates code to connect to DB
// Implemented as a Singleton to ensure max one connection
// 2015 hau
public class DBConnector
{
    
    public static void main( String[] args ) throws SQLException
    {        
        getCon();
    }


    private static Connection con = null;
    
    static String username  = "cphfp59";
    static String password  = "cphfp59";
    static String driver    = "oracle.jdbc.driver.OracleDriver";
    static String url       = "jdbc:oracle:thin:@thindatdb.cphbusiness.dk:1521:dat";
    
    
    static
    {
        try
        {
            Class.forName( driver );
            con = DriverManager.getConnection( url, username, password );
        }
        catch (Exception e)
        {
        }
    }
    
    public static Connection getCon()
    {
        return con;
    }
}
