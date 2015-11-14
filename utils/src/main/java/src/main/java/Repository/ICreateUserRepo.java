package src.main.java.Repository;

import src.main.java.Messages.Commands.Users.CreateUser;

/**
 * Created by travismartin on 2015-11-14.
 */
public interface ICreateUserRepo
{
    public CreateUser getUser(int id);
    public void addUser(CreateUser newUser);
}
