package service;
import Sem_2.StudentsGroup;
import Sem_2.User;



public interface DataService {
    void create(User user);
    StudentsGroup read(StudentsGroup studentsGroup);

    StudentsGroup read(int groupNumber);
}
