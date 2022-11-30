import java.io.FileWriter;
import java.io.IOException;

/**
 * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод
 * , который запишет эту строку в простой текстовый файл, обработайте исключения.
 */

public class sem_2_2 {
    public static void main(String[] args) {
        try (FileWriter fail = new FileWriter("text.txt", true)) {
            String name = " TEST ";
            StringBuilder text = new StringBuilder();
            for (int i = 0; i < 100; i++) {
                text.append(name);
            }
            fail.write(String.valueOf(text));
            fail.flush();

        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

}
