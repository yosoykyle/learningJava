package DAY20_8725.oop1st;

/*
 * Car.java
 * 
 * This class is used by: objectOriented.java
 *
 * Description:
 * This file defines a simple Car class for demonstrating Object-Oriented Programming (OOP) in Java.
 * It includes attributes (data) and methods (actions) to represent a real-world car entity.
 * 
 * Naming Convention:
 * - In Java, class names should follow **PascalCase**:
 *   → Each word starts with a capital letter, with no spaces or underscores.
 *   → Example: Car, CarEngine, ElectricCar
 *
 * - The filename should match the class name exactly, including capitalization.
 *   → If the class is named Car, the file must be Car.java
 *
 * - Class names should be **nouns**, because they represent real-world entities or concepts.
 *
 * - Keep the name meaningful and descriptive.
 *   → Bad: C, X1
 *   → Good: Car, Truck, Vehicle, CarRentalSystem
 *
 * Following proper naming conventions improves readability, consistency, and professionalism in your code.
 */

public class Car {
    
    // ===== Attributes (Fields or Properties) =====
    
    String carBrand = "BYD";         // Brand of the car
    String carModel = "Seal";        // Model name
    int carYear = 2025;              // Manufacturing year
    double carPrice = 1_198_000;     // Price in PHP
    boolean isEngineRunning = false; // Engine state (on/off)
    String owner = "Kyle";           // Owner name

    
    // ===== Methods (Behaviors or Actions) =====
    
    // Prints the name of the car owner
    void printOwner() {
        System.out.println("Owner: " + owner);
    }

    // Starts the car engine and returns a confirmation message
    String startCar() {
        isEngineRunning = true;
        return "Engine Started";
    }

    // Stops the car engine and returns a confirmation message
    String stopCar() {
        isEngineRunning = false;
        return "Engine Stopped";
    }

    // Simulates driving the car
    void driveCar() {
        System.out.println(owner + " drives the " + carModel);
    }

    // Simulates braking the car
    void breakCar() {
        System.out.println(owner + " braked the " + carModel);
    }
}
