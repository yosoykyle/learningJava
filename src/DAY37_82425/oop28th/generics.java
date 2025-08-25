package DAY37_82425.oop28th;

import java.util.ArrayList;

/*
 * generics.java
 * 
 * Demonstrates the use of Java Generics in classes, interfaces, and methods.
 * Generics allow you to write **flexible, type-safe, and reusable code**.
 *
 * Key Concepts:
 * -------------
 * 1. Type Parameter:
 *    - A placeholder for a data type specified with angle brackets <>.
 *    - Common letters: T (Type), E (Element), K (Key), V (Value), N (Number).
 *    - Example: <T> in a class definition.
 *
 * 2. Type Argument:
 *    - The actual data type you supply to a generic type parameter.
 *    - Examples: <String>, <Integer>, <Double>, <Boolean>, etc.
 *    - Example: ArrayList<String> fruits = new ArrayList<>();
 *
 * Benefits of Generics:
 * --------------------
 * - Code Reusability: Write a class/method once and use it with different types.
 * - Type Safety: Catch type mismatches at compile time instead of runtime.
 * - Eliminates Casts: No need to cast objects when retrieving them from collections.
 *
 * Rule of Thumb:
 * --------------
 * Use generics when:
 * - The class/method will handle multiple subtypes of a superclass.
 * - You want compile-time type safety.
 * - You want to avoid manual casting.
 *
 * Don’t use generics when:
 * - The type is fixed and will never change.
 * - Type safety or casting is not critical.
 */

public class generics {
    public static void main(String[] args) {

        /*
         * Example 1: Using a generic collection (ArrayList)
         * Type argument specified as <String> ensures only strings are allowed.
         */
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        // fruits.add(231); // Compile-time error: type mismatch

        /*
         * Example 2: Generic class with one type parameter
         * Box<T> can hold any type of object specified when creating the object.
         */
        Box<String> items = new Box<>();
        items.setItem("box");
        System.out.println(items.getItem()); // box
        items.setItem("boxes");
        System.out.println(items.getItem()); // boxes

        /*
         * Example 3: Generic class with multiple type parameters <T, U>
         * Product<T, U> can hold an item and a price with flexible types.
         */
        Product<String, Double> product = new Product<>("Apple", 0.90);
        System.out.println(product); // Item: Apple Price: 0.9

        product.setItem("Banana");
        product.setPrice(0.50);
        System.out.println(product.getItem() + "\n" + product.getPrice()); // Banana, 0.5

        /*
         * Example 4: Box holding a generic Product
         * Shows nesting generics: Box<Product<String, Double>>
         */
        Box<Product<String, Double>> productItem = new Box<>();
        productItem.setItem(new Product<>("Apple", 0.90));
        // Calls productItem.getItem() and prints it.
        // Java automatically uses the overridden toString() of Product to display a
        // readable string.
        System.out.println(productItem.getItem());

    }
}
