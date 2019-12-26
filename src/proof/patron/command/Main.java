package proof.patron.command;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("01");
		Cliente c2 = new Cliente("02");
		Cliente c3 = new Cliente("03");
		Cliente c4 = new Cliente("04");
		
		InvokerDatosPersonas invoker = new InvokerDatosPersonas();
		invoker.agregarPersona(c1);
		invoker.agregarPersona(c2);
		invoker.agregarPersona(c3);
		invoker.agregarPersona(c4);
		
		invoker.obtenesTodosLosDatos();
	}
}
