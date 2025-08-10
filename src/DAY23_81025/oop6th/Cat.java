package DAY23_81025.oop6th;

/*
 * Cat.java
 * 
 * A specific type of Animal (child class of Animal).
 * Inherits traits from both Animal (parent) and Organism (grandparent).
 * 
 * Inheritance syntax:
 *    class Child extends Parent
 * 
 * Notes:
 * - Java does NOT support multiple inheritance of classes.
 * - However, a class can implement multiple interfaces.
 */
public class Cat extends Animal {
    // Attribute unique to cats
    int lives = 9;

    // Method unique to cats
    void speak() {
        System.out.println("The cat goes *meow*!");
    }
}
