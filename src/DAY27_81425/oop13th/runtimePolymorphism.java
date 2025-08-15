package DAY27_81425.oop13th;

import java.util.Scanner;

/*
 * runtimePolymorphism.java
 * 
 * This program demonstrates **runtime polymorphism** in Java.
 * 
 * What is Runtime Polymorphism?
 * ------------------------------
 * Runtime polymorphism (also called dynamic binding or late binding)
 * happens when the decision of which method implementation to run 
 * is made **at runtime**, based on the actual type of the object.
 * 
 * Key points:
 * - It is achieved through **method overriding**.
 * - Requires **inheritance** (or interface implementation).
 * - The JVM, not the compiler, decides which method to execute 
 *   based on the real object type stored in the variable at runtime.
 * - Also known as "dynamic method dispatch".
 * 
 * Example in this program:
 * -------------------------
 * - We have an **abstract superclass**: Animal.
 * - Two concrete subclasses: Dog and Cat.
 * - The method `speak()` is defined abstractly in Animal, 
 *   and each subclass provides its own version.
 * - The program will ask the user whether they want a dog or a cat.
 * - Based on their input, the variable `animal` will store 
 *   either a Dog or a Cat object.
 * - Even though `animal` is declared as type Animal, 
 *   calling `animal.speak()` will run the **overridden method** 
 *   of the actual object type (Dog or Cat) chosen by the user.
 */
public class runtimePolymorphism {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*
         * Step 1:
         * We declare an Animal reference variable:
         * 
         *      Animal animal;
         * 
         * Here, "Animal" acts like a **data type** — specifically, 
         * it is a reference type that can hold an object of any 
         * subclass of Animal (e.g., Dog, Cat, or any future animal class).
         * 
         * Why can't we do `new Animal()`?
         * - Animal is abstract, so it cannot be directly instantiated.
         * - We don't know yet which specific type of pet the user wants.
         * 
         * Instead, we first set `animal` to `null`, and then later 
         * assign it a **specific subclass instance** at runtime.
         */
        Animal animal = null; // Will later point to either new Dog() or new Cat()

        /*
         * Step 2:
         * Determine the actual type of object at runtime based on user input.
         */
        animal = catOrDog(scn, animal);

        /*
         * Step 3:
         * Call the `speak()` method.
         * The JVM will check the real object type stored in `animal` 
         * and execute the corresponding overridden method.
         */
        animal.speak();

        scn.close();
    }

    /*
     * catOrDog()
     * A helper method that:
     * 1. Prompts the user to choose between a dog or a cat.
     * 2. Creates an instance of the chosen subclass (Dog or Cat).
     * 3. Returns the created object.
     * 
     * Because both Dog and Cat are subclasses of Animal,
     * this method's return type is Animal — allowing 
     * flexibility to return different object types.
     */
    static Animal catOrDog(Scanner scn, Animal animal) {
        int catOrDog = 0;

        while (true) {
            System.out.print("What would you like, a cat or a dog? (1 = dog, 2 = cat): ");

            if (scn.hasNextInt()) {
                catOrDog = scn.nextInt();
                scn.nextLine(); // Clear the newline from the input buffer

                switch (catOrDog) {
                    case 1 -> {
                        return animal = new Dog(); // Assign a Dog object
                    }
                    case 2 -> {
                        return animal = new Cat(); // Assign a Cat object
                    }
                    default -> {
                        System.out.println("Option must be: 1 or 2");
                    }
                }
            } else {
                System.out.println("Invalid Input! Please enter a number.");
                scn.next(); // Clear invalid input
            }
        }
    }
}
