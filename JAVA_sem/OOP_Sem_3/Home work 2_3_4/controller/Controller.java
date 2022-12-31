package sem_2.controller;

import sem_2.data.*;
import sem_2.service.*;

import java.util.List;


public class Controller {
    private DataService studentService;
    private DataService teacherService;
    private StudentGroupServiceImpl studentGroupService;
    private GroupStreamServiceImpl streamServise;

    public Controller(DataService studentService, DataService teacherService,
                      StudentGroupServiceImpl studentGroupService, GroupStreamServiceImpl streamServise) {
        this.studentService = studentService;
        this.teacherService = teacherService;
        this.studentGroupService = studentGroupService;
        this.streamServise = streamServise;
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
    public void sortGroupStream(List<GroupStream> groupStreamList){
        streamServise.streamsort(groupStreamList);
    }
    public void sortStudent(StudentGroup studentGroup){
        studentGroupService.sort(studentGroup);
    }



    public void removeStudent ( String fio , StudentGroup studentGroup){
        studentGroupService.remove(fio,studentGroup);
    }

}
