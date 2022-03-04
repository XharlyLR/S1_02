package n3exercici3;

public class Main {

	public static void main(String[] args) {
		try {
			FailingConstructor failingConstructor1 = new FailingConstructor();
		} catch (Throwable t) {
			System.err.println(t.getMessage());
		}
		
	}

}
