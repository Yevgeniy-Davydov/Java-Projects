
import java.util.ArrayList;

public class PetShelter {


    public ArrayList<Animal> animalsList = new ArrayList<Animal>();

    public void storeAnimal(Animal animal){
        animalsList.add(animal);
    }

    public void showAnimals(){
        for (Animal animal : animalsList) {
            animal.showInfo();

        }
    }

    public void allSounds(){
        for (Animal animal : animalsList){
            animal.makeSound();

        }
    }

    public Animal searchAnimal (String name){
        Animal animal = null;
        for (Animal currentAnimal: animalsList){
            if (currentAnimal.getName().equalsIgnoreCase(name)){
                return currentAnimal;

            }

        }
        return animal;
    }
    // animal from pet shelter to the user
    public void conveyAnimal (String name){
        Animal currentAnimal = searchAnimal(name);

        if (currentAnimal == null) {
            System.out.println( name + " ist leider nicht gefunden");
            System.out.println("Bitte suche Dir ein anderes Tier aus");
            return;
        }

        if (currentAnimal.getHealt() == false) {
            System.out.println(name + " ist leider nicht gesund");
            System.out.println("Bitte suche Dir ein anderes Tier aus");
            return;
        }
        animalsList.remove(currentAnimal);
        System.out.println("Du kannst " + name + " mitnehmen");

    }



}