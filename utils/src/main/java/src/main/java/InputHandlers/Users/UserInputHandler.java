package src.main.java.InputHandlers.Users;

import java.util.HashMap;

/**
 * Created by travismartin on 2015-11-11.
 */
public class UserInputHandler
{
    HashMap<String, Object> dataMap = new HashMap<String, Object>();

    //manidatory fields
    private long id;
    private String username, firstName, lastName, email;

    //optional fields, here just to simulate / test it out.
    private String middleName;
    private int age;

    public UserInputHandler(HashMap userInput)
    {
        userInput = this.dataMap;
    }


}
