package exercises;

public class GeneralPractitioner extends Doctor {
	
	public GeneralPractitioner() {
		super();
	}

	public GeneralPractitioner(String name) {
		super(name);
	}

	public GeneralPractitioner(String name, String specialty) {
		super(name, specialty);

	}

	public void makeHouseCalls() {
		System.out.println("Dr " + name + " is making house calls.");
	}
}
