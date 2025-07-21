package DAY4_72125;

/**
 * Compound Interest Exercise
 *
 * This program calculates the compound interest earned on an investment
 * over a period of time, based on user inputs like principal, rate, and time.
 *
 * Practice goals:
 * - Using variables and data types (double, int)
 * - Taking user input with Scanner
 * - Applying mathematical formulas (compound interest formula)
 * - Using Math.pow() for exponentiation
 * - Formatting output using System.out.printf()
 */

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Declarations of variables

        String name;
        double amount, principal, rate, years;
        int timesCompounded;
        char currencySymbol = '$';

        // User inputs
        System.out.print("Enter your name: ");
        name = scn.next();

        scn.nextLine();

        System.out.print("Enter the principal amount: ");
        principal = scn.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scn.nextDouble() / 100; // n / 100 ensures that the inputed values is in .n% : >

        System.out.print("Enter the # of times of compounded per year: ");
        timesCompounded = scn.nextInt();

        System.out.print("Enter the # of year: ");
        years = scn.nextDouble();

        // Calculations
        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("Hello %s, the ammount: %c%,.2f%n", name, currencySymbol, principal);
        System.out.printf("After %.1f years is: %c: %,.2f", years, currencySymbol, amount);

        scn.close();
    }
}
