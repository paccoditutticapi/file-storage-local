package rs.npTeam.localImplementation.models;

import interfaces.User_Interface;
import model.User;
import model.UserPriority;

public class LocalUser extends User {

    private String username;
    private String password;
    private UserPriority priority;

    public LocalUser(String username, String password, UserPriority priority) {
        super(username, password, priority);
        this.username = username;
        this.password = password;
        this.priority = priority;
    }

}
