package Sem_2.service;

import Sem_2.Data.StudentsGroup;
import Sem_2.Data.User;
import Sem_2.Util.WriteToTxt;

public class TeacherServiceImpel implements DataService{
    @Override
    public void create(User user) {
        WriteToTxt.write(user);

    }

    @Override
    public StudentsGroup read(User studentsGroup) {
        return null;
    }

    @Override
    public StudentsGroup read(int groupNumber) {
        return null;
    }

//    @Override
//    public StudentsGroup read(User user) {
//        return ReadeToTxt.read(user);
//
//
//    }
}
