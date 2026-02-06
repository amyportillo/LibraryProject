public class LibraryApp {
	public static void main(String[] args) {
	// Create library items
	LibraryItem book1 = new LibraryItem(1, "Atomic Habits", "Shelf 4Z Forsyth Public Library");
	LibraryItem book2 = new LibraryItem(2, "The Great Gatsby", "Shelf A1 Forsyth Public Library");
	LibraryItem book3 = new LibraryItem(3, "Harry Potter Vol 3", "Shelf B2 Forsyth Public Library");

	// Create the patron
	Patron patron = new Patron(1, "Amy Portillo");
	// Use getters to return a value
	System.out.println("Patron Information");
	System.out.println("Patron ID: " + patron.getPatronId());
	System.out.println("Patron Name: " + patron.getPatronName());

	System.out.println();

	System.out.println("Library Item Info:");
	System.out.println("ID: " + book1.getId());
	System.out.println("Title: " + book1.getTitle());
	System.out.println("Location: " + book1.getLocation());
	System.out.println("Available: " + book1.isAvailable());
	System.out.println("Checked Out: " + book1.isCheckedOut());
	System.out.println();
	System.out.println("ID: " + book2.getId());
	System.out.println("Title: " + book2.getTitle());
	System.out.println("Location: " + book2.getLocation());
	System.out.println("Available: " + book2.isAvailable());
	System.out.println("Checked Out: " + book2.isCheckedOut());
	System.out.println();
	System.out.println("ID: " + book3.getId());
	System.out.println("Title: " + book3.getTitle());
	System.out.println("Location: " + book3.getLocation());
	System.out.println("Available: " + book3.isAvailable());
	System.out.println("Checked Out: " + book3.isCheckedOut());
	}
}
