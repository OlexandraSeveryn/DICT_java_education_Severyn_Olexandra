package CoffeeMachine;
import java.util.*;

public class CoffeeMachine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*int water, milk, coffeeBeans;
        water = 200;
        milk = 50;
        coffeeBeans = 15;*/
        System.out.println("Write how many ml of water the coffee machine has:");
        int availableWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int availableMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int availableBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int userCups = scanner.nextInt();

        int[] amountCoffee = new int[] {availableWater / 200, availableMilk / 50, availableBeans / 15};
        var availableCoffee = Arrays.stream(amountCoffee).min().getAsInt();
        int moreThan = (availableCoffee - userCups);
        if (userCups == availableCoffee) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (availableCoffee > userCups) {
            System.out.println("Yes, I can make that amount of coffee. And even " + moreThan + " more than that");
        }else {
        System.out.println("No, I can make only " + availableCoffee + " cups of coffee");}
    }
}


