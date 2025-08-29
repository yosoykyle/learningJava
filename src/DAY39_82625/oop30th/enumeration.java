package DAY39_82625.oop30th;
/*
 * enumeration.java
 * 
 * What is an Enumeration (Enum)?
 * ------------------------------
 * - An enum (short for "enumeration") is a special type of class in Java that represents a fixed set of constants.
 * - Constants are values that stay the same throughout the program.
 * - Enums improve code readability because you use meaningful names instead of magic numbers or strings.
 * - Enums are easier to maintain because all related constants are grouped in one place.
 * - Using enums with switch statements is more efficient than using strings for comparisons.
 * - Each enum constant is actually an instance of the enum type itself (not a String or int).
 * - By convention, enum constants are written in ALL_CAPS to distinguish them from regular variables.
 * 
 * Why use Enums?
 * --------------
 * - Provides type safety: only allows predefined constants.
 * - Improves code clarity and maintainability.
 * - Avoids invalid assignments or errors that the compiler can catch.
 * - Can store additional data and methods, making the code organized and flexible.
 * 
 * Where can Enums be defined?
 * ---------------------------
 * 1. Top-level (own file) - reusable across multiple classes.
 * 2. Nested inside a class - limited to that class's scope.
 * 3. Local inside a method - exists only in that method (rarely used).
 * 
 * Basic Syntax:
 * -------------
 * enum Day {
 *     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
 * }
 * 
 * Using an enum in code:
 * ---------------------
 * Day today = Day.MONDAY;
 * System.out.println(today);  // Prints: MONDAY
 * 
 * Iterating over enum values:
 * for (Day d : Day.values()) {
 *     System.out.println(d);
 * }
 * 
 * Common Methods for Enums:
 * -------------------------
 * - values()          : Returns an array of all enum constants.
 * - valueOf(String)   : Returns the enum constant matching the given name (throws exception if not found).
 * - name()            : Returns the name of the enum constant as a String.
 * - ordinal()         : Returns the position/index of the constant in the enum declaration (starting from 0).
 * 
 * Example of methods:
 * Day today = Day.FRIDAY;
 * System.out.println(today.name());     // "FRIDAY"
 * System.out.println(today.ordinal());  // 4
 * Day another = Day.valueOf(today); // returns Day.FRIDAY
 * 
 * Enums with behavior:
 * -------------------
 * - Enums can define methods and fields.
 * - Each enum constant can override methods to provide unique behavior.
 * Example: 
 * enum Operation {
 *     ADD { @Override public double apply(double x, double y) { return x + y; } },
 *     SUBTRACT { @Override public double apply(double x, double y) { return x - y; } };
 *     public abstract double apply(double x, double y);
 * }
 * 
 * Enums implementing interfaces:
 * ------------------------------
 * - Enums can implement interfaces to enforce a contract for all constants.
 * - Each constant can implement interface methods differently.
 * Example:
 * interface Greeting { void sayHello(); }
 * enum Language implements Greeting {
 *     ENGLISH { public void sayHello() { System.out.println("Hello!"); } },
 *     SPANISH { public void sayHello() { System.out.println("¡Hola!"); } }
 * }
 * 
 * Using Enums with Switch:
 * -----------------------
 * - Enums are often used with switch statements for clean, readable code.
 * - Example:
 * switch(today) {
 *     case MONDAY -> System.out.println("Start of week");
 *     case FRIDAY -> System.out.println("Almost weekend");
 * }
 * - Provides type safety and avoids string comparison overhead.
 * 
 * Enums with associated values (fields/parameterized enums):
 * ----------------------------------------------------------
 * - Each enum constant can store extra information (fields).
 * - This is called a “parameterized enum” or “enum with fields”.
 * - Example: assigning numbers to days of the week.
 * 
 * enum Day {
 *     MONDAY(1), TUESDAY(2), WEDNESDAY(3);
 *     
 *     private final int dayNumber;
 *     
 *     Day(int dayNumber) { this.dayNumber = dayNumber; }
 *     public int getDayNumber() { return dayNumber; }
 * }
 * 
 * Key Points:
 * -----------
 * - Enums are more efficient and safer than using strings or integers for fixed sets of values.
 * - They can store data, methods, and implement interfaces.
 * - Useful for representing states, types, categories, or any fixed list of constants.
 * - Enhances code readability, maintainability, and performance in switches.
 */

import java.util.Scanner;

public class enumeration {
    public static void main(String[] args) {

        // try-with-resources ensures the Scanner is automatically closed
        try (Scanner scn = new Scanner(System.in)) {

            System.out.print("Enter a day of the week: ");
            // Read user input, convert to uppercase and remove extra spaces
            String respose = scn.nextLine().toUpperCase().trim();

            // Convert the string input to an enum constant of type Day
            // May throw IllegalArgumentException if the input is invalid
            Day today = Day.valueOf(respose);

            // Use switch statement on enum
            switch (today) {
                case MONDAY,
                        TUESDAY,
                        WEDNESDAY,
                        THURSDAY,
                        FRIDAY -> {
                    // Weekday case
                    // name() returns the enum constant name
                    // getDayNumber() returns the associated numeric value
                    System.out.println("It is a weekday: " + today.name() + ": " + today.getDayNumber());
                }
                case SATURDAY,
                        SUNDAY -> {
                    // Weekend case
                    System.out.println("It is a weekend: " + today.name() + ": " + today.getDayNumber());
                }
                default -> {
                    // Default case (technically not needed because all enum constants are covered)
                    System.out.println("Invalid day");
                }
            }
        } catch (IllegalArgumentException e) {
            // Handles invalid enum input
            // Example: user types "Funday", which is not a Day enum
            System.out.println("Invalid: " + e.getMessage());
        }
    }
}
