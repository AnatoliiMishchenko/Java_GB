package sem_2.service;

import sem_2.data.Student;
import sem_2.data.User;
import sem_2.repository.StudentRepository;
import sem_2.util.ReaderFromTxt;

import java.util.List;

public class StudentService implements DataService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student findIdStudent(int id) {
        return studentRepository.findById(id);
    }

    public Student findFioStudent(String fio) {
        return studentRepository.findByFio(fio);
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
        return ReaderFromTxt.read(text);
    }
}
