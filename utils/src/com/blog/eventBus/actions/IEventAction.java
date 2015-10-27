package src.com.blog.eventBus.actions;

/**
 * Created by travismartin on 15-10-20.
 * I am still kinda messing around trying to understand this pattern.
 */
public interface IEventAction {

    public void executeAction();
    /*
     * this class will be a base class for the actions performed
     * on the models. for example creating a new user pass in the create action.
     * separating out the types of actions will help us swap out functionality to make
     * it easier to enhance behavior.
     * User someUser = new User(!DATA!);
     * eventProcessor.processEvent(someUser, createAction, HashMap<String, String> details);
     */
}


/*
 * NOTES:
 */
//get user information, who is this person?
//get some user session data.
//what is the user trying to do?
//what action should we execute?
//what table is being accessed for an append?


//add/create event,
//delete event (NOTE WILL NOTE DELETE anything just label it 'removed X')
//update