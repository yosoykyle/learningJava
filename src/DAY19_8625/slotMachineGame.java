package DAY19_8625;

/*
 * slotMachineGame.java
 * 
 * A practice project designed to improve familiarity with:
 * - Java basics (loops, conditionals, arrays, methods)
 * - User input validation using Scanner
 * - Randomized outcomes using the Random class
 * - Modularity through method decomposition
 *
 * What it does:
 * This is a simple slot machine game simulation where a player starts with a set balance
 * and places bets to spin a virtual slot machine made of 3 random symbols.
 * If certain combinations of symbols appear, the player receives a payout.
 * After each win or loss, the player is asked whether they want to cash out or keep playing.
 * When the balance is depleted, the user can choose to play again.
 */

import java.util.Scanner;
import java.util.Random;

public class slotMachineGame {
    public static void main(String[] args) {
        // OBJECTS
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);

        // DECLARE VARIABLES
        int balance, bet, payout;
        String[] row;
        balance = 100;
        // DISPLAY WELCOME MESSAGE
        welcomeMessage();
        // PLAY IF BALANCE > O
        while (balance > 0) {
            // DISPLAY BALANCE
            System.out.printf("Your current balance is: $%d\n", balance);
            // ENTER BET AMOUNT
            bet = placeValidBet(scn, balance);
            balance -= bet; // SUBTRACT BET FROM BALANCE
            System.out.println("=".repeat(30));

            // SPIN ROW
            System.out.println("Spinning the row...");
            row = spinRow(rnd);

            // PRINT ROW
            printRow(row);
            System.out.println("=".repeat(30));

            // GET PAYOUT
            payout = getPayout(scn, row, bet);
            balance += payout;
            if (payout > 0) {
                System.out.println("You won $: " + payout);
                if (wantPayout(scn, balance)) {
                    balance = 0;
                    break;
                }
            } else {
                System.out.println("Sorry you lose this round : >");
            }
            if (balance <= 0) {
                // ASK TO PLAY AGAIN
                balance += validPlay(scn);
                System.out.println("=".repeat(30));
            }

        }

        // DISPLAY EXIT MESSAGE
        System.out.println("Thanks for playing!");
        scn.close();
    }

    // WELCOME MESSAGE
    static void welcomeMessage() {
        String separator = "=".repeat(30);
        String welcomeString = "Welcome to the Java Slots";
        String syms = "Key Car Lime Bell Star";
        System.out.println(separator);
        System.out.println(welcomeString);
        System.out.println("Symbols: " + syms);
        System.out.println(separator);
    }

    // PLACE VALID BET
    static int placeValidBet(Scanner scn, int balance) {
        int bet;
        // Loop until a valid bet is placed
        while (true) {
            System.out.print("Place your bet $: ");
            if (scn.hasNextInt()) {
                bet = scn.nextInt();
                scn.nextLine();
                // VERIFY IF BET > BALANCE
                if (bet > balance) {
                    System.out.println("Insufficient funds. Your balance is $" + balance + ". Please try again.");
                }
                // VERIFY IF BET > 0
                else if (bet > 0) {
                    // SUBTRACT BET FROM BALANCE
                    balance -= bet;
                    System.out.printf("You placed a bet of $%d. Your new balance is $%d.\n", bet, balance);
                    break; // Exit the loop if a valid bet is placed
                } else {
                    System.out.println("Bet must be greater than 0. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer for your bet.");
                scn.next(); // Clear the invalid input
            }
        }

        return bet;
    }

    // SPIN ROW
    static String[] spinRow(Random rnd) {
        String[] syms = { "Key", "Car", "Lime", "Bell", "Star" };
        String[] row = new String[3];
        for (int i = 0; i < row.length; i++) {
            // RANDOMLY SELECT A SYMBOL FROM THE ARRAY
            row[i] = syms[rnd.nextInt(syms.length)];
        }
        return row;
    }

    // PRINT ROW
    static void printRow(String[] row) {
        System.out.println("=".repeat(30));
        // EXPLAIN THIS IN A MULTI-LINE COMMENT ON HOW TO WORKS
        System.out.println(" " + String.join(" | ", row));
    }

    // GET PAYOUT
    static int getPayout(Scanner scn, String[] row, int bet) {

        /*
         * Instead of using a traditional switch-case block (which requires break
         * statements),
         * this uses Java’s modern `switch` expression with `->`, introduced in Java
         * 14+.
         * 
         * This allows the switch to directly return a value, making the code shorter
         * and clearer.
         * Example: `return switch(symbol) { case "Key" -> bet * 3; ... }`
         * 
         * The payout multiplier is based on which symbol matched and how many matched.
         * If no match is found, the method returns 0.
         */
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "Key" -> bet * 3;
                case "Car" -> bet * 4;
                case "Lime" -> bet * 5;
                case "Bell" -> bet * 10;
                case "Star" -> bet * 20;
                default -> 0;
            };
        } else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "Key" -> bet * 2;
                case "Car" -> bet * 3;
                case "Lime" -> bet * 4;
                case "Bell" -> bet * 5;
                case "Star" -> bet * 10;
                default -> 0;
            };
        } else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "Key" -> bet * 2;
                case "Car" -> bet * 3;
                case "Lime" -> bet * 4;
                case "Bell" -> bet * 5;
                case "Star" -> bet * 10;
                default -> 0;
            };
        }

        // No matches found
        return 0;
    }

    /*
     * Method to validate user input for whether they want to play again.
     * Accepts only "yes" or "no" (case-insensitive, no spaces).
     */
    static int validPlay(Scanner scn) {
        String playAgainMes = "Want to play again?(yes/no): ";
        String playAgain = " ";
        int again = 0;
        while (true) {
            System.out.print(playAgainMes);
            if (scn.hasNextLine()) {
                playAgain = scn.nextLine().toLowerCase().replace(" ", "");
                if (playAgain.equals("yes") || playAgain.equals("y")) {
                    again += 100;
                    return again;
                } else if (playAgain.equals("no") || playAgain.equals("n")) {
                    return 0;
                } else {
                    System.out.println("Invalid option"); // Invalid input message
                }
            }
        }
    }

    static boolean wantPayout(Scanner scn, int balance) {
        String yN = "";

        System.out.print("Want to payout + " + balance + " (Y/N): ");
        yN = scn.nextLine().toUpperCase();
        if (yN.equals("YES") || yN.equals("Y")) {
            return true;
        } else {
            return false;
        }
    }
}
