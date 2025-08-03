package DAY15_8225;

/*
 * arrays.java
 * 
 * Arrays Overview:
 * ----------------
 * - An array is a collection of elements of the same data type.
 * - Arrays are reference data types in Java.
 * - Think of an array as a container that can store multiple values under a single variable name.

 * Key Concepts:
 * -------------
 * - Syntax: dataType[] arrayName = new dataType[size]; or {val1, val2, val3};
 * - Access: Use index notation, e.g., array[0], to access or modify elements.
 * - Indexing: Arrays use 0-based indexing. First element is at index 0.
 * - Invalid Access: Accessing an index outside the bounds will throw ArrayIndexOutOfBoundsException.
 * - Use Cases: When you know the number of elements in advance and they are of the same type.
 * - Notes: Once created, the array size is fixed.

 * Common Operations:
 * ------------------
 * - Displaying elements
 * - Populating arrays
 * - Updating array values
 * - Traversing arrays (normal and enhanced for-loop)
 * - Sorting and filling arrays using utility methods (from java.util.Arrays)
 */

import java.util.Arrays; // Importing Arrays utility class gives access to many helpful static methods 
                         // like sort(), fill(), copyOf(), equals(), binarySearch(), etc.

public class arrays {
    public static void main(String[] args) {
        // Declare and initialize a String array
        String[] fruits = {"apple", "orange", "banana", "coconut"};
        int numOfFruitsLen;

        System.out.println(fruits);          // Prints the memory address (not contents)
        System.out.println(fruits[0]);       // Prints the first element ("apple")
        
        fruits[0] = "pineapple";             // Updates the first element
        
        numOfFruitsLen = fruits.length;      // .length is a property to get array size
        
        // Example of arrays methods
        Arrays.sort(fruits);                 // Sorts the array alphabetically
        Arrays.fill(fruits, "a");            // Replaces all elements with "a"

        // Regular for-loop to iterate through array using index
        for (int i = 0; i <= numOfFruitsLen - 1; i++) {
            System.out.print(fruits[i] + " ");
        }

        // Enhanced for-loop (for-each) for cleaner iteration
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
