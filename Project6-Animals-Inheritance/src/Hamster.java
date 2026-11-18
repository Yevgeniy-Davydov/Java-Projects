public class Hamster extends Rodent{

    public Hamster(String name, int age, String type, double weight){
        super(name, age, type, weight);

    }
    @Override
    public void makeSound(){
        System.out.println("Fieps!");
    }



}
