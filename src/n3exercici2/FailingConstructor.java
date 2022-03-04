package n3exercici2;

public class FailingConstructor {
	
	public FailingConstructor() throws Exception {
		System.out.println("inici constructor");
		throw new Exception("excepció del constructor");
	}
}
