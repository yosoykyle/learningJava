package DAY25_81225.oop10th;

/*
 * Circle.java
 * 
 * A CONCRETE subclass of Shape.
 *   - Must implement `area()` from Shape.
 *   - If it doesn't, this class itself must be declared abstract.
 */
public class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
