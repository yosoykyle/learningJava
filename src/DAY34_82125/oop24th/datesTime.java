package DAY34_82125.oop24th;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
 * datesTime.java
 * 
 * Introduction to working with Dates and Time in Java.
 * Demonstrates:
 * - LocalDate       : date only
 * - LocalTime       : time only
 * - LocalDateTime   : date + time
 * - Instant         : UTC timestamp
 * 
 * Notes:
 * - LocalDate/LocalTime/LocalDateTime are used for local date/time operations.
 * - Instant is for precise UTC timestamps (timezone-independent).
 * - DateTimeFormatter customizes output format.
*/
public class datesTime {
    public static void main(String[] args) {

        /*
         * ---- Optional current date/time examples ----
         * Uncomment to see current date, time, and UTC timestamp
        */
        /*
        // LocalDate: current date
        LocalDate today = LocalDate.now();
        System.out.println("Current LocalDate: " + today);

        // LocalTime: current time in 12-hour format
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("Current LocalTime: " + currentTime.format(timeFormatter));

        // LocalDateTime: current date and time
        LocalDateTime nowDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
        System.out.println("Current LocalDateTime: " + nowDateTime.format(dateTimeFormatter));

        // Instant: UTC timestamp
        Instant instantNow = Instant.now();
        System.out.println("UTC Timestamp: " + instantNow);
        */

        /*
         * ---- Creating custom dates and times ----
         * Instead of .now(), we can specify exact values
        */
        // LocalDate
        LocalDate customDate = LocalDate.of(2005, 2, 9);
        System.out.println("Custom LocalDate: " + customDate);

        // LocalDateTime
        LocalDateTime customDateTime1 = LocalDateTime.of(2026, 8, 4, 10, 32, 15);
        System.out.println("Custom LocalDateTime 1: " + customDateTime1);

        LocalDateTime customDateTime2 = LocalDateTime.of(2025, 8, 4, 10, 32, 15);
        System.out.println("Custom LocalDateTime 2: " + customDateTime2);

        /*
         * ---- Comparing LocalDateTime ----
         * Demonstrates .isBefore(), .isAfter(), and .isEqual()
        */
        if (customDateTime1.isBefore(customDateTime2)) {
            System.out.println(customDateTime1 + " is before " + customDateTime2);
        } else if (customDateTime1.isAfter(customDateTime2)) {
            System.out.println(customDateTime1 + " is after " + customDateTime2);
        } else if (customDateTime1.isEqual(customDateTime2)) {
            System.out.println(customDateTime1 + " is equal to " + customDateTime2);
        }
    }
}
