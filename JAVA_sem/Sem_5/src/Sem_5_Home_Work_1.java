import java.util.HashMap;
import java.util.Map;

/**
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
public class Sem_5_Home_Work_1 {
    public static void main(String[] args) {
        Map<String, int[]> phoneBook = new HashMap<>();
        phoneBook.put("Смирнов", new int[]{329554845});
        phoneBook.put("Петров", new int[]{44556457, 364464512});
        phoneBook.put("Миронов", new int[]{54456258, 36445575, 25745963});
        for (var i : phoneBook.entrySet())
            System.out.println("Фамилия: " + i.getKey() + ret(i.getValue()));
    }

    public static StringBuilder ret(int[] value) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < value.length; i++) {
            result.append("\n телефон №"+(i + 1)+ " - "+value[i]);
        }

        return result.append(".");
    }
}
