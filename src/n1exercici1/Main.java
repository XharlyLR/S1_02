package n1exercici1;

public class Main {

	public static void main(String[] args) {

		try {
			throw new Exception("exception");
		} catch (Exception e) {
			System.err.println(e.getMessage());

		} finally {
			System.out.println("Finally");
		}
		
	}
}
