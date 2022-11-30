package src;

//**Текст задачи:**
//        Настроить проект, вывести в консоль “Hello world!”.
//
//        Вывести в консоль системные дату и время.

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("выываа " + time);
    }
}
