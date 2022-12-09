import java.util.LinkedList;
import java.util.Scanner;

/**
 * Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Home_work_2 {

    public static void main(String[] args) {
        LinkedList<String> Start = enqueue();
        System.out.println(Start);
        System.out.println(dequeue(Start));
        System.out.println(Start);
        System.out.println(first(Start));
        System.out.println(Start);
    }

    public static LinkedList<String> enqueue() {
        LinkedList<String> start = new LinkedList<>();
        while (true) {
            System.out.println("Введите значение");
            String name = (new Scanner(System.in)).nextLine();
            if (name.isEmpty()) {
                break;
            } else {
                start.add(name);
            }
        }
        return start;
    }

    public static String dequeue(LinkedList<String> list) {
        String firstDel = list.removeFirst();
        return firstDel;
    }


    public static String first(LinkedList<String> list) {
        String first = list.peekFirst();
        return first;
    }
}
