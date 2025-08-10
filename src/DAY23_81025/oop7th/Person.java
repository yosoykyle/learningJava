package DAY23_81025.oop7th;

/*
 * Person.java
 * 
 * Parent (superclass) used by superKeyword.java.
 * 
 * Contains:
 *    - First name and last name attributes.
 *    - Constructor to initialize these attributes.
 *    - Method to display the full name.
 * 
 * Notes:
 *    - No default (empty) constructor is provided.
 *      This means subclasses must explicitly call this constructor 
 *      using 'super(fName, lName)'.
 * 
 * Example use case:
 *    Could represent a base "User" entity in a business application.
 */
public class Person {
    String fName;
    String lName;

    // Constructor requires both fName and lName
    Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    // Displays the full name
    void showName() {
        System.out.println(this.fName + " " + this.lName);
    }
}
