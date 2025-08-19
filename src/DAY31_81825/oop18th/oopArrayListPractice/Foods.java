package DAY31_81825.oop18th.oopArrayListPractice;

/*
 * Foods.java
 * ----------
 * Represents a single "food" object to be stored in ArrayList.
 * Demonstrates:
 * - Encapsulation (private fields + getters/setters)
 * - Overriding toString() for custom display
 * 
 * Why not store just Strings?
 * - With a class, we can extend it (add price, type, calories, etc.)
 * - Better modeling for real-world problems (production-ready design).
 */
public class Foods {
    // Private attribute → ensures encapsulation
    private String food;

    // Constructor (used when creating a new Foods object)
    public Foods(String food) {
        this.food = food;
    }

    // Setter → allows controlled modification of the "food" field
    void setFood(String food) {
        this.food = food;
    }

    // Getter → allows safe access to private field
    String getFood() {
        return this.food;
    }

    // Override toString() → defines how object prints when inside ArrayList
    @Override
    public String toString() {
        return String.format("%s", this.food);
    }
}
