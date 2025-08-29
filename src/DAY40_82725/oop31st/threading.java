package DAY40_82725.oop31st;
/*
 * threading.java
 * 
 * What is a Thread?
 * -----------------
 * - A thread is a lightweight unit of execution within a program.
 * - Allows a program to run multiple tasks simultaneously (concurrently).
 * - Useful for improving performance, responsiveness, and efficiency.
 * 
 *  * When to use Threads:
 * -------------------
 * - For time-consuming operations that should not block the main program
 * - To perform tasks concurrently for better responsiveness
 * - Common use cases:
 *   - File I/O (reading/writing large files without blocking the main program)
 *   - Network communications (download/upload while UI remains responsive)
 *   - Background calculations, logging, or repetitive tasks
 *   - Timers, animations, or game loops
 * 
 * Key Concepts:
 * -------------
 * - Process vs Thread:
 *   - Process: Independent program running in its own memory space.
 *   - Thread: Part of a process; shares memory with other threads of the same process.
 * - Concurrency vs Parallelism:
 *   - Concurrency: Threads appear to run at the same time (may share CPU).
 *   - Parallelism: Threads truly run simultaneously on multiple cores.
 * - Thread Lifecycle:
 *   1. NEW      : Thread object created but not started
 *   2. RUNNABLE : Thread ready to run (waiting for CPU)
 *   3. RUNNING  : Thread is executing
 *   4. WAITING/ TIMED_WAITING : Thread waiting for a signal or timeout
 *   5. TERMINATED : Thread has finished execution
 * - Daemon Threads:
 *   - Background threads that automatically stop when all user threads finish
 *   - Example: Garbage collector
 * 
 * Exceptions in Threads:
 * ----------------------
 * - Threads themselves do not throw checked exceptions directly.
 * - Exceptions occurring inside a thread’s run() method must be handled internally (try-catch)
 * - If uncaught, they terminate the thread but do not crash the main program.
 * - Examples:
 *   - InterruptedException (when using sleep(), wait(), join())
 *   - Runtime exceptions (ArithmeticException, NullPointerException)
 * 
 * How to create a Thread in Java:
 * -------------------------------
 *
 * 1. Extend the Thread class:
 *    - Pros:
 *       - Simple and easy to start
 *       - Can override the run() method directly
 *    - Cons:
 *       - Cannot extend another class (Java has single inheritance)
 *       - Less flexible for sharing tasks across multiple threads
 *    - Example:
 *       class MyThread extends Thread {
 *           @Override
 *           public void run() {
 *               // task code here
 *               System.out.println("Thread is running");
 *           }
 *       }
 *       public class ThreadExample1 {
 *           public static void main(String[] args) {
 *               MyThread t1 = new MyThread();
 *               t1.start(); // starts the thread, which calls run()
 *           }
 *       }
 *
 * 2. Implement the Runnable interface:
 *    - Pros:
 *       - Can implement multiple interfaces
 *       - Separates the task from thread management
 *       - Allows reusing the same Runnable across multiple threads
 *    - Cons:
 *       - Slightly more code, need a Thread object to run
 *    - Example:
 *       class MyTask implements Runnable {
 *           @Override
 *           public void run() {
 *               // task code here
 *               System.out.println("Runnable task is running");
 *           }
 *       }
 *       public class ThreadExample2 {
 *           public static void main(String[] args) {
 *               MyTask task = new MyTask();
 *               Thread t2 = new Thread(task);
 *               t2.start(); // starts the thread and calls run() internally
 *           }
 *       }
 *
 * Notes:
 * ------
 * - Always use start() to begin a thread; calling run() directly executes it on the main thread.
 * - @Override annotation is optional but helps ensure correct method overriding.
 * - Both approaches create a new thread of execution, allowing multitasking.
 * 
 * Other important methods:
 * ------------------------
 * - start()         : Starts a thread (calls run() internally)
 * - run()           : Contains the code executed by the thread
 * - sleep(ms)       : Pauses the thread for a specified number of milliseconds
 * - join()          : Waits for another thread to finish before continuing
 * - yield()         : Suggests to the thread scheduler that it can switch to another thread
 * - interrupt()     : Signals a thread to stop waiting/sleeping (can throw InterruptedException)
 * - currentThread() : Static method returning the thread currently executing this code; useful for logging, debugging, or thread-specific behavior
 * - getName()       : Returns the name of the thread (useful for identification)
 * - setName(name)   : Sets a custom name for the thread
 * - getPriority()   : Returns the thread's priority (1 to 10)
 * - setPriority(p)  : Sets the thread's priority (1 = MIN, 5 = NORM, 10 = MAX)
 * - isAlive()       : Checks if the thread is still running
 * - isDaemon()      : Checks if the thread is a daemon thread (background thread)
 * - setDaemon(true) : Marks a thread as a daemon (will stop when all user threads finish)

 * 
 * Where and How Threads are Defined:
 * ----------------------------------
 * - Thread is a top-level class in java.lang.Thread.
 * - You can create your own threads in several ways:
 *   1. Top-level class       : A separate class file extending Thread or implementing Runnable.
 *   2. Static nested class   : A static class inside another class.
 *   3. Inner class           : A non-static class inside another class.
 *   4. Local class           : A class defined inside a method (one-time use).
 *   5. Anonymous class       : Inline, quick thread definition without a class name.
 * - Choice depends on scope, reusability, and convenience.
 * 
 * Thread Safety and Synchronization:
 * ---------------------------------
 * - Threads share memory, so simultaneous access can cause issues (race conditions)
 * - Use synchronized blocks or methods to prevent inconsistent states
 * - Locks, volatile, and concurrent utilities help manage thread safety
 * 
 * Threads vs Timer/TimerTask:
 * ---------------------------
 * - Timer/TimerTask is a **scheduler utility** built on top of threads.
 * - TimerTask defines a task to execute; Timer manages its timing internally.
 * - Threads give **full control** over execution, while Timer handles scheduling automatically.
 * - You can run multiple TimerTasks using a single Timer (Timer uses a background thread internally).
 * - If you need precise periodic execution, use Timer.scheduleAtFixedRate() instead of manually looping in a thread.
 * - Threads and TimerTasks can be used together; a TimerTask can start its own threads for complex operations.
 * 
 * Summary:
 * --------
 * - Threads allow multitasking within a program.
 * - Use Runnable for flexibility and better design.
 * - Always handle exceptions inside threads.
 * - Be mindful of thread safety when accessing shared resources.
 */

import java.util.Scanner;

/*
 * threading.java
 *
 * This is the main program and represents the **main thread**.
 * 
 * Key Concepts:
 * -------------
 * - In Java, the main method itself runs in a **main thread** automatically.
 * - We can create additional threads to perform tasks concurrently.
 * - Here, we create a separate thread that counts down from 5 seconds
 *   while the main thread waits for user input.
 */
public class threading {
    public static void main(String[] args) {
        // Scanner object to read user input from console
        Scanner scn = new Scanner(System.in);

        // Create an instance of MyRunnable (task that will run in another thread)
        MyRunnable runCountDown = new MyRunnable();

        // Create a Thread object and pass the Runnable task
        Thread thread = new Thread(runCountDown); // Thread constructor accepts Runnable
        /*
         * Thread.setDaemon(true)
         * When the main thread finishes, all daemon threads are terminated
         * automatically.
         * This is useful for background tasks that should not prevent the program from
         * exiting.
         * here we set the countdown thread as a daemon so it won't block program exit.
         */
        thread.setDaemon(true); // Set the countdown thread as a daemon thread
        // Start the new thread
        thread.start(); // This executes run() in MyRunnable concurrently
        
        System.out.println(thread.isDaemon()); // true
        
        // Main thread continues independently while the countdown runs
        System.out.println("You have 5 seconds to enter your name");

        System.out.print("Enter your name: ");
        String userName = scn.nextLine().toUpperCase().trim();

        System.out.println("Hello " + userName);

        // Close the Scanner to release system resources
        scn.close();
    }
}
