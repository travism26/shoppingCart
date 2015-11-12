package src.main.java.Messages.Events.Users;

import src.main.java.Messages.IEvent;

/**
 * Created by travismartin on 2015-11-10.
 */
public class UserUpdated implements IEvent
{
    @Override
    public String eventName()
    {
        return "UserUpdated()";
    }
}
