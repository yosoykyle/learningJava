package DAY17_8425;

/*
 * variableArgumentsComparison.java
 *
 * This program demonstrates the differences between:
 * - Variable arguments (varargs)
 * - Regular arrays
 * - Overloaded methods
 *
 * -----------------------------------------------------
 * ▶ Regular Arrays:
 * - You must manually create and pass an array.
 * - Best when the data already exists as an array (e.g., from a file, user input, or collection).
 * - Syntax is less concise when passing multiple hardcoded values.
 *
 * ▶ Varargs (Variable Arguments):
 * - Allows passing a flexible number of arguments directly.
 * - Java automatically packs the arguments into an array behind the scenes.
 * - Cleaner and more convenient for utility-style methods (e.g., `sum()`, `average()`).
 * - Accepts zero or more arguments.
 * - Cannot be followed by other parameters; must always be the **last** in the method signature.
 *   ▸ ✅ `void log(String tag, String... messages)` – valid
 *   ▸ ❌ `void log(String... messages, String tag)` – invalid
 *
 * ▶ Overloaded Methods:
 * - Useful when:
 *   ▸ Each variation requires different logic or validation.
 *   ▸ Argument types differ (e.g., `int`, `double`, `String`).
 * - Helps maintain clear method intentions and type safety.
 * - More verbose when you only vary the number of parameters.
 *
 * -------------------------------------------------
 * ▶ Varargs vs. Overloaded Methods:
 * ▸ Use **varargs**:
 *   - When a method performs the same logic regardless of argument count.
 *   - To reduce redundant overloads differing only in parameter count.
 * 
 * ▸ Use **overloaded methods**:
 *   - When behavior should differ depending on parameter types or signatures.
 *   - To handle different data types or combinations more explicitly.
 *
 * ▶ Overloading Varargs Methods:
 * - You can overload a method with a varargs version.
 *   Example:
 *     void print(String label, int... values)
 *     void print(int... values)
 * - ⚠ Be careful of ambiguous calls.
 *   ▸ `print(10)` could match both → results in a compile-time error.
 */

public class variableArgumentsComparison {
    public static void main(String[] args) {
        System.out.println("=== Using Varargs ===");
        System.out.printf("Average: %.2f%n", averageVarArgs(80, 90, 100));
        System.out.printf("Average: %.2f%n", averageVarArgs()); // No arguments

        System.out.println("\n=== Using Regular Array ===");
        double[] grades = { 80, 90, 100 };
        System.out.printf("Average: %.2f%n", averageWithArray(grades));

        System.out.println("\n=== Using Overloaded Methods ===");
        System.out.printf("Average (2 inputs): %.2f%n", average(80, 90));
        System.out.printf("Average (3 inputs): %.2f%n", average(80, 90, 100));
    }

    // Method using variable-length arguments (varargs)
    static double averageVarArgs(double... numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        // If the array is empty, return 0; otherwise, return the average.
        return (numbers.length == 0) ? 0 : sum / numbers.length;
    }

    // Method using a regular array as input
    static double averageWithArray(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return (numbers.length == 0) ? 0 : sum / numbers.length;
    }

    // Overloaded methods for average with fixed parameters
    static double average(double a, double b) {
        return (a + b) / 2;
    }

    static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
