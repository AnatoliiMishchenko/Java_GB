package service;

import data.Student;
import data.StudentGroup;
import data.comparators.UserComparator;
import repository.StudentRepository;

import java.util.Collections;
import java.util.List;

public class StudentService implements DataService<Student> {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public Student createUser(Student user) {
        return studentRepository.save(user);
    }

    @Override
    public Student findById(Integer id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student findByLastName(String lastName) {
        return studentRepository.findByLastName(lastName);
    }

    @Override
    public void sortUsers(List<Student> users) {
        Collections.sort(users);
    }

    @Override
    public void sortUsersByName(List<Student> users) {
        Collections.sort(users, new UserComparator());
    }

    @Override
    public boolean deleteByLastName(String lastName) {
        return studentRepository.deleteByLastName(lastName);
    }

    @Override
    public boolean deleteByAgeAndGroupNumber(int age, int groupNumber) {
        return studentRepository.deleteByAgeAndGroupNumber(age,groupNumber);
    }





}
