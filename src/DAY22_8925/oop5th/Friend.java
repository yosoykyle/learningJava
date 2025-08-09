package DAY22_8925.oop5th;

/*
 * Friend.java
 * 
 * This class is used by staticScope.java to demonstrate 
 * how static variables and methods work in Java.
 * 
 * ------------------------
 * Instance variables vs. Static variables:
 * ------------------------
 * - Instance variables (non-static):
 *      Each object has its own separate copy.
 *      Changes in one object do not affect the others.
 * 
 * - Static variables:
 *      There is only ONE copy shared across all objects.
 *      The variable belongs to the class, not to individual objects.
 * 
 * In this example:
 * - numOfFriends is declared as static.
 * - Every time a Friend object is created, numOfFriends increments.
 * - All Friend objects see the updated shared value.
 */
public class Friend {

    // Static variable shared among all Friend objects
    static int numOfFriends;

    // Instance variable unique to each Friend object
    String name;

    // Constructor: initializes the Friend's name and increments the shared count
    Friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    /*
     * Static method: showFriends()
     * ----------------------------
     * - Can be called without creating an object.
     * - Cannot directly access non-static instance variables or use "this".
     * - Useful when the method only depends on static data.
     */
    static void showFriends() {
        System.out.println("Number of friends: " + numOfFriends + " in total");
    }
}
