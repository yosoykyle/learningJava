package DAY31_81825.oop18th.oopArrayListPractice;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * arraylistPractice.java
 * 
 * This program demonstrates:
 * - Using ArrayList with custom objects (Foods)
 * - Input validation using Scanner
 * - Iterating and adding objects into an ArrayList
 * - Applying encapsulation with a Foods class
 * 
 * Key Concepts:
 * - Why ArrayList instead of array:
 *   * Resizable, flexible, easier to manipulate.
 *   * In production, ArrayList is used often when storing
 *     dynamic collections of objects (e.g. orders, items, users).
 * 
 * - Why custom class (Foods):
 *   * Allows us to attach attributes and methods to stored objects
 *   * Instead of plain Strings, we can later extend Foods
 *     (e.g. add price, category, calories).
 */
public class arraylistPractice {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // ArrayList storing "Foods" objects instead of just Strings
        ArrayList<Foods> foods = new ArrayList<>();

        // Validate user input for number of foods to enter
        int numOfFood = validNumFood(scn);

        // Loop through user input and add Foods objects to the ArrayList
        for (int i = 0; i < numOfFood; i++) {
            System.out.print("Enter food #" + i + ": ");
            // Preprocess user input:
            // - remove spaces (replace(" ", ""))
            // - convert to uppercase (toUpperCase())
            String food = scn.nextLine().replace(" ", "").toUpperCase();

            // Add new Foods object into ArrayList
            foods.add(new Foods(food));
        }

        // Print the ArrayList (Foods.toString() controls formatting)
        System.out.println("Foods: " + foods);

        scn.close();
    }

    /*
     * validNumFood()
     * ----------------
     * Helper method for validating the number of foods to be entered.
     * - Uses Scanner to check if input is an integer
     * - Rejects invalid inputs (non-integers, <= 0 numbers)
     * - Keeps prompting until valid
     * 
     * Why separate method?
     * - Cleaner main()
     * - Reusable for other validations if needed
     */
    static int validNumFood (Scanner scn) {
        int numOfFood;
        while (true) {
            System.out.print("Enter the # of food you would like: ");
            if (scn.hasNextInt()) {      // Check if input is an integer
                numOfFood = scn.nextInt();
                scn.nextLine();          // Clear newline character

                if (numOfFood <= 0) {    // Must be positive
                    System.out.println("Must be greater than 0!");
                }
                else {
                    break;               // Valid input, exit loop
                }
            }
            else {
                System.out.println("Invalid input! Must be a number!");
                scn.next();              // Discard invalid token
            }
        }
        return numOfFood;
    }
}
