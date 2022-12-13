import java.util.HashMap;
import java.util.Map;

/**
 * Даны две строки надо убедиться что они изоморфны с помощью метода
 */
public class Sem_5_1 {
    public static void main(String[] args) {
        System.out.println(isIzomorphMetod("paper","title"));

    }

    public static boolean isIzomorphMetod(String one, String tow) {

        if (one.length() != tow.length()) {
            return false;
        }
        if (one.equals(tow)) {
            return true;
        }
        Map<Character, Character> elem = new HashMap<>();

        for (int i = 0; i < one.length(); i++) {
            char a = one.charAt(i);
            char b = tow.charAt(i);
            if (elem.containsKey(a) && b != elem.get(a)) {
                return false;
            } else {
                elem.putIfAbsent(a, b);
            }
        }

        return true;
    }
}
