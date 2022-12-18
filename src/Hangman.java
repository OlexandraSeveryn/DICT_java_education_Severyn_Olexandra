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
                if (guessedWord.length() > 1){
                    System.out.println("You should input a single letter");
                    continue;
                }
                if (!guessedWord.matches("[a-z]")){
                    System.out.println("Please enter a lowercase English letter\n");
                    continue;
                }
                if (word.contains(guessedWord)) {
                    if (letters.contains(guessedWord)){
                        System.out.println("No improvements\n ");

                    } else {
                        for (int i = 0; i < word.length(); i++) {
                            if (hide[i] == guessedWord.charAt(0)) {
                                hint.setCharAt(i, guessedWord.charAt(0));
                            }
                        }
                    }
                    if (hint.toString().equals(word)) {
                        System.out.println("You guessed the word " + hint + "!");
                        System.out.println("You survived!");
                        break;
                    }
                }else {
                    System.out.println("That letter doesn't appear in the word\n ");
                    attempts--;
                }
                letters.add(guessedWord);
            } else {
                System.out.println("You've already guessed this letter\nYou lost!");
                break;
            }
        }
    }
}