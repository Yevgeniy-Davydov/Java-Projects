import java.util.Scanner;
import java.util.Random;

public class SlotMachine {

    // Die 5 möglichen Symbole
    static String[] symbols = { "7", "BAR", "X", "O", "%" };

    // Zufälliges Symbol zurückgeben
    static String getRandomSymbol(Random random) {
        int index = random.nextInt(symbols.length);
        return symbols[index];
    }

    // 3 Symbole ziehen und anzeigen lassen
    static String[] spin(Random random) {
        String[] result = new String[3];
        result[0] = getRandomSymbol(random);
        result[1] = getRandomSymbol(random);
        result[2] = getRandomSymbol(random);
        return result;
    }

    // Prüfen ob alle 3 Symbole gleich sind
    static boolean isWin(String[] result) {
        return result[0].equals(result[1]) && result[1].equals(result[2]);
    }

    // Einsatz vom User abfragen (mit Validierung)
    static int getBet(Scanner scanner, int balance) {
        int bet = 0;
        while (bet <= 0 || bet > balance) {
            System.out.println("Dein Geldstand: " + balance + " €");
            System.out.print("Einsatz eingeben (1 - " + balance + "): ");
            bet = scanner.nextInt();
            if (bet <= 0 || bet > balance) {
                System.out.println("Ungültiger Einsatz! Bitte nochmal.");
            }
        }
        return bet;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Startgeld
        int balance = 100;

        System.out.println("# # # SLOT MACHINE # # #");
        System.out.println("Symbole: 7 | BAR | X | O | %");
        System.out.println("3 gleiche Symbole = Gewinn (3x Einsatz)!");
        System.out.println("# # # # # # # # # #");

        // Hauptschleife – läuft bis kein Geld oder User will aufhören
        while (balance > 0) {

            // Einsatz holen und vom Geldstand abziehen
            int betAmount = getBet(scanner, balance);
            balance -= betAmount;

            // Walzen drehen
            String[] result = spin(random);

            // Ergebnis anzeigen
            System.out.println("| " + result[0] + " | " + result[1] + " | " + result[2] + " |");

            // Gewinn oder Verlust prüfen
            if (isWin(result)) {
                int winAmount = betAmount * 3;
                balance += winAmount;
                System.out.println(" Dun hast gewonnen! +" + winAmount + " €");
            } else {
                System.out.println("Leider verloren!");
            }

            System.out.println("Aktueller Geldstand: " + balance + " €");

            // Kein Geld mehr?
            if (balance <= 0) {
                System.out.println("Kein Geld mehr! Spiel beendet.");
                break;
            }

            // Nochmal spielen?
            System.out.print("Nochmal spielen? (j/n): ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("n")) {
                System.out.println("Spiel beendet. Endstand: " + balance + " €");
                break;
            }



            System.out.println("# # # # # # # # # #");
        }

        scanner.close();
    }
}