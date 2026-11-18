//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //crate products
        Product newApple = new Product("Apfel", 2.99, 3);
        Product newBread = new Product("Brot", 2.99, 1);
        Product newMilk  = new Product("Milch", 1.49, 2);

        //create new basket
        Basket newBasket = new Basket();
        // add created products into basket
        newBasket.addProduct(newApple);
        newBasket.addProduct(newBread);
        newBasket.addProduct(newMilk);

        System.out.println("=== Basket: ===");
        System.out.println(newBasket.getProduct());
        System.out.println("----------------");

        //calcule total price of all items from Basket
        System.out.printf("Gesamt: %.2f EUR %n", newBasket.calcTotalPrice());

        // 2 apples added
        newApple.increaseAmount(2);

        System.out.println("=== Basket: ===");
        System.out.println(newBasket.getProduct());
        System.out.println("----------------");
        System.out.printf("Gesamt: %.2f EUR %n", newBasket.calcTotalPrice());

//        newApple.increaseAmount(-6);
        newApple.decreaseAmount(6);

        System.out.println("=== Basket: ===");
        System.out.println(newBasket.getProduct());
        System.out.println("----------------");




    }

}