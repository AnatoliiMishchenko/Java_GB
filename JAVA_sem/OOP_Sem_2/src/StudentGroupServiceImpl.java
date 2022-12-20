package service;

import Sem_2.StudentsGroup;
import Sem_2.User;


public class StudentGroupServiceImpl implements DataService {
    @Override
    public void create(User user) {

    }

    @Override
    public StudentsGroup read(StudentsGroup studentsGroup) {
        return (StudentsGroup) read(studentsGroup);
    }

    @Override
    public StudentsGroup read(int groupNumber) {
        return null;
    }


}
