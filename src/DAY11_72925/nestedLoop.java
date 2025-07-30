package DAY11_72925;

/*
 * nestedLoop.java
 *
 * What is a Nested Loop?
 * -----------------------
 * A **nested loop** is when you place one loop inside another.
 * The inner loop finishes all its cycles for every single cycle of the outer loop.
 *
 * Nested loops are helpful when:
 * - Creating patterns like pyramids or boxes made of characters
 * - Working with tables (rows and columns)(matrices)
 * - Looping through multi-dimensional arrays (like a grid)
 *
 * Example: Half Pyramid Pattern
 * ------------------------------
 * This example prints a half pyramid of stars (*) using nested loops.
 *
 * for (int i = 1; i <= 5; i++) {
 *     for (int j = 1; j <= i; j++) {
 *         System.out.print("* ");
 *     }
 *     System.out.println(); // move to the next line
 * }
 *
 * Output:
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 *
 * In this example:
 * - The outer loop (i) controls the number of rows.
 * - The inner loop (j) controls how many stars to print on each row.
 * - Each new row prints one more star than the last.
 *
 * Note:
 * -----
 * Be careful when using nested loops — since the inner loop runs completely
 * for each outer loop cycle, the total number of repetitions can grow fast.
 * This might slow down your program, especially with large ranges.
 * 
 * Always make sure that using a nested loop is necessary and that
 * you aren't repeating more than you really need to.
 *  
 */
import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args)  throws InterruptedException{
        // Scanner object
        Scanner scn = new Scanner(System.in);

        // Varible declaration and initialization
        int row, columns;
        int questionNumber;
        char symbol;
        String promtRow, promptColumn, promptSymbol, promptInvalid;
        row = 0;
        columns = 0;
        symbol = ' ';
        promtRow = "Enter the # of rows: ";
        promptColumn = "Enter the # of columns: ";
        promptSymbol = "Enter the symbol to use: ";
        promptInvalid = "Invalid Input";

        // User Prompt
        questionNumber = 1;
        while (questionNumber < 4) {
            switch (questionNumber) {
                case 1 -> {
                    System.out.print(promtRow);
                    if (scn.hasNextInt()) {
                        row = scn.nextInt();
                        scn.nextLine();
                        questionNumber = 2;
                    } else {
                        System.out.println(promptInvalid);
                        scn.next();
                    }
                }
                case 2 -> {
                    System.out.print(promptColumn);
                    if (scn.hasNextInt()) {
                        columns = scn.nextInt();
                        questionNumber = 3;
                        scn.nextLine();
                    } else {
                        System.out.println(promptInvalid);
                        scn.next();
                        questionNumber = 1;
                    }
                }
                case 3 -> {
                    System.out.print(promptSymbol);
                    symbol = scn.next().charAt(0); // to store char
                    scn.nextLine();
                    questionNumber = 4;
                }
            }
        }

        // loading effect (just for fun)
        System.out.print("Matrix Loading.");
        for (int k = 0;k < 3; k++) 
        {
            System.out.print('.');
            Thread.sleep(1000);
        }
        System.out.println();
        // Constructing the matrix
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol + "");
            }
            System.out.println();
        }
        scn.close();
    }
}
