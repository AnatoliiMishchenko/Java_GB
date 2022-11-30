import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


/**
 * Напишите метод, который вернет содержимое текущей файла в виде массива строк.
 * Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
 * Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
 * оно должно записаться в лог-файл.
 */
public class sem_2_3 {
    public static void main(String[] args) {
        String path = "C:\\Users\\Anatolii\\Desktop\\git_GB\\Java_GB\\JAVA_sem\\Sem_2\\src";

        printArray(getFolderContent(path));
        writeFolderContent(getFolderContent(path));


    }

    public static ArrayList<String> getFolderContent(String path) {
        ArrayList<String> array = new ArrayList<>();
        try {
            File text = new File(path);
            for (File f : text.listFiles()) {
                array.add(f.getName());
            }
            return array;
        } catch (Exception e) {
            logger("Ошибка открытия файла");
            System.out.println("Ошибка открытия файла");
            array.add("ошибка");
        }
        return array;
    }

    public static void printArray(ArrayList<String> array) {
        for (String i : array) {
            System.out.println(i);

        }
    }

    public static void writeFolderContent(ArrayList<String> array) {
        try {
            FileWriter fl = new FileWriter("content.txt", true);
            for (String f : array) {
                fl.write(f);
                fl.append("\n");
            }
            fl.flush();
        } catch (Exception e) {
            logger("Ошибка открытия файла");
            System.out.println("Ошибка записи");
        }

    }

    public static void logger(String text) {
        try {
            FileWriter log = new FileWriter("log.txt", true);
            log.write(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/mm/YYYY  HH:mm:ss ")) + text.concat("\n"));
            log.flush();
        } catch (Exception e) {
            System.out.println(e);

        }

    }
}
