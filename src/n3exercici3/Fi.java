package n3exercici3;

public class Fi {
	protected void finalize() throws Throwable {
        try {
 
            System.out.println("inside demo's finalize()");
        }
        catch (Throwable e) {
 
            throw e;
        }
        finally {
 
            System.out.println("Calling finalize method"
                               + " of the Object class");
 
           
        }
    }

	public void finalitza() {
		System.out.println("fi");
	}
}
