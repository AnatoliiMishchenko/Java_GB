package sem_2.data;

public class Student extends User{
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
}
