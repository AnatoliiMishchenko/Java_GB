package sem_2.data;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    private StudentGroup studentGroup;
    private Iterator<Student> studentIterator;

    //private List<Student> studentList;
    //private int cursor;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        this.studentIterator = studentGroup.getStudentList().iterator();
        //this.studentList = studentGroup.getStudentList();
    }

    @Override
    public boolean hasNext() {
        return this.studentIterator.hasNext();
        //return studentList.size() > cursor;
    }

    @Override
    public Student next() {
        return this.studentIterator.next();
        //return studentList.get(cursor++);
    }

    @Override
    public void remove() {
        this.studentIterator.remove();
        //this.studentList.remove(cursor);
    }
}
