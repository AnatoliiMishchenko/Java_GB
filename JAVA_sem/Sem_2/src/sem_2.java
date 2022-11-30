//Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N,
// которая состоит из чередующихся символов c1 и c2, начиная с c1.

import java.util.Scanner;

public class sem_2 {
    public static void main(String[] args) {
        while (true) {
            if (vod2() % 2 == 0) {
                print(vod2(), vod(), vod1());
                break;
            } else {
                System.out.println("Вы ввели не четное число");
            }
        }
    }
    public static void print(int N, String c1, String c2) {
    StringBuilder mane = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                mane.append(c1);
            } else {
                mane.append(c2);
            }
        }
        System.out.println(mane);
   }
   public static String vod(){
       System.out.println("Введите символ");
       String c1 = ((new Scanner(System.in)).nextLine());
       return c1;
   }
   public static String vod1(){
       System.out.println("Введите символ");
       String c2 = ((new Scanner(System.in)).nextLine());
       return c2;
   }
   public static int vod2(){
       System.out.println("Введите число n");
       int n = (new Scanner(System.in)).nextInt();
       return n;
   }
}




