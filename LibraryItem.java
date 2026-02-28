public class LibraryItem {
    // I store each item's unique ID here.
    private int id;
    // I store the item's title here.
    private String title;
    // I track if this item is currently checked out.
    private boolean isCheckedOut;
    // I track if this item is available on the shelf.
    private boolean isAvailable;
    // I store where I can find this item in the library.
    private String location;

    // I use this constructor to create a new library item with default availability.
    public LibraryItem(int id, String title, String location) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.isCheckedOut = false;
        this.isAvailable = true;
    }

    // I return the item ID.
    public int getId() {
        return id;
    }

    // I return the item title.
    public String getTitle() {
        return title;
    }

    // I return the item location.
    public String getLocation() {
        return location;
    }

    // I tell whether the item is checked out.
    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    // I tell whether the item is available.
    public boolean isAvailable() {
        return isAvailable;
    }
    
    // I provide a default loan period (this is overridden in subclasses).
    public int getLoanDays() {
        return 14;
    }

    // I check out an item only if it is not already checked out.
    public boolean checkOut() {
        if (isCheckedOut) {
            return false;
        }
        isCheckedOut = true;
        isAvailable = false;
        return true;
    }

    // I return an item only if it is currently checked out.
    public boolean returnItem() {
        if (!isCheckedOut) {
            return false;
        }
        isCheckedOut = false;
        isAvailable = true;
        return true;
    }

    // I return a user-friendly status string.
    public String getStatusText() {
        return isAvailable ? "Available" : "Checked Out";
    }
}
