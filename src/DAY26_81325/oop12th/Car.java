package DAY26_81325.oop12th;

/*
 * Car — Implements Vehicle
 * Provides its own version of the `go()` method.
 */
public class Car implements Vehicle {
    @Override
    public void go() {
        System.out.println("*You drive the car*");
    }
}
