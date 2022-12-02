import java.util.*;

/**
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
 * Вывести название каждой планеты и количество его повторений в списке.
 */

public class sem_3_2 {
    public static void main(String[] args) {
        String[] plan = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон"};
        ArrayList<String> array = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 150; i++) {
            array.add(plan[rnd.nextInt(0, plan.length)]);
        }
        print(array);
    }

    public static void print(ArrayList<String> arrayList) {
        System.out.println(arrayList);
        Set<String> PlanEnd = new HashSet<String>(arrayList);
        for (String st : PlanEnd
        ) {
            System.out.println(st + " = " + Collections.frequency(arrayList, st));
        }

    }

}

