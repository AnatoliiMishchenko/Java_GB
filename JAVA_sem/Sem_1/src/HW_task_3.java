package src;

import java.util.Scanner;

public class HW_task_3 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите первое число");
            String oneNumber = (new Scanner(System.in).nextLine());
            System.out.println("Введите арифметическую операцию");
            String znac = (new Scanner(System.in).nextLine()).trim();
            System.out.println("Введите второе число");
            String twoNumber = (new Scanner(System.in).nextLine());
            String end = "Для завершения работы введите q";

            switch (znac) {
                case ("+"):
                    System.out.println(Double.parseDouble(oneNumber) + Double.parseDouble(twoNumber) + "\n" + end);
                    break;
                case ("-"):
                    System.out.println(Double.parseDouble(oneNumber) - Double.parseDouble(twoNumber) + "\n" + end);
                    break;
                case ("*"):
                    System.out.println(String.format("%.2f", (Double.parseDouble(oneNumber) * Double.parseDouble(twoNumber))) + "\n" + end);
                    break;
                case ("/"):
                    if (Double.parseDouble(twoNumber) == 0) {
                        System.out.println("Делить на ноль нельзя" + "\n" + "Введите второе число");
                        twoNumber = (new Scanner(System.in).nextLine());
                    }
                    System.out.print(String.format("%.2f", (Double.parseDouble(oneNumber) / Double.parseDouble(twoNumber))) + "\n" + end + "\n");
                    break;
                default:
                    System.out.println("Вы ввели не арифметическую операцию" + "\n" + end);
                    break;
            }

            if (znac.equals("q") || oneNumber.equals("q") || twoNumber.equals("q")) {
                System.out.println("Пока");
                break;
            }

        }
    }
}
