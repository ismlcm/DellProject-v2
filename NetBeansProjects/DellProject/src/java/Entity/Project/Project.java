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
public class Project {
    
    private int projectID;
    private String cvrNumber;
    private String title;
    private String desc;
    private int cost;
    private String startDate;
    private String endDate;
    private String status;

    public Project( int projectID, String cvrNumber, String title, String desc, int cost, String startDate, String endDate, String status )
    {
        this.projectID = projectID;
        this.cvrNumber = cvrNumber;
        this.title = title;
        this.desc = desc;
        this.cost = cost;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public String getCvrNumber()
    {
        return cvrNumber;
    }

    public void setCvrNumber( String cvrNumber )
    {
        this.cvrNumber = cvrNumber;
    }

    public String getTitle()
    {
        return title;
    }

    public int getProjectID()
    {
        return projectID;
    }

    public void setProjectID( int projectID )
    {
        this.projectID = projectID;
    }

    public void setTitle( String title )
    {
        this.title = title;
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

    public String getStartDate()
    {
        return startDate;
    }

    public void setStartDate( String startDate )
    {
        this.startDate = startDate;
    }

    public String getEndDate()
    {
        return endDate;
    }

    public void setEndDate( String endDate )
    {
        this.endDate = endDate;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus( String status )
    {
        this.status = status;
    }
    
    

}
