package DAY9_72725;

/*
 * logicalOperator.java
 * Logical allow us to check or modify more than one condition.
 * 
 * Logical operators include:
 * 1. AND (&&): Returns true if both conditions are true.
 * 2. OR (||): Returns true if at least one condition is true.
 * 3. NOT (!): Reverses the logical state of its operand.
 * 
 * Note on && and ||:
 * - && (AND) checks if the first condition if false, it does not evaluate the second condition.
 * - || (OR) checks if the first condition is true, it does not evaluate the second condition. 
*/
import java.util.Scanner;
public class logicalOperator 
{
    public static void main(String[] args) 
    {
        // Varible declaration and initialization
        Scanner scn = new Scanner(System.in);
        String username;
        
        double temperature = 35.0;
        boolean isSunny = false;

        // Using the logical operator to see if the temperature falls within a certain range
        System.out.println("Temperature check example: ");
        if (temperature  <= 30 && temperature  >= 0 && isSunny)  // && logical operator
        {
            System.out.println("The weather is good!");
            System.out.println("It is sunny outside!");
        } 
        else if (temperature  <= 30 && temperature  >= 0 && !isSunny)  // ! logical operator
        {
            System.out.println("The weather is good!");
            System.out.println("It is cloudy outside!");
        }
        else if (temperature  > 30 || temperature  < 0 ) 
        {
            System.out.println("The weather is bad!");
        }

        // Validating username 
        System.out.println("username validation: ");
        // username must be between 4-12 chars
        // username must not contain spaces or underscores

        System.out.print("Enter your new username: ");
        while (true) 
        {
            if (scn.hasNextLine()) 
            {
                username = scn.nextLine();
                if (username.length() < 4 || username.length() > 12) 
                {
                    System.out.println("new username must be between 4-12 characters : >");
                    System.out.print("Enter your new username: ");
                }
                else if (username.contains(" ") || username.contains("_")) 
                {
                    System.out.println("new username must not have spaces or underscores :> ");
                    System.out.print("Enter your new username: ");
                }
                else 
                {
                    break;
                }
            }   
        }
        // Displaying the new username
        System.out.println("Welcome! " + username);
        scn.close();
      
    }
}
