package DAY41_82825;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/*
 * alarmClock.java
 * ----------------
 * Final project for Bro Code's Java course (2025) combining multiple learned concepts:
 * - User input
 * - Parsing strings into LocalTime
 * - Threading (alarm runs in a separate thread)
 * - Audio playback
 *
 * Key Concepts:
 * -------------
 * 1. LocalTime:
 *    - Represents a time without date (HH:mm:ss)
 *    - Used to store and compare the alarm time
 *    - Works with DateTimeFormatter to parse strings into time objects
 *
 * 2. Scanner:
 *    - Reads user input from console
 *    - Can be used in try-with-resources to ensure it closes automatically
 *
 * 3. Threading:
 *    - The alarm runs on its own thread (via Runnable interface)
 *    - Main thread continues executing while alarm thread waits for the set time
 *
 * 4. Exception Handling:
 *    - DateTimeParseException: triggered if the user input cannot be parsed
 *    - Generic Exception: catch-all for other unexpected issues
 *
 * Flow:
 * -----
 * - Prompt user to input alarm time (HH mm ss)
 * - Loop until valid input is provided
 * - Create an AClock object and start it on a separate thread
 */
public class alarmClock {
    public static void main(String[] args) {
        // Formatter for parsing HH:mm:ss strings
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        Scanner scn = new Scanner(System.in);
        String filePath = "src\\DAY41_82825\\mango.wav"; // path to alarm audio

        // Loop until user enters valid time
        while (alarmTime == null) {
            try {
                System.out.println(LocalTime.now()); // show current time
                System.out.print("Set the alarm (HH mm ss): ");
                String inputTime = scn.nextLine();

                // Parse input string to LocalTime using formatter
                alarmTime = LocalTime.parse(inputTime, dtf);

                System.out.println("Alarm set for: " + alarmTime);

            } catch (DateTimeParseException e) {
                System.out.println("Invalid time format. Please use HH mm ss (24-hour format).");
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }

        // Create the alarm Runnable and start it on a new thread
        AClock alarm = new AClock(alarmTime, filePath, scn);
        Thread alarmThread = new Thread(alarm);
        alarmThread.start();
        System.out.println(alarmThread.isAlive()); // check if thread started
    }
}
