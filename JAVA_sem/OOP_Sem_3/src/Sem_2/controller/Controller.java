package Sem_2.controller;

import Sem_2.Data.Student;
import Sem_2.Data.StudentsGroup;
import Sem_2.service.DataService;
import Sem_2.service.StudentGroupServiceImpl;

public class Controller  {

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

    public void Delet() {
         new StudentGroupServiceImpl().remove(new Student.getSurname());

    }
}


}
