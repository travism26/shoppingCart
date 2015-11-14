package src.main.java.Repository;

import src.main.java.Messages.Commands.Users.CreateUser;

import java.util.HashMap;

/**
 * Created by travismartin on 2015-11-14.
 */
public class InMemoryCreateUserRepo implements ICreateUserRepo
{
    private HashMap<Integer, CreateUser> eventCreateUser = new HashMap<Integer, CreateUser>();

    public CreateUser getUser(int id)
    {
        //for testing purposes, just assume validation passed.
        CreateUser event = eventCreateUser.containsKey(id) ? eventCreateUser.get(id) : null;
        return event;
    }

    public void addUser(CreateUser newUser)
    {
        //for testing purposes, just assume validation passed.
        eventCreateUser.put(newUser.getId(), newUser);
    }

    public String toString()
    {
        return eventCreateUser.toString();
    }
}
