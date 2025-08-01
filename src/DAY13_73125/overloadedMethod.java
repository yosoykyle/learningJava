package DAY13_73125;

/*
 * overloadedMethod.java
 *
 * Method Overloading means creating multiple methods with the same name,
 * but with different parameter lists (number or type of parameters).
 *
 * This helps in writing cleaner and more readable code when similar
 * operations need to be performed on different types or amounts of data.
 *
 * Signature = method name + parameter types
 *            (return type is NOT part of the signature)
 *
 * When to Use:
 * ------------
 * - When you need the same operation to handle different kinds of input
 * - When the method purpose remains the same, but the input data changes
 * - For example, a `print()` method for int, double, or String values
 *
 * Be Cautious:
 * ------------
 * - The return type alone cannot differentiate overloaded methods.
 * - Too many overloaded versions can make code harder to maintain.
 * - Be clear and intentional with parameter types to avoid confusion.
 */

public class overloadedMethod {
    public static void main(String[] args) {
        // Varible declaration and initialization
        String pizza = bakePizza("flat bread", "american cheese", "pepperoni");
        pizza.replace(" ", "").toLowerCase();
        // Displaying output
        System.out.println(pizza);
    }

    // Methods
    static String bakePizza(String bread) {
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }

    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + " pizza";
    }
}
