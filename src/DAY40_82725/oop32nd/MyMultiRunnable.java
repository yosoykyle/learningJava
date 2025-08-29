package DAY40_82725.oop32nd;

/*
 * MyMultiRunnable.java
 * -------------------
 * This class implements Runnable to define a task for a thread.
 * Runnable interface allows separating task logic from thread management.
 * Each instance can have its own data (here, `text`) to demonstrate thread-specific behavior.
 *
 * Key Points:
 * -----------
 * - run() method contains the code executed by the thread.
 * - Thread.sleep(milliseconds) pauses execution for a specified time.
 * - Thread.currentThread() returns the currently executing thread object.
 * - Override toString() to identify the object when printed.
 *
 * Notes:
 * ------
 * - catch InterruptedException inside run() to handle thread interruption.
 * - Each thread instance can be given a name for easy identification.
 * - System.exit(0) terminates the whole program (use with caution, normally avoid in threads).
 */

public class MyMultiRunnable implements Runnable {

    private final String text; // Data specific to this thread instance

    // Constructor to assign thread-specific text
    MyMultiRunnable(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        // Repeat task 5 times with a 1-second delay
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000); // Pause for 1 second
                // Print thread and object info
                System.out.println("This object: " + this.toString());
                System.out.println(Thread.currentThread().getName() + " - Text: " + this.text);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Exception in thread: " + e.getMessage());
            }

            // Indicate completion
            if (i == 5) {
                System.out.println("Countdown complete!");
                System.exit(0); // Terminate program (optional, normally threads end naturally)
            }
        }
    }

    // Custom toString() for thread identification
    @Override
    public String toString() {
        return "MyMultiRunnable instance";
    }
}
