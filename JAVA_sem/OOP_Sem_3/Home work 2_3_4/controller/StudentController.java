package sem_2.controller;

import sem_2.data.Student;
import sem_2.repository.StudentRepository;

public class StudentController implements UserController<Student,Integer>{
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student save(Student entity) {
        return studentRepository.save(entity);
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student findByFio(String fio) {
        return studentRepository.findByFio(fio);
    }
}
