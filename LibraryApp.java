public class LibraryApp {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		Library library = new Library();

		// Seed sample items
		library.addItem(new LibraryItem(1, "Atomic Habits", "Shelf 4Z Forsyth Public Library"));
		library.addItem(new Book(2, "The Great Gatsby", "Shelf A1 Forsyth Public Library", "F. Scott Fitzgerald"));
		library.addItem(new DVD(3, "Inception", "Shelf D2", 148));
		library.addItem(new Book(4, "To Kill a Mockingbird", "Shelf C1", "Harper Lee"));
		library.addItem(new DVD(5, "The Matrix", "Shelf D3", 136));
		library.addItem(new Magazine(6, "National Geographic", "Shelf E3", 202));

		// Seed patron(s)
		library.addPatron(new Patron(1, "Amy Portillo"));

		boolean running = true;
		while (running) {
			System.out.println("\nLibrary Menu:");
			System.out.println("1. List items");
			System.out.println("2. Check out item");
			System.out.println("3. Return item");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			String choice = scanner.nextLine();

			switch (choice) {
				case "1":
					System.out.println("\nAll Library Items:");
					library.listAllItems();
					break;
				case "2":
					System.out.print("Enter item ID to check out: ");
					String checkoutId = scanner.nextLine();
					System.out.print("Enter your patron ID: ");
					String patronId = scanner.nextLine();
					if (library.checkOutItem(checkoutId, patronId)) {
						System.out.println("Item checked out successfully.");
					} else {
						System.out.println("Checkout failed. Item may not be available or patron not found.");
					}
					break;
				case "3":
					System.out.print("Enter item ID to return: ");
					String returnId = scanner.nextLine();
					if (library.returnItem(returnId)) {
						System.out.println("Item returned successfully.");
					} else {
						System.out.println("Return failed. Item may not be checked out or not found.");
					}
					break;
				case "4":
					running = false;
					System.out.println("Exiting library system. Goodbye!");
					break;
				default:
					System.out.println("Invalid option. Please try again.");
			}
		}
		scanner.close();
	}
}
