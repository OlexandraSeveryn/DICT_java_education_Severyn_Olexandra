import java.util.*;

public class Hangman {
    public static void main(String[] args){
        System.out.print("HANGMAN\nGuess the word: ");
        String word = "javascript";
        Scanner scanner = new Scanner(System.in);
        String guessedWord = scanner.next();

        if (guessedWord.equals(word)) {
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }
}
