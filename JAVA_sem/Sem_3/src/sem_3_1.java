import java.util.*;

/**
 * Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
 */


public class sem_3_1 {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            intArray.add(rnd.nextInt(100));
        }
        System.out.println(intArray);
//        printArray(intArray);
        Collections.sort(intArray);
//        printArray(intArray);
        System.out.println(intArray);


    }
    public static void printArray( ArrayList<Integer> array){
        StringBuilder print = new StringBuilder();
        for (Integer i:array
             ) {
           print.append(i + ", ");
        }
        print = new StringBuilder(print.substring(0, print.length() - 2));

        System.out.println(print);
    }
}
