public class HotDrinkVendingMachine extends VendingMachine{

    public Product getProduct(String name, double price,double volume, int temperature){
        return new HotDrink(name, price,volume, temperature);
    }
}

