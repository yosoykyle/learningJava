package DAY26_81325.oop12th;

/*
 * Vehicle.java
 * 
 * Vehicle is an INTERFACE (could also be an abstract class).
 * 
 * Why interface here?
 * - Forces all implementing classes to define the `go()` method.
 * - Prevents direct instantiation of a generic "Vehicle".
 * - Lets unrelated classes share the same capability ("go") without forcing a strict class hierarchy.
 * 
 * Note: In an interface, methods are:
 * - Implicitly public and abstract (unless marked default or static).
 */
public interface Vehicle {
    void go(); // Implicitly public and abstract
}
