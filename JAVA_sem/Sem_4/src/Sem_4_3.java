import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 📔 Реализовать консольное приложение, которое:
 * <p>
 * 1. Принимает от пользователя и “запоминает” строки.
 * 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
 * 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
 */
public class Sem_4_3 {
    public static void main(String[] args) {
        Deque<String> list = new ArrayDeque<>();
        while (true) {
            System.out.println("\n" + "Введите строку");
            String name = (new Scanner(System.in)).nextLine();
            if (name.isEmpty()) {
                break;
            } else if (name.equals("print")) {
                while (!list.isEmpty()) {
                    System.out.print(list.removeLast() + ' ');
                }
            } else if (name.equals("revert")) {
                list.removeLast();
            } else {
                list.add(name);
            }
        }
        System.out.print(list);
    }
}
