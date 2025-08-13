package DAY26_81325.oop12th;

/*
 * polymorphisms.java
 * 
 * POLYMORPHISM — Greek origin:
 *   poly  = "many"
 *   morph = "shape" or "form"
 *   → "many forms"
 * 
 * Definition:
 * Polymorphism allows an object to take on many forms.
 * In Java, this is achieved using inheritance (via classes or interfaces).
 * 
 * Key Idea:
 * - An object can be referred to by references of different types,
 *   as long as those types are part of its inheritance hierarchy.
 * - Objects can be treated as instances of their superclass (or interface),
 *   enabling code flexibility and reuse.
 * 
 * Example in real life:
 * - A Dog is also an Animal.
 * - An Animal is also a LivingThing.
 * - All are still Objects in Java terms.
 * 
 * Why it’s powerful:
 * - Enables writing code that works with a "general type" but can handle
 *   many specific forms of that type without knowing the exact subclass.
 * 
 * Two Types of Polymorphism in Java:
 * 1. Compile-time (Static Binding / Early Binding)
 *    - Resolved at compile time.
 *    - Achieved via method overloading.
 *    - Example: same method name but different parameters.
 *    - Compiler decides which version to call based on method signature.
 * 
 * 2. Run-time (Dynamic Binding / Late Binding)
 *    - Resolved at runtime.
 *    - Achieved via method overriding (requires inheritance).
 *    - Example: subclass changes the implementation of a method in the superclass.
 *    - JVM decides which version to call based on the actual object’s type at runtime.
 *    - Also known as "dynamic method dispatch".
 * 
 * Array and Polymorphism:
 * - You cannot directly instantiate an abstract class (e.g., `new Vehicle()` if Vehicle is abstract).
 * - BUT: You can create an array of abstract class or interface type.
 * - Why? An array is just a container for references.
 *   Each slot can store any concrete subclass instance (or null).
 * 
 * Example:
 *   Vehicle[] vehicles = new Vehicle[3];
 *   vehicles[0] = new Car();    // Car is-a Vehicle
 *   vehicles[1] = new Bike();   // Bike is-a Vehicle
 *   vehicles[2] = new Boat();   // Boat is-a Vehicle
 * 
 *   for (Vehicle v : vehicles) { v.go(); }
 * 
 * This works because Car, Bike, and Boat all share the common type Vehicle.
 */
public class polymorphisms {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        // Invalid: Type mismatch — cannot store a Bike in a Car array
        // Car[] cars = new Car[3];
        // cars[0] = car;
        // cars[1] = bike; // Error
        // cars[2] = boat; // Error

        // Valid: Use a common superclass or interface type
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = bike;
        vehicles[2] = boat;

        // Polymorphic behavior: the correct 'go()' method is called for each object
        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}
