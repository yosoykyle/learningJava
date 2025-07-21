package DAY3_72025;
/*This is an important topic in programming: the use of arithmetic operators.
    * Arithmetic operators are used to perform basic mathematical operations.
    * The most common arithmetic operators are:
    * - Addition (+)
    * - Subtraction (-)
    * - Multiplication (*)
    * - Division (/)
    * - Modulus (%)
    */

public class Arithmetic {
    public static void main(String[] args) {
        // Addition
        System.out.println("Arithmetic Operators Example: Addition");
        int x, y, z;
        x = 10;
        y = 20;
        z = x + y;
        System.out.println("Addition of " + x + " and " + y + " is: " + z);

        // Subtraction
        System.out.println("Arithmetic Operators Example: Subtraction");
        int a, b, c;
        a = 30;
        b = 20;
        c = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " is: " + c);

        // Multiplication
        System.out.println("Arithmetic Operators Example: Multiplication");
        int e, f, g;
        e = 30;
        f = 20;
        g = e * f;
        System.out.println("Multiplication of " + e + " and " + f + " is: " + g);

        // Division
        System.out.println("Arithmetic Operators Example: Division");
        int h, i, j;
        h = 600;
        i = 20;
        j = h / i;
        System.out.println("Division of " + h + " by " + i + " is: " + j);

        // Modulus: useful when for determining if a number is even or not or for
        // finding the remainder or when working with cycles.
        System.out.println("Arithmetic Operators Example: Modulus");
        int k, l, m;
        k = 30;
        l = 15;
        m = k % l;
        System.out.println("\nModulus of " + k + " and " + l + " is: " + m);

        // Augmented Assignment Operators these operators are used to perform arithmetic
        // operations and assign the result to the variable in a single step.
        System.out.println("Arithmetic Operators Example: Augmented Assignment Operators");
        int n, o;
        n = 10;
        o = 5;
        System.out.println("Initial value of n: " + n);
        System.out.println("Initial value of o: " + o);
        n += o; // n = n + o
        System.out.println("After += operation, n is: " + n);
        n -= o; // n = n - o
        System.out.println("After -= operation, n is: " + n);
        n *= o; // n = n * o
        System.out.println("After *= operation, n is: " + n);
        n /= o; // n = n / o
        System.out.println("After /= operation, n is: " + n);
        n %= o; // n = n % o
        System.out.println("\nAfter %= operation, n is: " + n);

        // Increment and Decrement Operators pre-increment and post-increment
        /**
         * This program demonstrates the difference between
         * pre-increment (++i) and post-increment (i++) operators.
         * 
         * Pre-increment: Increases the value before it is used.
         * Post-increment: Uses the current value, then increases it.
         */

        System.out.println("Arithmetic Operators Example: Increment and Decrement Operators");
        // Increment
        System.out.println("Increment Operators Example");
        int p = 10;
        System.out.println("Initial value of p: " + p);
        System.out.println("Using post-increment: " + p++);
        System.out.println("Value of p after post-increment: " + p);
        System.out.println("Using pre-increment: " + ++p);
        System.out.println("\nValue of p after pre-increment: " + p);

        // Decrement
        System.out.println("Decrement Operators Example");
        int q = 10;
        System.out.println("Initial value of q: " + q);
        System.out.println("Using post-decrement: " + q--);
        System.out.println("Value of q after post-decrement: " + q);
        System.out.println("Using pre-decrement: " + --q);
        System.out.println("\nValue of q after pre-decrement: " + q);

        // The order of operations [PEMDAS/BODMAS]
        // PEMDAS stands for Parentheses, Exponents, Multiplication and Division (from
        // left to right), Addition and Subtraction (from left to right).
        // BODMAS stands for Brackets, Orders (i.e., powers and square roots, etc.),
        // Division and Multiplication (from left to right), Addition and Subtraction
        // (from left to right).
        // This is important to understand how expressions are evaluated in programming.
        // Example of order of operations
        System.out.println("Arithmetic Operators Example: Order of Operations");
        double result = 3 + 4 * (7 - 5) / 2.0;
        System.out.println("Result of 3 + 4 * (7 - 5) / 2.0 is: " + result);
    }
}
