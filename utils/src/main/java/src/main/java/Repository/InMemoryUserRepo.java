package src.main.java.Repository;

import src.main.java.DomainModels.Users.User;

import java.util.HashMap;

/**
 * Created by travismartin on 2015-11-14.
 */
public class InMemoryUserRepo implements IRepository
{
    private HashMap<Integer, User> users = new HashMap<Integer, User>();

    public User getUser(int id)
    {
        //for testing purposes, just assume validation passed.
        User user = users.containsKey(id) ? users.get(id) : null;
        return user;
    }

    public void addUser(User newUser)
    {
        //for testing purposes, just assume validation passed.
        users.put(newUser.getId(), newUser);
    }

//    public String toString(){
//        return users.size()+" ";
//    }
}
