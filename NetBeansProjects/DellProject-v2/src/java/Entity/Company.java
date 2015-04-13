/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

import java.util.HashMap;

/**
 * 
 * @author Ismail Cam
 */
public class Company {
    
    private String vatnumber;
    private String companyName;
    private String country;
    private String address;
    private String city;
    private String postcode;
    private String email;
    private String phone;
    private String password;
    private String status; // { new, open close }

    
    HashMap<String, User> users = new HashMap();
    HashMap<String, Project> projects = new HashMap();

    /******************************************************/
    
    // For Dell
    public Company( )
    {
        this.vatnumber = "0";
        this.companyName = "Dell A/S";
        this.country = "Denmark";
        this.address = "Arne Jacobsens Allé 15-17";
        this.city = "København S";
        this.postcode = "2300";
        this.email = "info@dell.dk";
        this.phone = "32871258";
        this.password = "dell";
        this.status = "open";
        this.projects = null;
    }
 
    // For other
    public Company( String vatnumber, String companyName, String country, String address, String city, String postcode, String email, String phone, String password )
    {
        this.vatnumber = vatnumber;
        this.companyName = companyName;
        this.country = country;
        this.address = address;
        this.city = city;
        this.postcode = postcode;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.status = "new";
    }
    
    /******************************************************/

    public String getVatnumber()
    {
        return vatnumber;
    }

    public void setVatnumber( String vatnumber )
    {
        this.vatnumber = vatnumber;
    }

    public String getName()
    {
        return companyName;
    }

    public void setCompanyName( String companyName )
    {
        this.companyName = companyName;
    }
    
    public String getCountry()
    {
        return country;
    }

    public void setCountry( String country )
    {
        this.country = country;
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

    public String getPostcode()
    {
        return postcode;
    }

    public void setPostcode( String postcode )
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

    public String getPassword()
    {
        return password;
    }

    public void setPassword( String password )
    {
        this.password = password;
    }
    
    public String getStatus()
    {
        return status;
    }

    public void setStatus( String status )
    {
        this.status = status;
    }

    public HashMap<String, User> getUsers()
    {
        return users;
    }

    public void setUsers( HashMap<String, User> users )
    {
        this.users = users;
    }

    public HashMap<String, Project> getProjects()
    {
        return projects;
    }

    public void setProjects( HashMap<String, Project> projects )
    {
        this.projects = projects;
    }
    
    
}
