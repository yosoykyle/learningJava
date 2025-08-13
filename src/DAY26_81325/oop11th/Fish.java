package DAY26_81325.oop11th;

/*
 * Example of implementing multiple interfaces:
 * - Fish is both a predator and prey.
 *   • It hunts smaller fish.
 *   • It flees from bigger fish.
 *
 * This shows that interfaces allow multiple "roles" in one class.
 */
public class Fish implements Prey, Predator {
    @Override
    public void flee() {
        System.out.println("*The fish is fleeing from a bigger fish*");
    }

    @Override
    public void hunt() {
        System.out.println("*The fish is hunting small fishes*");
    }
}
