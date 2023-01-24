package service;


import data.Student;
import data.StudentGroup;
import data.User;

import java.util.List;

public interface DataService<U extends User> {

    U createUser(U user);

    U findById(Integer id);

    U findByLastName(String lastName);

    public void sortUsers(List<U> users);

    void sortUsersByName(List<U> users);

    boolean deleteByLastName(String lastName);

    boolean deleteByAgeAndGroupNumber(int age, int groupNumber);


}