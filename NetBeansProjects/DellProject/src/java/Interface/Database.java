/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entity.User;

/**
 *
 * @author Ismail Cam
 */
public interface Database
{
    
    void createDatabase();
    
    void deleteDatabase();
    
    void updateDatabase();
    
    void getDatabaseName();
    
    void connect();
    
    //***********************************//
    
    void creatTabel();
    
    void deleteTabel();
    
    void updateTabel();
    
    void orderTabel();
    
    void getColumn();
    
    void getRow();
    
    void getCount();
    
    void getSum();
    
    void insertToTabel(String tabelname);
    
}
