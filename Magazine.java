public class Magazine extends LibraryItem {
    // I store the issue number for this magazine.
    private final int issueNumber;

    // I call super(...) to initialize shared fields, then set issue number.
    public Magazine(int id, String title, String location, int issueNumber) {
        super(id, title, location);
        this.issueNumber = issueNumber;
    }

    // I return the issue number.
    public int getIssueNumber() {
        return issueNumber;
    }
}
