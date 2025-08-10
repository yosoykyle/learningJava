package DAY23_81025.oop6th;

/*
 * Animal.java
 * 
 * Serves as the "parent" class for specific animal types (Dog, Cat).
 * Inherits from Organism, so all animals have the `isAlive` attribute.
 */
public class Animal extends Organism {
    // Method common to all animals
    void eat() {
        System.out.println("The animal is eating");
    }
}
