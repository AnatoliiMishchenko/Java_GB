package Sem_2.service;

import Sem_2.Data.Student;
import Sem_2.Data.StudentsGroup;
import Sem_2.Data.User;
import Sem_2.Data.UserComparator;

import java.util.Collections;
import java.util.Iterator;


public class StudentGroupServiceImpl implements DataService, {
    @Override
    public void create(User user) {

    }

    public User read(User user) {
        return;
    }

    @Override
    public StudentsGroup getGroup() {
        return new StudentsGroup(getGroup().getTeacher(), getGroup().getStudentList(), getGroup().getGroupNumber());
    }

    @Override
    public StudentsGroup getGroup(int groupNumber) {
        return new StudentsGroup(getGroup().getTeacher(), getGroup().getStudentList(), getGroup().getGroupNumber());
    }

    public void remove(Student surname) {
        Iterator<Student> studentsGroup = getGroup().iterator();
        while (studentsGroup.hasNext()) {
            Student student = studentsGroup.next();
            if ((student.getSurname()).equals(surname)) {
                studentsGroup.remove();
            }
        }


    }
    public void sortStudent(StudentsGroup studentsGroup){
        Collections.sort(studentsGroup.getStudentList());
    }
    public void  sort(StudentsGroup studentsGroup){
        Collections.sort(studentsGroup.getStudentList(), new UserComparator());
    }

}
