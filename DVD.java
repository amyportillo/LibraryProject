// DVD is a subclass of LibraryItem representing a DVD in the library
public class DVD extends LibraryItem {
    // Number of minutes for DVD runtime
    private final int runtimeMinutes;

    // Constructor calls super and sets runtimeMinutes
    public DVD(int id, String title, String location, int runtimeMinutes) {
        super(id, title, location);
        this.runtimeMinutes = runtimeMinutes;
    }

    // Getter for runtimeMinutes
    public int getRuntimeMinutes() {
        return runtimeMinutes;
    }
}
