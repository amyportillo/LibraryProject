public class Patron {
	private final int patronId;
	private final String patronName;

	public Patron(int patronId, String patronName) {
		this.patronId = patronId;
		this.patronName = patronName;
	}

	// Getters
	public int getPatronId() {
		return patronId;
	}

	public String getPatronName() {
		return patronName;
	}
}