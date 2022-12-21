package CoffeeMachine;
import java.util.*;

class Actions{
    Scanner scanner = new Scanner(System.in);
    int availableWater = 550;
    int availableMilk = 540;
    int availableBeans = 120;
    int availableMoney = 550;
    int disposableCups = 9;
    public void buy(int availableWater, int availableMilk, int availableBeans, int availableMoney) {
        if (water() - availableWater >= 0 && milk() - availableMilk >= 0 && cups() > 0 && beans() - availableBeans >= 0) {
            this.availableWater -= availableWater;
            this.availableMilk -= availableMilk;
            this.availableBeans -= availableBeans;
            this.availableMoney += availableMoney;
            this.disposableCups -= disposableCups;
        } else {
            System.out.println("I haven't enough resources, making you a coffee!");
        }
    }
    public void fill(){
        System.out.println("Write how many ml of water you want to add:");
        int addedWater = scanner.nextInt();
        this.availableWater += addedWater;
        System.out.println("Write how many ml of milk you want to add:");
        int addedMilk = scanner.nextInt();
        this.availableMilk += addedMilk;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addedBeans = scanner.nextInt();
        this.availableBeans += addedBeans;
        System.out.println("Write how many disposable coffee cups you want to add:");
        int addedCups = scanner.nextInt();
        this.disposableCups += addedCups;
    }
    public void remaining(){
        System.out.println("The coffee machine has:");
        System.out.println(availableWater + " of water\n" +
                availableMilk + " of milk\n" +
                availableBeans + " of coffee beans\n" +
                disposableCups + " of disposable cups\n" +
                availableMoney + " of money\n");
    }
    public void take(){
        System.out.println("I gave you " + availableMoney + "\n");
        availableMoney -= availableMoney;
    }
    int water(){
        return availableWater;
    }
    int milk(){
        return availableMilk;
    }
    int beans(){
        return availableBeans;
    }
    int cups(){
        return disposableCups;
    }

}
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Actions coffeeMachine = new Actions();
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            if (action.equals("buy")) {
                while (true) {
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, 4 - back to main menu:");
                    int coffeeType = scanner.nextInt();
                    if (coffeeType == 1) {
                        coffeeMachine.buy(250, 0, 16, 4);
                    } else if (coffeeType == 2) {
                        coffeeMachine.buy(300, 75, 20, 7);
                    } else if (coffeeType == 3) {
                        coffeeMachine.buy(200, 100, 12, 6);
                    } else if (coffeeType == 4) {
                        break;
                    }
                }
            } else if (action.equals("fill")) {
                coffeeMachine.fill();
            } else if (action.equals("remaining")) {
                coffeeMachine.remaining();
            } else if (action.equals("take")) {
                coffeeMachine.take();
            } else if (action.equals("exit")) {
                break;
            }
        }
    }
}