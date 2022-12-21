package Sem_2.Data;

public class Student extends User implements Comparable<Student> {
    private int numberGroup;

    public Student() {
        super();

    }


    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public Student(String name, String middelName, String surname, String data, String numberPasport, int numberGroup) {
        super(name, middelName, surname, data, numberPasport);
        this.numberGroup = numberGroup;
    }

    @Override
    public int compareTo(Student student) {
        if (this.getData() > student.getData()) {
            return 1;
        }
        if (student.getData() > this.getData()) {
            return -1;
        }

        return 0;
    }
}
