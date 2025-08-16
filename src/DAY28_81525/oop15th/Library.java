package DAY28_81525.oop15th;

/*
 * Library.java
 * 
 * Represents a Library object that can contain multiple Book objects.
 * 
 * Demonstrates Aggregation:
 * - The Library class has a "HAS-A" relationship with the Book class.
 * - A Library can contain many Books, but those Books are not dependent on the Library.
 * - Both Library and Book are independent classes that can exist on their own.
 */
public class Library {
    // Attributes of the Library
    // Final keyword ensures that libraryName and libraryYear cannot be reassigned after initialization.
    private final String libraryName;
    private final int libraryYear;

    // Aggregated object: a Library can have a collection of Book objects.
    // Note that the Book objects themselves are not created here;
    // they are passed in and linked to the Library.
    private Book[] books;

    // Constructor that initializes a Library with its name, year, and a collection of books.
    Library(String libraryName, int libraryYear, Book[] books) {
        this.libraryName = libraryName;
        this.libraryYear = libraryYear;
        this.books = books;
    }

    // Constructor that initializes a Library with only its name and year.
    // Books can be added later using the setter.
    Library(String libraryName, int libraryYear) {
        this.libraryName = libraryName;
        this.libraryYear = libraryYear;
    }

    // Setter method to associate an array of Book objects with this Library.
    void setBooks(Book[] books) {
        this.books = books;
    }

    // Getter method to retrieve the library’s name.
    String getLibraryName() {
        return this.libraryName;
    }

    // Getter method to retrieve the year the library was established.
    int getLibraryYear() {
        return this.libraryYear;
    }

    // Getter method to retrieve all books currently associated with the library.
    Book[] getLibraryBooks() {
        return this.books;
    }

    // Getter method to retrieve a specific book by its index in the array.
    Book getLibraryBook(int bookIndex) {
        return this.books[bookIndex];
    }

    // Displays general information about the library (year and name).
    void displayLibraryInfo() {
        System.out.printf("The %d, %s\n", this.libraryYear, this.libraryName);
    }

    // Override of toString() method.
    // When a Library object is printed, it displays meaningful library info.
    @Override
    public String toString() {
        return String.format("The %d, %s\n", this.libraryYear, this.libraryName);
    }

    // Displays all books currently stored in the library.
    // Loops through the Book array and prints each book using its toString() method.
    void displayBooks() {
        System.out.println("Available books: ");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
