package src.main.java.DomainModels.Users;

import src.main.java.DomainModels.baseModel;
import src.main.java.Messages.Commands.Users.CreateUser;

import java.util.concurrent.atomic.AtomicInteger;

import static src.main.java.GlobalAttributes.EventRaised.RaiseEvent;

/**
 * Created by travismartin on 15-10-20.
 */
public class User extends baseModel
{
    private static final AtomicInteger count = new AtomicInteger(0);
    private String username, firstName, lastName, email;
    private int id;
    private static int nextmember= 0;


    public User(String username, String firstName, String lastName, String email)
    {
        //should create a global event.
        //RaiseEvent(Event);
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.id = nextmember++;
        RaiseEvent(new CreateUser(id, username, firstName, lastName, email));
    }

    public User()
    {
    }

    public static User createUser(String username, String firstName, String lastName, String email)
    {
        return new User(username, firstName, lastName, email);
    }

    @Override
    public void handleEvent()
    {

    }
    //need to change up the set* methods to fire the
    //UserUpdated event. TBC

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public int getId()
    {
        return id;
    }

}
