package DAY26_81325.oop11th;

/*
 * interfaceJava.java
 *
 * Overview:
 * An interface in Java is like a **pure contract** — it only defines what must be done,
 * not how it is done (unless you use default or static methods).
 *
 * Key Points:
 * - An interface is a blueprint for a class that specifies methods any implementing class MUST define.
 * - A class can only extend ONE superclass (abstract or not) — via `extends`.
 * - A class can implement MULTIPLE interfaces — via `implements`.
 * - Interfaces allow multiple "contracts" without multiple inheritance of classes.
 *
 * Typical Usage:
 * - Interfaces define "what to do" (behavior signatures).
 * - Abstract classes can provide "what to do" + partial "how to do" (shared code).
 * - An abstract class can also implement an interface and leave some methods for its subclasses.
 *
 * When to Use:
 * - **Interface**: Need a shared contract between unrelated classes; multiple contracts per class.
 * - **Abstract Class**: Need common state or partial implementation.
 *
 * Naming Conventions:
 * - Interfaces: Often nouns/adjectives. If describing a capability, end with `-able` (e.g., Payable, Runnable).
 * - Abstract Classes: Follow normal class naming rules (PascalCase).
 *
 * Summary Table:
 * -------------------------------------------------------------
 * Interface       | Pure contract; multiple allowed
 * Abstract Class  | Shared traits + partial code; only one allowed
 * -------------------------------------------------------------
 *
 * Example in this program:
 * - Interfaces: Prey, Predator
 * - Classes:
 *      Rabbit implements Prey
 *      Hawk implements Predator
 *      Fish implements BOTH Prey and Predator
 * 
 * Purpose of Example:
 * - Show that a class can implement multiple interfaces but only extend one class.
 * - Demonstrate polymorphism via interface references.
 */
public class interfaceJava {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}
