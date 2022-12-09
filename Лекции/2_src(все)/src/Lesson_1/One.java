package Lesson_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class One {
    public static void main(String[] args) throws IOException {
        String[] name = { "C", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Cергей
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
        // C,е,р,г,е,й
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
        FileWriter text = new FileWriter("text.txt");
            text.write(sk);
            text.close();
    }
}
