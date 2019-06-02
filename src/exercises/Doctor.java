package exercises;

public class Doctor {

	String name, specialty;

	public Doctor() {
	}

	public Doctor(String name) {
		this.name = name;
	}

	public Doctor(String name, String specialty) {
		this.name = name;
		this.specialty = specialty;
	}

	public void doMedicine() {
		System.out.println("Dr. " + name + " is doing " + specialty);
	}

}
