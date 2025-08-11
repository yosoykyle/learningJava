package DAY24_81125.oop9th;

/*
 * toStringMethod.java
 * 
 * What is:
 *    - A method inherited from the 'Object' class that returns a string 
 *      representation of an object.
 *    - Default behavior: returns "ClassName@HexadecimalHashCode"
 *      (e.g., DAY24_81125.oop9th.Car@28a418fc).
 *    - Can be overridden to provide meaningful and readable output about the object.
 * 
 * Why use it:
 *    - Makes printed/logged object output human-readable.
 *    - Helps debugging by displaying object attributes directly.
 *    - Useful in any place where object state needs to be quickly understood.
 * 
 * When to use:
 *    - Whenever an object might be printed, logged, or displayed to the user.
 *    - Best practice: Override in most domain model classes (e.g., entities, DTOs, data holders).
 * 
 * Real-world example:
 *    - In a Spring Boot REST API, returning a Java object without a custom `toString()` 
 *      will log it as a hash code, which is not helpful. Overriding `toString()` 
 *      makes log statements meaningful during debugging.
 * 
 * This program:
 *    - Demonstrates the difference between the default `toString()` 
 *      and an overridden `toString()` that returns meaningful object details.
 */
public class toStringMethod {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", "Nuke Black", 2026);
        // Calls the overridden toString() in Car
        System.out.println(car);

        Kotse kar = new Kotse("Atoyot", "Aloroc", "Kcalb Ekun", 6202, 4);
        // Calls the overridden toString() in Kotse, which also calls Car's version
        System.out.println(kar);
    }
}
