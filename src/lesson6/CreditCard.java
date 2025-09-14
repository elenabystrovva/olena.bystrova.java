package lesson6;

public class CreditCard {
    private String accountNumber; // номер счета
    private double balance;       // текущая сумма на счету

    // Конструктор
    public CreditCard(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Метод для начисления суммы на карту
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("На счет " + accountNumber +
                    " зачислено " + amount + " eur");
        } else {
            System.out.println("Сумма для пополнения должна быть положительной!");
        }
    }

    // Метод для снятия суммы с карты
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Со счета " + accountNumber +
                        " снято " + amount + " eur");
            } else {
                System.out.println("Недостаточно средств на счете " + accountNumber);
            }
        } else {
            System.out.println("Сумма для снятия должна быть положительной!");
        }
    }

    // Метод для вывода информации о карте
    public void printInfo() {
        System.out.println("Счет: " + accountNumber +
                ", Текущий баланс: " + balance + " eur");
    }
}
