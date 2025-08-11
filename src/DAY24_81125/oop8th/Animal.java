package DAY24_81125.oop8th;

/*
 * Animal.java
 * 
 * This is the superclass used by methodOverriding.java.
 * Contains a generic implementation of `move()`
 * that is inherited by all subclasses unless overridden.
 */
public class Animal {
    void move () {
        System.out.println("The animal is running");
    }
}
