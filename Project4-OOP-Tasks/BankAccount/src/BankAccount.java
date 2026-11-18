public class BankAccount {

    // fields
    private String firstName;
    private String lastName;
    private String accountNumber;
    private double accountBalance;
    private double accountLimit = -500.00;

    // constructor of the class


    public BankAccount(String firstName, String lastName,
                       String accountNumber, double accountBalance) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountLimit = accountLimit;
    }

    // methods

    public void deposit(double value){
        if (value > 0){
            accountBalance += value;
            System.out.printf("Einzahlung: %.2f EUR erfolgreich %n", value);
        }else{
            System.out.printf("Einzahlung: %.2f EUR nicht möglich. Falsche Eingabe. %n", value);
            System.out.println("Bitte geben sie eine Positive Zahl an");
        }
    }

    public void payOut(double value){
        if (value > 0 && value < accountBalance + Math.abs(accountLimit)){
            accountBalance -= value;
            System.out.printf("Auszahlung: %.2f EUR erfolgreich %n", value);
        }else if(value > accountBalance + Math.abs(accountLimit)){
            System.out.printf("Auszahlung: %.2f EUR nicht möglich.%n", value);
            System.out.println("Nicht ausreichende Kontodeckung ");
        }else{
            System.out.printf("Auszahlung: %.2f EUR nicht möglich. Falsche Eingabe %n", value);
            System.out.println("Bitte geben sie eine Positive Zahl an");

        }
    }

    // getter
    public double getAccountBalance(){
        return accountBalance;



    }

    @Override
    public String toString() {
        return "BankAccount{ " +
                "Vorname: '" + firstName + '\'' +
                ", Nachname: '" + lastName + '\'' +
                ", Kontonummer: '" + accountNumber + '\'' +
                ", Kontostand: " + accountBalance +
                ", Kontolimit: " + accountLimit +
                '}';
    }
}
