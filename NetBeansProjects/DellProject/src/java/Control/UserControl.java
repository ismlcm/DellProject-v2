
package Control;

import Entity.User;
import Entity.UserType.Finans;
import Entity.UserType.Marketing;
import Entity.UserType.Partner;
import Interface.UserInterface;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * @author Ismail Cam
 */



public class UserControl implements UserInterface{

    
    static HashMap<String, Marketing>  marketingList  = new HashMap();
    static HashMap<String, Finans>     finansList     = new HashMap();

    
    @Override
    public boolean createUser( User user )
    {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteUser( String username )
    {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateUser()
    {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getUser()
    {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changeUserPassword()
    {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateUserStatus()
    {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }
    
  

}
