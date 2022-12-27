import java.util.List;

public class VendingMachine {

    public Product getProduct(String name, double price) {
        return new Product(name, price);

    }

    public void restore(Product product) {
        System.out.println("Продукт выдан " + product);
    }


}
