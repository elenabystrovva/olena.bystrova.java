package lesson3.operators;
import java.util.Scanner;

public class Task2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input the month: ");
            int month = scanner.nextInt();

            String poraGoda;

            if (month == 12 || month == 1 || month == 2) {
                poraGoda = "Winter";
            } else if (month >= 3 && month <= 5) {
                poraGoda = "Spring";
            } else if (month >= 6 && month <= 8) {
                poraGoda = "Summer";
            } else if (month >= 9 && month <= 11) {
                poraGoda = "Autumn";
            } else {
                poraGoda = "Wrong month!";
            }

            System.out.println("Season is: " + poraGoda);
        }
    }
