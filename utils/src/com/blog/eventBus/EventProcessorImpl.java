package src.com.blog.eventBus;

import src.com.blog.eventBus.actions.eventActions;
import src.com.blog.models.baseModel;

import java.util.HashMap;

/**
 * Created by travismartin on 15-10-25.
 */
public class EventProcessorImpl implements IEventProcessor
{

    @Override
    public void processEvent(baseModel model, eventActions action, HashMap<String, String> details)
    {
    }
}
