package src.main.java.Messages.Commands.Users;

import src.main.java.Messages.IEvent;
import src.main.java.Repository.ICreateUserRepo;
import src.main.java.Repository.globalRepo;

/**
 * Created by travismartin on 2015-11-09.
 */
public class CreateUser implements IEvent
{
    private String username, firstName, lastName, email;
    private int id;

    public CreateUser(int id, String username, String firstName, String lastName, String email)
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
        return "CreateUser()";
    }

    @Override
    public void handleEvent()
    {
        globalRepo.createRepo.addUser(this);
        //repository.addUser(new CreateUser(this.id, this.username, this.firstName, this.lastName, this.email));
    }

    public int getId()
    {
        return id;
    }


}
