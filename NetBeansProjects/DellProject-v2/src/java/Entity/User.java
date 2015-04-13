/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

/**
 * 
 * @author Ismail Cam
 */
public class User {

    
    private String firstname;
    private String lastname;
    private String password;
    private String email;
    private String phone;
    private String status; // {new, open, close}
    private String usertype; // { marketing, finans, partner }
    private String vatnumber;

    /******************************************************/

    // For Dell { marketing, finans }
    public User( String firstname, String lastname, String password, String email, String phone, String status, String usertype )
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.usertype = usertype;
        this.vatnumber = "0";
    }
    
    // For Partner
    public User( String firstname, String lastname, String password, String email, String phone, String vatnumber )
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.status = "new";
        this.usertype = "partner";
        this.vatnumber = vatnumber;
    }
    
    /******************************************************/

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname( String firstname )
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname( String lastname )
    {
        this.lastname = lastname;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword( String password )
    {
        this.password = password;
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

    public String getStatus()
    {
        return status;
    }

    public void setStatus( String status )
    {
        this.status = status;
    }

    public String getUsertype()
    {
        return usertype;
    }

    public void setUsertype( String usertype )
    {
        this.usertype = usertype;
    }

    public String getVatnumber()
    {
        return vatnumber;
    }

    public void setVatnumber( String vatnumber )
    {
        this.vatnumber = vatnumber;
    }
    
}


