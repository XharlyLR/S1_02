package n3exercici1;

public class Derivada extends Base{

	public Derivada() throws Exception {
		try {
//			super();	dona un error perquè el super ha de ser la primera linea al constructor
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
