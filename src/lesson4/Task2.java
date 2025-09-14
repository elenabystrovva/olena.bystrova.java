package lesson4;
import java.util.Scanner;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива:");
        int arraySize = scanner.nextInt();

        if (arraySize <= 0) {
            System.out.println("Размер массива должен быть больше нуля.");
            return;
        }

        int[] numbers = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        System.out.println("Сгенерированный массив: " + Arrays.toString(numbers));

        // Инициализация переменных для вычислений
        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;

        // Поиск максимума, минимума и суммы
        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
            sum += num;
        }

        double average = (double) sum / arraySize;

        System.out.println("Максимальное значение:" + max);
        System.out.println("Минимальное значение:" + min);
        System.out.println("Среднее значение:" + average);

        scanner.close();
    }
}
