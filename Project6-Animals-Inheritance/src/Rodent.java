public abstract class Rodent extends Animal{

    public Rodent(String name, int age, String type, double weight){
        super(name, age, type, weight);

    }

    public void gnaw(){
        System.out.println("Hat an einem Stück Holz geknabbert");
    }

}
