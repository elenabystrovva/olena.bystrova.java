import lesson6.CreditCard;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        CreditCard card1 = new CreditCard("4149 9890 5456 1232", 1000);
        CreditCard card2 = new CreditCard("4321 6754 7654 8754", 2000);
        CreditCard card3 = new CreditCard("4149 8767 8765 5678", 3000);

        // Тестовый сценарий
        card1.deposit(150);   // положить деньги на первую карту
        card2.deposit(250);   // положить деньги на вторую карту
        card3.withdraw(350);  // снять деньги с третьей карты

        System.out.println("Текущий баланс:");
        card1.printInfo();
        card2.printInfo();
        card3.printInfo();
    }
}