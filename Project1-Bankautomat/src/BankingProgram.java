

import java.util.Scanner;

public class BankingProgram {
    public BankingProgram() {
    }

    public static void main(String[] var0) {
        Scanner scanner = new Scanner(System.in);
        double startBalance = 0;
        boolean isOn = true;

        while(isOn) {
            System.out.println("\n");
            System.out.println("# # # # # # # # # #");
            System.out.println("#   BANK AUTOMAT  #");
            System.out.println("# # # # # # # # # #");
            System.out.println(" ");
            System.out.println("Was möchten Sie tun?");
            System.out.println(" ");
            System.out.println("1. Kontostand anzeigen");
            System.out.println("2. Einzahlung");
            System.out.println("3. Auszahlung");
            System.out.println("4. Beenden");
            System.out.println(" ");
            System.out.println("# # # # # # # # # #");
            System.out.print("Ihre Eingabe: ");
            int numberFromInput = scanner.nextInt();
            switch (numberFromInput) {
                case 1:
                    showBalance(startBalance);
                    break;
                case 2:
                    startBalance += deposit(scanner);
                    showBalance(startBalance);
                    break;
                case 3:
                    startBalance -= withdraw(scanner, startBalance);
                    showBalance(startBalance);
                    break;
                case 4:
                    System.out.println("Auf Wiedersehen!");
                    isOn = false;
                    break;
                default:
                    System.out.println("Bitte geben Sie eine Zahl zwischen 1-4 ein");
                    System.out.println(" ");
                    System.out.println("# # # # # # # # # #");
                    System.out.println("\n");
            }
        }

    }

    public static void showBalance(double balance) {

        System.out.printf("Aktueller Kontostand: %.2f€ %n", balance);
    }

    public static double deposit(Scanner scanner) {
        System.out.print("Wie viel moechten Sie einzahlen?: ");
        double currentBalance = scanner.nextDouble();
        if (currentBalance > 0) {
            System.out.printf("Ihre Einzahlug beträgt: %.2f€ %n", currentBalance);
        } else {
            System.out.println("Ihre Einzahlung ist nicht moeglich!");
            currentBalance = 0;
        }

        return currentBalance;
    }

    public static double withdraw(Scanner scanner, double amount) {
        System.out.print("Wieviel moechten sie abheben?: ");
        double currentAmount = scanner.nextDouble();
        if (currentAmount > 0 && currentAmount <= amount) {
            System.out.printf("Ihre Auszahlung beträgt: %.2f€ %n", currentAmount);
        } else {
            System.out.println("Vorgang nicht moeglich!");
            currentAmount = 0;
        }

        return currentAmount;
    }
}
