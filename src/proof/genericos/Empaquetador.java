package proof.genericos;

import java.util.ArrayList;

public abstract class Empaquetador < T> {
	
	private ArrayList<? extends T> elementosEmpaquetados;
	
	public Empaquetador() {
		this.elementosEmpaquetados = new ArrayList<T>();
	}
}
