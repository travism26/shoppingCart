package src.main.java;

import src.main.java.DomainModels.Users.User;
import src.main.java.Repository.ICreateUserRepo;
import src.main.java.Repository.InMemoryCreateUserRepo;
import src.main.java.Repository.InMemoryUserRepo;
import src.main.java.Repository.globalRepo;

/**
 * Created by travismartin on 15-10-27.
 * just to test my code, see if everything is flowing together.
 */
public class shopRunner
{
    public static void main(String[] args)
    {
        //repositories
        ICreateUserRepo createUserEvent = globalRepo.createRepo;
        InMemoryUserRepo userRepo = globalRepo.userRepo;

        //DOMAIN MODELS and events fired.
        User testUser = new User("blahbalh","Travis", "blah", "blah@yup.com");
        User testUser2 = new User("jessej","jo", "jo", "jo@coolio.com");

        System.out.println(testUser.getId()+ " "+ testUser2.getId());
        //save the domain models to our in memory DB
        userRepo.addUser(testUser);
        userRepo.addUser(testUser2);



        //print out repo data.
        System.out.println("UserRepo: " + userRepo.toString());
        System.out.println("createRepo: " + createUserEvent.toString());
    }
}
