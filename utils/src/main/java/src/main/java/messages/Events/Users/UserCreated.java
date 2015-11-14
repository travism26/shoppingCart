package src.main.java.Messages.Events.Users;

import src.main.java.Messages.IEvent;

/**
 * Created by travismartin on 2015-11-10.
 */
public class UserCreated implements IEvent
{

    private String username, firstName, lastName, email;
    private long id;

    public UserCreated(int id, String username, String firstName, String lastName, String email)
    {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String eventName()
    {
        return "UserCreated();";
    }

    @Override
    public void handleEvent()
    {

    }
}
