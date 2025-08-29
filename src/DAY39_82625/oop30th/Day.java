package DAY39_82625.oop30th;

/*
 * Day.java
 * 
 * A top-level (own file) definition of an enum.
 * This enum represents the days of the week, each associated with a number.
 */
public enum Day {

    /*
     * DAY CONSTANTS
     * -------------
     * By convention, enum constants are written in ALL_CAPS 
     * to distinguish them from regular variables.
     * 
     * Here we associate each constant with a value:
     * - MONDAY(1), TUESDAY(2), etc.
     * This is called an "enum with fields" or "parameterized enum".
     * 
     * Each constant has its own day number. To store this value, 
     * we define a private field and a constructor.
     */
    MONDAY(1), 
    TUESDAY(2), 
    WEDNESDAY(3), 
    THURSDAY(4), 
    FRIDAY(5), 
    SATURDAY(6), 
    SUNDAY(7);

    // Private field to store the number associated with the day
    private final int dayNumber; 

    /*
     * Constructor for the enum.
     * - Called automatically for each enum constant when it is created.
     * - Assigns the parameter 'dayNumber' to the field 'this.dayNumber'.
     * - Note: Enum constructors are always private (implicitly), cannot be public.
     */
    Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    /*
     * Getter method to access the day number of a constant.
     * Example: Day.MONDAY.getDayNumber() returns 1
     */
    public int getDayNumber() {
        return this.dayNumber; // 'this' refers to the current enum constant
    }
}
