package Sem_2.controller;

import Sem_2.Student;
import Sem_2.StudentsGroup;
import service.DataService;
import service.StudentGroupServiceImpl;
import service.SudentsServiceImpel;
import service.TeacherServiceImpel;

public class Controller {

    private DataService studentsService;

    public Controller(StudentGroupServiceImpl studentsService) {
        this.studentsService = studentsService;
    }

    //    public Student createStudent(Student student) {
//        studentsService.create(student);
//      return (Student)  studentsService.read(student);
//
//    }
    public StudentsGroup ControllerCreateGroup(int groupNumber) {
        return (StudentsGroup) studentsService.read(groupNumber);

    }


}
