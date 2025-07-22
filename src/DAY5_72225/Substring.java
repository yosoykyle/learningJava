package DAY5_72225;
/*
 * Substring.java
 * Substring is a string method that allows you to extract a portion of a string.
 * It is useful for manipulating strings, such as extracting specific parts of a string,
 * - substring(int beginIndex, int endIndex)
*/

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        // Email Slicer Program
        Scanner scn = new Scanner(System.in);
        String email, userName, domain, reconstructedEmail;
        char atSymbol;

        // Prompting user for email input with input validation
        System.out.print("Enter your email address: ");
        email = scn.nextLine().trim(); // Using trim() to remove leading and trailing
        while (email.isEmpty() || !email.contains("@")) {
            System.out.print("Please enter a valid email address (must contain '@'): ");
            email = scn.nextLine().trim(); // Using trim() to remove leading and trailing spaces
        }

        // substring to extract the username and domain from the email
        userName = email.substring(0, email.indexOf('@')); // Extract username before '@'
        System.out.println("User Name: " + userName);

        domain = email.substring(email.indexOf('@') + 1); // Extract domain after '@'
        System.out.println("Domain: " + domain);

        // extracting @ symbol from the email
        atSymbol = email.charAt(email.indexOf('@')); // Get the '@' character
        System.out.println("At Symbol: " + atSymbol);

        // Reconstructing the email from the extracted parts
        reconstructedEmail = userName + atSymbol + domain;
        System.out.println("Reconstructed Email: " + reconstructedEmail);

        scn.close();
    }
}
