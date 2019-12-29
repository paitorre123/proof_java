package proof.genericos;

import java.util.ArrayList;
import java.util.Collection;

public class Empaquetador <T> {
	
	private ArrayList<T> elementosEmpaquetados;
	
	public Empaquetador() {
		this.elementosEmpaquetados = new ArrayList<T>();
	}
	
	public void agregarElementosAlPaquete( T elemento) {
		this.elementosEmpaquetados.add(elemento);
	}
	
	public void identificarElementosEnPaquete() {
		for(T elemento: this.elementosEmpaquetados) {
			IIdentificar i = (IIdentificar)elemento;
			i.mostrarIdentificacion();
		}
	}
}	
