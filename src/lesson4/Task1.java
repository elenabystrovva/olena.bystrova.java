package lesson4;
import java.util.Scanner;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для удаления:");
        int deletedNumber = scanner.nextInt();

        int count = 0;
        for (int num : numbers) {
            if (num == deletedNumber) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Число " + deletedNumber + " не найдено в массиве.");
            return;
        }

        int[] result = new int[numbers.length - count];
        int index = 0;
        for (int num : numbers) {
            if (num != deletedNumber) {
                result[index++] = num;
            }
        }

        // Выводим результат
        System.out.println("Новый массив без числа " + deletedNumber + ": " + Arrays.toString(result));

        scanner.close();
    }
}
