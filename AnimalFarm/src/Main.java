
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        //2.
        String animal;
        int hunger = -1;
        int hungerSheep;
        int hungerCow;
        int hungerChicken;
        boolean isSheep = false;
        boolean isCow = false;
        boolean isChicken = false;



        //3.
        hungerSheep = 50;
        hungerChicken = 70;
        hungerCow = 70;

        System.out.println("HungerScore:\n" + "Sheep: " + hungerSheep + "\n" + "Chicken: " + hungerChicken + "\n" + "Cow: " + hungerCow);


        //4.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an animal here: ");
        animal = scanner.next().toLowerCase();

        System.out.println("you entered: " + animal);

        //5
        switch (animal) {
            case "sheep":
                hunger = hungerSheep;
                isSheep = true;
                System.out.println("Current animal: " + animal + ",\n Hunger: "  + hunger);
                break;
            case "chicken":
                hunger = hungerChicken;
                isChicken = true;
                System.out.println("Current animal: " + animal + ",\n Hunger: " + hunger);
                break;
            case "cow":
                hunger = hungerCow;
                isCow = true;
                System.out.println("Current animal: "+ animal + ",\n Hunger: " + hunger);
                break;
            default:
                System.out.println("Please enter one of those: sheep, cow, chicken.");
        }
        //6
        System.out.println("hunger outside switch " + hunger);

        // i do not need to ask for the animal, since hunger is defined anyways
        if (hunger >= 75) {
            System.out.println("the animal is beeing fed");
        } else if (hunger >= 50 && hunger < 75) {
            Scanner feedScanner = new Scanner(System.in);
            System.out.println("Will you feed the " + animal + "? -> type `yes` or `no` :");
            String answer = feedScanner.next().toLowerCase();
            System.out.println(answer);

                if(answer.equals("yes")) {
                    System.out.println("please feed the " + animal + "!");

                    if(isSheep) {
                        if (hungerSheep > 20) {
                            hungerSheep = Math.max(0, hungerSheep - 20); // This ensures that the value doesn't go below 0
                            System.out.println("New value of HungerSheep: " + hungerSheep);
                            if (hungerSheep >= 100) {
                                System.out.println("Your " + animal + " starved to death");
                            }
                        }
                    } else if (isChicken) {
                        if(hungerChicken > 20) {
                            hungerChicken = Math.max(0, hungerChicken - 20);
                            System.out.println("New value of HungerChicken: " + hungerChicken);
                            if (hungerChicken >= 100) {
                                System.out.println("Your " + animal + "starved to death");
                            }
                        }
                    } else if(isCow) {
                        if (hungerCow > 20) {
                            hungerCow = Math.max(0, hungerCow - 20);
                            System.out.println("New value of HungerCow: " + hungerCow );
                            if ( hungerCow >= 100) {
                                System.out.println("Your " + animal + "starved to death");
                            }
                        }
                    } else {
                        System.out.println("unknown animal, pls repeat process");
                    }
                } else if (answer.equals("no")) {
                    System.out.println("The " + animal + "is not hungry, pls do not feed");
                } else {
                    System.out.println("please type yes or no");
                }

        } else {
            System.out.println("The " + animal + " cant be fed right now");
        }


    }


}
