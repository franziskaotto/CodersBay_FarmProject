
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        //2.
        String animal;
        int hunger;
        int hungerSheep;
        int hungerCow;
        int hungerChicken;
        boolean isSheep;
        boolean isCow;
        boolean isChicken;


        //3.
        hungerSheep = 50;
        hungerChicken = 60;
        hungerCow = 60;

        System.out.println("HungerScore:\n" + "Sheep: " + hungerSheep + "\n" + "Chicken: " + hungerChicken + "\n" + "Cow: " + hungerCow);


        //4.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an animal here: ");
        animal = scanner.next().toLowerCase();

        System.out.println("you entered: " + animal);


        switch (animal) {
            case "sheep":
                hunger = hungerSheep;
                System.out.println("Current animal: " + animal + ",\n Hunger: "  + hunger);
                break;
            case "chicken":
                hunger = hungerChicken;
                System.out.println("Current animal: " + animal + ",\n Hunger: " + hunger);
                break;
            case "cow":
                hunger = hungerCow;
                System.out.println("Current animal: "+ animal + ",\n Hunger: " + hunger);
                break;
            default:
                System.out.println("Please enter one of those: sheep, cow, chicken");

        }



    }


}
