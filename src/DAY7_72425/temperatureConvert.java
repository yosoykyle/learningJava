package DAY7_72425;

/*
 * temperatureConvert.java
 * This converts temperatures between Celsius and Fahrenheit.
 * This is a practice project to get more familliar with ternary operators.
 */

import java.util.Scanner;

public class temperatureConvert {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Variables declaration and initialization
        double temperature, newConvertedTemperature;
        String unit, separator, welcomeString, exitString, getTempString, optionString, invalidString;
        getTempString = "Enter the temperature value: ";
        invalidString = "Invalid input.";
        separator = "=".repeat(35);
        welcomeString = "Welcome to the Temperature Converter!";
        exitString = "Thank you for using the Temperature Converter! Goodbye!";
        optionString = "'C' - Convert to Celsius\n'F' - Convert to Fahrenheit\nChoose the unit to convert TO: ";

        // Program start 
        System.out.println(separator);
        System.out.println(welcomeString);
        System.out.println(separator);

        // Prompt the user for temperature input
        System.out.print(getTempString);
        if (scn.hasNextDouble()) {
            temperature = scn.nextDouble();
            System.out.println(separator);
        } else {
            System.out.println(invalidString);
            System.out.println(separator);
            scn.close();
            return;
        }
        scn.nextLine(); // Clear the buffer after reading the double

        // Prompt the user for temperature unit to CONVERT TO
        System.out.print(optionString);
        unit = scn.next().toUpperCase(); // Normalize input
        System.out.println(separator);

        // Check if the input unit is valid and perform conversion
        newConvertedTemperature = (unit.equals("C")) 
            ?  (temperature - 32) * 5 / 9         // convert from Fahrenheit to Celsius
            :  (temperature * 9 / 5) + 32;        // convert from Celsius to Fahrenheit

        System.out.printf("%.1f converted to °%s is %.1f°%s%n", temperature, unit, newConvertedTemperature, unit);

        // exit
        System.out.println(separator);
        System.out.println(exitString);
        System.out.println(separator);

        scn.close();
    }
}
