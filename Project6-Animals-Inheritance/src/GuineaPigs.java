public class GuineaPigs extends Rodent {

    public GuineaPigs(String name, int age, String type, double weight){
        super(name, age, type, weight);
    }
    @Override
    public void makeSound(){
        System.out.println("Quiek!");
    }


}
