package n3exercici3;

public class FailingConstructor {
	
	public FailingConstructor() throws Throwable {
		System.out.println("inici constructor");
		
		Fi fi1 = new Fi();
		fi1.finalize();
		System.out.println(fi1);
		
		throw new Exception("excepció del constructor");
	}
}
