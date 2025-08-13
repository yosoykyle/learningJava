package DAY25_81225.oop10th;

/*
 * abstraction.java
 * 
 * WHAT IS:
 *   - "abstract" keyword: used to define abstract classes and/or abstract methods.
 *   - Abstraction = hiding implementation details and exposing only the essential features.
 *   - An abstract class is a "template" for subclasses — it is incomplete on its own.
 * 
 * KEY RULES:
 *   - Abstract classes CANNOT be instantiated directly.
 *     (Instantiation = creating an object from a class)
 *   - Can contain:
 *       * ABSTRACT methods: declared without implementation (subclasses MUST implement them).
 *       * CONCRETE methods: fully implemented and inherited by subclasses.
 * 
 * WHY USE IT:
 *   - Forces subclasses to follow a specific "contract" for method implementation.
 *   - Promotes consistency across related classes.
 *   - Separates "what something does" from "how it does it".
 * 
 * DIFFERENCE FROM METHOD OVERRIDING:
 *   - Method overriding: subclass changes behavior of an EXISTING implemented method.
 *   - Abstract method: subclass provides the FIRST implementation of a method defined without a body.
 * 
 * EXTRA NOTES:
 *   - Abstract classes can extend other abstract classes to build larger templates.
 *   - Common in frameworks, APIs, and large applications where a general base class defines required behavior.
 * 
 * ANALOGY:
 *   Teaching someone to drive without explaining how the engine works.
 *   You define the essential controls ("press the gas to go, brake to stop"), but the details of the engine are hidden.
 * 
 * THIS PROGRAM:
 *   - Uses Shape (abstract class) to enforce that all shapes define an `area()` method.
 *   - Circle, Triangle, and Rectangle must each implement `area()` differently.
 */
public class abstraction {
    public static void main(String[] args) {

        // This will not compile because Shape is abstract:
        // Shape shape = new Shape();

        // Create objects of concrete subclasses instead:
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);

        // Inherited concrete toString() method from Shape is used here:
        System.out.println(circle);
        System.out.println(triangle);
        System.out.println(rectangle);
    }
}
