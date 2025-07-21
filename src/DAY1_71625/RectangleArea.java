package DAY1_71625;

import java.util.Scanner;

/**
 * This class calculates the area of a triangle using user input for the base
 * and height.
 */

public class RectangleArea {
    public static void main(String[] args) {
        // Scanner object to read user input
        Scanner scn = new Scanner(System.in);

        // Declaring variables
        double area, length, width;

        // Prompting user for input
        System.out.print("Enter the length of the rectangle: ");
        length = scn.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        width = scn.nextDouble();

        // Calculating the area of the rectangle
        area = length * width;
        System.out.println("The area of the rectangle is: " + area + " cm²");

        // scn.close();
        scn.close();
    }
}
