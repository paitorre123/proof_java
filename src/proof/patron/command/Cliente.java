package proof.patron.command;

public class Cliente extends Persona implements ICommandObtenerDatos{
	
	

	private String IdCliente;
	
	public Cliente(String IdCliente) {
		super();	
		this.IdCliente = IdCliente;
	}
	
	@Override
	public void obtener() {
		//Obetener determinados datos de un cliente 
		//desde la base de datos
		System.out.println("Obteniendo datos de "+ this);
	}
	@Override
	public String toString() {
		return "Cliente [IdCliente=" + IdCliente + "]";
	}

	public String getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(String idCliente) {
		IdCliente = idCliente;
	}
	
}
