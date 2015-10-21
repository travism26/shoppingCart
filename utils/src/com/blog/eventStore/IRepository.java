package src.com.blog.eventStore;

/**
 * Created by travismartin on 15-10-18.
 */
public interface IRepository {

    public void saveEvent(Object model);

    public void updateEvent(Object model);

}
