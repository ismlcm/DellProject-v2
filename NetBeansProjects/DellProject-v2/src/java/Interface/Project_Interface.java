/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entity.Project;

/**
 *
 * @author Ismail Cam
 */
public interface Project_Interface
{
    
    boolean createProject(String vatnumber, String id, String title, String desc, String amount, String start_date, String end_date, String status);
    
    
    boolean deleteProject(String vatnumber, String id);
    
    Project getProject(String vatnumber, String id);
    
}
