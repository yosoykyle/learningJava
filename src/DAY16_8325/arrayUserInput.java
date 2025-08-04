package DAY16_8325;

import java.util.Arrays;
import java.util.Scanner;

/**
 * arrayUserInput.java
 * 
 * Practice project to get familiar with:
 * - Arrays and user input
 * - Array allocation and validation
 * - Sorting arrays
 * - Input validation for integers and strings
 * 
 * Features:
 * - Asks the user how many food items they have
 * - Collects each food name with validation
 * - Sorts the food names alphabetically
 * - Displays the sorted list with numbering
 */
public class arrayUserInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Step 1: Declare array and ask user how many items to store
        int foodSize;
        String[] foods; // Array to store food names

        System.out.print("How many foods do you have");
        foodSize = intValidation(scn); // Validate integer input
        foods = new String[foodSize]; // Allocate memory for array

        // Step 2: Input each food item with validation
        for (int i = 0; i < foods.length; i++) {
            System.out.print("Food " + (i + 1));
            foods[i] = stringValidation(scn);
        }

        // Step 3: Sort the array alphabetically
        Arrays.sort(foods);

        // Step 4: Display sorted array with numbering
        System.out.println("FOODS YOU HAVE: ");
        int counter = 1;
        for (String food : foods) {
            System.out.println(counter++ + ". " + food);
        }

        scn.close(); // Close the scanner to free resources
    }

    /**
     * Validates integer input from user.
     * Ensures input is a positive number greater than zero.
     */
    static int intValidation(Scanner scn) {
        int foodSize = 0;

        while (true) {
            System.out.print(": ");
            if (scn.hasNextInt()) {
                foodSize = scn.nextInt();
                scn.nextLine(); // Clear the newline character

                if (foodSize <= 0) {
                    System.out.println("Cannot be negative or zero");
                } else {
                    break; // Valid input
                }
            } else {
                System.out.println("Invalid input!");
                scn.nextLine(); // Clear invalid token
            }
        }

        return foodSize;
    }

    /**
     * Validates string input from user.
     * Ensures input is not empty and trims whitespace.
     */
    static String stringValidation(Scanner scn) {
        String input;

        while (true) {
            System.out.print(": ");
            if (scn.hasNextLine()) {
                input = scn.nextLine().trim().toLowerCase();

                if (input.isEmpty()) {
                    System.out.println("Cannot be empty");
                } else {
                    break; // Valid input
                }
            } else {
                System.out.println("Invalid input!");
            }
        }

        return input;
    }
}
