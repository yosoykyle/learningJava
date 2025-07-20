package DAY2_71925;

/*Mad Libs is a game where you create a story 
 * by filling in the blanks with your own words.
 * This will help us practice using variables and accepting user input.
 */

import java.util.Scanner;

public class MadLibs 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        
        // Writing all variables first helps us to see what we need to ask the user.
        String adjective1, adjective2, noun1, noun2, verb1, verb2, place1, place2;

        // User inputs
        System.out.print("Enter an adjective: ");
        adjective1 = scn.nextLine();
        System.out.print ("Enter another adjective: ");
        adjective1 = scn.nextLine();
        System.out.print("Enter a noun: ");
        noun1 = scn.nextLine();
        System.out.print("Enter a verb: ");
        verb1 = scn.nextLine();
        System.out.print("Enter a place: ");
        place1 = scn.nextLine();
        System.out.print("Enter another adjective: ");
        adjective2 = scn.nextLine();
        System.out.print("Enter another noun: ");
        noun2 = scn.nextLine();
        System.out.print("Enter another verb: ");
        verb2 = scn.nextLine();
        System.out.print("Enter another place: ");
        place2 = scn.nextLine();

        // Output the story using the user's inputs
        System.out.println("\nHere is your Mad Libs story:");
        System.out.println("Title: A Day in the Life of a " + adjective1 + " Adventurer");
        System.out.println("One " + adjective1 + " morning, I grabbed my trusty " + noun1 + " and decided it was time to " + verb1 + " all the way to " + place1 + ".");
        System.out.println("On the way, I met a " + adjective2 + " traveler carrying a mysterious " + noun2 + ".");
        System.out.println("They asked if I could help them " + verb2 + " it safely to " + place2 + ".");
        System.out.println("Of course, I agreed because nothing says adventure like unexpected detours!");

        scn.close();
    }
}