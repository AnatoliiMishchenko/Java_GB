import java.util.Scanner;

public class HW_task_3 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите первое число");
            double oneNumber = (new Scanner(System.in).nextDouble());
            System.out.println("Введите арифметическую операцию");
            String znac = (new Scanner(System.in).nextLine()).strip();
            System.out.println("Введите второе число");
            double twoNumber = (new Scanner(System.in).nextDouble());
            String end = "Для завершения работы введите q";

            switch (znac) {
                case ("+"):
                    System.out.println(oneNumber + twoNumber + "\n" + end);
                    break;
                case ("-"):
                    System.out.println(oneNumber - twoNumber + "\n" + end);
                    break;
                case ("*"):
                    System.out.println(String.format("%.2f", (oneNumber * twoNumber)) + "\n" + end);
                    break;
                case ("/"):
                    if (twoNumber == 0) {
                        System.out.println("Делить на ноль нельзя" + "\n" + "Введите второе число");
                        twoNumber = (new Scanner(System.in).nextDouble());
                    }
                    System.out.print(String.format("%.2f", (oneNumber / twoNumber)) + "\n" + end + "\n");
                    break;
                default:
                    System.out.println("Вы ввели не арифметическую операцию" + "\n" + end);
                    break;
            }

            if (znac.equals("q")) {
                System.out.println("Пока");
                break;
            }

        }
    }
}
