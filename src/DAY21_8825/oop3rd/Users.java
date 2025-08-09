package DAY21_8825.oop3rd;

/*
 * Users.java
 * 
 * This class is used by **overloadedConstructors.java** to demonstrate
 * a real-world example of overloaded constructors.
 * 
 * ───────────────
 * Purpose:
 * ───────────────
 * - Represents a basic user profile with three properties:
 *   1. userName → the name of the user
 *   2. email    → the user's email address
 *   3. age      → the user's age
 * 
 * - Demonstrates how a class can have multiple constructors
 *   to allow flexible object creation.
 * 
 * ───────────────
 * How it works in this example:
 * ───────────────
 * - Each constructor initializes the object differently, depending on the parameters given.
 * - Missing values are assigned **default values**.
 * - This is useful in real applications where you might not always have complete data at object creation time.
 */

public class Users {
    String userName;
    String email;
    int age;

    // Constructor: No arguments → all default values
    public Users() {
        this.userName = "guest";
        this.email = "not provided";
        this.age = 0;
    }

    // Constructor: Only username provided → set email and age to defaults
    public Users(String userName) {
        this.userName = userName;
        this.email = "not provided";
        this.age = 0;
    }

    // Constructor: Username + email provided → set age to default
    public Users(String userName, String email) {
        this.userName = userName;
        this.email = email;
        this.age = 0;
    }

    // Constructor: Username + email + age provided → fully initialized
    public Users(String userName, String email, int age) {
        this.userName = userName;
        this.email = email;
        this.age = age;
    }
}
