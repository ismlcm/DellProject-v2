/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entity.Project.Project;

/**
 *
 * @author Ismail Cam
 */
public interface ProjectInterface
{
    
    boolean createProject(Project project);
    
    boolean deleteProject(String projectId);
    
//    void updateProject();
//    
//    Project getProject();
//    
//    void updateProjectStatus();
    
}
