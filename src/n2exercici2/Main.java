package n2exercici2;

public class Main {

	public static void main(String[] args) {
		try {
			ThrowException.f();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
