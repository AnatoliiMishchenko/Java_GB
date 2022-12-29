package sem_2.service;

import sem_2.data.User;
import sem_2.util.ReaderFromTxt;
import sem_2.util.WriterToTxt;

import java.util.List;

public class TeacherServiceImpl implements DataService {
    @Override
    public User read(User user) {
        return ReaderFromTxt.readTxt(user);
    }

    @Override
    public void create(User user) {
        WriterToTxt.writeTxt(user);

    }

}
