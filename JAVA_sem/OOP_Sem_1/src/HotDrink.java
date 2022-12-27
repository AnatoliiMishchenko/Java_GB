public class HotDrink extends Product {
    private int temperature;
    private double volume;


    public HotDrink(String name, double price, double volume, int temperature) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    @Override
    public String toString(){
        return "Напиток-> " +
                "объем:  " + volume +
                ", наименование: " + super.getName() + "\t" +
                ", цена: " + super.getPrice() + "\t"+
                ", температура   " + temperature;
    }
}
