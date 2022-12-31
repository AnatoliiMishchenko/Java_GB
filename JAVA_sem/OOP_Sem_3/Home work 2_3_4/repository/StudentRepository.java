package sem_2.repository;

import sem_2.data.Student;

public class StudentRepository implements UserRepository<Student, Integer> {
    @Override
    public Student save(Student entity) {
        return null;
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student findByFio(String fio) {
        return null;
    }
}
