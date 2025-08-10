package DAY23_81025.oop7th;

/*
 * superKeyword.java
 * 
 * Demonstrates the usage of the 'super' keyword in Java.
 * 
 * What is 'super'?
 *    - Refers to the immediate parent (superclass) of the current object.
 *    - Can be used in two main ways:
 *       1. To call the parent class constructor.
 *       2. To access parent class methods or attributes 
 *          when they are overridden or hidden by the subclass.
 * 
 * Why is 'super' important?
 *    - Ensures proper initialization of inherited fields when the parent
 *      has no default constructor.
 *    - Allows access to parent behavior even when overridden in a child class.
 * 
 * Is this standard?
 *    - Yes. It is part of standard Java OOP practices, especially in inheritance chains.
 * 
 * When to use:
 *    - When a subclass constructor needs to initialize parent attributes.
 *    - When you need to call the parent method explicitly.
 * 
 * Real-world example:
 *    In a Spring Boot application with inheritance:
 *       - Base class: User (username, password)
 *       - Subclass: AdminUser (adminLevel)
 *       The AdminUser constructor uses 'super(username, password)' 
 *       to ensure the base user attributes are properly initialized.
 * 
 * This program flow:
 *    - Person.java   → Parent class with name attributes.
 *    - Student.java  → Child class adds GPA and calls 'super' in constructor.
 *    - Employee.java → Child class adds salary and calls 'super' in constructor.
 *    - main()        → Creates and demonstrates objects of each type.
 */
public class superKeyword {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe");
        Student student1 = new Student("Kissareen", "Smith", 1.57);
        Employee employee1 = new Employee("Tik", "Tok", 50000);

        // From super class
        person1.showName();
        System.out.println();
        // Subclass Student - inherited and unique methods
        student1.showName(); // inherited from Person
        student1.showGpa();  // unique to Student
        System.out.println();
        // Subclass Employee - unique method
        employee1.showSlary();
    }
}
