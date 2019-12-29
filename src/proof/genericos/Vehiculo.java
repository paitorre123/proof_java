package proof.genericos;

public abstract class Vehiculo  implements IIdentificar{
	
	private String patente;

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	
}
