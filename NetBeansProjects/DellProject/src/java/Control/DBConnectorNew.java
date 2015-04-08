package Control;

// STEP 1. Import required packages
import java.sql.*;

public class DBConnectorNew {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER      = "oracle.jdbc.driver.OracleDriver";  
   static final String DB_URL           = "jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat";

   // Database credentials
   static final String USER             = "cphfp59";
   static final String PASS             = "cphfp59";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName(JDBC_DRIVER);

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      
      String sql = "INSERT INTO cphfp59.Users " +
                   "VALUES (1, 12345678, 'password', 'status', 'usertype')";
      stmt.executeUpdate(sql);
//      sql = "INSERT INTO cphfp59.Items " +
//                   "VALUES (101, 2, 'Fatma', 25.50)";
//      stmt.executeUpdate(sql);
//      sql = "INSERT INTO cphfp59.Items " +
//                   "VALUES (102, 3, 'Khan', 30.50)";
//      stmt.executeUpdate(sql);
//      sql = "INSERT INTO cphfp59.Items " +
//                   "VALUES(103, 4, 'Mittal', 28.50)";
//      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");

   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end JDBCExample