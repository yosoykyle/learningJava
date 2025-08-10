package DAY23_81025.oop7th;

/*
 * Student.java
 * 
 * Child (subclass) of Person.java.
 * 
 * Adds:
 *    - GPA attribute.
 *    - Method to display GPA.
 * 
 * Why 'super' is needed here:
 *    - Person does not have a default constructor.
 *    - Student must pass fName and lName to Person's constructor
 *      using 'super(fName, lName)' to properly initialize inherited attributes.
 * 
 * Real-world example:
 *    In a school management system:
 *       - Person → stores common details like name, date of birth.
 *       - Student → adds details like GPA, grade level.
 */
public class Student extends Person {
    double gpa;

    // Constructor must call the parent's constructor
    Student(String fName, String lName, double gpa) {
        super(fName, lName); // Calls Person's constructor
        this.gpa = gpa;
    }

    void showGpa() {
        System.out.println(this.fName + "'s GPA is " + this.gpa);
    }
}
