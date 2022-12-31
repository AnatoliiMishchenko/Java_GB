package sem_2.service;

import sem_2.data.User;
import sem_2.util.ReaderFromTxt;
import sem_2.util.WriterToTxt;

import java.util.List;

public class StudentServiceImpl implements DataService {

    @Override
    public List<User> read(User user) {
        return ReaderFromTxt.readTxt(user);

    }

    @Override
    public void create(User user) {
        WriterToTxt.writeTxt(user);
    }

    @Override
    public List<User> read1(String text) {
        return null;
    }


}
