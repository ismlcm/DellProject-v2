/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Ismail Cam
 */
public interface Database_Interface
{

    void open_connection();

    void close_connection();

    ArrayList getTable( String tablename );

    HashMap getCompaniesWithSpecificValue( String tablename, String colName, String value );
    
    void insertCompaniesFromTableToHashMap(String tablename);
    
    void insertUsersToCompanies( String tablename );
    
    boolean updateValueInTable(String tablename, String updateCol, String newValue, String idColName, String id );
}
