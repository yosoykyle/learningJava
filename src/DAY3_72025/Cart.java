package DAY3_72025;
/* Shopping Cart program that users able to type an item, 
 * set a price for each and then ask for a quantity.
 * The our is going to be the total of the itmes based
 * on the price and quantity.
 * 
 * This program will help us practice using variables,
 * accepting user input, and performing arithmetic operations.
 */

import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Variables to hold item details
        String itemName;
        double itemPrice;
        int itemQuantity;
        double totalPrice;
        char currencySymbol = '$';

        // User inputs
        System.out.println("This is a Shopping Cart program.");
        System.out.print("What item would you like to add to your cart?: ");
        itemName = scn.nextLine();

        System.out.print("Enter the price of " + itemName + ": ");
        itemPrice = scn.nextDouble();

        System.out.print("How many " + itemName + " would you like to add?: ");
        itemQuantity = scn.nextInt();

        totalPrice = itemPrice * itemQuantity; // Calculate total price

        System.out
                .println("\nTotal price for " + itemQuantity + " " + itemName + "(s): " + currencySymbol + totalPrice);

        scn.close();
    }
}
