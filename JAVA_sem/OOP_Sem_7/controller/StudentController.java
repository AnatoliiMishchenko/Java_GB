package controller;

import data.Student;
import service.DataService;
import service.StudentService;


public class StudentController implements UserController<Student, Integer> {

    private final DataService<Student> studentService; //DPI

    public StudentController(DataService<Student> studentService) {
        this.studentService = studentService;
    }

    @Override
    public Student create(Student entity) {
        return studentService.createUser(entity);
    }

    @Override
    public Student findById(Integer id) {
        return studentService.findById(id);
    }

    @Override
    public Student findByLastName(String LastName) {
        return studentService.findByLastName(LastName);
    }
}
