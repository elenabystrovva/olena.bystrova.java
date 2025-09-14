package lesson5;
import java.util.Scanner;
import java.util.Random;

public class Task0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Размеры массива (можно изменить при желании)
        int x = 3, y = 3, z = 3;
        int[][][] array = new int[x][y][z];

        // Заполняем массив случайными числами от 0 до 9
        System.out.println("Исходный массив:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    array[i][j][k] = random.nextInt(10);
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.print(" | "); // Разделитель для удобства
            }
            System.out.println();
        }

        // Число для увеличения
        System.out.print("\nВведите число, на которое увеличить каждый элемент: ");
        int increment = scanner.nextInt();

        // Увеличиваем каждый элемент на заданное число
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    array[i][j][k] += increment;
                }
            }
        }

        // Вывод обновленного массива
        System.out.println("Массив после увеличения:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
