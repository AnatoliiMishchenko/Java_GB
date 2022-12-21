package Sem_2.Data;

public class Teacher extends User {
    private int namberDepartment;

    public Teacher() {
        super();
    }

    public int getNamberDepartment() {
        return namberDepartment;
    }

    public void setNamberDepartment(int namberDepartment) {
        this.namberDepartment = namberDepartment;
    }

    public Teacher(String name, String middelName, String surname, String data, String numberPasport, int namberDepartment) {
        super(name, middelName, surname, data, numberPasport);
        this.namberDepartment = namberDepartment;
    }
}
