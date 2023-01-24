package data;

public class Teacher extends User{
    private String rank;

    public Teacher(String fio, int id, String rank) {
        super(fio, id);
        this.rank = rank;
    }


    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
