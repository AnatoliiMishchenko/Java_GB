package Sem_2.Data;

import java.util.Iterator;
import java.util.List;

public class GroupStream extends StudentsGroup implements Iterator<StudentsGroup> {
    private List<StudentsGroup> studentsGroup;
    private  Iterator<StudentsGroup> studentsGroupIterator;

    public GroupStream(Teacher teacher, List<Student> studentList, int groupNumber, List<StudentsGroup> studentsGroup, Iterator<StudentsGroup> studentsGroupIterator) {
        super(teacher, studentList, groupNumber);
        this.studentsGroup = studentsGroup;
        this.studentsGroupIterator = studentsGroupIterator;
    }



    public List<StudentsGroup> getStudentsGroup() {
        return studentsGroup;
    }

    public void setStudentsGroup(List<StudentsGroup> studentsGroup) {
        this.studentsGroup = studentsGroup;
    }

    @Override
    public boolean hasNext() {
        return this.studentsGroup.iterator().hasNext();
    }

    @Override
    public StudentsGroup next() {

        return this.studentsGroup.iterator().next();
    }
}
