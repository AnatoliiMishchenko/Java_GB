package Sem_2.Data;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIteratol implements Iterator<Student> {
    private StudentsGroup studentsGroup;
    //    private Iterator<Student> studentIterator;
    private List<Student> studentList;
    private int cursor;

    public StudentGroupIteratol(StudentsGroup studentsGroup) {
        this.studentsGroup = studentsGroup;
//        this.studentIterator = studentsGroup.getStudentList().iterator();
        this.studentList = studentList;

    }

    @Override
    public boolean hasNext() {
        return cursor < studentList.size();

//        return this.studentIterator.hasNext();
    }

    @Override
    public Student next() {
        Student student = studentList.get(cursor++);
        return student;
//        return this.studentIterator.next();

    }

    @Override
    public void remove() {
        studentList.remove(cursor);
//        this.studentIterator.remove();

    }
}