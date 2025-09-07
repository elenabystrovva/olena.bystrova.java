package lesson3.operators;
import java.util.Scanner;


public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер: ");
        int number = scanner.nextInt();

        String color;

        switch (number) {
            case 1:
                color = "Красный";
                break;
            case 2:
                color = "Оранжевый";
                break;
            case 3:
                color = "Жёлтый";
                break;
            case 4:
                color = "Зелёный";
                break;
            case 5:
                color = "Голубой";
                break;
            case 6:
                color = "Синий";
                break;
            case 7:
                color = "Фиолетовый";
                break;
            default:
                color = "Некорректный номер! Нужно число от 1 до 7.";
        }

        System.out.println("Цвет радуги: " + color);
    }
}
