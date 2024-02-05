
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
        animal = scanner.next();
        System.out.println("you entered: " + animal);



    }


}
