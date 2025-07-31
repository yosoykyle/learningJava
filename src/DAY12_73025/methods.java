package DAY12_73025;
/*
 * methods.java
 * 
 * What is a Method?
 * ------------------
 * A method is a reusable block of code that performs a specific task.
 * It helps organize code into smaller, manageable sections.
 *
 * When to Use:
 * ------------
 * - To avoid repeating code
 * - To break down complex problems
 * - To make code cleaner and easier to debug
 * 
 * * Where to Write:
 * ---------------
 * - Methods are written inside a class but **outside** the `main()` method.
 * - They can be `static` (called without creating an object) or non-static (require an object).
 * 
 * * How to Call a Method:
 * ---------------------
 * - If it's static:     methodName(arguments);
 * - If it's non-static: objectName.methodName(arguments);
 *
 * Syntax:
 * -------
 * returnType methodName(parameters) {
 *     // Code to execute
 *     return value; // if not void
 * }
 * 
 * Scope and Variable Awareness:
 * ------------------------------
 * Each method has its own set of variables. 
 * - Variables declared in one method **cannot** be accessed in another method directly.
 * - To share data, you can pass variables as parameters or use return values.
 * - Parameters can have the same names as the arguments passed.
 * - Make sure the data types and their order in the arguments match the method's parameters.
 *
 * Caution:
 * --------
 * - Always make sure methods are called correctly, with the right number 
 *   and type of parameters.
 * - If a method returns a value, don't forget to store or use the result.
 * - Infinite recursion (when a method keeps calling itself without a stop condition)
 *   can crash your program.
 */

public class methods {
    public static void main(String[] args) {

        // Varible declaration and initialization
        String fName, lName, fullName;
        int age;
        boolean ageVefied;

        fName = "Kyle";
        lName = "B";
        lName.toUpperCase().charAt(0);
        fullName = fullName(fName, lName);
        age = 5;
        ageVefied = varifyAge(age);

        // methods
        happyBirthday(fName, age); // 1
        System.out.println(happyBday(fName, age)); // 2
        System.out.println(sqr(3)); // 3
        System.out.println(cube(3)); // 4
        System.out.println(fullName); // 5

        if (ageVefied) // 6
        {
            System.out.println("Age verified: " + ageVefied);
        } 
        else 
        {
            System.out.println("Age not verified: " + ageVefied); 
        }
       

    }

    // static methods examples

    // 1. void happyBirthday
    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday to %s!%n", name);
        System.out.printf("You are %d years old%n", age);
        System.out.println("Happy Birthday to you!%n");
    }

    // 2. String happyBday
    static String happyBday(String name, int age) {
        String greetString = String.format("Happy bday %s you are %d years old!", name, age);
        return greetString;
    }

    // 3. square
    static double sqr (double number) {
        return number * number;
    }

    // 4. cube
    static double cube(double number) {
        return number * number * number;
    }

    // 5. fullname
    static String fullName(String fName, String lName) {
        return fName + " " + lName;
    }

    // 6. verify user age
    static boolean varifyAge (int userAge) 
    {
        // if-else
            // if (userAge <= 18) 
            // {
            //     return true;
            // } 
            // else  
            // {
            //     return false;
            // }

        // Simplified
        return userAge >= 18;

       
    }
}
