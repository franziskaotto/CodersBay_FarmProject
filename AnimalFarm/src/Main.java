
import java.util.Scanner;


public class Main {

    static int hungerSheep = 80;
    static int hungerCow = 30;
    static int hungerChicken = 30;
    static boolean isSheep = false;
    static boolean isCow = false;
    static boolean isChicken = false;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        int hunger;

        while (true) {
            printHunger();

            System.out.print("Enter an animal here: ");
            String animal = scanner.next().toLowerCase();
            System.out.println(STR."you entered: \{animal}");

            isSheep = false;
            isChicken = false;
            isCow = false;

            //hunger is a Int
            hunger = getHungerOfAnimal(animal); //hungerVALUEofcurrentanimal
            System.out.println(hunger);

            if (hunger < 0) {
                continue;
            }


            if (hasHunger(hunger, animal)) {

                if (isSheep) {
                    hungerSheep -= 20;
                    System.out.println(STR."New value of HungerSheep: \{hungerSheep}");
                } else if (isChicken) {
                    hungerChicken -= 20;
                    System.out.println(STR."New value of HungerChicken: \{hungerChicken}");
                } else if (isCow) {
                    hungerCow -= 20;
                    System.out.println(STR."New value of HungerCow: \{hungerCow}");

                } else {
                    System.out.println("unknown animal, pls repeat process");
                    isSheep = false;
                    isChicken = false;
                    isCow = false;
                }
            }
            feedTheAnimals();


            if (hungerSheep >= 100 || hungerChicken >= 100 || hungerCow >= 100) {
                System.out.println(STR."your \{animal} starved to death! Game over!");
                break;
            }


        }
    }





    public static void printHunger () {
        System.out.println("HungerScore:\n" + "Sheep: " + hungerSheep + "\n" + "Chicken: " + hungerChicken + "\n" + "Cow: " + hungerCow);
    }

    public static int getHungerOfAnimal(String animal) {
        switch (animal) {
            case "sheep":
                isSheep = true;
                System.out.println("Current animal: " + animal);
                return hungerSheep;
            case "chicken":
                isChicken = true;
                System.out.println("Current animal: " + animal);
                return hungerChicken;
            case "cow":
                isCow = true;
                System.out.println("Current animal: " + animal);
                return hungerCow;
            default:
                System.out.println("Please enter one of those: sheep, cow, chicken.");
                return -1;
        }
    }


    public static boolean hasHunger(int hunger, String animal) {
        if (hunger >= 75) {
            System.out.println("the animal is being fed");
            return true;
        } else if (hunger >= 50) {
            Scanner feedScanner = new Scanner(System.in);
            System.out.println(STR."Will you feed the \{animal}? -> type `yes` or `no` :");
            String answer = feedScanner.next().toLowerCase();
            System.out.println(answer);
            if (answer.equals("yes")) {
                return true;
                //} //else if (answer.equals("no")) {
//                System.out.println(STR."The \{animal} is not hungry, please do not feed");
//                return false;
            } else {
                System.out.println("please type yes or no");
                return false;
            }
        } else {
            System.out.println(STR."The \{animal} can't be fed right now");
            return false;
        }
    }


    public static void feedTheAnimals() {
        if (!isSheep) {
            hungerSheep += 10;
        }

        if (!isChicken) {
            hungerChicken += 10;
        }

        if (!isCow) {
            hungerCow += 10;
        }
        printHunger();

    }

}