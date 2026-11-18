import java.util.ArrayList;

public class Basket {

    private ArrayList<Product> productsList = new ArrayList<>();

    //methods
    public void addProduct(Product product){

        productsList.add(product);

    }

    // getter

    public ArrayList getProduct(){
        return productsList;
    }
    public double calcTotalPrice(){

        double sum = 0;
        for(Product item : productsList){

            int amountOfItems = productsList.size();
            double priceOfProduct = item.getPrice();
            int amountOfProduct = item.getAmount();
            sum += priceOfProduct * amountOfProduct * amountOfItems;
        }
        return sum;

    }



}
