//Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.


import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        int[] Array = {3, 7, 9, 4, 9, 1,0};
        System.out.println("Введите цифру");
        int number = (new Scanner(System.in).nextInt());
        for (int i = 0; i < Array.length-1; i++) {
            if (Array[i] == number) {
                int t = Array[i];
                Array[i] = Array[i+1];
                Array[i+1] = t;

            }
        }
        for (int i : Array) {
            System.out.print(i + " ");
        }

    }
}
