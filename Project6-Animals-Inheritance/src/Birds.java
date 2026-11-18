public class Birds extends Animal{
    public Birds(String name, int age, String type, double weight){
        super(name, age, type, weight);
    }

    public void fly(){
        System.out.println("Is flying");
    }

    @Override
    public void makeSound(){
        System.out.println("Tweet");
    }

}
