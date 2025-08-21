package DAY33_82025.oop22nd.player;

import java.io.File; // The File class is needed to create a file object that points to a file or directory path.
import java.io.FileNotFoundException; 
// What is java.io.File?
// java.io.File is an abstraction of a file or directory path in the filesystem. 
// It does not handle the actual file content (no reading/writing).
// Instead, it is used to inspect, create, delete, and manipulate file or directory metadata. 
// Think of it as a pointer or handle to a file or folder, *not* the content itself.
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/*
 * playMusic.java
 * 
 * Demonstrates how to PLAY AUDIO with Java. 
 * This approach only supports specific formats: (.wav, .au, .aiff)
 * 
 * Why is .mp3 not supported?  
 * - The javax.sound.sampled API doesn’t provide built-in MP3 support.  
 * - To play MP3s, you must use external libraries such as JLayer, JavaFX Media, etc.
 * 
 * Quick solution: convert .mp3 files into supported formats.
 * Example converter: https://cloudconvert.com/mp3-to-wav
 */
public class playMusic {
    public static void main(String[] args) {
        // You can provide either an absolute path or a relative path.
        String musicPath = "src\\DAY33_92025\\oop22nd\\Music\\Nokia If I Could.wav";
        
        /*
         * File object
         * - Represents the pathname of the audio file.
         * - Does NOT load the audio itself.
         * - We pass musicPath into this File so it can be used by the AudioSystem.
         */
        File file = new File(musicPath);

        /*
         * try-with-resources
         * - This works only for objects that implement AutoCloseable.
         * - Each declared resource is separated by a semicolon `;`.
         * - Both AudioInputStream and Scanner implement AutoCloseable, 
         *   so they will be automatically closed when the try block ends.
         */
        try (
                // AudioInputStream object: streams audio data from the file
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                // Scanner object: reads user input from the console
                Scanner scn = new Scanner(System.in)) {

            // Clip object = like a small music player
            // - Responsible for playing, stopping, and resetting audio
            // - Provides playback controls
            // - Note: Clip itself is NOT AutoCloseable, so we manage it manually.
            Clip clip = AudioSystem.getClip();

            // Load the audio stream into the clip (prepare it for playback)
            clip.open(audioStream);

            // Start playing
            /*
             * Issue: The program starts the audio but does not wait until it finishes.
             * Why? Because the main thread continues execution.
             * 
             * One solution: Thread.sleep(clip.getMicrosecondLength() / 1000);
             *   (must handle InterruptedException if used)
             * Another solution (used here): keep the program alive 
             *   by prompting the user to control playback.
             * 
             * Controls implemented:
             * - (P)lay
             * - (S)top
             * - (R)eset (restarts track from beginning)
             * - (Q)uit (closes the clip and exits loop)
             * 
             * Audio continues until user explicitly chooses Stop or Quit.
             */
            String response = "";
            while (!response.equals("Q")) {
                System.out.println("""              
                    - (P)lay
                    - (S)top
                    - (R)eset
                    - (Q)uit """);
                response = validResponse(scn, response);
                System.out.println("Validated: " + response);

                switch (response) {
                    case "P" -> {
                        System.out.println("Now Playing: Nokia If I Could.wav");
                        clip.start();
                    }
                    case "S" -> {
                        System.out.println("Playback Stopped");
                        clip.stop();
                    }
                    case "R" -> {
                        System.out.println("Track...");
                        clip.setMicrosecondPosition(0);
                        response = "P"; // Automatically play after reset
                    } 
                    // Important: Clip does not auto-close, so we explicitly close it when quitting.
                    case "Q" -> {
                        clip.close();
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: Audio file not found.");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Error: Unsupported audio format. Use .wav, .au, or .aiff");
        } catch (IOException e) {
            System.out.println("I/O Error occurred while handling the audio file.");
        } catch (LineUnavailableException e) {
            System.out.println("Error: Unable to access audio playback resources.");
        } finally {
            // finally block always runs whether an exception occurs or not
            System.out.println("BYE!");
        }

    }

    /*
     * validResponse()
     * - Ensures the user only enters valid input (P, S, R, or Q).
     * - Converts input to uppercase for case-insensitive matching.
     * - Rejects non-letter input.
     * - Keeps prompting until a valid choice is made.
     */
    static String validResponse(Scanner scn, String response) {
        while (true) {
            System.out.print("Enter your choice: ");
            if (scn.hasNextLine()) {
                response = scn.next().toUpperCase();
                char toCharResponse = response.charAt(0);
                
                // Character wrapper class check: ensures only alphabetic input is accepted
                if (!Character.isLetter(toCharResponse)) {
                    System.out.println("Letters Only!");
                } 
                
                // Switch expression with multiple labels
                switch (toCharResponse) {
                    case 'P', 'S', 'R', 'Q' -> {
                        return response;
                    }
                    default -> {
                        System.out.println("Options: ['P', 'S', 'R', 'Q']");
                    }
                }
            }
        }
    }
}
