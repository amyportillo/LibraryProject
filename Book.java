public class Book extends LibraryItem {
    private final String author;

    public Book(int id, String title, String location, String author) {
        super(id, title, location);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
