package src.main.java.GlobalAttributes;

import src.main.java.InputHandlers.IInputHandler;
import src.main.java.Messages.IEvent;

import java.util.ArrayList;

/**
 * Created by travismartin on 2015-11-10.
 */
public class EventRaised
{
    /*
     * need to finish method
     * Options:
     * RaiseEvent(Model, SomeData, SomeData,...etc); well more complex but kinda secure?
     * RaiseEvent(Model, IMandatoryData, IOptionalData); more extendable
     *
     * This class will raise the event based on the model
     */
    public static ArrayList<String> errors;

    public static void RaiseEvent(IEvent event)
    {
        System.out.println("Fire Event: " + event.eventName());
    }

    public static void clearErrors()
    {
        errors.clear();
    }
}
