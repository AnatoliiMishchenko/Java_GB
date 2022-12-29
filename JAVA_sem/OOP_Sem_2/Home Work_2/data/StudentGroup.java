package sem_2.data;

import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private List<Student> studentList;
    private int droupNumber;


    public StudentGroup(Teacher teacher, List<Student> studentList, int droupNumber) {
        this.teacher = teacher;
        this.studentList = studentList;
        this.droupNumber = droupNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public int getDroupNumber() {
        return droupNumber;
    }

    public void setDroupNumber(int droupNumber) {
        this.droupNumber = droupNumber;
    }


}
