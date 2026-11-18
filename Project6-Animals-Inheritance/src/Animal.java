
public abstract class Animal {
    //fields
    private String name;
    private int age;
    private String type;
    private double weight;
    private boolean isHealthy = true;

    // constructor
    public Animal(String name, int age, String type, double weight){
        this.name = name;
        this.age = age;
        this.type = type;
        this.weight = weight;

    }

    //methods
    public void showInfo(){
        System.out.println(" ");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight);
        System.out.println("Is healthy: " + isHealthy);

    };

    public void setHealth(Boolean isHealthy){
        this.isHealthy = isHealthy;
    }
    public Boolean getHealt (){
        return this.isHealthy;
    }
    public abstract void makeSound();

    //getter
    public String getName(){
        return name;
    }



}
