import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 */


public class Home_work_2 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random rnd = new Random();
        System.out.println("Введите количество элементов списка");
        int number = (new Scanner(System.in)).nextInt();
        for (int i = 0; i < number; i++) {
            array.add(rnd.nextInt(10));
        }
        System.out.println(array);
        System.out.println(notEvenArray(array));
    }

    public static ArrayList<Integer> notEvenArray(ArrayList<Integer> arrayList) {
        ArrayList <Integer> newArray = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 != 0){
                newArray.add(arrayList.get(i));
            }
        }
        return newArray;
    }
}

