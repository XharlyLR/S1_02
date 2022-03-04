package n1exercici3;

public class Main {

	public static void main(String[] args) {
		
		int[] x = {1, 2};
		
		try {
			x[0] = x[2];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
	}

}
