package src.com.blog.models;

import src.com.blog.eventBus.eventActions;

/**
 * Created by travismartin on 15-10-20.
 */
public class baseModel {

    private eventActions eventHandler = new eventActions();
    final String saveAction ="created", updateAction="updated", deleteAction="removed";

}
