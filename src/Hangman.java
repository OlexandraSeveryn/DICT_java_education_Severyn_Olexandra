import java.util.*;

public class Hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN");
        String[] guessingWords = {"javascript", "java", "python", "kotlin"};
        Scanner scanner = new Scanner(System.in);
        Random randWord = new Random();
        ArrayList<String> letters = new ArrayList<>();
        String word = guessingWords[randWord.nextInt(guessingWords.length)];
        byte attempts = 8;
        boolean True = true;

        StringBuilder hint = new StringBuilder(word);
        char[] hide = word.toCharArray();
        for (int i = 0; i < hide.length; i++)
            hint.setCharAt(i, '-');

        while (True) {
            if (attempts > 0) {
                System.out.print(hint + "\nInput a letter: ");
                String guessedWord = scanner.next();
                letters.add(guessedWord);
                attempts--;
                if (word.contains(guessedWord)) {
                    for (int i = 0; i < word.length(); i++) {
                        if (hide[i] == guessedWord.charAt(0)) {
                            hint.setCharAt(i, guessedWord.charAt(0));
                        }
                    }
                    if (guessedWord.equals(word)) {
                        System.out.println("Thanks for playing!\nWe'll see how well you did in the next stage");
                        break;
                    }
                }else {
                    System.out.println("That letter doesn't appear in the word");
                }
            } else {
                System.out.println("Thanks for playing!\nWe'll see how well you did in the next stage");
                break;
            }
        }
    }
}