package CoffeeMachine;
import java.util.*;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int availableWater, availableMilk, availableBeans, availableMoney, disposableCups;
        availableWater = 550;
        availableMilk = 540;
        availableBeans = 120;
        availableMoney = 550;
        disposableCups = 9;
        System.out.println("The coffee machine has:");
        System.out.println(availableWater + " of water\n" +
                availableMilk + " of milk\n" +
                availableBeans + " of coffee beans\n" +
                disposableCups + " of disposable cups\n" +
                availableMoney + " of money\n");


        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            if (action.equals("buy")) {
                while (true) {
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, 4 - back to main menu:");
                    int coffeeType = scanner.nextInt();
                    if (coffeeType == 1) {
                        if (availableWater < 200 || availableMilk < 100 || availableBeans < 12 || disposableCups < 1){
                            System.out.println("I haven't enough resources, making you a coffee!");
                        }else {
                            availableWater -= 250;
                            availableMilk -= 0;
                            availableBeans -= 16;
                            availableMoney += 4;
                            disposableCups --;
                            System.out.println("I have enough resources, making you a coffee!");
                        }
                    } else if (coffeeType == 2) {
                        if (availableWater < 200 || availableMilk < 100 || availableBeans < 12 || disposableCups < 1) {
                            System.out.println("I haven't enough resources, making you a coffee!");
                        } else {
                            availableWater -= 350;
                            availableMilk -= 75;
                            availableBeans -= 20;
                            availableMoney += 7;
                            disposableCups --;
                            System.out.println("I have enough resources, making you a coffee!");}
                    } else if (coffeeType == 3) {
                        if(availableWater < 200 || availableMilk < 100 || availableBeans < 12 || disposableCups < 1) {
                            System.out.println("I haven't enough resources, making you a coffee!");
                        }else {
                            availableWater -= 200;
                            availableMilk -= 100;
                            availableBeans -= 12;
                            availableMoney += 6;
                            disposableCups --;
                            System.out.println("I have enough resources, making you a coffee!");}
                    } else if (coffeeType == 4) {
                        break;
                    }
                }
            } else if (action.equals("fill")) {
                System.out.println("Write how many ml of water you want to add:");
                int addedWater = scanner.nextInt();
                availableWater += addedWater;
                System.out.println("Write how many ml of milk you want to add:");
                int addedMilk = scanner.nextInt();
                availableMilk += addedMilk;
                System.out.println("Write how many grams of coffee beans you want to add:");
                int addedBeans = scanner.nextInt();
                availableBeans += addedBeans;
                System.out.println("Write how many disposable coffee cups you want to add:");
                int addedCups = scanner.nextInt();
                disposableCups += addedCups;
            } else if (action.equals("take")) {
                System.out.println("I gave you " + availableMoney + "\n");
                availableMoney -= availableMoney;
            } else if (action.equals("remaining")) {
                System.out.println("The coffee machine has:");
                System.out.println(availableWater + " of water\n" +
                        availableMilk + " of milk\n" +
                        availableBeans + " of coffee beans\n" +
                        disposableCups + " of disposable cups\n" +
                        availableMoney + " of money\n");
            } else if (action.equals("exit")) {
                break;
            }
        }
    }
}