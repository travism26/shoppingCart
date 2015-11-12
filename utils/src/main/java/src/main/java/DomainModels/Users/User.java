package src.main.java.DomainModels.Users;

import src.main.java.DomainModels.baseModel;
import src.main.java.InputHandlers.IInputHandler;
import src.main.java.InputHandlers.Users.UserInputHandler;
import src.main.java.Messages.Commands.Users.CreateUser;
import src.main.java.Messages.Events.Users.UserCreated;

import static src.main.java.GlobalAttributes.EventRaised.RaiseEvent;

/**
 * Created by travismartin on 15-10-20.
 */
public class User extends baseModel
{

    private String username, firstName, lastName, email;
    private int id;

    private User(String username, String firstName, String lastName, String email)
    {
        //should create a global event.
        //RaiseEvent(Event);
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        RaiseEvent(new CreateUser(id, username, firstName, lastName, email));
    }

    public static User createUser(String username, String firstName, String lastName, String email){

        return new User(username, firstName, lastName, email);
    }

    @Override
    public void handleEvent()
    {

    }

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

    public long getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

}
