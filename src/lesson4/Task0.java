package lesson4;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число:");
        int yourNumber = scanner.nextInt();

        boolean found = false;

        for (int num : numbers) {
            if (num == yourNumber) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число " + yourNumber + " входит в массив.");
        } else {
            System.out.println("Число " + yourNumber + " НЕ входит в массив.");
        }

        scanner.close();
    }
}
