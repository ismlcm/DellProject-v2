package Control;

import Entity.User;
import Entity.UserType.Finans;
import Entity.UserType.Marketing;
import Entity.UserType.Partner;
import Interface.UserInterface;
import java.util.HashMap;

/**
 *
 * @author Ismail Cam
 */
public class UserControl implements UserInterface
{

    // Static Maps. Der må ikke oprettes flere kopi af disse maps, selvom der bliver intialiseret flere instanter.
    public static HashMap<String, Marketing>    marketing_users = new HashMap();
    public static HashMap<String, Finans>       finans_users    = new HashMap();
    public static HashMap<String, Partner>      partner_users   = new HashMap();
    
    
    
    
    public static void main( String[] args )
    {
        
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
    
    public HashMap getUsersMap(String list)
    {
        if(list.equals( "partner" ) )
        {
            return partner_users;
        }
        else if(list.equals( "finans" ) )
        {
            return finans_users;
        }
        else if(list.equals( "marketing" ) )
        {
            return marketing_users;
        }
        else
        {
            return null;
        }
    }

//    @Override
//    public boolean updateUser(String username, HashMap users, User user)
//    {   
//        // IF USER EXIST
//        if ( users.containsKey( username ) )
//        {
//            // REPLACE NEW USER INFO
//            users.replace( username, user);
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//        
//    }
//
//    @Override
//    public User getUser(String username )
//    {  
//        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void changeUserPassword()
//    {
//        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean updateUserStatus(String username, String status )
//    {
//        return false;
//    }

}
