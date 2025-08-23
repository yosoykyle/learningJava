package DAY35_82225.oop25th;

/*
 * anonymousClass.java
 * 
 * An **anonymous class** is a class without a name, defined and instantiated in a single expression.
 * 
 * Key points:
 * - Cannot be reused because it has no name.
 * - Lets you add custom behavior to an existing class or interface without creating a separate subclass.
 * - Often used for one-time or specific tasks:
 *   - Implementing interfaces like Runnable for threads
 *   - Defining TimerTasks for scheduling
 *   - Creating callbacks for event handling
 *   - Quickly overriding methods in GUI components (e.g., ActionListener)
 *
 * Why use an anonymous class:
 * - Convenient for creating a single object with custom behavior.
 * - Keeps code concise and focused.
 *
 * How it works:
 * - Defined inline; no separate subclass is needed.
 * - Can extend a superclass or implement an interface.
 * - Methods can be overridden or new ones added.
 * - The class has no name, but the instance can be stored in a variable if needed.
 *
 * Ways to define:
 * 1. Without storing in a variable (direct use):
 *    new Dog() {
 *        @Override
 *        void dogSpeak() { ... }
 *    }.dogSpeak(); // used immediately
 *
 * 2. Storing instance in a variable:
 *    Dog scoobs = new Dog() {
 *        @Override
 *        void dogSpeak() { ... }
 *    };
 *    scoobs.dogSpeak();
 *
 * 3. Implementing an interface:
 *    Runnable r = new Runnable() {
 *        @Override
 *        public void run() { ... }
 *    };
 *    r.run();
 * 
 * Difference from anonymous object:
 * - Anonymous class: unnamed class + object creation in one step.
 * - Anonymous object: object without a reference, class itself has a name.
 */

public class anonymousClass {
    public static void main(String[] args) {
        /*
         * Example without anonymous class:
         * If we want a special dog (like Scooby-Doo) that speaks differently,
         * we would normally create a subclass:
         */
        Dog dog = new Dog();
        dog.dogSpeak();
        // subclassing Dog to create a specific dog behavior
        // (like Scooby-Doo) would look like this:
        TakingDog takingDog = new TakingDog();
        takingDog.dogSpeak();

        /*
         * Using an anonymous class:
         * Create a one-time Dog object with custom behavior without a new subclass.
         */
        // storing in an instance variable
        Dog scoobs = new Dog() {
            @Override
            void dogSpeak() {
                System.out.println("Scooby Doo says: HELLO (stored anonymously)");
            }
        };
        scoobs.dogSpeak();
        // using directly without storing
        new Dog() {
            @Override
            void dogSpeak() {
                System.out.println("Scooby Doo says: HELLO (used directly & anonymously)");
            }
        }.dogSpeak(); // used immediately
    }
}