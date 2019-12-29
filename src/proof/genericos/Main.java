package proof.genericos;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Vehiculo v1 = new Suzuki("Alto 800", "2019-09-20");
		v1.setPatente("HI1050");
		Vehiculo v2 = new Suzuki("Alto k10", "2019-08-30");
		Persona p1 = new Conductor("28989", "01-10-2021");
		Persona p2 = new Conductor("88488", "11-05-2022");
		
		Empaquetador<IIdentificar> e = new Empaquetador<IIdentificar>();
		e.agregarElementosAlPaquete(v1);
		e.agregarElementosAlPaquete((Conductor)p1);
		
		e.identificarElementosEnPaquete();
	}

}
