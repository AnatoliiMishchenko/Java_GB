package sem_2.service;

import sem_2.data.User;

import java.awt.*;
import java.util.List;

public interface DataService <U extends User> {

    List<User> read(User user);

    void create(User user);

    List<User> read1(String text);
}
