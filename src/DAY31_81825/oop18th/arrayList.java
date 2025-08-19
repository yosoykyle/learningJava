package DAY31_81825.oop18th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * arrayList.java
 * -------------------------
 * This program demonstrates the use of the Java ArrayList class.
 *
 * ❖ What is an ArrayList?
 *   - ArrayList is a resizable (dynamic) array that stores objects.
 *   - Unlike normal arrays which have fixed size, ArrayList can grow or shrink dynamically.
 *   - When storing primitives (int, double, char, etc.), Java automatically converts them
 *     to their wrapper classes (Integer, Double, Character, etc.) through autoboxing.
 *
 * ❖ Why use ArrayList?
 *   - Flexible in size (unlike fixed arrays).
 *   - Built-in methods for adding, removing, sorting, and accessing elements.
 *   - Often used when the number of items is unknown in advance, or when frequent insert/remove operations are needed.
 *
 * ❖ Why ArrayList stores objects (not primitives)?
 *   - Collections framework in Java is designed to work with objects.
 *   - For primitives, wrapper classes (Integer, Double, etc.) are used automatically by autoboxing.
 *
 * ❖ Caution when using ArrayList:
 *   - Accessing invalid indexes will cause IndexOutOfBoundsException.
 *   - Performance is slower than plain arrays when used in performance-critical code,
 *     because ArrayList operations (resize, shift) take extra work.
 *   - Thread-safety: ArrayList is not synchronized. Use CopyOnWriteArrayList or Collections.synchronizedList if needed.
 *
 * ❖ Ways to initialize an ArrayList:
 *   ArrayList<Type> list = new ArrayList<>();
 *   ArrayList<Type> list = new ArrayList<>(initialCapacity);
 *   List<Type> list = Arrays.asList(...);   // fixed-size list
 *
 * ❖ Does ArrayList have index?
 *   - Yes, like arrays, elements are indexed (starting from 0).
 *   - Elements can be accessed and modified using index positions.
 *
 * ❖ Where used in production?
 *   - Typically used in service layers, controllers, or utility classes where dynamic collections are required.
 *   - Very common in CRUD applications, inventory systems, shopping carts, etc.
 *
 * ❖ This program demonstrates:
 *   - Adding, removing, updating, and retrieving elements.
 *   - Sorting using Collections and Comparator.
 *   - Iterating using enhanced for-loop and regular for-loop.
 */

public interface arrayList {   // Note: It's better to use "class" instead of "interface" for demo
    public static void main(String[] args) {
        
        // Example: Storing primitives → must use wrapper class.
        // Autoboxing allows you to write list.add(3), but internally stores Integer object.
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(3);
        // list.add(2);
        // list.add(1);

        // Example: Storing Strings in an ArrayList
        ArrayList<String> listOfFruits = new ArrayList<>();

        /*
         * add(element)
         * -------------------------
         * Syntax: list.add(E element)
         * Adds an element at the end of the ArrayList.
         * Automatically resizes the list if capacity is full.
         */
        listOfFruits.add("Straberry");
        listOfFruits.add("Blueberry");
        listOfFruits.add("Blackberry");
        listOfFruits.add("Tom & Jerry");

        /*
         * remove(Object o) OR remove(int index)
         * -------------------------------------
         * Syntax: list.remove(Object o)   → removes first occurrence of element
         *         list.remove(int index)  → removes element at given index
         */
        listOfFruits.remove("Tom & Jerry");   // removes by object match

        /*
         * set(int index, E element)
         * -------------------------
         * Syntax: list.set(index, newValue)
         * Replaces the element at the specified index with newValue.
         * NOTE: Cannot be used to "add" at new index, only update existing.
         */
        listOfFruits.set(0, "Elderberry");

        /*
         * get(int index)
         * --------------
         * Syntax: list.get(index)
         * Retrieves the element at the given index.
         */
        System.out.println(listOfFruits.get(0)); // Output: "Elderberry"
        System.out.println();

        /*
         * size()
         * ------
         * Syntax: list.size()
         * Returns the number of elements currently stored.
         *
         * Compare:
         *   - Arrays  → .length (field, fixed size)
         *   - Strings → .length() (method)
         *   - ArrayList → .size() (method, dynamic size)
         */
        System.out.println("Size of arraylist: " + listOfFruits.size());
        
        /*
         * Printing an ArrayList
         * ---------------------
         * By default, ArrayList overrides toString() method to print all elements in [ ... ] format.
         */
        System.out.println("List of fruits: " + listOfFruits);

        /*
         * Sorting
         * -------
         * There are multiple ways to sort an ArrayList.
         *
         * 1. Collections.sort(list)     → Old way (before Java 8).
         *    Uses natural ordering (alphabetical for Strings, ascending for numbers).
         */
        Collections.sort(listOfFruits);
        System.out.println("Sorted arraylist: " + listOfFruits);

        /*
         * 2. list.sort(null)            → New way (Java 8+).
         *    Passing null means "use natural ordering".
         */
        listOfFruits.add("Avocado");
        System.out.println("Unsorted after add: " + listOfFruits);
        listOfFruits.sort(null);
        System.out.println("Sorted arraylist: " + listOfFruits);

        /*
         * 3. Reverse order sorting
         *    - Comparator.reverseOrder() → New way (Java 8+).
         *    - Collections.reverseOrder() → Old way (before Java 8).
         *    Both return a comparator that sorts in reverse (descending) order.
         */
        listOfFruits.sort(Comparator.reverseOrder());
        System.out.println("Sorted arraylist in reverse order: " + listOfFruits);

        /*
         * Iteration
         * ---------
         * Multiple ways to loop through ArrayList.
         */

        // Enhanced for-loop (for-each)
        System.out.println("Iterated using for-each loop:");
        for (String fruit : listOfFruits) {
            System.out.println(fruit);
        }
        System.out.println();  

        // Classic for-loop with index
        System.out.println("Iterated using for-loop with index:");
        for (int i = 0; i < listOfFruits.size(); i++) {
            System.out.println(listOfFruits.get(i));
        }
    }
}
