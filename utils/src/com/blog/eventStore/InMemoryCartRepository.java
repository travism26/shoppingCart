package src.com.blog.eventStore;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by travismartin on 15-10-18.
 */
public class InMemoryCartRepository implements IRepository {

    Map<Integer, Map> cartItems = new HashMap<Integer, Map>();


    @Override
    public void saveEvent(Object model)
    {

    }

    @Override
    public void updateEvent(Object model)
    {

    }
}
