package DAY28_81525.oop15th;

/*
 * aggregation.java
 * These are parts they are not the same as inheritance.
 * they are independent objects that can exist on their own.
 * and is not a subclass of the other.
 * and are reusable in other classes.
 * 
 * Represents a "has-a" relationship between objects. 
 * One object CONTAINS another object as part of its structure, 
 * but the contained object/s can exist independently.
 * 
 * why do this?
 * - To model real-world relationships where one object is composed of other objects.
 * 
 * how is this different from inheritance like extends and implements
 * Inheritance → "is-a" relationship "is-a" from subclass to superclass & interface
 * A subclass is a specialized form of its superclass.
 * Example: Dog is a Animal.
 * Aggregation → "has-a" relationship
 * One class contains another class as a field.
 * Example: Car has an Engine.
 * Inheritance → Used for extending behavior or sharing common code.
 * Aggregation → Used for building complex types from simpler ones by combining objects.
 * Inheritance: Subclass object is the superclass object; they share the same lifecycle.
 * Aggregation: Contained object can live on its own even if the container is destroyed. 
 * 
 * General Design Order
 * 
 * 
 * In this demonstration we will make book objects
 * library object to contain the object (One object CONTAINS another object but the contained object/s can exist independently)
 * books && library can exist independently
 * 
 * 
*/
public class aggregation {
    public static void main(String[] args) {
        // Book objeects can exiist independently
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", 309);
        Book book2 = new Book("The Little Prince", 96);
        Book book3 = new Book("The Lord of the Rings", 1100);
        // Library object can exiist independently
        Library library = new Library("National Library of the Philippines", 1889);

        Book[] books = new Book[3];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;

        library.setBooks(books);

        library.displayLibraryInfo();
        //System.out.println(library);
        System.out.println("\nBooks in the library:\n");
        // Display all books in the library
        Book[] libraryBooks = library.getLibraryBooks();
        for (Book book : libraryBooks) {
            System.out.println(book);
        }
        System.out.println();
        // get specific book using index
        System.out.println(library.getLibraryBook(0));

        library.displayBooks();
    }
}
