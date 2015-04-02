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
    
    boolean createUser(User user);
    
    boolean deleteUser(String username);
    
    void updateUser();
    
    User getUser();
    
    void changeUserPassword();
    
    void updateUserStatus();
    
}
