package DAY11_72925;

/**
 * numberGuessing.java
 * 
 * A practice project designed to get more familiar with:
 * - Working with loops (do-while loop)
 * - Conditional statements (if-else)
 * - Handling user input using the Scanner class
 * - Generating random numbers using the Random class
 * - Input validation (checking for valid integers)
 *
 * -----------------------------
 * Program Description:
 * This program will:
 * 1. Generate a random number between 1 and 10 (inclusive).
 * 2. Prompt the user repeatedly to guess the number.
 * 3. Give feedback if the guess is too high or too low.
 * 4. Keep track of how many attempts the user made.
 * 5. End the loop when the correct number is guessed.
 * 6. Handle invalid inputs (e.g., letters or symbols) without crashing.
 *
 * The program demonstrates the importance of input validation and loop control,
 * which are essential concepts in interactive console applications.
 */


import java.util.Scanner;
import java.util.Random;

public class numberGuessing {
    public static void main(String[] args) {
        // Obejcts
        Random rnd = new Random(); // Generates random numbers
        Scanner scn = new Scanner(System.in); // Accepts user input

        // Varible declaration and initialization
        String separator = "~".repeat(20);
        int guess, attempts; // user variables
        guess = 0;
        attempts = 0;
        int min, max, randomNumbers; // variables for the random numbers
        // Range 1-10:
        min = 1; // inclusive
        max = 10; // exclusive
        // Storing generated random number
        randomNumbers = rnd.nextInt(min, max + 1); // + 1 as max is exclusive

        System.out.println("Number Guessing Game");
        System.out.println(separator);

        do {
            System.out.printf("Guess a number from %d - %d: ", min,max);
            if (scn.hasNextInt()) {
                guess = scn.nextInt();
                attempts++;
                if (guess < randomNumbers) {
                    System.out.println(separator);
                    System.out.println("Your guess is too low!");
                    System.out.println(separator);
                } else if (guess > randomNumbers) {
                    System.out.println(separator);
                    System.out.println("Your guess is too high!");
                    System.out.println(separator);
                } else {
                    scn.nextLine();
                    break;
                }

            } else {
                System.out.println(separator);
                System.out.println("Invalid Input");
                System.out.println(separator);
                scn.next();
            }
        } while (guess != randomNumbers);
        System.out.println(separator);
        System.out.println("You guessed it! it's: " + randomNumbers);
        System.out.println("Attempts: " + attempts);
        System.out.println(separator);

        scn.close();
    }
}
