public class Product {

    private String name;
    private double price;
    private int amount;


    // constructor

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }


    //getter and setter

    // getter
    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    // methods

    public void increaseAmount(int number){
        amount += number;
    }

    public void decreaseAmount(int number){
        if(amount >= number){
        amount -= number;

        }else{
            System.out.println("Fehler, die eingegeben Zahl ist zu gross");
            System.out.println("Anzahl bleibt unverändert");
        }
    }

    @Override
    public String toString() {
        return name + " (" +
                "Preis: " + price + " EUR" +
                ", Anzahl: " + amount +
                ")";
    }
}
