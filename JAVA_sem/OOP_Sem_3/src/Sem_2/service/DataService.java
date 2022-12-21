package Sem_2.service;
import Sem_2.Data.StudentsGroup;
import Sem_2.Data.User;



public interface DataService {
    void create(User user);
    StudentsGroup read(User studentsGroup);

    StudentsGroup read(int groupNumber);

    User read(User user);

    abstract StudentsGroup getGroup(int groupNumber);
}
