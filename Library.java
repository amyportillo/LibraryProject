import java.util.ArrayList;

public class Library {
    private final ArrayList<LibraryItem> items = new ArrayList<>();
    private final ArrayList<Patron> patrons = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public LibraryItem findItemById(String id) {
        for (LibraryItem item : items) {
            if (String.valueOf(item.getId()).equals(id)) {
                return item;
            }
        }
        return null;
    }

    public Patron findPatronById(String id) {
        for (Patron patron : patrons) {
            if (String.valueOf(patron.getPatronId()).equals(id)) {
                return patron;
            }
        }
        return null;
    }

    public boolean checkOutItem(String itemId, String patronId) {
        LibraryItem item = findItemById(itemId);
        if (item == null) {
            System.out.println("Error: Item with ID " + itemId + " not found.");
            return false;
        }
        
        Patron patron = findPatronById(patronId);
        if (patron == null) {
            System.out.println("Error: Patron with ID " + patronId + " not found.");
            return false;
        }
        
        if (item.isCheckedOut()) {
            System.out.println("Error: Item '" + item.getTitle() + "' is already checked out.");
            return false;
        }
        
        return item.checkOut();
    }

    public boolean returnItem(String itemId) {
        LibraryItem item = findItemById(itemId);
        if (item == null) {
            System.out.println("Error: Item with ID " + itemId + " not found.");
            return false;
        }
        
        if (!item.isCheckedOut()) {
            System.out.println("Error: Item '" + item.getTitle() + "' is not currently checked out.");
            return false;
        }
        
        return item.returnItem();
    }

    public void listAllItems() {
        if (items.isEmpty()) {
            System.out.println("No items in catalog.");
            return;
        }
        for (LibraryItem item : items) {
            System.out.println("ID: " + item.getId() + ", Title: " + item.getTitle() + ", Status: " + item.getStatusText());
        }
    }

    public void listAvailableItems() {
        boolean hasAvailable = false;
        for (LibraryItem item : items) {
            if (item.isAvailable()) {
                System.out.println("ID: " + item.getId() + ", Title: " + item.getTitle() + ", Status: " + item.getStatusText());
                hasAvailable = true;
            }
        }
        if (!hasAvailable) {
            System.out.println("No available items.");
        }
    }

    public void listCheckedOutItems() {
        boolean hasCheckedOut = false;
        for (LibraryItem item : items) {
            if (item.isCheckedOut()) {
                System.out.println("ID: " + item.getId() + ", Title: " + item.getTitle() + ", Status: " + item.getStatusText());
                hasCheckedOut = true;
            }
        }
        if (!hasCheckedOut) {
            System.out.println("No checked out items.");
        }
    }
}
