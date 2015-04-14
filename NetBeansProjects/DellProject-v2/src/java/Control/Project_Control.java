/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import static Control.Company_Control.companies;
import Entity.Project;
import Interface.Project_Interface;
import com.sun.faces.config.WebConfiguration;
import java.util.HashMap;

/**
 *
 * @author Ismail Cam
 */
public class Project_Control implements Project_Interface {

    @Override
    public boolean createProject(String vatnumber, String Project_Id, String title, String desc, String amount, String start_date, String end_date, String status) {
        if (companies.containsKey(vatnumber)) {
            if (companies.get(vatnumber).getProjects().containsKey(Project_Id)) {
                return false;
            } else {
                Project project = new Project(Project_Id, title, desc, amount, start_date, end_date);
                companies.get(vatnumber).getProjects().put(Project_Id, project);
                return true;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteProject(String vatnumber, String Project_Id) {

        if (companies.containsKey(vatnumber)) {
            if (companies.get(vatnumber).getProjects().containsKey(Project_Id)) {
                companies.get(vatnumber).getProjects().remove(Project_Id);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public Project getProject(String vatnumber, String Project_Id) {
        if (companies.containsKey(vatnumber)) {
            if (companies.get(vatnumber).getProjects().containsKey(Project_Id)) {
                return companies.get(vatnumber).getProjects().get(Project_Id);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
    @Override
    public boolean projectStatus(String vatnumber, String project_id, String status) {
        if (companies.containsKey(vatnumber)) {
            if (companies.get(vatnumber).getProjects().containsKey(project_id)) {

                companies.get(vatnumber).getProjects().get(project_id).setStatus(status);
                return true;
            } else {

                return false;
            }

        }
        else return false;
    }
}
