package proof.genericos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conductor extends Persona  implements IIdentificar{
	
	private String identificadorLicencia;
	private Date fechaVencimientoLicencia;
	
	public Conductor(String identificadorLicencia, String fechaVencimientoLicencia) {
		super();
		this.identificadorLicencia = identificadorLicencia;
		this.fechaVencimientoLicencia = this.convertirStringADate(fechaVencimientoLicencia);
	}
	private Date convertirStringADate(String fechaVencimientoLicencia2) {
		try {
			return new SimpleDateFormat("dd-MM-yyyy").parse(fechaVencimientoLicencia2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String getIdentificadorLicencia() {
		return identificadorLicencia;
	}
	public void setIdentificadorLicencia(String identificadorLicencia) {
		this.identificadorLicencia = identificadorLicencia;
	}
	public Date getFechaVencimientoLicencia() {
		return fechaVencimientoLicencia;
	}
	public void setFechaVencimientoLicencia(Date fechaVencimientoLicencia) {
		this.fechaVencimientoLicencia = fechaVencimientoLicencia;
	}
	@Override
	public void mostrarIdentificacion() {
		System.out.println("NUmero licencia: "+ this.identificadorLicencia + " Fecha vencimiento: "+ this.fechaVencimientoLicencia);
		
	}
	
	
	
	

}
