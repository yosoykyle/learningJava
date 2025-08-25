package DAY37_82425.oop28th;

/*
 * Product.java
 * 
 * Generic class with two type parameters <T, U>.
 * - T represents the type of the item (e.g., String).
 * - U represents the type of the price (e.g., Double).
 *
 * Features:
 * - Constructor to initialize both fields.
 * - Getter and setter methods for each field.
 * - Overridden toString() method to safely display contents.
 *
 * Type Parameters:
 * - <T>: Flexible type for item name or description.
 * - <U>: Flexible type for price or numeric value.
 */

public class Product<T, U> {
    private T item;
    private U price;

    // Constructor: initializes both fields
    Product(T item, U price) {
        this.item = item;
        this.price = price;
    }

    // Setters
    public void setItem(T item) { this.item = item; }
    public void setPrice(U price) { this.price = price; }

    // Getters
    public T getItem() { return this.item; }
    public U getPrice() { return this.price; }

    // Overridden toString to handle nulls safely and display content
    @Override
    public String toString() {
        return "Item: " + (item != null ? item.toString() : "Empty Item")
             + " Price: " + (price != null ? price.toString() : "Empty Price");
    }
}
