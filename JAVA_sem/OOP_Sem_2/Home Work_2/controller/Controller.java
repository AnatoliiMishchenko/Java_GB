package sem_2.controller;

import sem_2.data.Student;
import sem_2.data.StudentGroup;
import sem_2.data.Teacher;
import sem_2.data.User;
import sem_2.service.DataService;
import sem_2.service.StudentGroupServiceImpl;
import sem_2.service.StudentServiceImpl;
import sem_2.service.TeacherServiceImpl;


public class Controller {
    private DataService studentService;
    private DataService teacherService;
    private StudentGroupServiceImpl studentGroupService;

    public Controller(DataService studentService, DataService teacherService, StudentGroupServiceImpl studentGroupService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
        this.studentGroupService = studentGroupService;
    }

    public Student createStudent(Student student){
        studentService.create(student);
       return (Student) studentService.read(student);


    }
    public Teacher creatTeacher(Teacher teacher){
        teacherService.create(teacher);
        return  (Teacher) teacherService.read(teacher);
    }

    public StudentGroup createGroup(int groupNumber){
        return studentGroupService.create(groupNumber);
    }
}
