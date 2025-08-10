package DAY23_81025.oop7th;

/*
 * Employee.java
 * 
 * Subclass (child class) of `Person`.
 * 
 * What it adds:
 *    - A `salary` field specific to employees.
 *    - A method `showSlary()` (typo kept as per original code) to display it.
 * 
 * How `super` is used here:
 *    - Calls the parent constructor (`super(firstName, lastName)`) to initialize
 *      the shared name fields.
 * 
 * Why this matters:
 *    - If `Person`’s constructor logic changes (e.g., adding validation or logging),
 *      all subclasses benefit automatically without modifying their own constructors.
 * 
 * Real-world analogy:
 *    - In a payroll system, `Person` covers universal data (name), while `Employee`
 *      adds salary info for payment processing.
 */
public class Employee extends Person {
    private double salary;

    // Employee constructor calls the parent (Person) constructor for shared attributes
    public Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName); // reuses Person's name initialization logic
        this.salary = salary;
    }

    // Displays the employee's salary
    public void showSlary() {
        System.out.println("Salary: " + salary);
    }
}

