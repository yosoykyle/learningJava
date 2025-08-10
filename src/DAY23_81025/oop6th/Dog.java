package DAY23_81025.oop6th;

/*
 * Dog.java
 * 
 * Another child class of Animal.
 * Inherits from Animal (parent) and Organism (grandparent).
 * Also defines its own unique traits and behaviors.
 * 
 * Yes — a child's unique traits can also be inherited by its own child
 * in deeper inheritance chains.
 */
public class Dog extends Animal {
    // Attribute unique to dogs
    int lives = 1;

    // Method unique to dogs
    void speak() {
        System.out.println("The dog goes *woof*!");
    }
}
