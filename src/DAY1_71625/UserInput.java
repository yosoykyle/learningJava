package DAY1_71625;

// Importing the Scanner class
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        /*
         * User Input in Java:
         * To get input from the user, we can use the Scanner class.
         * The Scanner class is part of the java.util package.
         * It allows us to read input from various sources, including keyboard input.
         */

        // Creating a Scanner object from the imported Scanner class to read input from
        // the keyboard
        Scanner scanner = new Scanner(System.in);

        // Variable declaration and initialization
        String name;
        int age;
        double gpa;
        boolean isStudent;

        // Prompting the user for the required input
        System.out.print("Enter your name: ");
        // name = scanner.nextLine(); // Reading a line of text input from the user
        name = scanner.next(); // reads a string until the first space, while .nextLine() reads the entire line
                               // including spaces

        scanner.nextLine(); // Consume the newline character left by next() to avoid skipping the next input

        System.out.print("Enter your age: ");
        age = scanner.nextInt(); // Reading an integer input from the user

        System.out.print("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean(); // Reading a boolean input from the user

        System.out.print("Enter your GPA: ");
        gpa = scanner.nextDouble(); // Reading a double input from the user

        // Displaying the stored input of the user back to them
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your GPA is: " + gpa);
        System.out.println("Student status: " + (isStudent ? "Student" : "Not a Student")); // Using a ternary operator
                                                                                            // to display student status
                                                                                            // or shorthand for boolean
                                                                                            // output

        // Closing the scanner to prevent resource leaks
        scanner.close();
    }

    // Note: Always remember to close the Scanner object to free up resources.
    // This is done using scanner.close() at the end of the program.

    /*
     * Take note:
     * After using scanner.next() or scanner.nextInt(),
     * you must call scanner.nextLine() to consume the leftover newline character
     * (\n)
     * left in the input buffer. Otherwise, the next call to nextLine() will read
     * that
     * leftover newline and skip user input.
     * 
     * This issue occurs with next(), nextInt(), nextDouble(), etc., because they do
     * not
     * consume the newline after pressing Enter. To avoid this, call
     * scanner.nextLine()
     * once after these methods before using nextLine() again.
     */

}