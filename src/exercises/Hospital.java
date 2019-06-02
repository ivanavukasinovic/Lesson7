package exercises;

public class Hospital {

	public static void main(String[] args) {

		GeneralPractitioner gp = new GeneralPractitioner("Bob");
		System.out.println(gp.getName());
		gp.doMedicine();
		gp.makeHouseCalls();

		Surgeon sur = new Surgeon("Rob");
		System.out.println(sur.getName());
		sur.doMedicine();
		sur.performSurgery();

	}
}
