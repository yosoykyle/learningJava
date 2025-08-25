package DAY36_82325.oop27th;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

/*
 * countDownTimer.java
 * 
 * Practice program to get familiar with:
 * - Using Timer and TimerTask classes
 * - Scheduling recurring tasks
 * - Handling user input with Scanner
 * 
 * Program behavior:
 * - Prompts the user for a countdown time (in seconds)
 * - Prints numbers counting down each second
 * - Displays "Time's up!" when finished
 */
public class countDownTimer {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int response = validRespons(scn);

            Timer timer = new Timer();
            TimerTask timerTask = new TimerTask() {
                int count = response; // start value from user input

                @Override
                public void run() {
                    System.out.print(count + " ");
                    count--;

                    if (count < 0) {
                        System.out.println("\nTime's up!");
                        timer.cancel(); // stop the timer once finished
                    }
                }
            };

            // Option 1: schedule()
            // - Runs tasks with a fixed delay measured AFTER the previous task finishes
            // - Can "drift" if tasks take longer than expected
            // - Not ideal for precise countdowns
            // timer.schedule(timerTask, 0, 1000);

            // Option 2: scheduleAtFixedRate()
            // - Runs tasks at fixed intervals based on scheduled start times
            // - Maintains more consistent timing (better for countdowns and clocks)
            timer.scheduleAtFixedRate(timerTask, 0, 1000);
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    /*
     * Prompts the user for a positive integer (seconds).
     * Keeps asking until a valid number is entered.
     */
    static int validRespons(Scanner scn) {
        while (true) {
            System.out.print("Enter # of seconds to countdown from: ");

            if (scn.hasNextInt()) {
                int value = scn.nextInt();
                scn.nextLine(); // consume leftover newline
                if (value > 0) {
                    return value; // valid input
                } else {
                    System.out.println("Invalid Response (must be > 0)");
                }
            } else {
                System.out.println("Invalid Response (not a number)");
                scn.next(); // clear invalid token
            }
        }
    }
}
