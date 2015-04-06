/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entity.User;
import java.util.HashMap;

/**
 *
 * @author Ismail Cam
 */
public interface UserInterface
{
    
    boolean createUser(User user, HashMap users);
    
    boolean deleteUser(String username, HashMap users);
    
    boolean updateUser(String username, HashMap users, User user);
    
    User getUser();
    
    void changeUserPassword();
    
    void updateUserStatus();
    
}
