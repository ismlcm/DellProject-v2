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
public interface UserInterface
{
    
    void createUser();
    
    void deleteUser();
    
    void updateUser();
    
    User getUser();
    
    void changeUserPassword();
    
    void updateUserStatus();
    
}
