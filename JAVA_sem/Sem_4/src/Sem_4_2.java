import java.util.LinkedList;
import java.util.Scanner;

/**
 * Реализовать консольное приложение, которое:
 * 1. Принимает от пользователя строку вида
 * text~num
 * 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
 * 2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 * </aside>
 */
public class Sem_4_2 {
    public static void main(String[] args) {
        while (true) {

            System.out.println("Введите строку и разделитель тильда и номер. при распечатания введите print и позиция");
            String name = (new Scanner(System.in)).nextLine();
            String[] arr = name.split("~");
            LinkedList<String> link = new LinkedList<>();

            int number = Integer.parseInt(arr[1]);
            for (int i = 0; i < number * 2; i++) {
                link.add(arr[0]);
            }
            if (arr[0].equals("print")) {
                System.out.println(link.remove(number));
            } else {
                link.add(number, arr[0]);
            }
            System.out.println(link);
            if (arr[0].equals("end")) {
                break;
            }


        }

    }
}
