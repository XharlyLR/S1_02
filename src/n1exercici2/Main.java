package n1exercici2;

public class Main {

	public static void main(String[] args) {
		
		Objecte myObjecte = null;
		
		try {
			myObjecte.metode();
		} catch (NullPointerException e) {
			System.err.println(" NullPointerException - " + e.getMessage());
		}
		
	}

}
