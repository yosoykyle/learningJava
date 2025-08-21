package DAY33_82025.oop21st;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

/*
 * readFiles.java
 * 
 * How to read a file using Java (3 popular options)
 * 
 * 1. BufferedReader + FileReader
 *    - Best for reading text files line-by-line.
 *    - BufferedReader cannot work on its own; it acts as a "middle man"
 *      between the program and the file system.
 *    - FileReader actually reads the file from disk.
 *    - Combined, they allow efficient line-by-line reading.
 * 
 * 2. FileInputStream
 *    - Best for binary files (e.g., images, audio, videos).
 * 
 * 3. RandomAccessFile
 *    - Best when you need to read/write specific portions of a large file.
 *    - Useful if you need direct access instead of sequential reading.
 * 
 * This file demonstrates both:
 * - Writing to a file (FileWriter)
 * - Reading from a file (BufferedReader + FileReader)
 */
public class readFiles {
    public static void main(String[] args) {
        // LOCAL VARIABLES FOR FileWriter
        String path = "C:\\Users\\HUAWEI\\Documents\\Notepad\\Lament.txt";

        // Multi-line string content to write into file
        String fileContent = """
                Lament

                You dare surrender to parting,
                yet my essence still sends a tremor through you.

                How shall I eclipse this lament
                from your sudden retreat?

                Tell me,
                where will you find your anchor?
                Are you whole without my Riverbed?

                Why do your actions betray you,
                when the only thing that made you, is me.
                """;

        // LOCAL VARIABLES FOR BufferedReader + FileReader
        String readerPath = "C:\\Users\\HUAWEI\\Documents\\Notepad\\Lament.txt";

        /*
         * Outer try-catch block delegates all checked exceptions
         * from the two inner try-with-resources blocks.
         * 
         * Why structure it this way?
         * - Each try-with-resources handles its own resource lifecycle (auto-closing).
         * - A single catch section at the outer level handles exceptions for both.
         */
        try {
            /*
             * WRITING FILE
             * 
             * Concept:
             * - Using FileWriter to create or overwrite a text file.
             * - By default: new FileWriter(path) overwrites an existing file.
             *   Steps when executed multiple times:
             *     1. Opens the file
             *     2. Truncates (clears) old contents
             *     3. Writes new content
             * 
             * If you want to append instead of overwrite:
             * - Use: new FileWriter(path, true)
             *   → This adds new content at the end of the file.
             */
            try (FileWriter writeFile = new FileWriter(path)) {
                writeFile.write(fileContent);
                System.out.println("File written successfully!");
            }

            /*
             * READING FILE
             * 
             * Why BufferedReader + FileReader?
             * - FileReader reads raw characters from the file.
             * - BufferedReader adds efficiency by buffering and allows line-by-line reading.
             * - Together, they make reading text files easier and faster.
             */
            try (BufferedReader buffRead = new BufferedReader(new FileReader(readerPath))) {
                System.out.println("Reading from: " + readerPath + "\n");

                // LOCAL VARIABLE to hold one line at a time
                String line;

                /*
                 * While-loop: reads file line by line.
                 * Condition: (line = buffRead.readLine()) != null
                 * - readLine() returns:
                 *     → A String (the line read) if available
                 *     → null when the end of file is reached
                 * 
                 * Important note:
                 * - Each cycle overwrites the variable "line"
                 *   with the new line just read.
                 * - If you want to preserve all lines,
                 *   you must store them (e.g., in a List).
                 */
                while ((line = buffRead.readLine()) != null) {
                    System.out.println(line); // Print each line
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Path not found or cannot create file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred while writing/reading the file: " + e.getMessage());
        } catch (SecurityException e) {
            System.out.println("Access denied: " + e.getMessage());
        }
    }
}
