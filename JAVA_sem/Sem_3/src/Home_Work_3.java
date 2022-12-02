import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */
public class Home_Work_3 {


    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random rnd = new Random();
        System.out.println("Введите количество элементов списка");
        int number = (new Scanner(System.in)).nextInt();
        for (int i = 0; i < number; i++) {
            array.add(rnd.nextInt(-10 ,10));
        }
        System.out.println(array);
        Max_min_sred(array);
        System.out.println();
        sortMetod(array);
    }

    public static void Max_min_sred(ArrayList<Integer> arrayList) {
        int Max = arrayList.get(0);
        int min = arrayList.get(1);
        int summ = 0;
        for (Integer i : arrayList
        ) {
            if (Max <= i) {
                Max = i;
            }
            if (min >= i) {
                min = i;
            }
            summ += i;
        }
        int sred = (summ) / arrayList.size();
        boolean sredn = true;
        do {
            for (Integer i : arrayList) {
                if (sred == i) {
                    sredn = false;
                }
            }
            sred++;
        } while (sredn);
        System.out.printf(" максимальное число %d , минимальное число %d, среднее значение %d ", Max, min, sred - 1);
    }

    public static void sortMetod(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        int Max = arrayList.get(arrayList.size() - 1);
        int Min = arrayList.get(0);
        int sred = arrayList.get(arrayList.size() / 2);
        System.out.println(arrayList);
        System.out.printf(" максимальное число %d , минимальное число %d, среднее значение %d ", Max, Min, sred);
    }
}
