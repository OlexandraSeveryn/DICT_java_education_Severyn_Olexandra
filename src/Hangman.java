import java.util.*;

public class Hangman {
    public static void main(String[] args){
        System.out.print("HANGMAN\nGuess the word ");
        String[] guessingWords = {"javascript", "java", "python", "kotlin"};
        Scanner scanner = new Scanner(System.in);
        Random randWord = new Random();
        String word = guessingWords[randWord.nextInt(guessingWords.length)];

        char[] hide = word.toCharArray();
        for (int i = 2; i < hide.length; i++)
            hide[i] = '-';
        String hint = String.valueOf(hide);
        System.out.print(hint + ": ");
        String guessedWord = scanner.next();
        if (guessedWord.equals(word)) {
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }
}
