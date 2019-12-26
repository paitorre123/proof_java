package proof.patron.command;

public class Cliente extends Persona implements ICommandObtenerDatos{
	
	private String IdCliente;
	
	public Cliente() {
		super();	
	}
	
	@Override
	public void obtener() {
		//Obetener determinados datos de un cliente 
		//desde la base de datos
		System.out.println("Obteniendo datos del cliente");
	}

	public String getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(String idCliente) {
		IdCliente = idCliente;
	}
	
}
