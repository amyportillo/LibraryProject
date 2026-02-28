public class Book extends LibraryItem {
    // I store the book's author here.
    private final String author;

    // I call super to set common item fields, then set author.
    public Book(int id, String title, String location, String author) {
        super(id, title, location);
        this.author = author;
    }

    // I return the author name.
    public String getAuthor() {
        return author;
    }

    // I override loan days because books can be borrowed longer.
    @Override
    public int getLoanDays() {
        return 21;
    }
}
