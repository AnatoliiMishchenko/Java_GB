package data;

public class Student extends  User implements Comparable<Student> {
    private String department;
    private int course;
    private int yearOfBirth;
    private int groupNumber;

    public Student(String fio, int id, String department, int course, int yearOfBirth) {
        super(fio, id);
        this.department = department;
        this.course = course;
        this.yearOfBirth = yearOfBirth;
    }

    public Student(String fio) {
        super(fio);
    }

    public Student(String fio, int id, String department, int course, int yearOfBirth, int groupNumber) {
        super(fio, id);
        this.department = department;
        this.course = course;
        this.yearOfBirth = yearOfBirth;
        this.groupNumber = groupNumber;
    }

    public Student(String fio, String department, int course, int yearOfBirth, int groupNumber) {
        super(fio);
        this.department = department;
        this.course = course;
        this.yearOfBirth = yearOfBirth;
        this.groupNumber = groupNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.yearOfBirth, o.yearOfBirth);
    }

    @Override
    public String toString() {
        return "Student{ " +
                (getFio() != null ? "firstName=" + getFio() + " " : "") +
                (department != null ? "department=" + department + " " : "") +
                (course != 0 ? "course=" + course + " " : "") +
                (yearOfBirth != 0 ? "age=" + yearOfBirth + " " : "") +
                (groupNumber != 0 ? "groupNumber=" + groupNumber + " " : "") +
                '}';
    }
}
