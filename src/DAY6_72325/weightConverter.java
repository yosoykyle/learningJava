package DAY6_72325;

import java.util.Scanner;
public class weightConverter 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner (System.in);
        // Variables declaration and initialization
        final double kgs = 0.453592; // 1 kilogram = 2.20462262 pounds constant
        final double lbs = 2.204622; // 1 pound = 0.45359237 kilograms constant
        double weight, newWeight;
        int userChoice;
        String welcomeString, exitString, optioString;
        welcomeString = "Welcome to the Weight Converter!";
        exitString = "Thank you for using the Weight Converter! Goodbye!";
        optioString = "1. Convert kilograms to pounds\n2. Convert pounds to kilograms\nPlease select an option (1-2): ";

        // Display the menu
        String separator = "=".repeat(32);
        System.out.println(separator);
        System.out.println(welcomeString);
        // Display the options && Prompt the user for their choice
        System.out.println(separator);
        System.out.print(optioString);
        userChoice = scn.nextInt();
        System.out.println(separator);
        System.out.println("You chose: " + userChoice);
        System.out.println(separator);

        // Perform the conversion based on user choice
        if (userChoice == 1) 
        {
            System.out.print("Enter weight in pounds (lbs): ");
            weight = scn.nextDouble();
            newWeight = weight * kgs;
            System.out.println(separator);
            System.out.printf("%.2f pounds is equal to %.2f kilograms.%n", weight, newWeight);
            System.out.println(separator);
            System.out.println(exitString);
        } 
        else if (userChoice == 2) 
        {
            System.out.print("Enter weight in kilograms (kgs): ");
            weight = scn.nextDouble();
            newWeight = weight * lbs;
            System.out.println(separator);
            System.out.printf("%.2f kilograms is equal to %.2f pounds.%n", weight, newWeight);
            System.out.println(separator);
            System.out.println(exitString);
        } 
        else 
        {
            System.out.println("Invalid choice. Please select either 1 or 2.");
        }
        scn.close();
    }    
}
