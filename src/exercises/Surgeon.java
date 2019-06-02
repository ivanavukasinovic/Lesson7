package exercises;

public class Surgeon extends Doctor {

	public Surgeon(String name) {
		super(name);
	}

	void doMedicine() {
		System.out.println("As a Surgeon, I operate on patients to treat injuries, diseases and deformities.");
	}

	void performSurgery() {
		System.out.println("I perform surgery.");
	}

}
