package DAY18_8525;

/**
 * quizGame.java
 * 
 * A simple console-based Java quiz game to test understanding of basic Java concepts.
 * 
 * Features:
 * - Asks multiple-choice questions.
 * - Validates user input.
 * - Displays score at the end.
 */

import java.util.Scanner;

public class quizGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // List of quiz questions
        String[] questions = {
            "What does the \"Scanner.nextLine()\" method do?",
            "What must be done before using \"Arrays.binarySearch()\" on an array?",
            "What is the purpose of \"scn.nextLine()\" after reading a number with scn.nextInt()?",
            "Which of the following correctly declares a 2D array of strings?",
            "Which method validates an integer input in a loop?",
            "Which of the following is a benefit of using \"varargs (...)\" over overloaded methods?",
            "How do you reverse a \"String[]\" manually?",
            "Which ternary operation checks if an array is empty?",
            "What does \"charAt(0)\" return in scn.next().charAt(0);?",
            "What is the difference between \".length\" and \".length()\" in Java?"
        };

        // Multiple-choice options for each question
        String[][] options = {
            { "1.Reads the next character", "2.Reads the next full line", "3.Reads the next integer", "4.Clears the buffer" },
            { "1.Convert to Arraylist", "2.Fill the array with values", "3.Make sure the array is sorted", "4.Cast it to a String" },
            { "1.To print a newline", "2.To close the scanner", "3.To reset the input", "4.to clear the newline character from the buffer" },
            { "1.String[2][3] names;", "2.String[][] names = new String[2][3];", "3.String names = new String[][];", "4.String names[][] = \"apple\", \"banana\";" },
            { "1.hasNextInt()", "2.isDigit()", "3.isNumber()", "4.nextIntLine()" },
            { "1.Less memory usage", "2.Handles unknown numbers of arguments", "3.Requires fewer parameters", "4.Only works for integers" },
            { "1.Arrays.reverse()", "2.Loop from the end to the beginning and print", "3.Collections.reverse()", "4.String.reverse()" },
            { "1.(arr == null) ? ...", "2.(arr.isEmpty()) ? ...", "3.(arr.size == 0) ? ...", "4.(arr.empty()) ? ..." },
            { "1.The first word", "2.The last character", "3.The first character of the input", "4.The ASCII code" },
            { "1.No difference", "2..length is a method; .length() is a property", "3..length is for arrays; .length() is for Strings", "4.One is deprecated" }
        };

        // Index of correct answer for each question (1-based)
        int[] answers = { 2, 3, 4, 2, 1, 2, 2, 1, 3, 3 };

        int score = 0;      // Tracks user's score
        int answerUser;     // User input for each question

        // Welcome message
        System.out.println("=".repeat(30));
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("=".repeat(30));

        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i]);

            // Print each option
            for (int j = 0; j < options[i].length; j++) {
                System.out.println("    " + options[i][j]);
            }

            System.out.println("=".repeat(50));

            // Validate user input and get answer
            answerUser = intValidation(scn);

            // Check if the answer is correct
            if (answerUser == answers[i]) {
                score++;
                System.out.println("CORRECT!");
            } else {
                System.out.println("WRONG :(");
            }

            System.out.println("=".repeat(50));
        }

        // Display final score
        System.out.println("Final Score: " + score + " / " + questions.length);

        scn.close();
    }

    /**
     * Validates that the user input is an integer between 1 and 4.
     * Loops until valid input is received.
     */
    static int intValidation(Scanner scn) {
        int userAnswer = 0;
        while (true) {
            System.out.print("Enter your answer (1-4): ");
            if (scn.hasNextInt()) {
                userAnswer = scn.nextInt();
                scn.nextLine(); // Clear the newline character
                if (userAnswer >= 1 && userAnswer <= 4) {
                    break;
                } else {
                    System.out.println("Pick from 1-4 only.");
                }
            } else {
                System.out.println("Invalid answer. Please enter a number.");
                scn.next(); // Discard invalid input
            }
        }
        return userAnswer;
    }
}