package repository;

import data.Student;
import db.StudentTable;

import java.util.Collection;

public class StudentRepository implements UserRepository<Student,Integer>{//DIP

    private final StudentTable studentTab;

    public StudentRepository() {
        this.studentTab = new StudentTable();
    }


    @Override
    public Student save(Student entity) {
        return studentTab.save(entity);
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }


    @Override
    public Student findByLastName(String lastName) {
        return null;
    }

    @Override
    public boolean deleteByLastName(String lastName) {
        return studentTab.deleteByFio(lastName);
    }

    @Override
    public boolean deleteByAgeAndGroupNumber(int age, int groupNumber) {
        return studentTab.deleteByFio(age,groupNumber);
    }

    @Override
    public Collection<Student> findAll() {
        return studentTab.getElements();
    }
}

