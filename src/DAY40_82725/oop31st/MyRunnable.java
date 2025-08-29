package DAY40_82725.oop31st;

/*
 * MyRunnable.java
 *
 * This class defines a **task** for a separate thread by implementing Runnable.
 * 
 * Key Concepts:
 * -------------
 * - Implementing Runnable is the recommended way to define thread tasks.
 * - run() contains the code executed in the new thread.
 * - Threads run concurrently, meaning this countdown runs at the same time
 *   as the main thread which waits for user input.
 * - Thread.sleep(milliseconds) pauses the thread without stopping other threads.
 */

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        // Countdown loop for 5 seconds
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000); // Pause thread for 1 second
            } catch (InterruptedException e) {
                // Happens if another thread interrupts this thread while sleeping
                System.out.println("Thread Interrupted!");
            } catch (IllegalArgumentException e) {
                // Rare, but can happen if invalid argument is passed to sleep()
                System.out.println(e.getMessage());
            }

            // When countdown reaches 5, print "Time's up!"
            if (i == 5) {
                System.out.println("Time's up!");
                System.exit(0);// terminate the program prematurely
            }
        }
    }
}
