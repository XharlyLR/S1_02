package n3exercici2;

public class Main {

	public static void main(String[] args) {
		try {
			FailingConstructor failingConstructor1 = new FailingConstructor();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

}
