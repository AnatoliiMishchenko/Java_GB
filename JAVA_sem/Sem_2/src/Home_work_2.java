/**
 * К калькулятору из предыдущего дз добавить логирование.
 */

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Home_work_2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите первое число");
        String oneNumber = (new Scanner(System.in).nextLine());
        System.out.println("Введите арифметическую операцию");
        String znac = (new Scanner(System.in).nextLine()).trim();
        System.out.println("Введите второе число");
        String twoNumber = (new Scanner(System.in).nextLine());
        String end = "Для завершения работы введите q";
        System.out.println(calculen(oneNumber, znac, twoNumber));
        logi(calculen(oneNumber, znac, twoNumber));


    }

    public static String calculen(String oneNumber, String znac, String twoNumber) {

        String end = "Для завершения работы введите q";
        String str = "";
        double ruselt = 0;

        switch (znac) {
            case ("+"):
                ruselt = Double.parseDouble(oneNumber) + Double.parseDouble(twoNumber);
                str = oneNumber.concat(" + ").concat(twoNumber).concat(" = ").concat(String.valueOf(ruselt));
                break;
            case ("-"):
                ruselt = Double.parseDouble(oneNumber) - Double.parseDouble(twoNumber);
                str = oneNumber.concat("-").concat(twoNumber).concat("=").concat(String.valueOf(ruselt));

                break;
            case ("*"):
                ruselt = Double.parseDouble(oneNumber) * Double.parseDouble(twoNumber);
                str = oneNumber.concat("*").concat(twoNumber).concat("=").concat(String.valueOf(ruselt));

                break;
            case ("/"):
                if (Double.parseDouble(twoNumber) == 0) {
                    System.out.println("Делить на ноль нельзя" + "\n" + "Введите второе число");
                    twoNumber = (new Scanner(System.in).nextLine());
                }
                ruselt = Double.parseDouble(oneNumber) / Double.parseDouble(twoNumber);
                str = oneNumber.concat("/").concat(twoNumber).concat("=").concat(String.format("%.2f", ruselt));
                break;
            default:
                str = "Вы ввели не арифметическую операцию";
                break;
        }
        return str;
    }


    public static void logi(String str) throws IOException {
        Logger logger = Logger.getLogger(Home_work_2.class.getName());
        FileHandler fw = new FileHandler("calcLog.txt", true);
        logger.addHandler(fw);
        SimpleFormatter sFormat = new SimpleFormatter();
        fw.setFormatter(sFormat);
        logger.info(str);
    }
}

