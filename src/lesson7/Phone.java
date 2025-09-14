package lesson7;

public class Phone {
    private String number;
    private String model;
    private double weight;

    // Конструктор без параметров
    public Phone() {
        System.out.println("Вызван конструктор без параметров");
    }

    // Конструктор с двумя параметрами
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        System.out.println("Вызван конструктор с двумя параметрами");
    }

    // Конструктор с тремя параметрами (вызывает конструктор с двумя)
    public Phone(String number, String model, double weight) {
        this(number, model); // вызов конструктора с двумя параметрами
        this.weight = weight;
        System.out.println("Вызван конструктор с тремя параметрами");
    }

    // Метод выводит сообщение о звонке
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    // Перегруженный метод с именем и номером звонящего
    public void receiveCall(String name, String callerNumber) {
        System.out.println("Звонит " + name + ", номер: " + callerNumber);
    }

    // Возврат номера телефона
    public String getNumber() {
        return number;
    }

    // Метод отправки сообщения нескольким номерам
    public void sendMessage(String... numbers) {
        System.out.println("Отправка сообщения на номера:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }

    // Метод вывода информации о телефоне
    public void printInfo() {
        System.out.println("Номер: " + number +
                ", Модель: " + model +
                ", Вес: " + weight + " г");
    }
}
