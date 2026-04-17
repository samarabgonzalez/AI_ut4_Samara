package Cubo;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Clase que gestiona una lista de cubos.
 */
public class GestorCubo {

	private ArrayList<Cubo> cubos;

	public GestorCubo () {
		cubos = new ArrayList<>();
	}

	/**
	 * Pide al usuario cuántos cubos crear y los añade a la lista.
	 */
	public void inicializarYPoblarListaCubos() {
		int cantidad = pedirCantidad();

		for (int i = 0; i < cantidad; i++) {
			cubos.add(new Cubo());
		}
	}

	/**
	 * Ordena los cubos por volumen.
	 */
	public void ordenarCubos() {
		Collections.sort(cubos);
	}

	/**
	 * Muestra los cubos por pantalla.
	 */
	public void mostrarCubos() {
		String texto = "";

		for (Cubo c : cubos) {
			texto += c.toString() + "\n";
		}

		JOptionPane.showMessageDialog(null, texto);
	}

	/**
	 * Comprueba si un cubo cabe dentro de otro.
	 */
	public boolean cabeDentro(Cubo c1, Cubo c2) {
		return c1.getLado() <= c2.getLado();
	}

	/**
	 * Pide al usuario cuántos cubos crear.
	 */
	private int pedirCantidad() {
		int cantidad = 0;
		boolean valido = false;

		while (!valido) {
			try {
				String texto = JOptionPane.showInputDialog("¿Cuántos cubos quieres crear?");

				if (texto == null) {
					System.exit(0);
				}

				cantidad = Integer.parseInt(texto);

				if (cantidad <= 0) {
					JOptionPane.showMessageDialog(null, "Debe ser mayor que 0");
				} else {
					valido = true;
				}

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error: introduce un número válido");
			}
		}

		return cantidad;
	}
}