import java.time.LocalTime;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Введите имя");
        String name = (new Scanner(System.in).nextLine());
        LocalTime time = LocalTime.now();
        LocalTime moning = LocalTime.of(5, 0, 0);
        LocalTime day = LocalTime.of(12, 0, 0);
        LocalTime evening = LocalTime.of(18, 0, 0);
        LocalTime night = LocalTime.of(23, 0, 0);


        //int time = LocalTime.now().getHour();
//        if (time >= 5 && time <= 12) {
//            System.out.printf("Доброе утро, %s", name);
//        }
//        if (time >= 13 && time <= 17) {
//            System.out.printf("Добрый день, %s", name);
//        }
//        if (time >= 18 && time <= 22) {
//            System.out.printf("Добрый вечер, %s", name);
//        }
//        if (time >= 23 && time < 24 || time < 5) {
//            System.out.printf("Доброй ночи, %s", name);
//        }
        if (time.isAfter(moning) && time.isBefore(day)) {
            System.out.printf("Доброе утро, %s", name);
        }
        if (time.isAfter(day) && time.isBefore(evening)) {
            System.out.printf("Добрый день, %s", name);
        }
        if (time.isAfter(evening) && time.isBefore(night)) {
            System.out.printf("Добрый вечер, %s", name);
        }
        if (time.isAfter(night) && time.isBefore(moning)) {
            System.out.printf("Доброй ночи, %s", name);
        }


    }
}
