package DAY8_72525;

/*
 * calculatorProgram.java
 * This is a practice project to get more familliar using enhanced switch statements.
 * 
 * This program will ask:
 * 1. Firt numer
 * 2. The operator (+, -, *, /)
 * 3. Second number
 * 4. output the result of the operation
 * * This program will also handle division by zero and invalid operators.
 * 
 * This will also use System.err.println(); to print error messages.
 * * System.err.println() is used to print error messages to the standard error stream.
 * * This is useful for debugging and error handling.
*/
import java.util.Scanner;

public class calculatorProgram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Variables declaration and initialization
        int stage;

        double firstNumber, secondNumber, result;
        firstNumber = 0;
        secondNumber = 0;
        result = 0;

        char operator;
        operator = ' ';
        String separator, welcomeString, exitString, getFirstNumberString, getSecondNumberString, getOperatorString,
                invalidInputString, resultString;
        separator = "==".repeat(15);
        welcomeString = "Simple Calculator Program";
        getFirstNumberString = "Enter the first number: ";
        getOperatorString = "Enter the operator (+, -, *, /): ";
        getSecondNumberString = "Enter the second number: ";
        invalidInputString = "Invalid input. Please try again.";
        resultString = "The result of %.2f %c %.2f is: %.2f"; // firstNumber,operator,secondNumber,result
        exitString = "Calculation ended...";

        // Program start

        // Welcome message
        System.out.println(separator);
        System.out.println(welcomeString);
        ;
        System.out.println(separator);

        // Prompt for use inputs
        stage = 1;
        while (stage < 4) {
            switch (stage) {
                case 1 -> {
                    System.out.print(getFirstNumberString);
                    if (scn.hasNextDouble()) {
                        firstNumber = scn.nextDouble();
                        stage = 2;
                        System.out.println(separator);
                    } else {
                        System.out.println(separator);
                        System.err.println(invalidInputString);
                        System.out.println(separator);
                        scn.next(); // Clear the invalid input
                    }
                }
                case 2 -> {
                    System.out.print(getOperatorString);
                    operator = scn.next().charAt(0);
                    if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                        stage = 3; // Move to the next stage if the operator is valid
                        System.out.println(separator);
                    } else {
                        System.out.println(separator);
                        System.err.println(invalidInputString);
                        stage = 1; // Reset to stage 1 for a new first number input
                        System.out.println(separator);
                    }

                }
                case 3 -> {
                    System.out.print(getSecondNumberString);
                    if (scn.hasNextDouble()) {
                        secondNumber = scn.nextDouble();
                        stage = 4;
                        System.out.println(separator);
                    } else {
                        System.out.println(separator);
                        System.err.println(invalidInputString);
                        System.out.println(separator);
                        scn.next(); // Clear the invalid input
                    }
                }
                default -> {
                    System.err.println("Unexpected error: invalid stage.");
                    break; // Safeguard against unexpected stage values default case cannot be reached as
                           // the
                    // while loop condition ensures stage is always less than 4.
                }
            }
        }

        // Perform the calculation based on the operator
        switch (operator) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> {
                if (secondNumber == 0) {
                    System.err.println("Error: Division by zero is not allowed.");
                    scn.close();
                    return; // Stop execution to avoid division by zero
                }
                result = firstNumber / secondNumber;
            }
            default -> {
                System.err.println(invalidInputString); // safeguard against invalid operator input
                scn.close();
            }
            
        }
        
        System.out.printf(resultString, firstNumber, operator, secondNumber, result);
        System.out.println();
        System.out.println(exitString);

        scn.close();
    }
}
