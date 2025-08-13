package DAY26_81325.oop11th;

public class Rabbit implements Prey {
    /*
     * The method must be declared public — otherwise:
     * "Cannot reduce the visibility of the inherited method from Prey"
     */
    @Override
    public void flee() {
        System.out.println("*The rabbit is running away*");
    }
}
