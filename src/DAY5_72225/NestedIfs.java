package DAY5_72225;

/*
 * A nested if-statement is a control structure used to evaluate multiple conditions,
 * where one if-statement is placed inside another.
 * 
 * This allows for more precise decision-making by checking a condition
 * only when a preceding condition is true, creating a hierarchy of checks.
 * 
 * Compared to a simple if-statement, nested ifs provide more granular control,
 * making them useful in scenarios with layered or dependent logic.
 * 
 * Common use cases include:
 * - Validating multi-step user input
 * - Checking multiple attributes of an object
 * - Implementing complex business rules or conditions
 */

import java.util.Scanner;

public class NestedIfs {
    public static void main(String[] args) {
        // Movie ticket pricing based on age (senior) and student status
        Scanner scn = new Scanner(System.in);
        String name;
        boolean isStudent, isSenior;
        double priceTicket = 10.99;
        char currency = '$';

        // Prompting user for input
        System.out.print("Enter your name: ");
        name = scn.nextLine().trim();
        /*
         * input validation for name we use .trim() to remove leading and trailing
         * spaces
         * and check if the name is empty. the while loop will continue to prompt the
         * user
         * until a valid name is entered.
         */
        while (name.isEmpty()) {
            System.out.print("Please enter a valid name: ");
            name = scn.nextLine().trim();
        }
        // Prompting user for age validation
        // If age is 65 or older, they are considered a senior citizen
        System.out.print("Enter your age: ");
        int age = scn.nextInt();
        if (age >= 65) {
            isSenior = true; // Senior citizen if age is 65 or older
            System.out.print("Are you by chance a student? (true/false): ");
            isStudent = scn.nextBoolean();
        } else {
            isSenior = false;
            System.out.print("Are you by chance a student? (true/false): ");
            isStudent = scn.nextBoolean();
        }

        // Discount conditions
        if (isStudent) {
            if (isSenior) {
                System.out.printf("Hi %s! %nYou qualify for a student and a senior discount of 10%% + 20%% = 30%%.%n",
                        name);
                priceTicket *= 0.7; // Apply 30% discount
                System.out.printf("Your movie ticket: %c%.2f%n", currency, priceTicket);
            } else {
                System.out.printf("Hi %s! %nYou qualify for a student discount of 10%%.%n", name);
                priceTicket *= 0.9; // Apply 10% discount
                System.out.printf("Your movie ticket: %c%.2f%n", currency, priceTicket);
            }
        } else {
            if (isSenior) {
                System.out.printf("Hi %s! %nYou qualify for a senior discount of 20%%.%n", name);
                priceTicket *= 0.8; // Apply 20% discount
                System.out.printf("Your movie ticket: %c%.2f%n", currency, priceTicket);
            } else {
                System.out.printf("Hi %s! %nYou do not qualify for any discounts.%n", name);
                System.out.printf("Your movie ticket: %c%.2f%n", currency, priceTicket);
            }
        }
        scn.close();
    }
}
