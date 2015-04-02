/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.UserType;

import Entity.User;
import Entity.UserType.Partner;
import Interface.UserInterface;
import java.util.HashMap;

/**
 *
 * @author Ismail Cam
 */
public class PartnerControl implements UserInterface
{

    static HashMap<String, Partner> partners = new HashMap();

    @Override
    public boolean createUser( User user )
    {

        if ( partners.containsKey( user.getUsername() ) )
        {
            return false;
        }

        else
        {
            partners.put( user.getUsername(), (Partner) user );

            return true;
        }

    }

    @Override
    public boolean deleteUser( String username )
    {
        if ( partners.containsKey( username ) )
        {
            partners.remove( username );

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

    //===============================================
    //  PARTNERS CUSTOM METHODS
    //===============================================
    public Partner newPartner( int id, String companyID, String password,
            String companyName, String address, String city, int postcode, String email, String phone )
    {
        Partner user = new Partner( id, companyID, password, companyName, address, city, postcode, email, phone );

        return user;
    }

}
