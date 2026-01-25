public class LibraryApp {
	public static void main(String[] args) {
		// Create a libraryitem
		LibraryItem book1 = new LibraryItem(1, "Atomic Habits", "Shelf 4Z Forsyth Public Library");
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
	}
}