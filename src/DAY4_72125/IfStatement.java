package DAY4_72125;
/*if-statements perfoms a block of code 
 * if its conditions is true. Useful for decision making in programs*/

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        int age;
        String name;
        boolean isStudent;

        Scanner scn = new Scanner(System.in);

        // Prompting user for input
        System.out.print("Enter your name: ");
        name = scn.nextLine();
        // GROUP 1 Condition
        if (name.isEmpty()) {
            System.out.println("Enter a valid name.");
        } else {
            System.out.println("Hello, " + name + "!");
        }

        // Prompting user for input
        System.out.print("Enter your age: ");
        age = scn.nextInt();
        // GROUP 2 Condition
        if (age >= 65) {
            System.out.println(name + ", you are a senior.");
        } else if (age >= 18) {
            System.out.println(name + ", you are an adult.");
        } else if (age < 0) {
            System.out.println(name + ", you haven't been born yet.");
        } else if (age == 0) {
            System.out.println(name + ", you are a newborn.");
        } else {
            System.out.println(name + ", you are a minor.");
        }
        // Prompting user for input
        System.out.print("Are you a student? (true/false): ");
        isStudent = scn.nextBoolean();
        // GROUP 3 Condition
        if (isStudent)
        {
            System.out.println(name + ", you are a student.");
        } 
        else
        {
            System.out.println(name + ", you are not a student.");
        }

        scn.close();
    }
}
