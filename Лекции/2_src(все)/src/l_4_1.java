import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class l_4_1 {
    public static void main(String[] args) {
        Map<Integer,String> tt = new HashMap<>();
        tt.put(1, String.format("пол", ));
        tt.putIfAbsent(2,"dfcz");
        System.out.println(tt);


    }
}
