package DAY22_8925.oop4th;

/*
 * arrayOfObjects.java
 * 
 * This example demonstrates the concept of **Array of Objects** in Java.
 * 
 * What is an Array of Objects?
 * - An array that stores multiple instances (objects) of the same class.
 * - Instead of holding primitive data types (int, char, double), it holds references to objects.
 * 
 * Why use an Array of Objects?
 * - To store and manage a collection of objects efficiently.
 * - Useful when you want to perform similar operations on multiple objects.
 * 
 * When to use:
 * - When you know the fixed number of objects in advance.
 * - When you want to iterate through multiple objects easily.
 * 
 * Notes:
 * - The array stores references, not the actual objects.
 * - You must create the objects separately before placing them in the array 
 *   (unless using anonymous objects).
 * 
 * This example uses **Car.java** to demonstrate:
 *  1. Creating individual objects and storing them in an array.
 *  2. Using **anonymous objects** directly inside an array.
 *  3. Iterating over the array using different loop types.
 */

public class arrayOfObjects {
    public static void main(String[] args) {
        
        // Step 1: Create individual Car objects
        Car car1 = new Car("BYD Han", "Onyx Black");
        Car car2 = new Car("BYD Tang", "Mazda Red");
        Car car3 = new Car("BYD Alto3", "Jet Black");

        /*
         * Step 2: Create an array to hold the Car objects
         * Syntax: ClassName[] arrayName = new ClassName[size];
         * Here, "cars" can store 3 Car objects.
         */
        Car[] cars = new Car[3];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;

        /*
         * Step 3: Using anonymous objects
         * 
         * What is an anonymous object?
         * - An object created without assigning it a name (reference variable).
         * - Created and used immediately, often inside method calls or array initializations.
         * 
         * Why use them?
         * - Saves memory if the object is only needed temporarily.
         * - Reduces code clutter for short-term use.
         * 
         * Syntax:
         * new ClassName(arguments);
         */
        Car[] kotse = {
            new Car("Jeep", "Kalimbahin"),
            new Car("Tok", "Asul"),
            new Car("Kotse", "Berde")
        };

        // Step 4: Iterating using standard for loop
        System.out.println("Iterated using standard for loop: ");
        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }

        System.out.println();

        /*
         * Step 5: Iterating using enhanced for loop (for-each loop)
         * 
         * Why use enhanced for loop?
         * - Shorter and more readable.
         * - Ideal for iterating over arrays when you don't need the index.
         */
        System.out.println("Iterated using enhanced for loop: ");
        for (Car car : cars) {
            car.drive();
        }

        System.out.println();

        /*
         * Step 6: Iterating over anonymous object arrays
         * - You can still modify the objects even if they were created anonymously.
         */
        System.out.println("Iterating an anonymous object array using enhanced for loop: ");
        for (Car makina : kotse) {
            makina.color = "Jet Orange"; // Change color for each Car object
            makina.drive();
        }
    }
}
