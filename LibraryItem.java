public class LibraryItem {
	private int id;
	private String title;
	private boolean isCheckedOut;
	private boolean isAvailable;
	private String location;

	// Constructor
	public LibraryItem(int id, String title, String location) {
		this.id = id;
		this.title = title;
		this.location = location;
		this.isCheckedOut = false;
		this.isAvailable = true;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getLocation() {
		return location;
	}

	public boolean isCheckedOut() {
		return isCheckedOut;
	}

	public boolean isAvailable() {
		return isAvailable;
	}
	
// Methods
	// Returns the default loan period in days (polymorphic)
	public int getLoanDays() {
		return 14;
	}
	public boolean checkOut() {
		if (isCheckedOut) {
			return false;
		}
		isCheckedOut = true;
		isAvailable = false;
		return true;
	}

	public boolean returnItem() {
		if (!isCheckedOut) {
			return false;
		}
		isCheckedOut = false;
		isAvailable = true;
		return true;
	}

	public String getStatusText() {
		return isAvailable ? "Available" : "Checked Out";
	}

}
