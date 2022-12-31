package sem_2.data;

import java.util.Iterator;
import java.util.List;

public abstract class UserGroup implements Iterator<User> {
    private final List<User> userList;

    public UserGroup(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }

}
