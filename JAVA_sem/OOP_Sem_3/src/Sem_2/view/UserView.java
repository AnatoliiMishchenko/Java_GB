package Sem_2.view;

import Sem_2.Data.User;

import java.util.List;

public abstract class UserView {
    void showTheBest(List<User> userList){
       User user = findTheBest(userList);
        System.out.println(user);
    };
    protected abstract User findTheBest(List<User> userList);

}
