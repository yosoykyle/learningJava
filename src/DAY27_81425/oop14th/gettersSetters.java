package DAY27_81425.oop14th;

/*
 * gettersSetters.java
 * 
 * CONCEPT OVERVIEW:
 * In Java, getters and setters are special methods used to control
 * access to an object's fields (instance attributes).
 * 
 * WHY DO WE NEED THEM?
 * - They allow us to keep fields private (data hiding) but still
 *   provide controlled ways to read or modify them.
 * - They enable us to apply rules, checks, or formatting before data is
 *   returned or updated (e.g., validating a price before setting it).
 * 
 * HOW IS THIS DIFFERENT FROM A CONSTRUCTOR?
 * - A constructor is called ONCE when the object is created to initialize fields.
 * - Setters can be called ANY TIME after creation to change fields (if allowed).
 * 
 * WHY NOT DIRECTLY ACCESS FIELDS?
 * - Direct access (public fields) means anyone can modify data without restrictions,
 *   which breaks encapsulation and may cause invalid or inconsistent states.
 * - Using getters/setters enforces control and safety.
 * 
 * HOW DOES THIS PROTECT DATA?
 * - By making fields `private`, external code cannot directly see or change them.
 * - Only the logic inside getter/setter methods decides what happens to that data.
 * 
 * CAN GETTERS/SETTERS BE OVERLOADED?
 * - Yes. You can create multiple setters with the same name but different parameter
 *   types (e.g., setPrice(int) and setPrice(String)). Overloading may be used to allow
 *   flexible ways to modify fields.
 * 
 * IS THIS COMMON?
 * - Extremely. Getters and setters are a standard Java convention in almost all
 *   real-world OOP projects.
 * 
 * THIS PROGRAM DEMONSTRATES:
 * - Declaring private fields in a class.
 * - Using getters to retrieve values safely.
 * - Using setters to modify values while applying validation.
 */
public class gettersSetters {
    public static void main(String[] args) {
        // Creating a Car object with initial values using the constructor
        Car car = new Car("M3", "Black", 50000);

        // Without getters/setters:
        // If fields were public, anyone could change them directly:
        // car.model = "X6"; // Dangerous, no validation or control

        /*
         * To prevent unrestricted access:
         * - Declare fields as private.
         * - Provide controlled access using getters and setters.
         */

        // Modifying object data safely via setters (with validation)
        car.setColor("Emerald"); // Allowed
        car.setPrice(900);       // Allowed but validated

        // Retrieving data via getters (safe and possibly formatted)
        System.out.println(car.getModel()); // "M3"
        System.out.println(car.getColor()); // "Emerald"
        System.out.println(car.getPrice()); // "$900"
    }
}
