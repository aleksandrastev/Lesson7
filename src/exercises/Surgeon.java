package exercises;

public class Surgeon extends Doctor {

	public Surgeon() {
		super();
	}

	public Surgeon(String name) {
		super(name);
	}

	public Surgeon(String name, String specialty) {
		super(name, specialty);

	}

	public void performSurgery() {
		System.out.println("Dr " + name + " is performing surgery.");
	}
}
