
public class Main {
    public static void main(String[] args) {

        BankAccount testAccount = new BankAccount("Max", " Mustermann",
                "DE123456789", 750);
        System.out.println(testAccount);

        testAccount.deposit(200);
        System.out.println("Kontostand: " + testAccount.getAccountBalance() + " EUR");

        testAccount.payOut(1600);
        System.out.println("Kontostand: " + testAccount.getAccountBalance() + " EUR");


        testAccount.payOut(400);
        System.out.println("Kontostand: " + testAccount.getAccountBalance() + " EUR");





    }
}