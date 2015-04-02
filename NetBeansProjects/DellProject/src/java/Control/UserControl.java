
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



public class UserControl implements UserInterface{
    
    static HashMap<String, Partner>    partnerList    = new HashMap();
    static HashMap<String, Marketing>  marketingList  = new HashMap();
    static HashMap<String, Finans>     finansList     = new HashMap();
    
    public static void main( String[] args )
    {
        
            // USER INFO
            int id = 1;
            String username = "12345678";
            String password = "1234";
            
            
            // PARTNER INFO
            String companyID = username;
            String companyName = "Icwebdesign";
            String address = "Hovedvejen 106";
            String city = "Glostrup";
            int postcode = 2600;
            String email = "info@webcoda.dk";
            String phone = "53706072";
               
            // Create new Partner
            Partner partner = new Partner(id, companyID, password, companyName, address, city, postcode, email, phone );
            
            // Put new Partner to HashMap
            UserControl.partnerList.put( username, partner);
            
            // Current Partner
            Partner cur_Partner = UserControl.partnerList.get( username );
            
            // Change User Status to 'accept' and PartnerStatus to "deny"
//            cur_Partner.setStatus( "accept" );
//            cur_Partner.setPartnerStatus( "deny");
            
            
            System.out.println(
                    
                    //Skal bruges til userType i database
                    "Class name: " + cur_Partner.getUserType() + "\n" +
                    
                    "::::::::::::::" + "\n" +
                    "USER" + "\n" +
                    "::::::::::::::" + "\n" +
                    cur_Partner.printUser() +
                    
                    "\n\n" +

                    cur_Partner.toString()

            );
            
    }

    @Override
    public void createUser()
    {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteUser()
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
