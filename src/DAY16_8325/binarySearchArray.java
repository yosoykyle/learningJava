package DAY16_8325;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * binarySearchArray.java
 * 
 * Practice Project: Demonstrates how to generate a random array of integers, sort it, 
 * and search for a specific number using the Arrays.binarySearch() method.
 * 
 * Concepts covered:
 * - Array creation and initialization
 * - Random number generation
 * - Input validation
 * - Sorting an array (required before binary search)
 * - Binary search
 * - Ternary operator usage
 *
 * What is Binary Search?
 * ----------------------
 * Binary search is an efficient algorithm for finding an item in a **sorted array**.
 * It works by repeatedly dividing the search range in half:
 *   1. Start with the middle element of the array.
 *   2. If it's equal to the target, return its index.
 *   3. If the target is smaller, search the left half.
 *   4. If the target is larger, search the right half.
 * 
 * This continues until the item is found or the search range is empty.
 * 
 * Note: The array **must be sorted** before performing binary search.
 *       If not sorted, the result will be incorrect.
 */

public class binarySearchArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);  // For user input
        Random rnd = new Random();             // To generate random numbers
        int numberSize = 0;
        int searchNumber;
        int[] numbers;
        int searched;

        System.out.print("Define the size of the array ");
        numberSize = arrayUserInput.intValidation(scn); // Get valid array size from user
        numbers = new int[numberSize];                  // Initialize array with given size

        // Fill array with random numbers between 1 and 5
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(1, 6); // 6 is exclusive
        }

        // Check if array has no elements using ternary operator
        String isEmpty = (numbers.length == 0) ? "empty" : "!empty";
        System.out.println("Array status: " + isEmpty);

        Arrays.sort(numbers); // Must sort the array before binary search

        // Prompt user to enter number to search
        searchNumber = intValidation(scn);

        // Perform binary search
        searched = Arrays.binarySearch(numbers, searchNumber);
        if (searched >= 0) {
            System.out.println("Number found at index: " + searched);
        } else {
            System.out.println("Number not found (result: " + searched + ")");
        }

        scn.close(); // Close scanner to avoid resource leaks
    }

    // Validates and returns an integer input from the user
    static int intValidation(Scanner scn) {
        int validN = 0;
        while (true) {
            System.out.print("Enter number to search: ");
            if (scn.hasNextInt()) {
                validN = scn.nextInt();
                scn.nextLine(); // clear input buffer
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scn.nextLine(); // clear invalid input
            }
        }
        return validN;
    }
}
