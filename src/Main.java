import lesson7.Phone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone("49-111-111-111", "Samsung Galaxy", 180);
        Phone phone2 = new Phone("49-222-222-222", "iPhone 17", 170);
        Phone phone3 = new Phone("49-333-333-333", "Xiaomi Redmi", 190);

        System.out.println("Информация о телефонах:");
        phone1.printInfo();
        phone2.printInfo();
        phone3.printInfo();

        System.out.println("Проверка методов receiveCall и getNumber:");
        phone1.receiveCall("Андрей");
        System.out.println("Номер телефона: " + phone1.getNumber());

        phone2.receiveCall("Мария");
        System.out.println("Номер телефона: " + phone2.getNumber());

        phone3.receiveCall("Иван");
        System.out.println("Номер телефона: " + phone3.getNumber());

        System.out.println("Перегруженный метод receiveCall (имя + номер):");
        phone1.receiveCall("Ольга", "49-577-231-323");
        phone2.receiveCall("Петр", "49-568-265-309");
        phone3.receiveCall("Елена", "49-555-876-654");

        System.out.println("Отправка сообщений:");
        phone1.sendMessage("49-999-111-111", "49-999-222-222", "49-999-333-333");

    }
}