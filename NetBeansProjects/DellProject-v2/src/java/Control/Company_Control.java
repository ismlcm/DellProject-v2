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
public class Company_Control implements Company_Interface {

    public static HashMap<String, Company> companies = new HashMap();

    @Override
    public boolean createCompany(String companyId, String name, String country, String address, String city, String postcode, String email, String phone, String password) {
        if (companies.containsKey(companyId)) {
            return false;
        } else {
            Company company = new Company(companyId, name, country, address, city, postcode, email, phone, password);

            companies.put(companyId, company);

            return true;
        }
    }

    @Override
    public boolean createDellCompany() {
        if (companies.containsKey("0")) {
            return false;
        } else {
            Company dellCompany = new Company();

            companies.put("0", dellCompany);

            return true;
        }
    }

    @Override
    public boolean removeCompany(String companyId) {
        if (companies.containsKey(companyId)) {
            companies.remove(companyId);

            return true;
        } else {
            return false;
        }

    }

    @Override
    public Company getCompany(String companyId) {
        if (companies.containsKey(companyId)) {
            Company company = companies.get(companyId);

            return company;
        } else {
            return null;
        }
    }

    @Override
    public boolean createOtherUser(String email, String password, String firstname, String lastname, String phone, String status, String usertype, String vatnumber) {
        if (companies.containsKey(vatnumber)) {

            User user = new User(email, password, firstname, lastname, phone, status, usertype, vatnumber);

            companies.get(vatnumber).getUsers().put(email, user);

            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean removeOtherUser(String companyId, String userEmail) {
        if (companies.containsKey(companyId)) {
            if (companies.get(companyId).getUsers().containsKey(userEmail)) {
                companies.get(companyId).getUsers().remove(userEmail);

                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public User getUser(String companyId, String userEmail) {
        if (companies.containsKey(companyId)) {
            if (companies.get(companyId).getUsers().containsKey(userEmail)) {
                User user = companies.get(companyId).getUsers().get(userEmail);

                return user;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @Override
    public boolean checkUser(String vatnumber, String userEmail, String password) {
        if (companies.containsKey(vatnumber)) {
            if (companies.get(vatnumber).getUsers().containsKey(userEmail)) {
                if (companies.get(vatnumber).getUsers().get(userEmail).getEmail().equals(userEmail)
                        && companies.get(vatnumber).getUsers().get(userEmail).getPassword().equals(password)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {

            return false;
        }
    }

    @Override
    public boolean checkUserType(String vatnumber, String userEmail, String userType) {
        if (companies.containsKey(vatnumber)) {
            if (companies.get(vatnumber).getUsers().containsKey(userEmail)) {
                if (companies.get(vatnumber).getUsers().get(userEmail).equals(userEmail)
                        && companies.get(vatnumber).getUsers().get(userEmail).equals(userType)) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }

        } else {
            return false;
        }

    }
}
