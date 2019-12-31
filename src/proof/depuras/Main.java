package proof.depuras;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int tallaIngresadaPorTeclado = Integer.parseInt(JOptionPane.
				showInputDialog("Ingrese el largo del arreglo"));
		ArregloAleatorio arregloAletorio = new ArregloAleatorio(tallaIngresadaPorTeclado);
		arregloAletorio.mostrarArreglo();

	}

}
