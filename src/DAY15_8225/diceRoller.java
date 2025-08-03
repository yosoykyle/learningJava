package DAY15_8225;

/**
 * diceRoller.java
 * 
 * This is a practice project to get familiar with concepts:
 * - User input and validation using Scanner
 * - Random number generation with Random class
 * - Looping constructs (while and for loops)
 * - Method creation and reuse
 * - Using switch expressions
 * - Displaying ASCII art with multi-line strings
 * 
 * Features:
 * - Prompts user for the number of dice to roll
 * - Rolls each die and displays result using ASCII art
 * - Calculates and prints the total of all dice rolls
 * - Validates user input (only accepts positive integers)
 * - Asks the user if they want to play again (Y/N input with case-insensitivity)
 * - Loops the game until the user decides to quit
 */

import java.util.Scanner;
import java.util.Random;

public class diceRoller {
    public static void main(String[] args) {
        // Declare Varibles && objects
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        int numOfDice, totalOfDice;
        totalOfDice = 0;
        boolean isPlaying = true;
        String stringSeparator = "***".repeat(10);

        while (isPlaying) {
            // Get the # of dice from the user
            System.out.println(stringSeparator);
            System.out.print("Enter the # of dice to roll: ");
            // Check if the input isValid
            if (scn.hasNextInt()) {
                numOfDice = scn.nextInt();
                scn.nextLine();
                // Check if the # of Dice > 0
                if (numOfDice > 0) {
                    // Roll all the dice
                    for (int i = 0; i < numOfDice; i++) {
                        int roll = rnd.nextInt(1, 7); // will give rnd of 1 - 6
                        System.out.println("you rolled: " + roll);
                        asciiDie(roll); // Display ASCII of dice
                        totalOfDice += roll; // Get the total
                    }
                    System.out.println("total: " + totalOfDice);
                    System.out.println(stringSeparator);
                    isPlaying = playAgain(scn); // Ask to play again
                } else {
                    System.out.println("# of dice must be > 0");
                }
            } else {
                System.out.println("Invalid input");
                scn.next();
            }
        }
        System.out.println("Kaboom!");

        scn.close();
    }

    static void asciiDie(int roll) {
        // Multi-line String
        String dice1 = """
                     -------
                    |       |
                    |   @   |
                    |       |
                     -------
                """;
        String dice2 = """
                     -------
                    |@      |
                    |       |
                    |      @|
                     -------
                """;
        String dice3 = """
                     -------
                    |@      |
                    |   @   |
                    |      @|
                     -------
                """;
        String dice4 = """
                     -------
                    |@     @|
                    |       |
                    |@     @|
                     -------
                """;
        String dice5 = """
                     -------
                    |@     @|
                    |   @   |
                    |@     @|
                     -------
                """;
        String dice6 = """
                     -------
                    |@     @|
                    |@     @|
                    |@     @|
                     -------
                """;
        switch (roll) {
            case 1 -> {
                System.out.println(dice1);
            }
            case 2 -> {
                System.out.println(dice2);
            }
            case 3 -> {
                System.out.println(dice3);
            }
            case 4 -> {
                System.out.println(dice4);
            }
            case 5 -> {
                System.out.println(dice5);
            }
            case 6 -> {
                System.out.println(dice6);
            }
            default -> {
                System.out.println("invalid roll");
            }
        }
    }

    static boolean playAgain(Scanner scn) {
        boolean isPlaying, askPlayer;
        isPlaying = false;
        askPlayer = true;
        String playInput = "";
        char playAgain = ' ';

        while (askPlayer) {
            System.out.print("Do you want to play again?: ");
            playInput = scn.next().trim();
            if (!playInput.isEmpty()) {
                playAgain = playInput.charAt(0);
                switch (playAgain) {
                    case 'Y', 'y' -> {
                        System.out.println("Okay, let's play again!");
                        isPlaying = true;
                        askPlayer = false;
                    }
                    case 'N', 'n' -> {
                        System.out.println("Thanks for playing!");
                        isPlaying = false;
                        askPlayer = false;
                    }
                    default -> System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
        }
        return isPlaying;
    }
}
