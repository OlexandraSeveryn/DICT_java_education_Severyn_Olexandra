package CoffeeMachine;
import java.util.*;
public class CoffeeMachine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int userCups = scanner.nextInt();
        int water, milk, coffeeBeans;
        water = 200;
        milk = 50;
        coffeeBeans = 15;
        System.out.println("For " + userCups + " cups of coffee you will need:");
        System.out.println((water * userCups) + " ml of water\n"
                + (milk * userCups) + " ml of milk\n"
                + (coffeeBeans * userCups) + " g of coffee beans");

    }
}
