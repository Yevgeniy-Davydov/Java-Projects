
public class Cat extends Animal{

    public Cat(String name, int age, String type, double weight){
        super(name, age, type, weight);
    }

    @Override
    public void makeSound(){
        System.out.println("Miau!");

    };


}
