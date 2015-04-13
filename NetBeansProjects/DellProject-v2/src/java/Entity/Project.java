/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

/**
 * 
 * @author Ismail Cam
 */
public class Project {

    
    private String id;
    private String title;
    private String desc;
    private String amount;
    private String start_date;
    private String end_date;
    private String status; // { new, cancel, pending_mk, accept, deny, peding_fn, payout_accept, payout_deny }

    /******************************************************/
    
    public Project( String id, String title, String desc, String amount, String start_date, String end_date )
    {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.amount = amount;
        this.start_date = start_date;
        this.end_date = end_date;
        this.status = "new";
    }
    
    /******************************************************/

    public String getId()
    {
        return id;
    }

    public void setId( String id )
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
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

    public String getAmount()
    {
        return amount;
    }

    public void setAmount( String amount )
    {
        this.amount = amount;
    }

    public String getStart_date()
    {
        return start_date;
    }

    public void setStart_date( String start_date )
    {
        this.start_date = start_date;
    }

    public String getEnd_date()
    {
        return end_date;
    }

    public void setEnd_date( String end_date )
    {
        this.end_date = end_date;
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
