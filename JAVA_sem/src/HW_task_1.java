//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)


import java.util.Formatter;
import java.util.Scanner;

public class HW_task_1 {
    public static void main(String[] args) {
        System.out.println("Введите число N");
        int n = (new Scanner(System.in).nextInt());

        System.out.printf("сумма чисел от 1 до %d = %d,  а факториал числа %d = %d", n, Summ(n),n,Factorial(n));


    }


    public static int Factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return Factorial(number - 1) * number;
    }

    public static int Summ(int number) {
        if (number == 1) {
            return 1;
        }
        return Summ(number - 1) + number;
    }


}
