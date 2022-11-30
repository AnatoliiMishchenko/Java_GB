/*  Напишите метод, который принимает на вход строку (String)
    и определяет является ли
    строка палиндромом (возвращает boolean значение).*/

import java.util.Arrays;
import java.util.List;

public class Sem_2_1 {
    public static void main(String[] args) {
        String text = "попq";
        System.out.println(polidrom(text));
        print(text, polidrom1(text));
        System.out.println(polidrom2(text));
    }

    public static String polidrom(String text) {
        String t;
        char[] array = text.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        String text_p = new String(array);
        if (text_p.equals(text)) {
            t = "является полиндромом";
        } else {
            t = "не является полиндромом";
        }
        return t;
    }

    public static String polidrom1(String text) {
        String t;
        String[] array = text.split("");
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        String text_p = String.join("", array);
        if (text_p.equals(text)) {
            t = "является полидромом";
        } else {
            t = "не является полидромом";
        }
        return t;
    }

    public static String polidrom2(String text) {
        String t;
        int count = 0;
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) == text.charAt(text.length() - i - 1)) {
                count++;
            }
        }
        if (count == (text.length() / 2)) {
            t = "является полидромом";
        } else {
            t = "не является полидромом";
        }
        return t;
    }
    public static void print(String name, String name1) {
        System.out.println(name);
        System.out.println(name1);
    }


}
