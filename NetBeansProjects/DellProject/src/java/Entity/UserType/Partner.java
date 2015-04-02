/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.UserType;

import Entity.User;

/**
 *
 * @author Ismail Cam
 */
public class Partner extends User
{

    private String companyID; // CVR number
    private String companyName;
    private String address;
    private String city;
    private int postcode;
    private String email;
    private String phone;
    private String partnerStatus; // new, accept, deny

    public Partner( int id, String companyID, String password, 
                    String companyName, String address, String city, int postcode, String email, String phone )
    {
        
        // User Constructor
        super( id, companyID, password );

        this.companyID      = companyID;
        this.companyName    = companyName;
        this.address        = address;
        this.city           = city;
        this.postcode       = postcode;
        this.email          = email;
        this.phone          = phone;
        this.partnerStatus  = "new";
    }

    public String getCompanyID()
    {
        return companyID;
    }

    public void setCompanyID( String companyID )
    {
        this.companyID = companyID;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName( String companyName )
    {
        this.companyName = companyName;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress( String address )
    {
        this.address = address;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity( String city )
    {
        this.city = city;
    }

    public int getPostcode()
    {
        return postcode;
    }

    public void setPostcode( int postcode )
    {
        this.postcode = postcode;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone( String phone )
    {
        this.phone = phone;
    }

    public String getPartnerStatus()
    {
        return partnerStatus;
    }

    public void setPartnerStatus( String partnerStatus )
    {
        this.partnerStatus = partnerStatus;
    }
    
    public String getUserType(){
    
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString()
    {
        return "Partner{" + "companyID=" + companyID + ", companyName=" + companyName + ", address=" + address + ", city=" + city + ", postcode=" + postcode + ", email=" + email + ", phone=" + phone + ", partnerStatus=" + partnerStatus + '}';
    }

}
