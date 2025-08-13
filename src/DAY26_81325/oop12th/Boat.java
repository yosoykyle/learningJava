package DAY26_81325.oop12th;

/*
 * Boat — Implements Vehicle
 * Provides its own version of the `go()` method.
 */
public class Boat implements Vehicle {
    @Override
    public void go() {
        System.out.println("*You sail the boat*");
    }
}
