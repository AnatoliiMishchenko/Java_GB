package sem_2.service;

import sem_2.data.Teacher;
import sem_2.data.User;
import sem_2.repository.TeacheRepository;

import java.util.List;

public class TaecherService implements DataService{
    private final TeacheRepository teacheRepository;

    public TaecherService(TeacheRepository teacheRepository) {
        this.teacheRepository = teacheRepository;
    }

    public Teacher saveTeacher (Teacher teacher){
        return teacheRepository.save(teacher);
    }
    public Teacher finTeacher( String numberDepartment) {
        return teacheRepository.findById(Integer.parseInt(numberDepartment));
    }

    @Override
    public List<User> read(User user) {
        return null;
    }

    @Override
    public void create(User user) {

    }

    @Override
    public List<User> read1(String text) {
        return null;
    }
}
