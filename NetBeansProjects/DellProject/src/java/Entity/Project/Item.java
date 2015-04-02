/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity.Project;

/**
 * 
 * @author Ismail Cam
 */
public class Item {
    
    private String projectID;
    private String desc;
    private int cost;

    public Item( String projectID, String desc, int cost )
    {
        this.projectID = projectID;
        this.desc = desc;
        this.cost = cost;
    }

    public String getProjectID()
    {
        return projectID;
    }

    public void setProjectID( String projectID )
    {
        this.projectID = projectID;
    }

    public String getDesc()
    {
        return desc;
    }

    public void setDesc( String desc )
    {
        this.desc = desc;
    }

    public int getCost()
    {
        return cost;
    }

    public void setCost( int cost )
    {
        this.cost = cost;
    }
    
    
    

}
