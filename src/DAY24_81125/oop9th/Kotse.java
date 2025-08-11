package DAY24_81125.oop9th;

/*
 * Kotse.java
 * 
 * A subclass of Car that adds number of doors.
 * 
 * Overrides toString():
 *    - Extends Car's toString() output by also including number of doors.
 *    - Calls `super.toString()` to reuse the parent class's implementation.
 */
public class Kotse extends Car {
    int numOfDoor;

    Kotse(String make, String model, String color, int year, int numOfDoor) {
        super(make, model, color, year);
        this.numOfDoor = numOfDoor;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.numOfDoor;
    }
}
