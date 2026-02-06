public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(int id, String title, String location, int issueNumber) {
        super(id, title, location);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}
