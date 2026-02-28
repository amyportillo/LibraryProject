public class LibraryApp {
    public static void main(String[] args) {
        // I create Scanner so I can read user input from terminal.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        // I create one Library object to manage items and patrons.
        Library library = new Library();

        // I seed sample items so the app has starter data.
        library.addItem(new LibraryItem(1, "Atomic Habits", "Shelf 4Z Forsyth Public Library"));
        library.addItem(new Book(2, "The Great Gatsby", "Shelf A1 Forsyth Public Library", "F. Scott Fitzgerald"));
        library.addItem(new DVD(3, "Inception", "Shelf D2", 148));
        library.addItem(new Book(4, "To Kill a Mockingbird", "Shelf C1", "Harper Lee"));
        library.addItem(new DVD(5, "The Matrix", "Shelf D3", 136));
        library.addItem(new Magazine(6, "National Geographic", "Shelf E3", 202));

        // I seed one patron so I can test checkout flows quickly.
        library.addPatron(new Patron(1, "Amy Portillo"));

        // I keep running until I choose to exit.
        boolean running = true;
        while (running) {
            // I show the menu each loop.
            System.out.println("\nLibrary Menu:");
            System.out.println("1. List all items");
            System.out.println("2. Check out item");
            System.out.println("3. Return item");
            System.out.println("4. List available items");
            System.out.println("5. List checked out items");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine().trim();

            // I branch behavior based on my menu choice.
            switch (choice) {
                case "1":
                    System.out.println("\nAll Library Items:");
                    library.listAllItems();
                    break;
                case "2":
                    System.out.print("Enter item ID to check out: ");
                    String checkoutId = scanner.nextLine().trim();
                    if (!isValidNumber(checkoutId)) {
                        System.out.println("Error: Please enter a valid item ID (number).");
                        break;
                    }
                    System.out.print("Enter your patron ID: ");
                    String patronId = scanner.nextLine().trim();
                    if (!isValidNumber(patronId)) {
                        System.out.println("Error: Please enter a valid patron ID (number).");
                        break;
                    }
                    if (library.checkOutItem(checkoutId, patronId)) {
                        System.out.println("Item checked out successfully.");
                    }
                    break;
                case "3":
                    System.out.print("Enter item ID to return: ");
                    String returnId = scanner.nextLine().trim();
                    if (!isValidNumber(returnId)) {
                        System.out.println("Error: Please enter a valid item ID (number).");
                        break;
                    }
                    if (library.returnItem(returnId)) {
                        System.out.println("Item returned successfully.");
                    }
                    break;
                case "4":
                    System.out.println("\nAvailable Items:");
                    library.listAvailableItems();
                    break;
                case "5":
                    System.out.println("\nChecked Out Items:");
                    library.listCheckedOutItems();
                    break;
                case "6":
                    // I stop the app here.
                    running = false;
                    System.out.println("Exiting library system. Goodbye!");
                    break;
                default:
                    // I handle invalid menu choices gracefully.
                    System.out.println("Invalid option. Please choose 1-6.");
            }
        }
        // I close scanner to clean up resources.
        scanner.close();
    }

    private static boolean isValidNumber(String str) {
        // I reject null/empty input first.
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            // I try parsing to int to confirm valid numeric input.
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            // I return false if parsing fails.
            return false;
        }
    }
}
