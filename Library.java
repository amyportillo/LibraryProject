import java.util.ArrayList;

public class Library {
    // I keep all library items in this list.
    private ArrayList<LibraryItem> items;
    // I keep all patrons in this list.
    private ArrayList<Patron> patrons;

    // I initialize empty collections when I create a Library.
    public Library() {
        items = new ArrayList<>();
        patrons = new ArrayList<>();
    }

    // I add a new item to the library collection.
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    // I add a new patron to the library system.
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    // I search for an item by ID; I return null if not found.
    public LibraryItem findItemById(String id) {
        for (LibraryItem item : items) {
            if (String.valueOf(item.getId()).equals(id)) {
                return item;
            }
        }
        return null;
    }

    // I search for a patron by ID; I return null if not found.
    public Patron findPatronById(String id) {
        for (Patron patron : patrons) {
            if (String.valueOf(patron.getPatronId()).equals(id)) {
                return patron;
            }
        }
        return null;
    }

    // I check out an item after validating the item and patron.
    public boolean checkOutItem(String itemId, String patronId) {
        LibraryItem item = findItemById(itemId);
        if (item == null) {
            System.out.println("Error: Item not found.");
            return false;
        }

        Patron patron = findPatronById(patronId);
        if (patron == null) {
            System.out.println("Error: Patron not found.");
            return false;
        }

        if (item.isCheckedOut()) {
            System.out.println("Error: Item is already checked out.");
            return false;
        }

        // I use the item's own rule logic here.
        return item.checkOut();
    }

    // I return an item after validating state and existence.
    public boolean returnItem(String itemId) {
        LibraryItem item = findItemById(itemId);
        if (item == null) {
            System.out.println("Error: Item not found.");
            return false;
        }

        if (!item.isCheckedOut()) {
            System.out.println("Error: Item is not currently checked out.");
            return false;
        }

        // I use the item's own return rule logic.
        return item.returnItem();
    }

    // I list every item with key details.
    public void listAllItems() {
        for (LibraryItem item : items) {
            System.out.println("ID: " + item.getId() + ", Title: " + item.getTitle() + ", Status: " + item.getStatusText());
        }
    }

    // I list only available items for reporting.
    public void listAvailableItems() {
        boolean found = false;
        for (LibraryItem item : items) {
            if (item.isAvailable()) {
                System.out.println("ID: " + item.getId() + ", Title: " + item.getTitle() + ", Status: " + item.getStatusText());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No available items found.");
        }
    }

    // I list only checked out items for reporting.
    public void listCheckedOutItems() {
        boolean found = false;
        for (LibraryItem item : items) {
            if (item.isCheckedOut()) {
                System.out.println("ID: " + item.getId() + ", Title: " + item.getTitle() + ", Status: " + item.getStatusText());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No checked out items found.");
        }
    }
}
