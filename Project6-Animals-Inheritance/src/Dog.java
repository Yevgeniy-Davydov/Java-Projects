
public class Dog extends Animal {

    public Dog(String name, int age, String type, double weight){
        super(name, age, type, weight);

    }
    @Override
    public void makeSound(){
        System.out.println("Wuff!");

    };
    public void showInfo(){
        // here are the things from parent mathod
        super.showInfo();
        // additional stuff
        System.out.println("Hunde brauchen regelmäßigen Auslauf.");
        System.out.println(" ");

    };

}

  