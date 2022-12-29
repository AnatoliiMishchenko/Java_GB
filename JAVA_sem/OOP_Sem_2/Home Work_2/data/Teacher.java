package sem_2.data;

public class Teacher extends User{
    private String numberDepartment;

    public Teacher(String fio, String data, String pasportSeriaNumber, String numberDepartment) {
        super(fio, data, pasportSeriaNumber);
        this.numberDepartment = numberDepartment;
    }

    public String getNumberDepartment() {
        return numberDepartment;
    }

    public void setNumberDepartment(String numberDepartment) {
        this.numberDepartment = numberDepartment;
    }
}
