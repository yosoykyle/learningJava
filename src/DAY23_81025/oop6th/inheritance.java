package DAY23_81025.oop6th;

/*
 * inheritance.java
 * 
 * Demonstrates the concept of Inheritance in Java.
 * 
 * Inheritance allows one class (child/subclass) to acquire 
 * the attributes and methods of another class (parent/superclass).
 * 
 * Relationship example:
 *    Child <- Parent <- Grandparent
 *    Just like in real life, a child can inherit traits from 
 *    both the parent and the grandparent.
 * 
 * Multi-level Inheritance:
 *    A class can inherit from another class, which in turn 
 *    inherits from another, forming a chain.
 * 
 * Why use inheritance?
 *    - Promotes code reusability.
 *    - Follows the D.R.Y. principle (Don't Repeat Yourself).
 *    - Makes it easier to maintain and scale programs.
 * 
 * When to use:
 *    - When multiple classes share common behavior or attributes.
 *    - When creating an organized class hierarchy.
 * 
 * Example use case in real life:
 *    In a Spring Boot application for e-commerce:
 *       - Base class: Product (fields: id, name, price)
 *       - Subclass: Electronics (additional fields: warranty, brand)
 *       - Subclass: Clothing (additional fields: size, material)
 *    This way, common attributes are stored in Product, and 
 *    specialized details go into their respective subclasses.
 * 
 * This example uses:
 *    - Organism.java   → Grandparent
 *    - Animal.java     → Parent (inherits from Organism)
 *    - Dog.java, Cat.java → Children (inherit from Animal)
 *    - Plant.java      → Another child of Organism
 */
public class inheritance {
    public static void main(String[] args) {
        // Creating child class objects
        Dog dog = new Dog();
        Cat cat = new Cat();
        // Creating another branch of the hierarchy (direct child of Organism)
        Plant plant = new Plant();

        // Accessing grandparent's attribute through child classes
        System.out.println(cat.isAlive);
        System.out.println(dog.isAlive);

        // Accessing parent's method
        dog.eat();
        cat.eat();

        // Accessing child's own attributes and methods
        System.out.println(dog.lives);
        dog.speak();
        System.out.println(cat.lives);
        cat.speak();

        System.out.println();

        // Accessing Plant's attributes and methods
        System.out.println(plant.isAlive); // From Organism
        plant.photosynthesize();
    }
}
