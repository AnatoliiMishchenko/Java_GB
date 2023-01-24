package data;

public abstract class User {
    private String fio;

    private int id;

    public User(String fio, int id) {
        this.fio = fio;

        this.id = id;
    }

    public User(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
