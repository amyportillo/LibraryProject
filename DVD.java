// DVD is a subclass of LibraryItem representing a DVD in the library
public class DVD extends LibraryItem {
    // I store how long the DVD runs in minutes.
    private final int runtimeMinutes;

    // I call super(...) for shared fields, then set runtime.
    public DVD(int id, String title, String location, int runtimeMinutes) {
        super(id, title, location);
        this.runtimeMinutes = runtimeMinutes;
    }

    // I return the DVD runtime.
    public int getRuntimeMinutes() {
        return runtimeMinutes;
    }

    // I override loan days because DVDs have a shorter loan period.
    @Override
    public int getLoanDays() {
        return 7;
    }
}
