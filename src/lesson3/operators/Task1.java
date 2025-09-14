package lesson3.operators;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер месяца ");
        int month = scanner.nextInt();

        String poraGoda;

        switch (month) {
            case 12: case 1: case 2:
                poraGoda = "Winter";
                break;
            case 3: case 4: case 5:
                poraGoda = "Spring";
                break;
            case 6: case 7: case 8:
                poraGoda = "Summer";
                break;
            case 9: case 10: case 11:
                poraGoda = "Autumn";
                break;
            default:
                poraGoda = "Wrong month number!";
        }

        System.out.println("Season is: " + poraGoda);
    }
}
