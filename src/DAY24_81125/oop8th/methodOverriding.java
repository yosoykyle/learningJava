package DAY24_81125.oop8th;

/*
 * methodOverriding.java
 * 
 * Demonstrates the concept of Method Overriding in Java.
 * 
 * What is method overriding?
 *    - It occurs when a subclass provides its own implementation 
 *      of a method that already exists in its parent (superclass).
 *    - The method in the subclass must have the *same* name, 
 *      return type, and parameters as the one in the superclass.
 * 
 * Why use it?
 *    - To provide specific behavior for a subclass, instead of 
 *      using the default behavior from the parent.
 *    - Enables polymorphism — the ability to treat objects 
 *      differently based on their actual type.
 * 
 * Is this standard?
 *    - Yes, it's a fundamental OOP concept and widely used.
 * 
 * When to use:
 *    - When you need to customize or completely change the 
 *      behavior of an inherited method.
 *    - When implementing abstract methods in subclasses.
 * 
 * Real-world example:
 *    - In a Spring Boot REST API, you might override the 
 *      `toString()` method in an entity to customize how 
 *      objects are logged or serialized.
 * 
 * This program uses:
 *    - Animal.java (superclass with default `move()` method)
 *    - Cat.java, Dog.java (subclasses that inherit `move()` as-is)
 *    - Fish.java (subclass that overrides `move()` to swim instead)
 */
public class methodOverriding {
    public static void main(String[] args) {

        // Subclass objects
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();

        // Superclass inherited method
        cat.move();
        dog.move();

        // Overridden method of Fish class
        fish.move();
    }
}
