package DAY28_81525.oop15th;

public class Book {
    // Attributes
    String title;
    int pages;

    // Constructors
    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
    Book(String title) {
        this.title = title;
    }

    // displayInfo() {}
    String displayInfo() {
        return this.title + " (" + this.pages + " pages)";
    }
    // toString()
    @Override
    public String toString() {
        return String.format("%s (%d pages)", this.title, this.pages);
    }
}
