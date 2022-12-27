public class Ets extends Product{
    private double wigth;



    public Ets(String name, double price, double wigth) {
        super(name, price);
        this.wigth = wigth;

    }


    public double getWigth() {
        return wigth;
    }

    public void setWigth(double wigth) {
        this.wigth = wigth;
    }

    @Override
    public void consume() {
        System.out.println("Привет");
    }

    @Override
    public String toString() {
        return "Товар->" +
                " наименование: " + super.getName() + "\t" +
                ", цена: " + super.getPrice() + "\t" + "вес " + wigth;
    }
}
