package DAY28_81525.oop15th;

public class Library {
    // Library's attributes
    private final String  libraryName;
    private final int libraryYear;
    // aggregated object
    private Book[] books;
    // constructor
    Library (String libraryName, int libraryYear, Book[] books) {
        this.libraryName = libraryName;
        this.libraryYear = libraryYear;
        this.books = books;
    }
    Library (String libraryName, int libraryYear) {
        this.libraryName = libraryName;
        this.libraryYear = libraryYear;
    }

    // setters;
    void setBooks (Book[] books) {
        this.books = books;
    }
    // get libraryName;
    String getLibraryName () {
        return this.libraryName;
    }
    // get libraryYear;
    int getLibraryYear () {
        return this.libraryYear;
    }
    // get all libraryBooks;
    Book[] getLibraryBooks () {
        return this.books;
    }
    // get a book libraryBook;
    Book getLibraryBook (int bookIndex) {
        return this.books[bookIndex];
    }

    // display library info
    void displayLibraryInfo () {
        System.out.printf("The %d, %s\n", this.libraryYear, this.libraryName);
    }

    @Override
    public String toString() {
        return String.format("The %d, %s\n", this.libraryYear, this.libraryName);
    }

    // displayBooks () 
    void displayBooks () {
        System.out.println("Available books: ");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
