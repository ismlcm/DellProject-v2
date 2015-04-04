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
public class UserControl implements UserInterface
{

    public static HashMap<String, Marketing>    marketing_users = new HashMap();
    public static HashMap<String, Finans>       finans_users    = new HashMap();
    public static HashMap<String, Partner>      partner_users   = new HashMap();
    
    
    public static void main( String[] args )
    {
        UserControl u = new UserControl();
        
        u.createUser( new Partner(1, "companyid", "password", "companyname", "address", "city", 2000, "email", "phone"), partner_users);
        
        System.out.println( partner_users.get( "companyid" ).getUserType() );
        
        u.createUser( new Finans(2, "personalid", "password", "firstname", "lastname", "email", "phone"), finans_users);
        
        System.out.println( finans_users.get( "personalid" ).getUserType());
        
        System.out.println( ":::::::::::::::" );
        System.out.println( finans_users.size() );
        
        
        u.deleteUser( "personalid", finans_users);
        
        System.out.println( finans_users.size() );
    }
    

    @Override
    public boolean createUser( User user, HashMap users )
    {
        // IF USER EXIST
        if ( users.containsKey( user.getUsername() ) )
        {
            return false;
        }

        else
        {   
            // INSERT USER TO HASHMAP
            users.put( user.getUsername(), user );

            return true;
        }
    }

    @Override
    public boolean deleteUser( String username, HashMap users )
    {
        // IF USER EXIST
        if ( users.containsKey( username ) )
        {       
            // DELETE USER FROM HASHMAP
            users.remove( username );

            return true;
        }

        else
        {
            return false;
        }
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
