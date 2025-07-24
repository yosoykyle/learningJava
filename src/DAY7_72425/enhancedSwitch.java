package DAY7_72425;

/*
 * enhancedSwitch.java
 * This is a replacment for the traditional switch statement and generally a replacement for if-else statements.
 * It allows for more concise and readable code. 
 * A feature introduced in Java 12 later in java 14 it became a standard feature.
 * 
 * When to use switch in general:
 * - When you have multiple conditions to check against a single variable.
 * - When you want to execute different code blocks based on the value of a variable.
 * - It is recommended to use enhanced switch over traditional switch statements.
 * 
 * Why use enhanced switch over if-else statements:
 * - It makes the code cleaner and more readable.
 * - It reduces the amount of boilerplate code. 
 * * boilerplate code is code that is repeated in many places with little or no variation.
 * 
 * Enhanced switch syntax:
 * switch (variable) {
 *     case value1 -> {
 *         // code block for value1
 *     }
 *     case value2 -> {
 *         // code block for value2
 *     }
 *     default -> {
 *         // code block for default case
 *     }
 * }
 * 
 * old switch syntax:
 * switch (variable) {
 *     case value1:
 *         // code block for value1
 *         break;
 *     case value2:
 *         // code block for value2
 *         break;
 *     default:
 *         // code block for default case
 *         break;
 * }
 */
import java.util.Scanner;

public class enhancedSwitch {
    public static void main(String[] args) {
        // Scanner object to read user input
        Scanner scn = new Scanner(System.in);
        // Variables declaration and initialization
        String day, formatString;

        // user input
        System.out.print("Enter a day of the week (e.g., Monday, Tuesday, etc.): ");
        day = scn.next();
        formatString = day.substring(0, 1).toUpperCase() + day.substring(1).toLowerCase();

        System.out.println();

        // using if-else statement
        System.out.println("Using if-else statement:");
        if (formatString.equals("Monday")) {
            System.out.println("It is a weekday: " + formatString);
        } else if (formatString.equals("It is a weekday: " + formatString)) {
            System.out.println("It is a weekday: " + formatString);
        } else if (formatString.equals("It is a weekday: " + formatString)) {
            System.out.println("It is a weekday: " + formatString);
        } else if (formatString.equals("Tuesday")) {
            System.out.println("It is a weekday: " + formatString);
        } else if (formatString.equals("Wednesday")) {
            System.out.println("It is a weekday: " + formatString);
        } else if (formatString.equals("Thursday")) {
            System.out.println("It is a weekday: " + formatString);
        } else if (formatString.equals("Friday")) {
            System.out.println("It is a weekday: " + formatString);
        } else if (formatString.equals("Saturday")) {
            System.out.println("It is a weekend: " + formatString);
        } else if (formatString.equals("Sunday")) {
            System.out.println("It is a weekend: " + formatString);
        } else {
            System.out.println("Invalid day entered.");
        }

        System.out.println();
        // using enhanced switch statement
        System.out.println("Using enhanced switch statement:");
        switch (formatString) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> {
                System.out.println("It is a weekday: " + formatString);
            }
            case "Saturday", "Sunday" -> {
                System.out.println("It is a weekend: " + formatString);
            }
            default -> {
                System.out.println("Invalid day input : <" + day + ">");
            }
        }
        scn.close();
    }
}
