package Entity.UserType;

import Entity.User;

/**
 *
 * @author Ismail Cam
 */
public class Finans extends User
{

    private String personalID;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;

    public Finans( int id, String personalID, String password, 
                   String firstname, String lastname, String email, String phone )
    {
        
        // User Constructor
        super( id, personalID, password );

        this.personalID = personalID;
        this.firstname  = firstname;
        this.lastname   = lastname;
        this.email      = email;
        this.phone      = phone;
    }

    public String getPersonalID()
    {
        return personalID;
    }

    public void setPersonalID( String personalID )
    {
        this.personalID = personalID;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname( String firstname )
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname( String lastname )
    {
        this.lastname = lastname;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone( String phone )
    {
        this.phone = phone;
    }

    public String getUserType(){
    
        return this.getClass().getSimpleName();
    }
    
    @Override
    public String toString()
    {
        return "Finans{" + "personalID=" + personalID + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", phone=" + phone + '}';
    }
}
