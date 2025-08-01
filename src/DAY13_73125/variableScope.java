package DAY13_73125;

/*
 * variableScope.java
 * 
 * This file demonstrates the concept of **variable scope** in Java.
 * 
 * Will cover:
 * -----------
 * 1. **Local**
 * 2. **Class**
 * 
 * What is Variable Scope?
 * -----------------------
 * Scope refers to **where** in your code a variable can be accessed.
 * It determines the **lifetime** and **visibility** of a variable.
 * 
 * Types of Variables:
 * -------------------
 * 1. **Local Variables**
 *    - Declared inside methods, constructors, or blocks.
 *    - Only accessible within that method or block.
 *    - Created when the method is called, destroyed after.
 *    - Java will use local varibles insted of a class variable if they share same name
 * 
 * 2. **Instance Variables (Fields)**
 *    - Declared inside a class, but outside any method.
 *    - Belong to an object (you need to create an object to use them).
 *    - Accessible throughout the class (non-static context).
 * 
 * 3. **Class Variables (Static Fields)**
 *    - Declared with the `static` keyword.
 *    - Belong to the class itself (not tied to an object).
 *    - Shared by all instances of the class.
 * 
 * When to Use Each:
 * -----------------
 * - Use **local variables** for temporary tasks (like counters or input).
 * - Use **instance variables** to store object-specific data (like name, age).
 * - Use **class variables** for values shared across all objects (like a counter that tracks how many objects were created).
 * 
 * Note:
 * -----
 * - Be careful with scope. A variable declared in one method **cannot be accessed** in another unless passed as an argument or stored as a field.
 * - Using the same variable name in different scopes is allowed, but it can be confusing.
 * - Varible Shadowing. If a local variable shares the same name as a class or instance variable, Java will use the local variable within that scope.
 * 
 */

public class variableScope {

    // CLASS SCOPE VARIABLE
    // Belong to the class itself (not tied to an object).
    // Shared by all instances of the class.
    static int y = 3; 
    public static void main(String[] args) {

        // LOCAL SCOPE VARIABLE 
        // Declared inside methods, constructors, or blocks.
        // Exist only during method execution and can’t be accessed outside.
        int x = 1; // inside main() method
        
        System.out.println(x); // LOCAL
        doSomething(); // LOCAL FROM A METHOD
        System.out.println(y); // CLASS
        doSomethings(); // CLASS FROM A METHOD

        
    }

    static void  doSomething () 
    {
        int x = 2; // LOCAL
        System.out.println(x);
    }

    static void  doSomethings () 
    {
        System.out.println(y);
    }
}
