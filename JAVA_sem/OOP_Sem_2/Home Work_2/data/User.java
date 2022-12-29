package sem_2.data;

public abstract class User {

    private String fio;
    private String data;
    private String pasportSeriaNumber;

    public User(String fio, String data, String pasportSeriaNumber) {
        this.fio = fio;
        this.data = data;
        this.pasportSeriaNumber = pasportSeriaNumber;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPasportSeriaNumber() {
        return pasportSeriaNumber;
    }

    public void setPasportSeriaNumber(String pasportSeriaNumber) {
        this.pasportSeriaNumber = pasportSeriaNumber;
    }


}
