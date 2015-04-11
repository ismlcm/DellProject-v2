/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

import Entity.Project.Project;
import Interface.ProjectInterface;
import java.util.HashMap;

/**
 * 
 * @author Ismail Cam
 */
public class ProjectControl implements ProjectInterface{
    
    public static HashMap<Integer, Project> projects = new HashMap();
    
    
    public static void main(String[] args) {
        
        ProjectControl p = new ProjectControl();
        
        //p.createProject(new Project(1, "341343131", "Test title", "Test desc", "start dato", "end dato"));
        
        
//        System.out.println(projects.size());
////        p.deleteProject("1");
////         System.out.println(projects.size());
//        
//        projects.get("1").setCost(Integer.MAX_VALUE);
////        System.out.println(projects.get("1").getStatus());
////        
////        projects.get("1").setStatus("accept");
////        
////        System.out.println(projects.get("1").getStatus());
        
        System.out.println( projects.get( "1" ).getProjectID() );
    }

    @Override
    public boolean createProject(Project project) {
        
        int projectId = project.getProjectID();
        
        if(projects.containsKey(projectId))    
        {
            return false; 
        }
        
        else
        {
            // Ny Project
            projects.put(projectId, project);
            return true;
        }
 
    }
    

    @Override
    public boolean deleteProject(String projectId) {

       if(projects.containsKey(projectId)){
        projects.remove(projectId);
       return true;
       
       }else{
     return false;
       
       }
    }

//    @Override
//    public boolean updateProject() {
//     }

//    @Override
//    public Project getProject() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void updateProjectStatus() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }   
//
//    @Override
//    public void updateProject()
//    {
//        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
//    }
}
