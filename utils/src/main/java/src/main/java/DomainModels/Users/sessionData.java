package src.main.java.DomainModels.Users;

import src.main.java.DomainModels.baseModel;

/**
 * Created by travismartin on 15-10-22.
 */
public class sessionData extends baseModel
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

    @Override
    public void handleEvent()
    {

    }
}
