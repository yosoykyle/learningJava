package DAY14_8125;

/*
 * bankingProgram.java
 *
 * This is a practice project designed to help understand and apply
 * core Java programming concepts such as:
 * - Variables and data types (int, double, boolean, String)
 * - Input handling using the Scanner class
 * - Conditional logic and control flow (if-else, switch-case)
 * - Loops (do-while and while)
 * - Method definition and calling
 * - Handling invalid user input
 *
 * The program simulates a simple banking system that allows the user to:
 * - View their current balance
 * - Deposit money
 * - Withdraw money (with validation against negative or excessive withdrawals)
 * - Exit the application
 *
 * This file is part of hands-on exercises to become more familiar
 * with Java syntax, logic structuring, and console-based interaction.
 */


import java.util.Scanner;

public class bankingProgram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Declare Variables
        double balance;
        balance = 0;
        boolean isRunning = true;
        int userChoice;
        String stringSeparator = "***".repeat(10);

        while (isRunning) {
            displayMenu(stringSeparator); // displayMenu()
            // Get and Process User Choice
            if (scn.hasNextInt()) {
                userChoice = scn.nextInt();
                scn.nextLine(); // Safeguard: clears newline in case we add String input later
                switch (userChoice) {
                    case 1 -> {
                        // showBalance()
                        System.out.println(stringSeparator);
                        showBalance(balance);

                    }
                    case 2 -> {
                        // depositMoney()
                        balance += deposit(scn, stringSeparator);
                    }
                    case 3 -> {
                        // withdrawBalance()
                        balance -= withdraw(scn, balance, stringSeparator);
                    }
                    case 4 -> {
                        // EXIT message
                        isRunning = false;
                    }
                    default -> {
                        System.out.println("\nInvalid Choice");
                    }
                }
            } else {
                System.out.println("Invalid Input");
                scn.nextLine(); // Discard the invalid input instead
            }
        }
        System.out.println(stringSeparator);
        System.out.println("Thank you! Have a nive day!");
        scn.close();
    }

    // DISPLAY MENU
    static void displayMenu(String stringSeparator) {
        System.out.println(stringSeparator);
        System.out.println("BANKING PROGRAM");
        System.out.println(stringSeparator);
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println(stringSeparator);
        System.out.print("Enter choice (1-4): ");
    }

    // SHOW BALANCE
    static void showBalance(double balance) {
        System.out.printf("BALANCE: $ %.2f%n", balance);
    }

    // DEPOSIT
    static double deposit(Scanner scn, String stringSeparator) {
        double amount;
        amount = 0;
        do {
            System.out.println(stringSeparator);
            System.out.print("Enter amount to deposit: ");
            if (scn.hasNextDouble()) {
                amount = scn.nextDouble();
                scn.nextLine();
                if (amount < 0) {
                    System.out.println("Amount cannot be negative");
                } else {
                    System.out.println("Deposit successful!");
                    break;
                }
            } else {
                System.err.println("Invalid input");
                scn.next();
            }
        } while (true);
        return amount;
    }

    // WITHDRAW
    static double withdraw(Scanner scn, double balance, String stringSeparator) {
        double amount;
        amount = 0;
        do {
            System.out.println(stringSeparator);
            System.out.print("Enter amount to withdraw: ");
            if (scn.hasNextDouble()) {
                amount = scn.nextDouble();
                scn.nextLine();
                if (amount > balance) {
                    System.out.println("Amount exceeds balance");
                } else if (amount < 0) {
                    System.out.println("Amount cannot be negative");
                } else {
                    System.out.println("Amount withdrawn successfuly!");

                    break;
                }
            } else {
                System.err.println("Invalid input");
                scn.next();
            }
        } while (true);
        return amount;
    }
}
