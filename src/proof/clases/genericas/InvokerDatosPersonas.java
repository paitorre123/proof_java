package proof.clases.genericas;

import java.util.ArrayList;

public class InvokerDatosPersonas {
	
	private ArrayList<Persona> personas;
	
	public InvokerDatosPersonas() {
		this.personas = new ArrayList<Persona>();
	}
	
	public void agregarPersona(Persona persona) {
		this.personas.add(persona);
	}
	
	public void obtenesTodosLosDatos() {
		for (Persona persona : personas) {
			if(persona instanceof Cliente) {
				Cliente cliente = (Cliente)persona;
				cliente.obtener();
			}
		}
	}
}
