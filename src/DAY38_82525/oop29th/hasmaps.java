package DAY38_82525.oop29th;
/*
 * hashMap.java
 *
 * What is HashMap?
 * ----------------
 * - HashMap is a container in Java that stores data in pairs called key and value.
 * - It is a type of data structure that uses a hashing mechanism to store pairs efficiently.
 * - HashMap does NOT maintain insertion order because it stores items based on the hash of the keys.
 * - If you need to maintain order, you can use LinkedHashMap (keeps insertion order) or TreeMap (keeps keys sorted).
 * - Keys must be unique (no duplicates), but values can repeat.
 * - Keys are used to quickly find the value they are associated with.
 * - Part of Java's Collections Framework (java.util package).
 *
 * When to use HashMap?
 * --------------------
 * - When you want to connect one piece of information to another.
 *   Example: Student ID -> Student Name
 * - When you want to find items quickly using a key.
 * - When you do not care about the order of items.
 *
 * How to write a HashMap:
 * -----------------------
 * HashMap<KeyType, ValueType> map = new HashMap<>();
 * Example:
 * HashMap<String, Integer> ages = new HashMap<>();
 * Here, String is the key type (like a name) and Integer is the value type (like age).
 *
 * Common HashMap methods:
 * ----------------------
 * - put(key, value)       : Add a key-value pair. Updates value if key already exists.
 * - get(key)              : Retrieve the value for a specific key.
 * - remove(key)           : Delete the key-value pair.
 * - containsKey(key)      : Check if a key exists in the map.
 * - containsValue(value)  : Check if a value exists in the map.
 * - size()                : Get the number of key-value pairs.
 * - isEmpty()             : Check if the map has no entries.
 * - keySet()              : Get all keys as a Set.
 * - values()              : Get all values as a Collection.
 * - entrySet()            : Get all key-value pairs for iteration.
 * - clear()               : Remove all entries from the map. After calling clear(), the map is empty.
 *
 * How to iterate using entrySet():
 * --------------------------------
 * Syntax:
 * for (Map.Entry<KeyType, ValueType> entry : map.entrySet()) {
 *     KeyType key = entry.getKey();       // Get the key
 *     ValueType value = entry.getValue(); // Get the value
 *     // Do something with key and value
 * }
 *
 * Example:
 * HashMap<String, Integer> ages = new HashMap<>();
 * ages.put("Alice", 25);
 * ages.put("Bob", 30);
 *
 * for (Map.Entry<String, Integer> entry : ages.entrySet()) {
 *     System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
 * }
 *
 * How to use clear():
 * ------------------
 * map.clear();
 * - Removes all key-value pairs from the map.
 * - After calling clear(), map.size() will return 0 and isEmpty() will return true.
 *
 * Example:
 * HashMap<String, Double> map = new HashMap<>();
 * map.put("apple", 0.50);
 * map.clear(); // removes everything
 *
 * Comparison with ArrayList:
 * --------------------------
 * ArrayList:
 * - Stores items in order using an index (0, 1, 2...).
 * - Allows duplicates.
 * - Searching for an item may require looping through the list (slower for large lists).
 *
 * HashMap:
 * - Stores items as key-value pairs.
 * - Keys must be unique; values can repeat.
 * - Fast lookup using keys (very efficient even for large data).
 * - Order is not preserved (use LinkedHashMap if order matters).
 *
 * When to choose:
 * - Use ArrayList if you need an ordered list or simple collection.
 * - Use HashMap if you need to map unique keys to values and need fast lookup.
 */


import java.util.HashMap;

public class hasmaps {
    public static void main(String[] args) {
        /*
         * Create a HashMap to store keys and values
         * Keys are Strings (like names of fruits)
         * Values are Doubles (like prices)
         */
        HashMap<String, Double> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("apple", 0.50);   // Add "apple" with price 0.50
        map.put("orange", 0.75);  // Add "orange" with price 0.75
        map.put("banana", 0.25);  // Add "banana" with price 0.25
        map.put("coconut", 1.50); // Add "coconut" with price 1.50

        // Update the value for an existing key
        map.put("apple", 1.00); // "apple" now has price 1.00

        // Remove a key-value pair (uncomment to test)
        // map.remove("banana"); // Deletes "banana" from the map

        // Retrieve a value using its key
        System.out.println(map.get("apple")); // Prints 1.0

        // Check if a specific key exists
        String keys = "cocnut"; // Intentional typo to show "not found" case
        if (map.containsKey(keys)) {
            // Key exists: print key and its value
            System.out.println("{key: " + keys + ", value: " + map.get(keys) + "}");
        } else {
            // Key does not exist: print not found message
            System.out.println("{key: " + keys + ", value: not in the map}");
        }

        // Check if a specific value exists in the map
        System.out.println(map.containsValue(1.50)); // true or false

        // Get the number of key-value pairs
        System.out.println(map.size()); // 4 (or fewer if removed entries)

        // Print the entire map (shows all key-value pairs)
        System.out.println(map); // Example output: {orange=0.75, banana=0.25, apple=1.0, coconut=1.5}

        // Loop through all keys in the map and print key with its value
        for (String key : map.keySet()) {
            // get(key) retrieves the value for the current key
            // printf formats the output nicely: 3 decimal places for price
            System.out.printf("key: %s $%.3f\n", key, map.get(key));
        }
    }
}
