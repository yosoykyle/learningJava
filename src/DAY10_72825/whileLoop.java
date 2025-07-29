package DAY10_72825;

/*
 * What is a Loop?
 * ----------------
 * A loop is a control structure in programming that repeatedly executes a block of code 
 * as long as a specified condition is true. Loops help eliminate code repetition, making 
 * programs shorter, more readable, and easier to maintain.
 *
 * Common Types of Loops in Java:
 * -------------------------------
 * 1. for loop      - Used when the number of iterations is known in advance.
 * 2. while loop    - Used when the number of iterations is not known beforehand.
 * 3. do-while loop - Similar to while loop, but guarantees at least one execution.
 *
 * About the while Loop:
 * ----------------------
 * A while loop continues to execute a block of code **as long as** its condition evaluates 
 * to `true`. It checks the condition *before* executing the loop body.
 * 
 * Syntax:
 * -------
 * while (condition) {
 *     // Code to repeat
 * }
 * 
 * When to Use:
 * ------------
 * Use a `while` loop when:
 * - You don't know ahead of time how many times you'll loop.
 * - You want to keep looping until a specific condition is met.
 * - You rely on user input or external data to determine when to stop looping.
 *
 * Be Cautious of Infinite Loops!
 * Ensure the condition will eventually become false; otherwise, the loop
 * will run forever (an infinite loop).
 * 
 * Example of an infinite loop:
 *     while (1 == 1) 
 *     {
 *         System.out.println("Help! I am stuck in a loop!!");
 *     }
 * 
 * To terminate a program stuck in an infinite loop:
 * - Clicking the "stop" button (■) or "Terminate" button.
 * - In a terminal/command prompt: press Ctrl + C to interrupt the program.
 */

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        // Scanner object
        Scanner scn = new Scanner(System.in);

        // Varible declaration and initialization
        String name = "";
        int age, number;

        /*
         * Converting from if-statement to while-loop:
         * --------------------------------------------
         * Originally, this logic uses an if-statement, which only checks the condition
         * once.
         * As a result, it does not prevent the user from proceeding even if the `name`
         * variable is empty or invalid.
         *
         * To enforce repeated validation and stop the user from continuing without
         * valid input,
         * this logic should be rewritten using a while-loop instead.
         */

        System.out.println("if-stament example!");
        if (name.isEmpty()) {
            System.out.print("enter your name: ");
            name = scn.nextLine().replace(" ", "");
        }
        System.out.println("Hello " + name);

        /*
         * While && Do while for Input Validation:
         * ---------------------------------
         * This loop ensures that the user cannot proceed until a valid name is entered.
         * It runs repeatedly as long as the `name` variable remains empty — even if
         * the user simply presses Enter without typing anything.
         *
         * This is useful for enforcing required fields and preventing blank
         * submissions.
         */

        // asking user for their name
        System.out.println("Now a while-loop");
        while (name.isEmpty()) {
            System.out.print("enter your name: ");
            name = scn.nextLine().replace(" ", "");
        }
        // asking for their age but in do-while  
        do {
            System.out.print( "Invalid input please enter age: ");
            age = scn.nextInt();
        } while (age < 0);

        // asking user to pick a number range 1-10 using do-while loop
        do 
        {
            System.out.print("Enter a number between 1 - 10: ");
            number = scn.nextInt();
        } 
        while (number < 1 || number > 10); // do once then check the condition


        // Displaying output
        System.out.println("Hello " + name + " age: " + age + " you picked no.: " + number);

        scn.close();
    }
}
