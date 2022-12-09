import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */
public class Home_work_1 {
    public static void main(String[] args) {
        System.out.println("Введите число элементов");
        int N = (new Scanner(System.in)).nextInt();
        LinkedList<Integer> y = startList(N);
        System.out.println(y);
        System.out.println(endList(y));
    }


    // Метод заполнения LinkedList
    public static LinkedList<Integer> startList(int i) {
        LinkedList<Integer> sratlist = new LinkedList<Integer>();
        for (int j = 0; j < i; j++) {
            Random rt = new Random();
            sratlist.add(rt.nextInt(0, 100));
        }
        return sratlist;
    }

    // Метод переворачивания заданного LinkedList
    public static LinkedList<Integer> endList(LinkedList<Integer> start) {
        LinkedList<Integer> end = new LinkedList<Integer>();
        for (int i = start.size() - 1; i > -1; i--) {
            end.add(start.remove(i));
        }
        return end;
    }
}
