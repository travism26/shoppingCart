package src.main.java.Repository;

/**
 * Created by travismartin on 2015-11-14.
 * used to centralize the inmemory repos
 */
public class globalRepo
{

    public static ICreateUserRepo createRepo = new InMemoryCreateUserRepo();
    public static InMemoryUserRepo userRepo = new InMemoryUserRepo();

    public static ICreateUserRepo getCreateUserRepo(){
        return createRepo;
    }
    public static InMemoryUserRepo getInMemoryUserRepo(){
        return userRepo;
    }
}
