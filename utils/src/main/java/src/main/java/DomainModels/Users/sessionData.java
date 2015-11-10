package src.main.java.DomainModels.Users;

/**
 * Created by travismartin on 15-10-22.
 */
class sessionData
{

    private static sessionData instance;
    private User userData;

    private sessionData()
    {
    }

    public static sessionData getInstance()
    {
        if (instance == null)
        {
            //synchronized (sessionData.class) {}
            instance = new sessionData();
        }
        return instance;
    }

    private void destroySession()
    {
        this.instance = null;
    }
}
