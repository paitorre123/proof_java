package proof.depuras;

public class ArregloAleatorio {
	
	private int talla;
	private int[] arreglo;
	
	public ArregloAleatorio(int talla) {
		this.talla = talla;
		this.arreglo = new int[this.talla];
		this.generarArregloAleatoriamente();
	}
	
	private void generarArregloAleatoriamente() {
		for (int i = 0; i < arreglo.length; i++) {
			this.arreglo[i] = (int)Math.random() * 100;
		}
	}
	
	public void mostrarArreglo() {
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(this.arreglo[i]);
		}
	}

}
