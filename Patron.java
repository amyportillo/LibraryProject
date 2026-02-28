public class Patron {
    // I store each patron's unique ID.
    private int patronId;
    // I store the patron's full name.
    private String name;

    // I use this constructor to create a patron record.
    public Patron(int patronId, String name) {
        this.patronId = patronId;
        this.name = name;
    }

    // I return the patron ID.
    public int getPatronId() {
        return patronId;
    }

    // I return the patron name.
    public String getName() {
        return name;
    }
}