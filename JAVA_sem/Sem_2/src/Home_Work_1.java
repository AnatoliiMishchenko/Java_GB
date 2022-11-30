import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл
 */

public class Home_Work_1 {
    public static void main(String[] args) throws IOException {
        int[] array = {5,6,4,3,8,0,1, 3, 4, 5, 2, 6, 7, 8};
        bubleSort(array);

    }

    public static void bubleSort(int[] array) {
        try {
            FileWriter log = new FileWriter("logb.txt", true);// создает объект с именем log

            for (int i : array) {                                            //Вывод массива
                System.out.print(i + " ");
            }


            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        log.write(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss: "))
                                + " элемент " + array[i] + " под номером " + (i + 1) +
                                " меняется на элемент " + array[j] + " под номером " + (j + 1) + " получаем массив ");
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;

                        for (int r : array) {
                            log.write(Integer.toString(r));// записываем массив
                        }
                        log.write('\n');
                    }
                }
            }

            System.out.println("\nОтсортированный массив");
            for (int w : array) { //Вывод массива отсортированного
                System.out.print(w + " ");
            }
            log.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
