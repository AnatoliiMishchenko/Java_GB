package src;

//Вывести все простые числа от 1 до 1000

public class HW_task_2 {
    public static void main(String[] args) {
        int i;
        int j;
        for (i = 1; i < 1000; i++) {
            for (j = 2; j < i; j++) {// берем с двойки так как число 1 не является натуральным
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i) {
                System.out.printf("%d.", i);
            }
        }
    }
}
