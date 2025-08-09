package DAY22_8925.oop5th;

/*
 * staticScope.java
 * 
 * This file demonstrates the concept of "static scope" in Java.
 * It is a continuation of the topic from:
 * DAY13_73125/src/DAY13_73125/variableScope.java
 * 
 * ------------------------
 * What is static scope?
 * ------------------------
 * - A "static" variable or method belongs to the class itself,
 *   rather than to any individual object created from that class.
 * - This means all instances (objects) of the class share the same
 *   static variable or method.
 * - Commonly used for:
 *      1. Utility methods (e.g., Math.sqrt())
 *      2. Shared resources (e.g., counting the number of created objects)
 * 
 * Key points:
 * - The 'static' keyword is seen in the 'main' method declaration 
 *   and in static variables/methods.
 * - Static members can be accessed without creating an object of the class.
 */

public class staticScope {
    public static void main(String[] args) {
        
        // Creating several Friend objects
        Friend friend1 = new Friend("ABC");
        Friend friend2 = new Friend("DEF");
        Friend friend3 = new Friend("GHI");
        Friend friend4 = new Friend("JKL");
        Friend friend5 = new Friend("MNO");

        /*
         * Accessing a static variable:
         * ----------------------------
         * Although static variables can be accessed via an object, 
         * it is strongly recommended to access them using the class name 
         * for clarity and best practice.
         */
        System.out.println("Number of Friends: " + Friend.numOfFriends);

        System.out.println();

        // Accessing the same static data through a static method
        Friend.showFriends();

        /*
         * Another example of static members:
         * -----------------------------------
         * The Math class has many static methods, such as Math.sqrt().
         * - No object creation is required to use them.
         * - Accessed directly through the class name.
         */
        double result = Math.sqrt(6);
        System.out.println("Square root of 6: " + result);
    }
}
