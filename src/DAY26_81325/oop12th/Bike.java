package DAY26_81325.oop12th;

/*
 * Bike — Implements Vehicle
 * Provides its own version of the `go()` method.
 */
public class Bike implements Vehicle {
    @Override
    public void go() {
        System.out.println("*You ride the bike*");
    }
}
