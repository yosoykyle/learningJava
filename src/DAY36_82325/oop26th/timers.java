package DAY36_82325.oop26th;

import java.util.Timer;
import java.util.TimerTask;

/*
 * timers.java
 *
 * This program demonstrates the use of Java's Timer and TimerTask classes
 * to execute a task repeatedly at a fixed interval.
 *
 * Classes:
 * --------
 * Timer (java.util.Timer)
 *   - Responsible for scheduling tasks for future execution, either once or periodically.
 *   - Can schedule tasks to run:
 *     - after a specific delay
 *     - repeatedly at fixed intervals
 *
 *   Common methods you should know:
 *   -------------------------------
 *   1. schedule(TimerTask task, long delay)
 *      - Schedules a task to run once after the specified delay (in milliseconds)
 *   2. schedule(TimerTask task, long delay, long period)
 *      - Schedules a task to run repeatedly:
 *        first after delay, then every period milliseconds
 *   3. scheduleAtFixedRate(TimerTask task, long delay, long period)
 *      - Similar to schedule(), but ensures fixed-rate execution (helps maintain consistent timing)
 *   4. cancel()
 *      - Terminates the Timer, discarding any scheduled tasks
 *   5. purge()
 *      - Removes all cancelled tasks from the Timer's task queue (optional cleanup)
 *
 * TimerTask (java.util.TimerTask)
 *   - Represents the task that will be executed by a Timer.
 *   - To define the task, you create a subclass of TimerTask and override the run() method.
 *   - Often done using anonymous classes for quick, inline tasks.
 *
 *   Common methods you should know:
 *   -------------------------------
 *   1. run()
 *      - The method that contains the task logic; executed by the Timer
 *   2. cancel()
 *      - Cancels the execution of this TimerTask
 *   3. scheduledExecutionTime()
 *      - Returns the scheduled execution time of the most recent run (useful for logging or debugging)
 *
 * Typical use cases:
 * ------------------
 * - Sending notifications or reminders (e.g., daily emails)
 * - Refreshing caches or temporary data
 * - Periodic system maintenance or cleanups
 * - Scheduled updates in games or apps
 * - Automated logging or metrics collection
 *
 * Analogy:
 * --------
 * Think of Timer as a "manager" or "scheduler" and TimerTask as the "job" or "work"
 * the manager assigns. The Timer decides *when* the task runs, while TimerTask
 * defines *what* happens when it runs.
 */

public class timers {
    public static void main(String[] args) {
        // Create a Timer object
        // This acts as the scheduler for tasks
        Timer timer = new Timer();

        // Create a TimerTask object using an anonymous class
        // The run() method defines the task's behavior
        TimerTask task = new TimerTask() {
            int counter = 3; // counter to limit how many times the task executes

            @Override
            public void run() {
                // The code here executes every time the Timer triggers this task
                System.out.println("hello");
                
                // Decrease counter each time the task runs
                counter--;

                /*
                 * Rule of thumb for stopping repeated tasks:
                 * - Use <= 0 to safely stop the task, even if the counter
                 *   is accidentally decremented past 0
                 * - Using == 0 works only if you are sure the value hits exactly 0
                 */
                if (counter <= 0) {
                    System.out.println("task complete");

                    // Stop the timer to prevent further executions
                    timer.cancel();
                }
            }
        };

        // Schedule the task with the timer
        // Parameters: task, delay before first execution (ms), period between executions (ms)
        // Here: 0 delay → starts immediately
        //       1000 ms period → repeats every 1 second
        timer.schedule(task, 0, 1000);
    }
}
