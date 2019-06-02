package exercises;

public class Hospital {

	public static void main(String[] args) {
		new Doctor("Hudson", "stomatology").doMedicine();
		new GeneralPractitioner("Smith").doMedicine();
		new GeneralPractitioner("Samuel").makeHouseCalls();
		new Surgeon("House", "surgery").doMedicine();
		new Surgeon().performSurgery();

	}

}
