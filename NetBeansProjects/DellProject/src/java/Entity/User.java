
package Entity;

/**
 *
 * @author Ismail Cam
 */
public class User
{

    private int id;
    private String username;
    private String password;
    private String status; // new, open, close

    public User( int id, String username, String password )
    {
        this.id         = id;
        this.username   = username;
        this.password   = password;
        this.status     = "new";
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername( String username )
    {
        this.username = username;
    }

    public int getId()
    {
        return id;
    }

    public void setId( int id )
    {
        this.id = id;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword( String password )
    {
        this.password = password;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus( String status )
    {
        this.status = status;
    }

    public String printUser()
    {
        return "User{" + "id=" + id + ", username=" + username + ", password=" + password + ", status=" + status + '}';
    }
}
