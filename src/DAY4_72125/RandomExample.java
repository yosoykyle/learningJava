package DAY4_72125;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) 
    {
        //Random object
        Random rnd = new Random();

        int a;
        int b;

        a = rnd.nextInt(); // this will generate a random integer but very large.
        System.out.println("Random number: " + a); // prints the random number ranging from Integer.MIN_VALUE to Integer.MAX_VALUE

        b = rnd.nextInt(0,5); // this will generate a random integer between 0 and 5
        System.out.println("\nRandom number between 0 and 5: " + b); // prints the random number ranging from 0 to 5
        // The First number is inclusive and the second number is exclusive meaning it will not include 5.

        /* Note: not only you can generate random integers but also doubles 
         * you can generate random doubles, booleans, and even random elements from an array.
         * Example:
         * double randomDouble = rnd.nextDouble(); // generates a random double between 0.0 and 1.0
         * boolean randomBoolean = rnd.nextBoolean(); // generates a random boolean value (true or false)
         * String[] names = {"Alice", "Bob", "Charlie"};
         * String randomName = names[rnd.nextInt(names.length)]; // selects a random name from the array
        */
    }
}