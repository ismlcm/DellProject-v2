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
public interface DatabaseInterface
{
    
//    void createDatabase();
//    
//    void deleteDatabase();
//    
//    void updateDatabase();
//    
//    void getDatabaseName();
    
    void connect();
    
    //***********************************//
    
//    void creatTabel();
//    
//    void deleteTabel();
    
    /*
    * @param table
     * @param primaryKey
     * @param columnName
     * @param newValue
    */
    void updateValue(String table, String primaryKey, String columnName, String newValue);
    
//    void orderTabel();
//    
//    void getColumn();
//    
//    void getRow();
//    
//    void getCount();
//    
//    void getSum();
    
    void insertValue(String tabel, ArrayList<String> list);
    
    HashMap getFromTable( String table, String colName, String value );
    
}
