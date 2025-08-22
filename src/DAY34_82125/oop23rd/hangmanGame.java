package DAY34_82125.oop23rd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
 * hangmanGame.java
 * 
 * a practice project to...
 * 
 * this program...
 * will chose rnd word from the list of words eenglish_word.txt
 * 
 * Combined Hangman Strategy (vowels + consonants)
 * If you want the best first guesses, go in this order:
 * - E (most common vowel and letter overall)
 * - A
 * - T
 * - O
 * - N
 * - I
 * - S
 * - R
 * - H
 * - U
*/
public class hangmanGame {
    public static void main(String[] args) {
        /*
         * imports file of words
         * and a word rnd chosen
         */
        String filePath = "src\\DAY34_82125\\oop23rd\\english_words.txt";
        ArrayList<String> arrayWords = new ArrayList<>();

        try (BufferedReader buffRead = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = buffRead.readLine()) != null) {
                arrayWords.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        Random rnd = new Random();

        String word = arrayWords.get(rnd.nextInt(arrayWords.size()));
        char underscores = '_';
        String decors = "=".repeat(25);
        /*
         * In the beginning the array list containts a buch of underscores `-`
         * that will filled in one letter at a time by guessing
         */
        ArrayList<Character> wordState = new ArrayList<>();
        // To track all wrong guesses
        int wrongGuesses = 0;

        /*
         * Within the array of `wordState` we going to
         * add an underscore `_` for every letter within our `word`
         * this can be achieved by using a for-loop
         * a loop that will cyle once or every letter in `word`
         */
        for (int i = 0; i < word.length(); i++) {
            // each cycle, takes `wordState` and adds a char `_`
            wordState.add(underscores);
        }
        // wellcome message
        System.out.println(decors);
        System.out.println("Java Hangman Game");
        System.out.println(decors);
        // TRY BLOCK
        try (Scanner scn = new Scanner(System.in)) {
            while (wrongGuesses < 6) {
                System.out.print("Attempts left: ");
                System.out.println(6 - wrongGuesses);
                System.out.println(getHangmanArt(wrongGuesses));
                /*
                 * When we directly print an arrayList it will override its toString();
                 * and will return somthing like this: [_, _, _, _, _, _, _, _, _]
                 * to change this use a for-loop like the one below
                 * notice that this is the same way we print or get the element's value in an
                 * array.
                 */
                System.out.print("Word: ");
                // for-each
                // for (char letter : wordState) {
                // System.out.print(letter + " ");
                // }
                // for-loop
                for (int j = 0; j < wordState.size(); j++) {
                    System.out.print(wordState.get(j) + " ");
                }
                System.out.println();
                char guess = validGuess(scn);
                /*
                 * .indexOf
                 * Gives the position of the first time
                 * the character appears in the string
                 * example: word: pizza
                 * guess: 'z'
                 * word.indexOf(guess) is 2
                 * >= 0 means that guess is present in word
                 */
                if (word.indexOf(guess) >= 0) {
                    System.out.println("Correct guess!\n");
                    /*
                     * CHANGE wordState to reflect correct guess!
                     * for-loop checks if..
                     */
                    for (int k = 0; k < word.length(); k++) {
                        // checks where exactly is the match
                        if (word.charAt(k) == guess) {
                            wordState.set(k, guess);

                        }
                    }
                    /*
                     * checks if wordState still
                     * has '_' if not you win hangman live (for now)
                     */
                    if (!wordState.contains('_')) {
                        System.out.println(getHangmanArt(wrongGuesses));
                        System.out.println(decors);
                        System.out.println("You win!");
                        System.out.println("The word was: " + word);
                        System.out.println(decors);
                        break;
                    }
                } else {
                    System.out.println("Wrong guess!");
                    wrongGuesses++;
                }
            }
            if (wrongGuesses >= 6) {
                System.out.println(getHangmanArt(wrongGuesses));
                System.out.println(decors);
                System.out.println("Game Over!");
                System.out.println("The word was: " + word);
                System.out.println(decors);
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }

    static char validGuess(Scanner scn) {
        String input = " ";

        while (true) {
            System.out.print("Enter guess: ");
            if (!scn.hasNextLine()) {
                System.out.println("Game exited!");
                System.exit(0);
            }
            if (scn.hasNextLine()) {
                input = scn.next().replace(" ", "");
                if (!input.isEmpty() && input.length() == 1 && Character.isLetter(input.charAt(0))) {
                    return input.charAt(0);
                } else {
                    System.out.println("Invalid input. Please enter ONE letter only.");
                    scn.nextLine();
                }
            }
        }
    }

    static String getHangmanArt(int wrongGuesses) {
        /*
         * yield keyword?
         * yield is used inside a switch expression to produce a value when you’re using
         * { }.
         * Think of it like return, but specifically for switch expressions.
         * 
         * used when curly brace is used on a switch this used when a method's switch
         * returns
         * 
         * Rule of thumb:
         * -> value = no braces, no yield, simple
         * -> { ... yield value; } = braces, multiple statements, must yield
         * 
         * this switch a combination of no brace and brace to see the difference
         */
        return switch (wrongGuesses) {
            case 0 -> {
                yield """
                        +---+
                        |   |
                            |
                            |
                            |
                            |
                        =========""";
            }
            case 1 -> {
                yield """
                          +---+
                          |   |
                          O   |
                              |
                              |
                              |
                        =========""";
            }
            case 2 -> {
                yield """
                          +---+
                          |   |
                          O   |
                          |   |
                              |
                              |
                        =========""";
            }
            case 3 -> {
                yield """
                          +---+
                          |   |
                          O   |
                         /|   |
                              |
                              |
                        =========""";
            }
            // backslashes (\) are escape sequence that's use double `\\`
            case 4 ->
                """
                          +----+
                          |    |
                          O    |
                         /|\\   |
                               |
                               |
                        =========""";
            case 5 ->
                """
                         +----+
                         |    |
                         O    |
                        /|\\   |
                        /     |
                              |
                        =========""";
            case 6 ->
                """
                         +----+
                         |    |
                         O    |
                        /|\\   |
                        / \\   |
                              |
                        =========""";
            default -> "Invalid number of wrong guesses. 0 - 6";

        };
    }
}
