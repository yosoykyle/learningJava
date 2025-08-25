package DAY37_82425.oop28th;

/*
 * Box.java
 * 
 * Generic class with one type parameter <T>.
 * - Demonstrates a simple container for a single object of any type.
 *
 * Features:
 * - setItem(T item): stores the object.
 * - getItem(): retrieves the object.
 *
 * Usage:
 * - Box<String> stringBox = new Box<>();
 * - Box<Product<String, Double>> productBox = new Box<>();
 */

public class Box<T> {
    private T item;

    // Store an object of type T
    public void setItem(T item) {
        this.item = item;
    }

    // Retrieve the stored object of type T
    public T getItem() {
        return this.item;
    }
}
