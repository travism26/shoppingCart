package src.main.java.DomainModels.Users;

import src.main.java.DomainModels.baseModel;

/**
 * Created by travismartin on 15-10-20.
 */
public class User extends baseModel
{

    private String username, firstName, lastName;
    private long id;

    public User(String username, String firstName, String lastName)
    {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
