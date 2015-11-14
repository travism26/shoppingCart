package src.main.java.GlobalAttributes;

import src.main.java.Messages.IEvent;

import java.util.ArrayList;

/**
 * Created by travismartin on 2015-11-10.
 */
public class EventRaised
{
    /*
     * need to finish method
     * This class will raise the event based on the model/event
     *
     */
    public static ArrayList<String> errors;

    public static void RaiseEvent(IEvent event)
    {
        System.out.println("Fire Event: " + event.eventName());
        event.handleEvent();
    }

    public static void clearErrors()
    {
        errors.clear();
    }
}
