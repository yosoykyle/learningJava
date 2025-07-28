package DAY5_72225;

/*
 * StringMethods.java
 * This class demonstrates various string manipulation methods in Java.
 * Useful for understanding how to work with strings effectively.
 *
 * Methods demonstrated:
 * - length()
 * - charAt(int)
 * - indexOf(char/String)
 * - lastIndexOf(char/String)
 * - toLowerCase()
 * - toUpperCase()
 * - isLowerCase(.charAt(int))
 * - isUpperCase(.charAt(int))
 * - trim()
 * - replace(char, char) / replace(CharSequence, CharSequence) can be used to remove spaces or replace characters
 * - startsWith(String)
 * - endsWith(String)
 * - isEmpty()
 * - repeat(int)
 * - contains(CharSequence)
 * - equals(Object)
 * - equalsIgnoreCase(String)
 */
public class StringMethods {
    public static void main(String[] args) {
        String name = "  Kyle Baluyot  ";

        /*
         * If you need to find the length of a string,
         * you can use the length() method.
         * .length() returns the number of characters in the string
         * and is stored in an int variable.
         * It does not count spaces as characters.
         */
        int length = name.length();
        System.out.println("Length of the name: " + length);

        /*
         * Use charAt(index) to get a character at a specific index.
         * The index starts at 0, so charAt(0) returns the first character.
         */
        char firstChar = name.charAt(0);
        System.out.printf("First character of the name: %s is '%c'%n", name, firstChar);

        /*
         * Use indexOf(char) to find the position of a character in the string.
         * If the character is not found, it returns -1.
         * this will find the first occurrence of the character.
         * If you want to find the last occurrence, use lastIndexOf(char).
         * Both can also find spaces and other characters.
         */
        int index = name.indexOf('y');
        System.out.printf("Index of 'y' in the name: %d%n", index);
        int lastIndex = name.lastIndexOf('y');
        System.out.printf("Last index of 'y' in the name: %d%n", lastIndex);

        /*
         * If you need to make the string lowercase, use toLowerCase().
         * If you need to make it uppercase, use toUpperCase().
         * These ensure that the string is in the desired case.
         * * note that these methods do not change the original string,
         * they return a new string with the changes applied.
         * Useful for formatting output or for comparisons.
         */
        String lower = name.toLowerCase();
        String upper = name.toUpperCase();
        System.out.printf("Lowercase name: %s%n", lower);
        System.out.printf("Uppercase name: %s%n", upper);

        /*
         * If you need to check if a character is uppercase, use
         * Character.isUpperCase().
         * If you need to check if a character is lowercase, use
         * Character.isLowerCase().
         * These methods return a boolean indicating the case of the character.
         * Useful for validating input (like names) or applying specific logic based on
         * case.
         * 
         * Note: These methods work on characters, not full strings.
         * To apply them to a string, use string.charAt(index) to access a specific
         * character.
         */
        if (name.isEmpty()) {
            System.out.println("You entered an empty string.");
        } else if (Character.isUpperCase(name.charAt(0))) {
            System.out.println("The first letter is uppercase.");
        } else if (Character.isLowerCase(name.charAt(0))) {
            System.out.println("The first letter is lowercase.");
        } else {
            System.out.println("The first character is not a letter.");
        }

        /*
         * When you need to trim whitespace from the beginning and end of a string,
         * use the trim() method.
         * This ensures that any leading or trailing spaces are removed.
         * It does not affect spaces between words.
         * Useful for cleaning up user input or formatting strings.
         */
        String trimmed = name.trim();
        System.out.printf("Trimmed name: '%s'%n", trimmed);

        /*
         * If you want to replace characters in a string,
         * use the replace(oldChar, newChar) method. Any occurrence of oldChar
         * will be replaced with newChar.
         * This creates a new string with the specified replacements.
         */
        String replaced = name.replace('K', 'J');
        System.out.printf("Replaced name: %s%n", replaced);

        // Prefix is
        /*
         * To check if a string starts with a specific prefix,
         * use startsWith(prefix). It returns true if the string begins with the
         * specified prefix.
         * This is useful for validating input or checking
         * if a string matches a certain pattern.
         * 
         * * Note that startsWith is case-sensitive,
         * so "Kyle" and "kyle" would yield different results.
         * 
         * Use cases include validating usernames, file paths, or any string that should
         * start with a specific sequence of characters.
         */
        boolean startsWith = name.startsWith("  Kyle");
        System.out.printf("Does the name start with '  Kyle'?: %b%n", startsWith);

        /*
         * To check if a string ends with a specific suffix,
         * use endsWith(suffix). It returns true if the string ends with the specified
         * suffix.
         * This is useful for validating file extensions, URLs, or any string that
         * should
         * end with a certain sequence of characters.
         */
        boolean endsWith = name.endsWith("e"); // it uses "" and not '' because it is a string
        System.out.printf("Does the name end with 'e'?: %b%n", endsWith);

        /*
         * To check if a string is empty,
         * use isEmpty(). It returns true if the string has no characters.
         */
        boolean isEmpty = name.isEmpty();
        System.out.printf("Is the name empty?: %b%n", isEmpty);

        /*
         * Use repeat(int) to create a new string that repeats the original string
         * a specified number of times.
         * Use cases include creating visual separators, formatting output,
         * or generating repeated content in a string.
         */
        String repeated = "=".repeat(10);
        System.out.printf("Repeated dash: %s%n", repeated);

        /*
         * To check if the string contains a specific sequence of characters,
         * use contains(CharSequence). It returns true if the string contains
         * the specified sequence.
         * This is useful for validating input, searching for keywords,
         * or checking if a string includes certain content.
         */
        boolean contains = name.contains(" ");
        System.out.printf("Does the name contain ' '?: %b%n", contains);

        /*
         * If you need to check if two strings are equal,
         * use equals(Object) for case-sensitive comparison.
         * Use equalsIgnoreCase(String) for case-insensitive comparison.
         * This is useful for validating user input, comparing strings,
         * or checking if two strings are identical.
         */
        System.out.printf("name: '%s'%n", name);
        boolean equals = name.equals("  yle Baluyot  ");
        System.out.printf("Is the name equal to '  yle Baluyot  '?: %b%n", equals);
        boolean equalsIgnoreCase = name.equalsIgnoreCase("  kyle baluyot  ");
        System.out.printf("Is the name equal to '  kyle baluyot  '?: %b%n", equalsIgnoreCase);
    }
}
