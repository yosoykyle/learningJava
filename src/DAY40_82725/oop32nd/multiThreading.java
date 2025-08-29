package DAY40_82725.oop32nd;

/*
 * multiThreading.java
 * -------------------
 * This is a practice program for using multiple threads in Java.
 * Threads = independent paths of execution in a program.
 * Multi-threading = running more than one thread concurrently (at the same time).
 * Useful for:
 *  - Background tasks
 *  - Time-consuming operations (like file I/O, network calls)
 *  - Animations, timers, or simultaneous tasks
 *
 * Main Concepts Demonstrated:
 * ---------------------------
 * 1. Creating threads using Runnable interface.
 * 2. Starting threads with start() method.
 * 3. Main thread and worker threads running concurrently.
 * 4. Using join() to wait for threads to complete.
 *
 * Notes:
 * ------
 * - Each thread has its own execution flow.
 * - Threads share memory but execute independently.
 * - The main thread does not automatically wait for other threads unless join() is used.
 * - Daemon threads terminate when the main thread ends; user threads continue.
 */

public class multiThreading {
    public static void main(String[] args) {
        // Creating threads with Runnable objects
        Thread thread1 = new Thread(new MyMultiRunnable("Ping"), "Thread1 ");
        Thread thread2 = new Thread(new MyMultiRunnable("Pong"), "Thread2 ");

        // Start threads (threads begin executing run() concurrently)
        thread1.start();
        thread2.start();

        /*
         * Main Thread Behavior:
         * -------------------
         * - The main thread continues running while other threads are executing.
         * - To ensure main waits for threads to finish, we use join().
         * - thread.join() pauses the main thread until the thread finishes.
         * - join() can throw InterruptedException, which must be handled.
         */
        try {
            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        // All threads finished, main thread ends
        System.out.println("Main thread ending...");
    }
}
