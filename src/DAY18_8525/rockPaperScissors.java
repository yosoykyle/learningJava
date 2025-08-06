package DAY18_8525;

/*
 * rockPaperScissors.java
 *
 * A simple Rock-Paper-Scissors game implementation in Java.
 * 
 * Practice goals:
 * - Using arrays, conditionals, loops, and methods
 * - Accepting and validating user input
 * - Randomly generating computer choices
 * - Understanding string comparison (e.g., equals())
 * 
 * When run, the game asks the user to input "rock", "paper", or "scissors",
 * randomly generates a choice for the computer, determines the winner, and
 * asks if the user wants to play again.
 */

import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);  // Scanner to get user input
        Random rnd = new Random();             // Random object to get computer's move

        // Declare and initialize variables
        String[] choices = { "rock", "paper", "scissors" };  // Possible choices
        String playerChoice;                                 // Player's move
        String computerChoice;                               // Computer's move
        String playAgain = "yes";                            // Control loop to play again
        // Prompt messages used for user input: one for choosing a move, the other for replay confirmation
        String getUserChoice = "Enter your move (rock, paper, scissors): ";
        String playAgainMes = "Play again? (yes/no): ";

        // Main game loop
        while (playAgain.equals("yes")) {
            // Get and validate player's choice
            playerChoice = validChoice(scn, getUserChoice, choices);

            // Generate computer's random choice
            computerChoice = choices[rnd.nextInt(0, 3)];  // Random index from 0 to 2
            System.out.println("computer: " + computerChoice);  // Show computer's move

            // Determine winner using conditionals
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (
                // Winning combinations for the player
                (playerChoice.equals(choices[0]) && computerChoice.equals(choices[2])) || // rock beats scissors
                (playerChoice.equals(choices[1]) && computerChoice.equals(choices[0])) || // paper beats rock
                (playerChoice.equals(choices[2]) && computerChoice.equals(choices[1]))    // scissors beats paper
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            // Ask if the user wants to play again
            playAgain = validPlay(scn, playAgainMes);
        }

        // End of game
        System.out.println("Thanks for playing!");

        scn.close();  // Close Scanner
    }

    /*
     * Method to validate user input for the move.
     * Keeps asking until input is valid (rock, paper, or scissors).
     */
    static String validChoice(Scanner scn, String getUserChoice, String[] choices) {
        String userChoice;
        while (true) {
            System.out.print(getUserChoice);
            if (scn.hasNextLine()) {
                // Normalize input (lowercase and remove spaces)
                userChoice = scn.nextLine().toLowerCase().replace(" ", "");

                // Check if input is one of the valid choices
                if (userChoice.equals(choices[0]) || userChoice.equals(choices[1]) || userChoice.equals(choices[2])) {
                    break;  // Exit loop if valid
                } else {
                    System.out.println("Invalid input");
                    System.out.println("Choices: rock, paper, scissors");
                }
            } else {
                System.out.println("Invalid input");
            }
        }
        return userChoice;
    }

    /*
     * Method to validate user input for whether they want to play again.
     * Accepts only "yes" or "no" (case-insensitive, no spaces).
     */
    static String validPlay(Scanner scn, String playAgainMes) {
        String playAgain = " ";
        while (true) {
            System.out.print(playAgainMes);
            if (scn.hasNextLine()) {
                playAgain = scn.nextLine().toLowerCase().replace(" ", "");
                if (playAgain.equals("yes") || playAgain.equals("no")) {
                    break;  // Valid response
                } else {
                    System.out.println("Invalid option");  // Invalid input message
                }
            }
        }
        return playAgain;
    }
}
