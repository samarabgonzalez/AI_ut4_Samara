package Cubo;
import javax.swing.*;

/**
 * Clase principal del programa.
 */
public class MainCubo {

	public static void main(String[] args) {
		// Inicializamos el gestor de cubos
		GestorCubo gestor = new GestorCubo();

		gestor.inicializarYPoblarListaCubos();
		gestor.ordenarCubos();
		gestor.mostrarCubos();

		Cubo c1 = new Cubo(2);
		Cubo c2 = new Cubo(4);

		boolean cabe = gestor.cabeDentro(c1, c2);

		JOptionPane.showMessageDialog(null,
				"¿Cabe el cubo de lado " + c1.getLado() +
						" dentro del cubo de lado " + c2.getLado() +
						"? " + cabe);
	}
}