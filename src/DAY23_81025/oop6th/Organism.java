package DAY23_81025.oop6th;

/*
 * Organism.java
 * 
 * Acts as the "grandparent" class in this example.
 * Provides common attributes and behavior for all living things
 * in this hierarchy.
 */
public class Organism {
    // Attribute shared by all organisms
    boolean isAlive;

    // Constructor: By default, every new organism starts alive
    Organism() {
        isAlive = true;
    }
}
