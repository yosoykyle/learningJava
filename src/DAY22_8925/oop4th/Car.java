package DAY22_8925.oop4th;

/*
 * Car.java
 * 
 * This is a simple class used to represent a Car.
 * It is used by arrayOfObjects.java to demonstrate the concept of arrays of objects.
 * 
 * 📌 Key Points:
 * - Has two attributes: model and color.
 * - Has a constructor to initialize these attributes.
 * - Has a method (drive) to display car details.
 */
public class Car {
    String model; // Model name of the car
    String color; // Color of the car

    /*
     * Constructor
     * Purpose:
     * - To initialize the Car object's attributes when it is created.
     * - "this" keyword refers to the current object instance.
     */
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    /*
     * drive() method
     * Purpose:
     * - Displays a message indicating that you are driving the car.
     * - Uses "this.model" and "this.color" to access the current object's attributes.
     */
    void drive() {
        System.out.println("You drive a " + this.color + " " + this.model);
    }
}
