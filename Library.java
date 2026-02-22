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
        Patron patron = findPatronById(patronId);
        if (item == null || patron == null) {
            return false;
        }
        return item.checkOut();
    }

    public boolean returnItem(String itemId) {
        LibraryItem item = findItemById(itemId);
        if (item == null) {
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
}
