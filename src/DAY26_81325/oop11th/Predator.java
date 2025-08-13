package DAY26_81325.oop11th;

/*
 * When a class implements an interface:
 * - All methods in the interface are implicitly public and abstract
 *   (unless declared as default or static inside the interface).
 * - Implementing classes MUST declare these methods as public;
 *   using protected, private, or package-private will cause a compile-time error.
 * - Reason: An interface is a public contract — any code holding a reference
 *   to the interface must be able to call its methods.
 */
public interface Predator {
    void hunt(); // implicitly public and abstract
}
