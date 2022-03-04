package n1exercici4;

public class Main {

	public static void main(String[] args) {
		
		try {
			metode();
//			throw new MyException();
		} catch (MyException e) {
			System.err.println("MyException - " + e.getMessage());
		}
		
	}

	private static void metode() throws MyException {
		throw new MyException();
	}
}
