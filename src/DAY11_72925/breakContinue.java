package DAY11_72925;

/*
 * breakContinue.java
 *
 * This file demonstrates the use of two fundamental control flow keywords in Java: `break` and `continue`.
 *
 * What Are They?
 * --------------
 * - `break`:
 *   Stops the nearest enclosing loop immediately.
 *   Useful when you want to exit a loop based on a certain condition,
 *   such as finding a match in a search.
 *
 * - `continue`:
 *   Skips the current iteration and proceeds with the next one.
 *   Ideal when you want to ignore certain cases without stopping the loop entirely.
 *
 * Both are essential tools for refining loop behavior, improving readability,
 * and controlling flow in repetitive structures like `for`, `while`, and `do-while` loops.
 */

public class breakContinue {
    public static void main(String[] args) {

        int i;
        for (i = 0; i <= 10; i++) 
        {
            if (i == 5) 
            {
                continue; // output 0 1 2 3 4 6 7 8 9 10 (missing 5) (SKIP)
            }
            if ( i == 9) 
            {
                break; // output 0 1 2 3 4 6 7 8 (missing 5, 9, 10) (STOP)
            } 
            System.out.print(i + " ");
        }
    }
}
