package DAY41_82825;

import java.time.LocalTime;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.util.Scanner;

/*
 * AClock.java
 * ----------------
 * Handles the actual alarm functionality in a separate thread.
 *
 * Key Concepts:
 * -------------
 * 1. Runnable Interface:
 *    - Implemented to define a task for a thread
 *    - run() method contains the task code
 *
 * 2. Thread.sleep():
 *    - Pauses the thread for 1 second between time checks
 *    - Can throw InterruptedException if the thread is interrupted
 *
 * 3. LocalTime Comparison:
 *    - Checks continuously if current time is before alarm time
 *    - Once current time >= alarm time, alarm sounds
 *
 * 4. Audio Playback:
 *    - Uses javax.sound.sampled API
 *    - Opens and plays a .wav file
 *    - User can stop the alarm by pressing Enter
 *
 * 5. Exception Handling:
 *    - Handles file not found, unsupported audio, line unavailable, I/O exceptions
 *
 * 6. Threading Notes:
 *    - Main thread is independent; alarm runs concurrently
 *    - Scanner passed to avoid creating multiple Scanner objects on System.in
 */
public class AClock implements Runnable {
    private final LocalTime alarmTime;
    private String filePath = null;
    private final Scanner scn;

    // Constructor assigns alarm time, audio file, and shared scanner
    AClock(LocalTime alarmTime, String filePath, Scanner scn) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scn = scn;
    }

    @Override
    public void run() {
        // Wait until alarm time
        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000); // pause 1 second between checks
                LocalTime now = LocalTime.now();

                // Display current time with leading zeros
                // \r moves cursor to start of line to overwrite previous print
                System.out.printf("\rCurrent time: %02d:%02d:%02d",
                        now.getHour(),
                        now.getMinute(),
                        now.getSecond());
            } catch (InterruptedException e) {
                System.out.println("Alarm interrupted: " + e.getMessage());
            }
        }
        System.out.println("\nAlarm ringing! Wake up!");
        alarmSound();
    }

    // Plays the alarm audio file
    private void alarmSound() {
        File audioFile = new File(filePath); // ensure the file exists
        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.println("Press Enter to stop the alarm...");
            scn.nextLine(); // waits for user input
            clip.stop();
            scn.close(); // closes scanner after stopping alarm
        } catch (LineUnavailableException e) {
            System.out.println("Error: Unable to access audio playback resources.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: Audio file not found.");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Error: Unsupported audio format. Use .wav, .au, or .aiff");
        } catch (IOException e) {
            System.out.println("I/O Error occurred while handling the audio file.");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
