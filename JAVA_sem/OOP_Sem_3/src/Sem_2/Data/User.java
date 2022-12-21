package Sem_2.Data;

public abstract class User extends Student {
    private String name;
    private String middelName;
    private String Surname;
    private String data;
    private String numberPasport;

    public User() {
        super();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddelName() {
        return middelName;
    }

    public void setMiddelName(String middelName) {
        this.middelName = middelName;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNumberPasport() {
        return numberPasport;
    }

    public void setNumberPasport(String numberPasport) {
        this.numberPasport = numberPasport;
    }

    public User(String name, String middelName, String surname, String data, String numberPasport) {
        this.name = name;
        this.middelName = middelName;
        this.Surname = surname;
        this.data = data;
        this.numberPasport = numberPasport;
    }
}
