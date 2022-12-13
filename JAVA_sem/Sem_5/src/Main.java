import java.util.*;

/**
 * Создать структуру данных для хранения.Номер паспорта и Фамилию сотрудника организации
 * 1234 Иванов
 * 2458 Сергеев
 * 1247 Иванов
 * 1457 Стрельников
 * 1154 Мищенко
 * 145789 Иванов
 * 1471 Петров
 *вывести данные по фамилии Иванов
 *
 */
public class Main {
    public static void main(String[] args) {
       Map<Integer, String> basSotrud = new HashMap<>();
       String encoding = System.getProperty("console.encoding","UTF-8");
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите номер паспорта и фамилию");
            String s = (new Scanner(System.in, encoding)).nextLine().trim();
            String[] d = s.split(" ");
            basSotrud.put(Integer.parseInt(d[0]), d[1]);
        }
        for (Map.Entry<Integer, String> i: basSotrud.entrySet()) {
            System.out.print(i.getKey() + " " + i.getValue() + "\n");
        }
        System.out.println("===========");
        for (Map.Entry<Integer, String> i: basSotrud.entrySet()) {
            if(i.getValue().equals("Иванов")){
                System.out.print(i.getKey() + " " + i.getValue() + "\n");
            }

        }
        }
}
