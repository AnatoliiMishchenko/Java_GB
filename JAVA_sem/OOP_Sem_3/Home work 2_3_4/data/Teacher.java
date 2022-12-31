package sem_2.data;

import java.util.List;

public class Teacher extends User {
    private String numberDepartment;
    private List<Integer> group;

    public Teacher(String fio, String data, String pasportSeriaNumber, String numberDepartment) {
        super(fio, data, pasportSeriaNumber);
        this.numberDepartment = numberDepartment;
    }

    public Teacher(String fio, String data, String pasportSeriaNumber, String numberDepartment, List<Integer> group) {
        super(fio, data, pasportSeriaNumber);
        this.numberDepartment = numberDepartment;
        this.group = group;
    }

    public List<Integer> getGroup() {
        return group;
    }

    public void setGroup(List<Integer> group) {
        this.group = group;
    }

    public String getNumberDepartment() {
        return numberDepartment;
    }

    public void setNumberDepartment(String numberDepartment) {
        this.numberDepartment = numberDepartment;
    }
}
