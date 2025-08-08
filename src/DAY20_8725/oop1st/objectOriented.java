package DAY20_8725.oop1st;

/*
 * objectOriented.java
 *
 * OOP = Object-Oriented Programming
 * This is a programming paradigm that organizes code using "objects".
 *
 * In programming, objects represent real-world entities.
 * An entity is anything that can be described using characteristics and behaviors.
 *
 * Objects contain:
 * - Attributes → the data (also called fields or properties)
 * - Methods    → the actions (also called behaviors or functions)
 *
 * Why is it a reference data type?
 * - Objects are not stored directly in variables.
 * - Instead, variables hold a *reference* (like a pointer) to the actual object in memory.
 *
 * Examples:
 * - Attributes: name, age, height, weight
 * - Methods: eat(), sleep(), walk(), talk()
 *
 * Why is OOP useful?
 * - Organizes code into reusable components (objects)
 * - Makes code easier to understand, test, and maintain
 * - Supports principles like abstraction, encapsulation, inheritance, and polymorphism
 *
 * Why is Java an OOP language?
 * - Java was designed with OOP principles in mind.
 * - Everything in Java revolves around classes and objects.
 *
 * In this program, we’ll use a **Car** object as an example.
 *
 * How to create an object:
 * - First, define a class as a blueprint.
 * - Then, create an object (instance) based on that class.
 */

public class objectOriented {
    public static void main(String[] args) {
        Car car1 = new Car();

        // Printing the object reference (memory address by default)
        System.out.println(car1);

        /*
         * To access the attributes of an object, use the dot operator:
         * objectName.attributeName
         */

        // Accessing Car attributes and storing them in local variables
        String carBrand = car1.carBrand;
        String carModel = car1.carModel;
        int carYear = car1.carYear;
        double carPrice = car1.carPrice;
        boolean isEngineRunning;

        // Calling Car methods and storing the result
        String carStart = car1.startCar(); // Calls a method that returns a String
        isEngineRunning = car1.isEngineRunning; // Get the current engine status
        String carStop = car1.stopCar(); // Calls another method

        // Modifying a Car attribute
        carModel = car1.carModel = "Sealion"; // Changing model from Seal to Sealion

        // Displaying Car info
        car1.printOwner(); // Calls a void method
        System.out.println("Car Brand: " + carBrand);
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Year: " + carYear);
        System.out.printf("Car Price: $%,.2f\n", carPrice);

        System.out.println();

        // Displaying Car actions
        System.out.println(carStart);
        System.out.println("isEngineRunning: " + isEngineRunning);
        car1.driveCar();  // Calls method to simulate driving
        car1.breakCar();  // Calls method to simulate braking
        System.out.println(carStop);
        isEngineRunning = car1.isEngineRunning; // Update engine status again
        System.out.println("isEngineRunning: " + isEngineRunning);
    }
}
