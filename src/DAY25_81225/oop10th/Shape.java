package DAY25_81225.oop10th;

/*
 * Shape.java
 * 
 * ABSTRACT CLASS:
 *   - Declared with "abstract" keyword before `class`.
 *   - Serves as a base (superclass) for all shapes.
 *   - Cannot be instantiated directly.
 * 
 * MEMBERS:
 *   - `area()` is abstract → subclasses MUST implement it.
 *   - `toString()` is concrete → all subclasses inherit it.
 * 
 * ATTRIBUTES:
 *   - Abstract classes can still have fields, getters, and setters.
 * 
 * toString() NOTE:
 *   - Overriding toString() in an abstract class is common.
 *   - This allows all subclasses to have a shared, consistent text representation.
 *   - Often preferred over a custom `display()` void method because toString() is automatically called in many contexts (e.g., System.out.println()).
 */
public abstract class Shape {

    // ABSTRACT METHOD: subclasses must implement this
    abstract double area();

    // CONCRETE METHOD: shared by all shapes
    @Override
    public String toString() {
        return String.format("This is a shape with area %.2f", area());
    }
}
