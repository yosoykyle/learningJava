package DAY20_8725.oop2nd;

/* 
 * Student.java
 * 
 * This class is used by constructors.java; 
 * 
 * The `this` keyword refers to the current object (the instance being created).
 * It’s used to avoid confusion when constructor parameters have the same names as instance variables.
 *
 * Example:
 *   this.name = name;
 *   → same as writing: student.name = name;
 *   → 'this.name' refers to the object's variable,
 *      while 'name' (on the right) is the constructor parameter.
 */

public class Student {
    // Attributes
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // Constructor
    Student(String name, int age, double gpa) {
        this.name = name; 
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    // Methods
    void studying () {
        System.out.println(this.name + " is studying");
    }

}
