import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> ve = new ArrayList<>();
        ve.add(new HotDrink("чай", 12.4, 0.5, 24));
        ve.add(new HotDrink("кофе", 12.3, 1, 30));
        ve.add(new Product("хлеб", 3.5 ));
        ve.add(new Ets("мясо", 123.4 , 12));
        for (Object q : ve) {
            System.out.println(q);

        }
        HotDrinkVendingMachine Hd = new HotDrinkVendingMachine();
        HotDrinkVendingMachine Hd1 = new HotDrinkVendingMachine();
        VendingMachine Hd2 = new VendingMachine();
        VendingMachinTea hd3 = new VendingMachinTea();

        Hd.restore(Hd.getProduct("Сок", 12.4,1,15));
        Hd1.restore(Hd1.getProduct("Молоко", 22.4,1.3,25));
        Hd2.restore(Hd2.getProduct("хлеб", 3.5));
        hd3.restore(hd3.getProduct("мясо", 123.4 , 12));


    }
}