package DAY20_8725.oop2nd;
/*
 * constructors.java
 * 
 * This program uses the **Student** class to demonstrate the concept of constructors in Java.
 * 
 * In Java, a constructor looks similar to a method, 
 * but it serves a completely different purpose: it is used to initialize new objects.
 * 
 * ───────────────
 * Method vs Constructor
 * ───────────────
 * METHOD:
 * - Performs an action or computes a result.
 * - Can have any valid name (except the class name).
 * - Must have a return type (e.g., void, int, String, etc.).
 * - Called manually using: object.methodName()
 * - Can be overloaded (same method name, different parameters).
 * - Supports varargs (variable-length argument lists).
 * 
 * CONSTRUCTOR:
 * - Initializes a newly created object.
 * - Must have the **same name as the class**.
 * - Has **no return type**, not even `void`.
 * - Called automatically when you use: new ClassName()
 * - Cannot return a value.
 * - Can also be overloaded.
 * - Supports varargs as well.
 * 
 * ───────────────
 * Why Constructors Are Important
 * ───────────────
 * - Constructors ensure that every object starts in a **valid and consistent state**.
 * - They allow you to assign initial values to instance variables right when the object is created.
 * - Constructors help enforce **rules or requirements** for object creation (e.g., no null names, valid ages, etc.).
 * - Without constructors, you would have to manually assign values like:
 *     Student s = new Student();
 *     s.name = "Kyle"; // prone to forgetting or skipping
 * - This can lead to **bugs**, **inconsistent states**, or **null values**, especially in larger projects.
 * - Using constructors makes your code **cleaner**, **easier to maintain**, and **less error-prone**.

 * Bad practice: Skipping constructors and setting values directly (e.g., `object.name = "X"`)
 * Good practice: Defining constructors to ensure proper initialization at creation time.

 * ───────────────
 * Syntax Example:
 * ───────────────
 * public class Car {
 *     String brand;
 *     int year;
 *
 *     // Constructor
 *     public Car(String brand, int year) {
 *         this.brand = brand; → refers to the instance variable
 *         this.year = year;
 *     }
 * }
 * 
 * ───────────────
 * Additional Notes:
 * ───────────────
 * - Constructors are usually declared near the top of the class.
 * - They are helpful when you want to ensure that objects are initialized with specific values.
 * - The **this** keyword refers to the current instance of the class.
 *   → It is commonly used to distinguish between instance variables and parameters with the same name.
 *   → Example: this.brand = brand;
 */

public class constructors {
    public static void main(String[] args) {

        // Objects
        Student student1 = new Student("Kyle", 20, 1.5);
        Student student2 = new Student("John",23, 2.0);
        Student student3 = new Student("Kissa", 19, 1.57);

        // student1 attributes
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student3.studying();

        System.out.println();

        // student2 attributes
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student3.studying();

        System.out.println();

        // student3 attributes
        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        student3.studying();
    }
}
