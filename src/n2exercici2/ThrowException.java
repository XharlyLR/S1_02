package n2exercici2;

public class ThrowException {
	public static void f() throws Exception{
		try{
			g();
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
			throw new Exception("Exception m�tode f()");
		}
	}
	
	public static void g() throws Exception{
		throw new Exception("Exception m�tode g()");
	}
}
