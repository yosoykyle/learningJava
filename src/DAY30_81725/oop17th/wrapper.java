package DAY30_81725.oop17th;
/*
 * wrapper.java
 *
 * Wrappers in Java allow primitive values (int, double, char, boolean, etc.)
 * to be treated as objects. This is useful because Java’s Collections and
 * many APIs only work with objects, not raw primitives.
 *
 * Example:
 *   int num = 5;                // primitive
 *   Integer wrappedNum = 5;     // wrapper object (autoboxing)
 *
 * Why wrappers matter:
 * --------------------
 * 1. Collections Framework: ArrayList, HashMap, etc. only store objects.
 *    Wrappers allow primitives to be stored.
 * 2. Utility Methods: Wrappers provide static helpers (e.g., Integer.parseInt()).
 * 3. Constants: e.g., Integer.MAX_VALUE, Double.MIN_VALUE.
 *
 * Nullability:
 * ------------
 * - Wrappers can be null, primitives cannot.
 * - Risk: unboxing a null wrapper throws NullPointerException (NPE).
 *
 * Example:
 *   Integer maybeNull = null;
 *   int value = maybeNull;   // NPE at runtime
 *
 * To prevent this, always check for null before unboxing.
 *
 * Wrapping vs Autoboxing:
 * -----------------------
 * - Pre-Java 5 (manual wrapping):
 *     Integer num = new Integer(5);   // Deprecated since Java 9
 *     int val = num.intValue();       // Manual unwrapping
 *
 * - Java 5+ (autoboxing/autounboxing):
 *     Integer num = 5;   // autoboxing
 *     int val = num;     // auto-unboxing
 *
 * Deprecation:
 * ------------
 * - Wrapper constructors (e.g., new Integer(5)) are deprecated.
 * - Prefer autoboxing or factory methods like Integer.valueOf(5).
 *
 * Why autoboxing is better:
 * --------------------------
 * - Cleaner and more readable.
 * - May reuse cached objects instead of always creating new ones.
 * - Removes boilerplate like .intValue().
 *
 */

public class wrapper {
    public static void main(String[] args) {
        // Old (deprecated) way: explicitly creating wrapper objects
            // Integer a = new Integer(123);
            // Double b = new Double(3.14);
            // Character c = new Character('$');
            // Boolean d = new Boolean(false);

        // Modern way: autoboxing (preferred)
        // Automatically converts primitives into wrapper objects
            // Integer e = 456;
            // Double f = 4.14;
            // Character g = '#';
            // Boolean h = true;
            // Note: Strings are also objects
            // String i = "Grr";
        // Reminder: wrappers and Strings can be null

        // Unboxing: automatically converts wrappers back to primitives
            // int j = e;
            // double k = f;
            // char l = g;
            // boolean m = h;
            // Watch out: if wrapper is null → NullPointerException

        // ============================
        // Example: Wrapper Utility Methods
        // ============================

        // Converting primitives into Strings
        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('@');
        String d = Boolean.toString(false);

        // Concatenating Strings
        String concat = a + b + c + d;
        System.out.println(concat);

        // Converting Strings back into primitives
        int e = Integer.parseInt(a);
        double f = Double.parseDouble(b);
        char g = c.charAt(0);            // char has no parse method
        boolean h = Boolean.parseBoolean(d);

        // Invalid concatenation with mixed primitives → won’t compile
        // String concats = e + f + g + h;

        // ============================
        // Character Utility Methods
        // ============================

        char letter = 'a';

        // Check if character is a letter
        System.out.println(Character.isLetter(letter));   // true

        // Check if character is uppercase
        System.out.println(Character.isUpperCase(letter)); // false
    }
}
