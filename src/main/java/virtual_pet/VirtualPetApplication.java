package virtual_pet;
import java.util.Scanner;

public class VirtualPetApplication {
    static VirtualPet Tommy = new VirtualPet("Tommy");
    static Scanner  inputScanner = new Scanner(System.in);
    public static void main(String[] args) {


        

        boolean isFirstInput = true;


        while(true) {
            System.out.println("This is Tommy!");
            System.out.println("  /\\_/\\  (\n" +
                                " ( ^.^ ) _)\n" +
                            "   \\\"/  (\n" +
                                 " ( | | )\n" +
                                  "(__d b__)");



            
            if (isFirstInput) {
                System.out.println("Say hi to him!");
                String inputActivity = inputScanner.nextLine();
                inputEvaluation(inputActivity);
                isFirstInput = false;
            }

            System.out.println("What would you like to do with Tommy?");
            System.out.println("  /\\_/\\  (\n" +
                                " ( ^.^ ) _)\n" +
                            "   \\\"/  (\n" +
                                 " ( | | )\n" +
                                  "(__d b__)");

            System.out.println("1. Give food");
            System.out.println("2. Give a drink");
            System.out.println("3. Play with Tommy");
            System.out.println("4. Take him for a nap");
            System.out.println("5. Take him to the litter box");
            System.out.println("6. Give Tommy his medicine");
            System.out.println("7.Take Tommy to the veterinary");
            System.out.println("8. Look at Tommy's stats!");
            String inputActivity = inputScanner.nextLine();
            inputEvaluation(inputActivity);
            Tommy.tick();
        }
    }

    public static void inputEvaluation(String userChoice) {
        switch (userChoice) {

            case "1":
                System.out.println("This is today's food menu, what would you like to feed him with?");
            for (int i=0; i< VirtualPet.foodMenu.length;i++) {
                System.out.println(VirtualPet.foodMenu[i]);
            }
            String foodInput = inputScanner.nextLine();
                System.out.println("You chose: " + foodInput);
                Tommy.giveFood(foodInput);
        break;

            case "2":
                System.out.println("This are the drinks you can give to Tommy to hydrate him");
                for (int i=0; i< VirtualPet.drinksMenu.length;i++) {
                    System.out.println(VirtualPet.drinksMenu[i]);
                }
                String drinkInput = inputScanner.nextLine();
                System.out.println("You chose: " + drinkInput);
                Tommy.giveDrink(drinkInput);
                break;

            case "3":
                System.out.println("Wohoo!This will be fun!");
                Tommy.play();
                break;

            case "4":
                System.out.println("Shh! Be quiet so he can rest a lot!");
                Tommy.sleep();
                break;

            case "5":
                System.out.println("This is a smelly one! ");
                Tommy.takeToLitterBox();
                break;

            case "6":
                System.out.println("This will make him feel a lot better!");
                Tommy.giveMedicine();
                break;

            case "7":
                System.out.println("Speedy recovery for Tommy!");
                Tommy.takeToTheVet();
                break;

            case "8":
                System.out.println("This are Tommy's stats!");
                
                break;
        }
    }
    
}
