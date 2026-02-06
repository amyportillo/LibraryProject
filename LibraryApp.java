public class LibraryApp {
	public static void main(String[] args) {
	// Create library items
	LibraryItem book1 = new LibraryItem(1, "Atomic Habits", "Shelf 4Z Forsyth Public Library");
	LibraryItem book2 = new LibraryItem(2, "The Great Gatsby", "Shelf A1 Forsyth Public Library");
	LibraryItem book3 = new LibraryItem(3, "Harry Potter Vol 3", "Shelf B2 Forsyth Public Library");

	// Create subclass items
	Book specialBook = new Book(4, "To Kill a Mockingbird", "Shelf C1", "Harper Lee");
	DVD specialDVD = new DVD(5, "Inception", "Shelf D2", 148);
	Magazine specialMagazine = new Magazine(6, "National Geographic", "Shelf E3", 202);

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

	// Print details for subclass items
	System.out.println();
	System.out.println("Book Subclass Info:");
	System.out.println("ID: " + specialBook.getId());
	System.out.println("Title: " + specialBook.getTitle());
	System.out.println("Location: " + specialBook.getLocation());
	System.out.println("Author: " + specialBook.getAuthor());
	System.out.println("Available: " + specialBook.isAvailable());
	System.out.println("Checked Out: " + specialBook.isCheckedOut());

	System.out.println();
	System.out.println("DVD Subclass Info:");
	System.out.println("ID: " + specialDVD.getId());
	System.out.println("Title: " + specialDVD.getTitle());
	System.out.println("Location: " + specialDVD.getLocation());
	System.out.println("Runtime (min): " + specialDVD.getRuntimeMinutes());
	System.out.println("Available: " + specialDVD.isAvailable());
	System.out.println("Checked Out: " + specialDVD.isCheckedOut());

	System.out.println();
	System.out.println("Magazine Subclass Info:");
	System.out.println("ID: " + specialMagazine.getId());
	System.out.println("Title: " + specialMagazine.getTitle());
	System.out.println("Location: " + specialMagazine.getLocation());
	System.out.println("Issue Number: " + specialMagazine.getIssueNumber());
	System.out.println("Available: " + specialMagazine.isAvailable());
	System.out.println("Checked Out: " + specialMagazine.isCheckedOut());
	}
}
