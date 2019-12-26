package proof.genericos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Suzuki extends Vehiculo {
	
	private String modelo;
	private Date fechaEnsamblado;
	
	public Suzuki(String modelo, String fechaEnsamblado) {
		super();
		this.modelo = modelo;
		try {
			this.fechaEnsamblado = new SimpleDateFormat("dd-MM-yyyy").parse(fechaEnsamblado);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getFechaEnsamblado() {
		return fechaEnsamblado;
	}

	public void setFechaEnsamblado(Date fechaEnsamblado) {
		this.fechaEnsamblado = fechaEnsamblado;
	}
	

	
	
	
	
}	
