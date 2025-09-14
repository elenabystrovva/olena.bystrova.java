package lesson3.operators;
import java.util.Scanner;

public class Task8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите положительное число: ");
            int n = scanner.nextInt();

            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;  // прибавляем текущее число к сумме
            }

            System.out.println("Сумма чисел от 1 до " + n + " равна: " + sum);
        }
}
