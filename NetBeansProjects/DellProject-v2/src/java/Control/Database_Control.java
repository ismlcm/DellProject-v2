/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entity.Company;
import Entity.User;
import Interface.Database_Interface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Ismail Cam
 */
public class Database_Control implements Database_Interface {

    public static void main(String[] args) {
        Database_Interface db = new Database_Control();

       // System.out.println(Company_Control.companies.size());

        db.open_connection();

        //db.insertCompaniesFromTableToHashMap("COMPANIES");
       // db.insertUsersToCompanies("USERS");
        //String tablename, String updateCol, String newValue, String idColName, String id 
        db.updateValueInTable("PROJECTS", "TITLE", "faruktest", "PROJECTID", "2");

        db.close_connection();

        //System.out.println(Company_Control.companies.size());

       // System.out.println(Company_Control.companies.get("12345678").getUsers());

    }

    /**
     * **************************************************************
     * CONNECTION INFORMATION
     * ***************************************************************
     */
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String URL = "jdbc:oracle:thin:@datdb.cphbusiness.dk:1521:dat";

    // DatabaseInterface user details
    static final String USERNAME = "cphic34";
    static final String PASSWORD = "cphic34";

    /**
     * **************************************************************
     * START ***************************************************************
     */
    static Connection CONNECTION = null;
    static Statement STATEMENT = null;

    /**
     * **************************************************************
     * OPEN CONNECTION
     * ***************************************************************
     */
    @Override
    public void open_connection() {
        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open connection
            CONNECTION = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected to " + CONNECTION.getSchema() + " successfully...");
        } catch (SQLException se) {
            // Errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Errors for Class.forName
            e.printStackTrace();
        }
    }

    @Override
    public void close_connection() {
        try {
            if (STATEMENT != null || CONNECTION != null) {
                CONNECTION.close();
            }
        } catch (Exception se) {
            se.printStackTrace();
        }
    }

    @Override
    public ArrayList getTable(String tablename) {

        // HashMap
        ArrayList<String> map = new ArrayList();

        // SQL ready
        String sql = "SELECT * FROM " + tablename;

        try {
            // Create statement
            STATEMENT = CONNECTION.createStatement();

            // Create resultset
            ResultSet rs = STATEMENT.executeQuery(sql);

            // Get metadata
            ResultSetMetaData md = rs.getMetaData();

            // Get column count
            int columns = md.getColumnCount();

            while (rs.next()) {
                for (int i = 1; i <= columns; ++i) {
                    // Get in HashMap & add to ArrayList
                    map.add(rs.getString(i));
                }
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }

        return map;
    }

    @Override
    public HashMap getCompaniesWithSpecificValue(String tablename, String colName, String value) {
        // HashMap
        HashMap<String, ArrayList<String>> map = new HashMap();

        // SQL ready
        String sql = "SELECT * FROM " + tablename + " WHERE " + colName + " = '" + value + "'";

        try {
            // Create statement
            STATEMENT = CONNECTION.createStatement();

            // Create resultset
            ResultSet rs = STATEMENT.executeQuery(sql);

            // Get metadata
            ResultSetMetaData md = rs.getMetaData();

            // Get column count
            int columns = md.getColumnCount();

            for (int i = 1; i <= columns; ++i) {
                // Put in HashMap & new ArrayList
                map.put(md.getColumnName(i), new ArrayList());
            }
            while (rs.next()) {
                for (int i = 1; i <= columns; ++i) {
                    // Get in HashMap & add to ArrayList
                    map.get(md.getColumnName(i)).add(rs.getString(i));
                }
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }

        return map;
    }

    @Override
    public void insertCompaniesFromTableToHashMap(String tablename) {
        ArrayList<String> map = getTable(tablename);

        ArrayList<String> com = new ArrayList();

        for (int i = 0; i < map.size(); i++) {

            com.add(map.get(i));

            if (com.size() == 10) {
                Company company = new Company(com.get(0), com.get(1), com.get(2), com.get(3), com.get(4), com.get(5), com.get(6), com.get(7), com.get(8));
                Company_Control.companies.put(com.get(0), company);
                com.clear();
            }

        }
    }

    @Override
    public void insertUsersToCompanies(String tablename) {
        ArrayList<String> map = getTable(tablename);

        ArrayList<String> com = new ArrayList();

        for (int i = 0; i < map.size(); i++) {

            com.add(map.get(i));

            if (com.size() == 8) {
                System.out.println(com.get(0));

                User user = new User(com.get(0), com.get(1), com.get(2), com.get(3), com.get(4), com.get(5), com.get(6), com.get(7));
                Company_Control.companies.get(com.get(7)).getUsers().put(com.get(0), user);
                com.clear();
            }

        }
    }

    @Override
    public boolean updateValueInTable(String tablename, String updateCol, String newValue, String idColName, String id ) {

        String sql = "UPDATE" + tablename + "SET" + updateCol + " = " + newValue + "WHERE" + idColName + " = " + id;

        try 
        {
            // Create statement
            STATEMENT = CONNECTION.createStatement();

            // Execute SQL
            STATEMENT.executeQuery(sql);
            
            return true;
        } 
        catch (SQLException se) 
        {
            se.printStackTrace();
            
            return false;
        }
        
    }
}
