package Sem_2.service;

import Sem_2.Data.StudentsGroup;
import Sem_2.Data.User;
import Sem_2.Util.ReadeToTxt;
import Sem_2.Util.WriteToTxt;

public class SudentsServiceImpel implements DataService{

    @Override
    public void create(User user) {
        WriteToTxt.write(user);
    }

    @Override
    public StudentsGroup read(User user) {
        return ReadeToTxt.readText(user);

    }
}
