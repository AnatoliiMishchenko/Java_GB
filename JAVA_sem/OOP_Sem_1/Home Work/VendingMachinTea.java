public class VendingMachinTea extends VendingMachine{

    @Override
    public void restore(Product product) {
        super.restore(product);
    }


    public Product getProduct(String name, double price, double wigth) {
        return new Ets(name, price,wigth);
    }
}
