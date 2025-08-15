package DAY27_81425.oop14th;

public class Car {
    /*
     * FIELDS:
     * - Made private to hide them from direct external access.
     * - `final` used for `model` so it cannot be reassigned after construction.
     */
    private final String model;
    private String color;
    private int price;

    /*
     * CONSTRUCTOR:
     * - Initializes fields when the object is created.
     * - Called only once during instantiation.
     */
    Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    /*
     * GETTERS:
     * - Return the value of private fields to the outside world.
     * - Can contain logic (e.g., formatting numbers, combining data).
     */
    String getModel() {
        return this.model;
    }

    String getColor() {
        return this.color;
    }

    String getPrice() {
        // Adds currency formatting before returning the price
        return String.format("$%,d", this.price);
    }

    /*
     * SETTERS:
     * - Allow controlled modification of private fields.
     * - Often include validation to reject invalid inputs.
     */
    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price) {
        if (price <= 0) {
            System.out.println("Price can't be zero or negative.");
        } else {
            this.price = price;
        }
    }
}
