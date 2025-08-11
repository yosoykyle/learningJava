package DAY24_81125.oop9th;

/*
 * Car.java
 * 
 * Represents a basic vehicle with make, model, color, and year.
 * 
 * Overrides toString():
 *    - Instead of printing the default ClassName@HashCode, 
 *      it returns a human-readable description of the car's details.
 */
public class Car {
    String make;
    String model;
    String color;
    int year;

    Car(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}
