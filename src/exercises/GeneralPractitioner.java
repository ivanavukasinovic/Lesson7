package exercises;

public class GeneralPractitioner extends Doctor {

	public GeneralPractitioner(String name) {
		super(name);
	}

	void doMedicine() {
		System.out.println("As a General practitioner, I treat all common medical conditions and "
				+ "refer patients for specialist treatment.");
	}

	void makeHouseCalls() {
		System.out.println("Telephone medical consultations are part of my duties.");
	}

}
