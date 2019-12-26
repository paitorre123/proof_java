package proof.tipos.enumerados;

public class Main {
	
	
	public static void main(String[] args) {
		
		Talla t1 = Enum.valueOf(Talla.class, "MINI" );
		System.out.println(t1.getAbreviatura());
		
		
	}

}
