package DAY29_81625.oop16th;

/*
 * Car.java
 *
 * Represents the "whole" object in the Composition relationship.
 *
 * Key points:
 * - Car owns an Engine. The Engine is constructed inside Car’s constructor.
 * - Car’s methods (like carStart) delegate tasks to Engine, so Car doesn’t
 *   duplicate Engine’s functionality.
 * - Encapsulation is applied: external classes don’t need to know how Car
 *   manages Engine internally — they just call Car’s methods.
 */
public class Car {
    // Car attributes
    private final String model;  // The car’s model name
    private final int year;      // The manufacturing year

    // Composition relationship
    private final Engine engine; // Car HAS-A Engine (strong ownership)

    // Constructor: creates a new Car and automatically creates its Engine
    Car(String model, int year, String engineType) {
        this.model = model;
        this.year = year;

        // Composition: instead of receiving an Engine object, Car builds its own
        this.engine = new Engine(engineType);
    }

    // Start the car → Car delegates this action to Engine
    void carStart() {
        this.engine.engineStart();  // Car doesn’t start itself, it uses Engine
    }

    // Getter for model
    String getModel() {
        return this.model;
    }

    // Getter for year
    int getYear() {
        return this.year;
    }

    // Getter for engine
    Engine getEngine() {
        return this.engine;
    }

    // Method to display car information in a formatted way
    void displayCarInfo() {
        // Uses getters to fetch details, avoids direct field access
        System.out.printf("Car: %s %d\nEngine: %s\n", getModel(), getYear(), getEngine());
    }

    // Overriding toString() → defines how Car should be represented as text
    @Override
    public String toString() {
        // When Car is printed, we display both Car info and its Engine info
        return String.format("Car: %s %d\nEngine: %s\n", getModel(), getYear(), getEngine());
    }
}
