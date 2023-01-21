package data;

public class Student extends  User implements Comparable<Student> {
    private String department;
    private int course;
    private final int yearOfBirth;

    public Student(String firstName, String lastName, int id, String department, int course, int yearOfBirth) {
        super(firstName, lastName, id);
        this.department = department;
        this.course = course;
        this.yearOfBirth = yearOfBirth;
    }

    public Student(String firstName) {
        super(firstName);

        yearOfBirth = 0;
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
    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.yearOfBirth, o.yearOfBirth);
    }
}
