package DAY28_81525.oop15th;

/*
 * aggregation.java
 * 
 * This program demonstrates the concept of Aggregation in Object-Oriented Programming (OOP).
 * 
 * Key Idea of Aggregation:
 * - Aggregation represents a "HAS-A" relationship between classes.
 * - One object contains references to another object as part of its structure.
 * - Unlike inheritance, the contained objects (the "parts") are independent and can exist
 *   without the container object.
 * 
 * Example in this program:
 * - A Library "HAS-A" collection of Book objects.
 * - Even if the Library object is destroyed, the Book objects can still exist independently.
 * 
 * Difference from Inheritance:
 * - Inheritance ("IS-A" relationship): a subclass is a specialized form of a superclass. 
 *   Example: Dog IS-A Animal.
 * - Aggregation ("HAS-A" relationship): a class contains another class as a field. 
 *   Example: Car HAS-A Engine.
 * 
 * Usage in software design:
 * - Aggregation is used when modeling real-world entities composed of smaller, independent parts.
 * - Inheritance is used when creating hierarchies where specialized classes share common behavior.
 */
public class aggregation {
    public static void main(String[] args) {
        // Create independent Book objects.
        // Each Book can exist on its own, without requiring a Library.
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", 309);
        Book book2 = new Book("The Little Prince", 96);
        Book book3 = new Book("The Lord of the Rings", 1100);

        // Create a Library object.
        // The Library can also exist independently without any books initially.
        Library library = new Library("National Library of the Philippines", 1889);

        // Store the created Book objects in an array for easy grouping.
        Book[] books = new Book[3];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;

        // Associate the array of Book objects with the Library object.
        // This demonstrates aggregation: the Library contains Book objects,
        // but those Book objects are not "owned" by the Library and can exist without it.
        library.setBooks(books);

        // Display information about the Library (name and year established).
        library.displayLibraryInfo();

        // Display all books in the Library by looping through its collection.
        System.out.println("\nBooks in the library:\n");
        Book[] libraryBooks = library.getLibraryBooks();
        for (Book book : libraryBooks) {
            System.out.println(book); // Uses the Book class’s toString() method.
        }

        // Display a specific book using its index in the collection.
        System.out.println();
        System.out.println(library.getLibraryBook(0));

        // Display all books again using the Library's own display method.
        library.displayBooks();
    }
}
