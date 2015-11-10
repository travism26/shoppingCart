package src.main.java.Messages.eventBus;

import src.main.java.Messages.eventBus.actions.IEventAction;
import src.main.java.DomainModels.baseModel;

import java.util.HashMap;

/**
 * Created by travismartin on 15-10-25.
 */
public class EventProcessorImpl implements IEventProcessor
{

    @Override
    public void processEvent(baseModel model, IEventAction action, HashMap<String, String> details)
    {
    }
}
