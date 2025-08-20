package DAY32_81925.oop20th;

import java.io.FileWriter; // Needed for FileWriter (used for writing character/text data to files)
import java.io.IOException; // General input/output exception class
import java.io.FileNotFoundException; // More specific exception for missing/invalid file paths

/*
 * writeFile.java
 * 
 * Purpose:
 * Demonstrates how to write data into a file using Java.
 * 
 * Popular file-writing options in Java (and when to use them):
 * - FileWriter      = Best for writing small or medium-sized text files (plain text).
 * - BufferedWriter  = Better for performance when writing large amounts of text
 *                     because it reduces disk I/O operations by buffering output.
 * - PrintWriter     = Best for structured or formatted data (like reports, logs, CSV, etc.).
 * - FileOutputStream= Best for binary files (e.g., images, audio files, PDFs).
 * 
 * Key point: All these classes can throw checked exceptions, so you must handle them
 * either with try-catch blocks or by declaring 'throws' in your method signature.
 */

public class writeFile {
    public static void main(String[] args) {
        // FileWriter example

        // Define the absolute path where the file will be created/written.
        // Using absolute paths requires careful escaping of backslashes (\\).
        // Example: "C:\\Users\\HUAWEI\\Documents\\Notepad\\writerfile.txt"
        String path = "C:\\Users\\HUAWEI\\Documents\\Notepad\\writerfile.txt";

        // Define the content that we want to write into the file.
        // For multiline strings, you can use Java's text blocks with triple quotes (""")
        String fileContent = "Hello FileWriter"; 

        // Use try-with-resources so the FileWriter is automatically closed after use.
        // This avoids resource leaks (open file handles) even if an exception occurs.
        try (FileWriter writeFiles = new FileWriter(path)) {
            // FileWriter.write() writes the given string into the file.
            writeFiles.write(fileContent);
            System.out.println("File written successfully using FileWriter.");
        } 
        // Best practice: catch the most specific exceptions first.

        // FileNotFoundException is a subclass of IOException.
        // It occurs when the file path is invalid, the parent directory does not exist,
        // or when the program does not have permission to create/write the file.
        catch (FileNotFoundException e) {
            System.out.println("Path not found or cannot create file: " + e.getMessage());
        } 
        // IOException is the general case for input-output errors.
        // It can occur if the disk is full, the file is locked, or any other I/O failure.
        catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
 