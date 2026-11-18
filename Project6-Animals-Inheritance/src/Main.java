import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog bello = new Dog("Bello", 6, "Labrador", 28.5);
        Cat luna = new Cat("Luna", 4, "Europäisch Kurzhaar", 4.2);
        Dog rocky = new Dog("Rocky", 3, "Schäferhund", 31.0);
        Dog daisy = new Dog("Daisy", 8, "Beagle", 12.5);
        Cat felix = new Cat("Felix", 7, "Maine Coon", 6.5);
        Cat mimi = new Cat("Mimi", 2, "Maine Coon", 3.8);

        // add new hamster <- rodernt <- animal:)
        Hamster nala = new Hamster("Nala", 1, "Goldhamster", 0.15);

        // add new guinea pigs <- rodernt <- animal:)
        GuineaPigs krumel = new GuineaPigs("Krümel", 2, "Rosette", 0.9);
        GuineaPigs muffin = new GuineaPigs("Muffin", 1, "Glatthaar", 0.8);
        Birds hansi = new Birds("Hansi", 4, "Wellensittich", 0.04);
        Birds susi = new Birds("Susi", 3, "Wellensittich", 0.05);


        //create pet shelter
        PetShelter myPetShelter = new PetShelter();

        // store the animals in the list
        myPetShelter.storeAnimal(bello);
        myPetShelter.storeAnimal(luna);
        myPetShelter.storeAnimal(rocky);
        myPetShelter.storeAnimal(daisy);
        myPetShelter.storeAnimal(felix);
        myPetShelter.storeAnimal(mimi);
        myPetShelter.storeAnimal(nala);
        myPetShelter.storeAnimal(krumel);
        myPetShelter.storeAnimal(muffin);
        myPetShelter.storeAnimal(hansi);
        myPetShelter.storeAnimal(susi);


         // set some animals as not healthy
         felix.setHealth(false);
         rocky.setHealth(false);
         susi.setHealth(false);

         

        // here starts the input
        Scanner scanner = new Scanner(System.in);

        start(scanner, myPetShelter);


    }

    private static void start(Scanner scanner, PetShelter myPetShelter) {
        Boolean isOn = true;
        showMainMenu();

        while(isOn){

            int numberFromInput = scanner.nextInt();
            switch (numberFromInput) {
                case 1:
                    show(myPetShelter);
                    isOn = backToOptions(scanner, isOn);
                    break;
                case 2:
                    search(scanner, myPetShelter);
                    isOn = backToOptions(scanner, isOn);
                    break;
                case 3:
                    convey(scanner, myPetShelter);
                    isOn = backToOptions(scanner, isOn);
                    break;
                case 4:
                    isOn = endOfMenu();
                    break;
                default:
                    inputIsWorng();
            }
        }
    }

    private static void show(PetShelter myPetShelter) {
        addDelay(500);
        System.out.println("Hier sind alle Tiere:");
        myPetShelter.showAnimals();
    }

    private static void search(Scanner scanner, PetShelter myPetShelter) {
        addDelay(500);
        System.out.print("Bitte gib Name vom gesuchten Tier ein: ");
        String nameFromInput = scanner.next();
        Animal tempAnimal = myPetShelter.searchAnimal(nameFromInput);
        addDelay(500);
        if(tempAnimal == null){
            System.out.println(nameFromInput + " ist leider nicht gefunden");
            System.out.println("Bitte suche Dir ein anderes Tier aus");
        }else{

        tempAnimal.showInfo();
        }
    }

    private static void convey(Scanner scanner, PetShelter myPetShelter) {
        String nameFromInput;
        addDelay(500);
        System.out.print("Bitte gib Name vom gewunschten Tier ein: ");
        nameFromInput = scanner.next();
        addDelay(500);
        myPetShelter.conveyAnimal(nameFromInput);

    }

    private static Boolean backToOptions(Scanner scanner, Boolean isOn) {
        System.out.println("\n");
        System.out.println("Zurück zum Menue? y/n (oder anderer Symbol)");
        String mainMenu = scanner.next();
        if (mainMenu.equalsIgnoreCase("y")){
            showMenuOptions();
        }else{
            isOn = endOfMenu();
        }
        return isOn;
    }

    private static Boolean endOfMenu() {
        Boolean isOn;
        addDelay(500);
        isOn = false;
        System.out.println("Bis zum nächten mal");
        return isOn;
    }

    private static void inputIsWorng() {
        addDelay(500);
        System.out.println("Bitte gib eine Zahl zwischen 1-4 ein");
        System.out.println(" ");
        System.out.println("# # # # # # # # # #");
        System.out.println("\n");
        showMenuOptions();

    }

    private static void showMainMenu() {
        System.out.println(" ");
        System.out.println("# # # # # # # # # #");
        System.out.println("#     TIERHEIM    #");
        System.out.println("# # # # # # # # # #");
        showMenuOptions();
    }

    private static void showMenuOptions() {
        System.out.println(" ");
        System.out.println("Was möchtest Du tun?");
        System.out.println(" ");
        System.out.println("1. Alle Tiere anzeigen");
        System.out.println("2. Ein Tier suchen");
        System.out.println("3. Ein Tier nach Hause mitnehmen");
        System.out.println("4. Beenden");
        System.out.println(" ");
        System.out.println("# # # # # # # # # #");
        System.out.print("Deine Eingabe: ");
        System.out.println(" ");
    }


    //to add a delay, answers comes not immediately
    private static void addDelay(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
