import java.util.*;

/**
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
 * Вывести название каждой планеты без повторения.
 */
public class sem_3_3 {
    public static void main(String[] args) {
        String[] plan = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон"};
        ArrayList<String> array = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 15; i++) {
            array.add(plan[rnd.nextInt(0, plan.length)]);
        }
        Collections.sort(array);
        System.out.println(array);

        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i) == array.get(i + 1)) {
                array.remove(array.get(i));
                i--;
            }
        }
        System.out.println(array);

        Set<String> newSet = new HashSet<>(array);// в коллекцию "Set"  можно добавить только не повторяющие элементы
        System.out.println(newSet);

    }
}


