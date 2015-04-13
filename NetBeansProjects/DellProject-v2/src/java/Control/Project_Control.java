/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

import static Control.Company_Control.companies;
import Entity.Project;
import Interface.Project_Interface;
import java.util.HashMap;

/**
 * 
 * @author Ismail Cam
 */
public class Project_Control implements Project_Interface{
    
   
    @Override
    public boolean createProject(String vatnumber, String id, String title, String desc, String amount, String start_date, String end_date, String status) {
        if(companies.containsKey(vatnumber)){
            
            if(companies.get(vatnumber).getProjects().containsKey(id))
            {
                return false;
            }
            else
            {
                Project project = new Project(id, title, desc, amount, start_date, end_date);
                companies.get(vatnumber).getProjects().put(id, project);
                return true;
            } 
        }
        else
        {
            return false;
        }
        
    }

    @Override
    public boolean deleteProject(String vatnumber, String id) {
        
        if(companies.containsKey(vatnumber)){
            if(companies.get(vatnumber).getProjects().containsKey(id)){
                companies.remove(id);
                return true;
            }
            return false;
        }
           return false;
    }

    @Override
    public Project getProject(String vatnumber, String id) {
        if(companies.containsKey(vatnumber)){
            if(companies.get(vatnumber).getProjects().containsKey(id)){
                return companies.get(vatnumber).getProjects().get(id);
                
                
            }
            else{
                return null;
            }
            
        }
        else{
            return null;
        }
        
    }
}
    
