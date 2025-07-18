package DAY1_71625;

public class Variables {
    public static void main(String[] args) {
        /* Variables are reusable containers for storing data in Java. 
         * It behaves as if it was the value itself.
         * 
         * Two types of variables:
         * 1. Primitive types: These are the basic data types in Java. Stored directly in memory (stack).
         * 2. Reference types: These are more complex types that refer to objects. Stored in memory (heap).
         * * Bank vs wallet analogy: Think of the stack as a wallet where you carry a small amount of cash (primitive types), and the heap as a bank where you store larger amounts of money or valuable items (reference types).
         * * If I gave you a $100 bill (primitive type), you could easily fit it in your wallet (stack). But if I gave you a credit card (reference type), you would need to go to the bank (heap) to access your funds.
         *
         * * Primitive types include:
         *   - byte: is the smallest integer type, useful for small numbers like 1, 2, 3
         *   - short: is a larger integer type, useful for numbers like 1000, 2000
         *   - int: is a standard integer type, useful for numbers like 1, 2, 3
         *   - long: is a larger integer type, useful for very large numbers like 1000000L
         *   - float: is used for single-precision floating-point numbers, useful for numbers with decimal points like 1.5f, 2.3f
         *      - n'f' is used to indicate a float literal because Java treats decimal numbers as double by default.
         *   - double: is used for double-precision floating-point numbers, useful for larger decimal numbers like 3.14, 2.718
         *   - The difference between float and double is precision; double is more precise than float. Use double for more accuracy. Use float for less precision.
         *   - char: is a character type, useful for storing single characters like 'A', 'B', 'C'
         *   - boolean: is a type for true/false values and is used for logical operations
         * 
         * * Reference types include:
         *   - String: is a sequence of characters
         *   - Arrays: are collections of elements
         *   - Objects: are instances of classes
        */

        /* Two Steps to creating a variable:
         * 1. Declaration: Specify the variable type and name.
         * 2. Initialization or Assignment: Assign a value to the variable (using the '=' operator).
         */

        // Example of variable declaration and initialization for primitive types
        byte smallNumber = 10; // 8 bits
        short mediumNumber = 1000; // 16 bits
        int largeNumber = 100000; // 32 bits
        long veryLargeNumber = 10000000000L; // 64 bits
        float decimalNumber = 5.75f; // 32 bits
        double largeDecimalNumber = 19.99; // 64 bits
        char singleCharacter = 'A'; // 16 bits
        boolean trueOrFalse = true; // 1 bit
        // Example of variable declaration and initialization for reference types
        String greeting = "Hello, World!"; // String type
        int[] numbersArray = {1, 2, 3, 4, 5}; // Array type

        // Printing the values of the variables
        System.out.println("Byte value: " + smallNumber);
        System.out.println("Short value: " + mediumNumber);
        System.out.println("Int value: " + largeNumber);
        System.out.println("Long value: " + veryLargeNumber);
        System.out.println("Float value: " + decimalNumber);
        System.out.println("Double value: " + largeDecimalNumber);
        System.out.println("Char value: " + singleCharacter);
        System.out.println("Boolean value: " + trueOrFalse);
        System.out.println("String value: " + greeting);
        // Ways to print array values:
       // basic for loop
        System.out.print("Array values: ");
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i] + " ");
        }
        System.out.println(); 

        // Enhanced for loop
        System.out.print("Array values (enhanced for loop): ");
        for (int number : numbersArray) {
            System.out.print(number + " ");
        }
        System.out.println(); // New line after printing array values.

        // Using Arrays.toString() method
        System.out.println("Array values (using Arrays.toString()): " + java.util.Arrays.toString(numbersArray));
    }
}
