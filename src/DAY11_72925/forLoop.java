package DAY11_72925;

/*
 * About the for Loop:
 * --------------------
 * A `for` loop is commonly used when the number of iterations is known or predictable.
 * It is a compact looping structure that combines initialization, condition-checking, 
 * and increment/decrement in one line.
 * 
 * Regular for Loop Syntax:
 * --------------------------
 * for (initialization; condition; update) {
 *     // Code to repeat
 * }
 * 
 * It's commmon to name the counter/initialization 'i' meaning index.
 * Example:
 * --------
 * for (int i = 0; i < 5; i++) // ++ by n || -- by n 
 * {
 *     System.out.println("Iteration #" + i);
 * }
 *
 * Enhanced for-each Loop:
 * ------------------------
 * A `for-each` loop (also called "enhanced for loop") is used to iterate over 
 * arrays or collections without needing an index.
 * 
 * for (type element : arrayOrCollection) {
 *     // Code using element
 * }
 *
 * Example:
 * --------
 * String[] fruits = {"Apple", "Banana", "Cherry"};
 * for (String fruit : fruits) {
 *     System.out.println(fruit);
 * }
 * 
 * Equivalent using Traditional For Loop:
 * --------------------------------------
 * for (int i = 0; i < fruits.length; i++) {
 *     System.out.println(fruits[i]);
 * }
 *
 * When to Use:
 * -------------
 * - Use `for` loop when you need control over the index or when modifying array elements.
 * - Use `for-each` loop when you just need to read elements from an array or collection.
 *
 * Tips:
 * ------
 * - Avoid using `for-each` if you need to modify the underlying array/collection directly.
 * - `for-each` simplifies syntax and reduces the chance of off-by-one errors.
 */
import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) throws InterruptedException 
    {

        // Objects
        Scanner scn = new Scanner(System.in);

        // Varible declaration and initialization
        int max, start;
        start = 0;
        max = 0;

        // User prompt with input validation
        while (true) {
            System.out.print("Enter how many times you want to loop: ");
            if (scn.hasNextInt()) {
                max = scn.nextInt();
                scn.nextLine(); // Consume the rest of the line (including the newline character)
                break;
            } else {
                System.out.println("Invalid input");
                scn.next(); // Consume the invalid token to prevent an infinite loop
            }
        }

        // for-loop
        for (int i = 1; i <= max; i++) {
            System.out.println("Count " + i);
        }

        System.out.println();

        System.out.println("Countdown from " + max);

        /*
         * A countdown program using the Thread class.
         * This program pauses for 1 second between each loop iteration
         * by using Thread.sleep().
         */

        start += max;
        for (int j = start; j > 0; --j) {
            System.out.println(j);
            Thread.sleep(1000); // 1 second in millisecond
            /*
             * Added throws InterruptedException 
             * This exception typically occurs when a thread running
             * the method is interrupted while it is sleeping, waiting
             * or otherwise paused in its exection
            */
        }
        System.out.println("Happy New Year!");

        scn.close();
    }
}
