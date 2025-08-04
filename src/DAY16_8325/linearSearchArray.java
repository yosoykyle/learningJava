package DAY16_8325;

import java.util.Arrays;
import java.util.Scanner;

/*
 * linearSearchArray.java
 * 
 * Practice Project:
 * Demonstrates how to perform linear search on both String and int arrays.
 * 
 * Concepts:
 * - Linear search implementation
 * - Reusability through methods
 * - User input and input normalization
 * - Case-insensitive String comparison
 * - Flag checking for search results
 */

public class linearSearchArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // String array (fruits)
        String[] fruits = { "Banana", "Apple", "Grapes", "Mango", "Cherry" };
        Arrays.sort(fruits); // Optional sort

        System.out.print("Enter a fruit to search for: ");
        String fruitTarget = scn.nextLine().toLowerCase().trim(); // Normalize input
        searchStringArray(fruits, fruitTarget); // Call method to search string

        // Integer array (numbers)
        int[] numbers = { 5, 9, 15, 3, 22 };
        System.out.print("\nEnter a number to search for: ");
        while (!scn.hasNextInt()) {
            System.out.println("Invalid input. Enter a valid number:");
            scn.nextLine(); // Clear invalid input
        }
        int numberTarget = scn.nextInt();
        searchIntArray(numbers, numberTarget); // Call method to search int array

        scn.close();
    }

    // Method to search in a String array (case-insensitive)
    static void searchStringArray(String[] fruits, String fruitTarget) {
        boolean isNotFound = true;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equalsIgnoreCase(fruitTarget)) {
                System.out.println("Fruit found at index " + i);
                isNotFound = false;
                break;
            }
        }
        if (isNotFound) {
            System.out.println("Fruit not found in the array.");
        }
    }

    // Method to search in an int array
    static void searchIntArray(int[] numbers, int numberTarget) {
        boolean isNotFound = true;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberTarget) {
                System.out.println("Number found at index " + i);
                isNotFound = false;
                break;
            }
        }
        if (isNotFound) {
            System.out.println("Number not found in the array.");
        }
    }
}
