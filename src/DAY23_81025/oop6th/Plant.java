package DAY23_81025.oop6th;

/*
 * Plant.java
 * 
 * A direct child class of Organism (skips the Animal layer).
 * Demonstrates that multiple classes can share the same grandparent
 * without sharing the same parent.
 */
public class Plant extends Organism {
    // Method unique to plants
    void photosynthesize() {
        System.out.println("The plant absorbs sunlight!");
    }
}
