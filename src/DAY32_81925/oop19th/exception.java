package DAY32_81925.oop19th;

import java.util.Scanner;
import java.util.InputMismatchException; // needed for catching invalid input type errors

/*
 * exception.java
 * 
 * An *exception* is an event that interrupts the normal flow of a program.
 * 
 * Common examples:
 * - Dividing by zero
 * - File not found
 * - Input type mismatch
 * 
 * These kinds of events cause interruptions in program execution,
 * and they are called **exceptions**.
 * 
 * Exceptions are handled using a combination of these blocks:
 * - try {} → surrounds any “dangerous” code that *might* fail
 * - try() {} with resources → automatically closes the resource used (e.g., Scanner, File)
 * - catch() {} → catches exceptions and acts as a "safety net"
 * - finally {} (optional) → always executes, useful for cleanup
 * 
 * Analogy with if–else:
 * - if → try
 * - else if → catch
 * - else → finally (not exact, but similar in flow control)
 * 
 * Difference between **validation** vs **exception handling**:
 * - Validation (if–else): manually check input/conditions and handle errors with messages/flags.
 * - Exception (try–catch): let Java throw an *exception object* when something unexpected happens,
 *   then handle it with catch blocks. This is the **standard, object-oriented way**.
 *
 * In practice:
 * - Use **validation** when you expect common or likely mistakes 
 *   (e.g., checking if input is empty, or a list is null).
 * - Use **exceptions** for rare or critical failures that are not easily predictable
 *   (e.g., divide by zero, file missing, network down).
 *
 * Rule of thumb:
 * - If the problem is *likely and normal* → use **validation**.
 * - If the problem is *unlikely and exceptional* → use **exceptions**.
 * 
 * Where is this usually typed?
 * - Around code that deals with user input, files, networking, or anything external/unpredictable.
 *
 * Example side-by-side:
 *
 * Validation (expected mistake):
 * -----------------------------
 * String input = "abc";
 * if (input.matches("\\d+")) {
 *     int age = Integer.parseInt(input);
 * } else {
 *     System.out.println("Invalid age!");
 * }
 *
 * Exception (unexpected failure):
 * -------------------------------
 * try {
 *     int number = 10 / 0;   // dangerous: division by zero
 * } catch (ArithmeticException e) {
 *     System.out.println("You cannot divide by zero!");
 * }
 * 
 */


public class exception {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // Accepting user input is considered “dangerous” because the user can type anything.
        // That’s why we often wrap it in try-catch blocks.

        // try{}
        // try {
        //     // dangerous code
        // }

        // try-with-resources: () ensures the resource is automatically closed after use.
        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("Enter a number: "); // user may type letters instead of a number
            int number = scn.nextInt(); // risky line: could throw InputMismatchException
            System.out.println(number);

            // Example: uncomment this to force an ArithmeticException
            // System.out.println(1 / 0); // dividing by zero → will throw ArithmeticException
        }

        // A catch block handles exceptions thrown inside the try block.
        // Syntax: catch (ExceptionType e) { ... }
        // You can use multiple catch blocks to handle *different* exception types separately.

        // Catch block: handles invalid user input
        catch (InputMismatchException e) {
            System.out.println("Not a valid number! Please enter digits only.");
        }

        // Catch block: handles division by zero
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0! (╬▔皿▔)╯");
        }

        // Generic catch: handles all exceptions not specifically caught above.
        // ⚠ Not best practice, since it’s not descriptive and may hide details.
        // Use this for exceptions you didn’t anticipate.
        catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }

        // finally{} (optional)
        // This block *always executes*, whether or not an exception occurred.
        // Common uses:
        // - Clean up resources (close files, DB connections, etc.)
        // - Ensure important code always runs
        finally {
            // scn.close();  
            // If Scanner was declared outside try, we’d normally close it here.
            // (In try-with-resources, this is handled automatically.)
            System.out.println("`finally` block executed: cleanup done.");
        }
    }
}
