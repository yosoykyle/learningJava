package DAY17_8425;

/*
 * twoDArray.java
 * 
 * Demonstrates the use of a two-dimensional (2D) array in Java.
 *
 * A 2D array is essentially an array of arrays. It allows for structured data storage 
 * in a matrix or table format, making it useful for representing grids, tables, and 
 * categorized datasets (e.g., rows and columns).
 * 
 * Use cases:
 * - Storing tables (like spreadsheets or multiplication tables)
 * - Representing game boards (e.g., chess, tic-tac-toe)
 * - Categorizing data (e.g., Fruits, Vegetables, Meats)
 * 
 * Notes:
 * - Each row can have a different number of columns (jagged arrays).
 * - You access elements using [row][column].
 * 
 * Why use a 2D array:
 * - Organizes related data more intuitively.
 * - Makes nested loops practical for navigation and processing.
 */

public class twoDArray {
    public static void main(String[] args) {
        // One-dimensional arrays for individual categories
        String[] fruits = { "apple", "orange", "banana" };
        String[] vegetables = { "potato", "onion", "carrot" };
        String[] meats = { "chicken", "beef", "lamb", "fish" };

        // Two-dimensional array grouping all categories
        String[][] produce = {
            { "apple", "orange", "banana" },                // Row 0: Fruits
            { "potato", "onion", "carrot", "beans" },       // Row 1: Vegetables
            { "chicken", "beef", "lamb", "fish" }           // Row 2: Meats
        };

        // Outer loop iterates through each category (rows)
        for (int i = 0; i < produce.length; i++) {
            // Print category label based on the current row index
            switch (i) {
                case 0 -> System.out.print("Fruits: ");
                case 1 -> System.out.print("Vegetables: ");
                case 2 -> System.out.print("Meats: ");
                default -> System.out.print("Unknown category: ");
            }

            // Inner loop iterates through items within the category (columns)
            for (int j = 0; j < produce[i].length; j++) {
                System.out.print(produce[i][j] + " ");
            }

            // Move to the next line after printing a category
            System.out.println();
        }
    }
}
