package ChatBot;
import java.util.Scanner;

public class ChatBot {
    public static void main (String[] args){
        String name = "Sunrise";
        int creatingData = 2022;

        System.out.println("Hello my name is " + name);
        System.out.println("I was created in " + creatingData);
        System.out.println("Please, remind me your name.");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();

        System.out.println("What a great name you have, " + userName + "!");
    }
}
