package DAY21_8825.oop3rd;

/*
 * overloadedConstructors.java
 * 
 * This program demonstrates the concept of **overloaded constructors** in Java.
 * 
 * ───────────────
 * What are Overloaded Constructors?
 * ───────────────
 * - A class can have **multiple constructors** with different parameter lists (different number or type of arguments).
 * - Each constructor provides a different way to initialize an object.
 * - This allows flexibility — you can create an object with just the data you currently have.
 * 
 * ───────────────
 * Why is this used?
 * ───────────────
 * - To provide **multiple initialization options** for a class.
 * - To make object creation more convenient, avoiding unnecessary parameters when they are not available.
 * 
 * ───────────────
 * Why is this useful? (Scenarios)
 * ───────────────
 * 1. User Registration:
 *    - If the system can register a user with just a username first, 
 *      but later on can also accept email and age — overloaded constructors handle both cases.
 * 2. Default Values:
 *    - Some constructors can set default values when certain data is not provided.
 * 3. Backward Compatibility:
 *    - If new parameters are added to a class later, overloaded constructors allow old code to still work.
 * 
 * ───────────────
 * Notes:
 * ───────────────
 * - This program uses the **Users** class to demonstrate the concept.
 * - Each constructor in the Users class sets the fields differently depending on the arguments.
 */

public class overloadedConstructors {
    public static void main(String[] args) {
        /*
         * With overloaded constructors, we can create objects
         * using different numbers and types of arguments.
         */
        Users user1 = new Users("kyle");                           // Only username
        Users user2 = new Users("elyk", "elyk@gmail.com");         // Username + email
        Users user3 = new Users("seti", "seti@gmail.com", 20);     // Username + email + age
        Users user4 = new Users();                                 // No arguments → default values

        // Display details of each user object
        System.out.println("user1");
        System.out.println(user1.userName);
        System.out.println(user1.age);
        System.out.println(user1.email);

        System.out.println();

        System.out.println("user2");
        System.out.println(user2.userName);
        System.out.println(user2.age);
        System.out.println(user2.email);

        System.out.println();

        System.out.println("user3");
        System.out.println(user3.userName);
        System.out.println(user3.age);
        System.out.println(user3.email);

        System.out.println();

        System.out.println("user4");
        System.out.println(user4.userName);
        System.out.println(user4.age);
        System.out.println(user4.email);
    }
}
