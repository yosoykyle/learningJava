package DAY27_81425.oop13th;

/*
 * Animal.java
 * 
 * Abstract superclass representing the common "Animal" concept.
 * 
 * Why abstract?
 * - We don't want to create generic "Animal" objects directly.
 * - We only define the common structure (what every animal must do),
 *   leaving the actual implementation to concrete subclasses.
 * 
 * In this case, every Animal must be able to `speak()`, 
 * but *how* it speaks depends on the specific animal type.
 */
public abstract class Animal {
    // Abstract method: no implementation here — must be overridden by subclasses
    abstract void speak();
}
