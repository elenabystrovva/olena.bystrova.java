package lesson4;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        // Создаём два массива по 5 целых чисел
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        System.out.println("Массив 1: " + Arrays.toString(array1));
        System.out.println("Массив 2: " + Arrays.toString(array2));

        double sum1 = 0;
        double sum2 = 0;

        for (int num : array1) {
            sum1 += num;
        }
        for (int num : array2) {
            sum2 += num;
        }

        double average1 = sum1 / array1.length;
        double average2 = sum2 / array2.length;

        System.out.println("Среднее значение массива 1: " + average1);
        System.out.println("Среднее значение массива 2: " + average2);

        // Сравнение средних
        if (average1 > average2) {
            System.out.println("Среднее значение первого массива больше");
        } else if (average2 > average1) {
            System.out.println("Среднее значение второго массива больше");
        } else {
            System.out.println("Средние значения обоих массивов равны.");
        }
    }
}
