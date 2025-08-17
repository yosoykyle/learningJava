package DAY29_81625.oop16th;

/*
 * composition.java
 *
 * This is the main driver class to demonstrate the **Composition** relationship in OOP.
 *
 * Concept Recap:
 * - Composition is a "part-of" relationship.
 *   Example: A Car "has-a" Engine. The Engine is part of the Car.
 * - The Car object owns its Engine object. If the Car is destroyed,
 *   the Engine is destroyed too. (Their lifecycles are tightly bound.)
 *
 * Key Difference vs Aggregation:
 * - In Aggregation, the Engine could exist independently and just be
 *   passed into the Car. But here, the Car constructs its own Engine.
 *
 * In this example:
 * - We create a Car, which automatically creates an Engine inside it.
 * - The Car delegates starting behavior to its Engine.
 * - We can still access the Engine's details through Car’s methods.
 */
public class composition {
    public static void main(String[] args) {
        // Create a Car object. Notice we only provide the engine type as a String.
        // Car itself constructs its Engine internally → strong ownership (Composition).
        Car car = new Car("Hyundai Ioniq 5", 2024, "77.4 kWh Battery Electric");

        // Start the car.
        // Internally, Car forwards this request to its Engine (delegation).
        car.carStart();

        // Uncomment the lines below to explore how Car interacts with Engine:

        // Display formatted info using Car’s custom method
        //car.displayCarInfo();

        // Use Car’s toString() method (overridden) to get the same info
        //System.out.println(car);

        // Get the model of the car directly
        //System.out.println(car.getModel());

        // Get the year of the car directly
        //System.out.println(car.getYear());

        // Get the Engine object itself (its toString() shows the engine type)
        //System.out.println(car.getEngine());
    }
}
