/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entity.Company;
import Entity.User;
import Interface.Company_Interface;
import java.util.HashMap;

/**
 *
 * @author Ismail Cam
 */
public class Company_Control implements Company_Interface
{

    public static HashMap<String, Company> companies = new HashMap();
    

    @Override
    public boolean createCompany( String companyId, String name, String country, String address, String city, String postcode, String email, String phone, String password )
    {
        if ( companies.containsKey( companyId ) )
        {
            return false;
        }
        else
        {
            Company company = new Company( companyId, name, country, address, city, postcode, email, phone, password );

            companies.put( companyId, company );

            return true;
        }
    }

    @Override
    public boolean createDellCompany()
    {
        if ( companies.containsKey( "0" ) )
        {
            return false;
        }
        else
        {
            Company dellCompany = new Company();

            companies.put( "0", dellCompany );

            return true;
        }
    }

    @Override
    public boolean removeCompany( String companyId )
    {
        if ( companies.containsKey( companyId ) )
        {
            companies.remove( companyId );

            return true;
        }
        else
        {
            return false;
        }

    }

    @Override
    public Company getCompany( String companyId )
    {
        if ( companies.containsKey( companyId ) )
        {
            Company company = companies.get( companyId );

            return company;
        }
        else
        {
            return null;
        }
    }

    @Override
    public boolean createOtherUser( String companyId, String firstname, String password, String lastname, String email, String phone, String vatnumber )
    {
        if ( companies.containsKey( companyId ) )
        {
            User user = new User( firstname, password, lastname, email, phone, vatnumber );

            companies.get( companyId ).getUsers().put( email, user );

            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public boolean removeOtherUser( String companyId, String userEmail )
    {
        if ( companies.containsKey( companyId ) )
        {
            if ( companies.get( companyId ).getUsers().containsKey( userEmail ) )
            {
                companies.get( companyId ).getUsers().remove( userEmail );

                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    @Override
    public User getUser( String companyId, String userEmail )
    {
        if ( companies.containsKey( companyId ) )
        {
            if ( companies.get( companyId ).getUsers().containsKey( userEmail ) )
            {
                User user = companies.get( companyId ).getUsers().get( userEmail );

                return user;
            }
            else
            {
                return null;
            }
        }
        else
        {
            return null;
        }
    }

}
