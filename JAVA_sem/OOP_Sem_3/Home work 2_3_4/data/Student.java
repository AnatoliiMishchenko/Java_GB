package sem_2.data;

public class Student extends User implements Comparable<Student> {
    private String naumberGroup;

    public Student(String fio, String data, String pasportSeriaNumber, String naumberGroup) {
        super(fio, data, pasportSeriaNumber);
        this.naumberGroup = naumberGroup;
    }

    public String getNaumberGroup() {
        return naumberGroup;
    }

    public void setNaumberGroup(String naumberGroup) {
        this.naumberGroup = naumberGroup;
    }

    @Override
    public int compareTo(Student student) {
        if (Integer.parseInt((this.getData())) > Integer.parseInt(student.getData())) return 1;
        if (Integer.parseInt((this.getData())) < Integer.parseInt(student.getData())) return -1;
        return 0;
    }
}
