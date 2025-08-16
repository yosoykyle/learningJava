package DAY28_81525.oop15th;

/*
 * Book.java
 * 
 * Represents a Book object with attributes like title and number of pages.
 * 
 * Key Points:
 * - A Book is an independent class. It does not rely on Library to exist.
 * - Each Book stores its own details such as its title and number of pages.
 * - The class provides methods to display this information in a user-friendly format.
 */
public class Book {
    // Attributes (fields) of the Book class.
    // Each Book object has its own title and page count.
    String title;
    int pages;

    // Constructor to initialize both title and number of pages.
    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    // Constructor to initialize only the title.
    // If pages are not provided, they will remain uninitialized (default: 0).
    Book(String title) {
        this.title = title;
    }

    // Returns a string with formatted book information (title + pages).
    String displayInfo() {
        return this.title + " (" + this.pages + " pages)";
    }

    // Override of toString() method.
    // This allows printing a Book object directly (e.g., System.out.println(book))
    // to display meaningful book information instead of a memory reference.
    @Override
    public String toString() {
        return String.format("%s (%d pages)", this.title, this.pages);
    }
}
