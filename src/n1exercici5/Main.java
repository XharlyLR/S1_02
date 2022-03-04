package n1exercici5;

public class Main {

	public static void main(String[] args) {
		int x = 0;
		
		try {
			metodeWhile(x);
		} catch (StackOverflowError e) {
			System.err.println(e);
		}
		System.out.println(x);

	}

	private static void metodeWhile(int x) throws StackOverflowError{
		while(x >= 0) {
			System.out.println(x);
			x++;
			metodeWhile(x);
		}
		
	}

}
