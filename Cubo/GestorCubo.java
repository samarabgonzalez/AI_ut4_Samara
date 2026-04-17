package Cubo;

import javax.swing.JOptionPane;

/**
 * Ofrece operaciones de apoyo para trabajar con colecciones de cubos.
 */
public class GestorCubo {

	/**
	 * Crea un cubo solicitando su lado por JOptionPane.
	 *
	 * @param numero etiqueta del cubo para mostrar en el dialogo
	 * @return cubo creado con el lado indicado por el usuario
	 */
	public Cubo crearCuboDesdeDialogo(int numero) {
		Cubo cubo = new Cubo(0);
		JOptionPane.showMessageDialog(
				null,
				"Introduce los datos del cubo " + numero + ".",
				"Nuevo cubo",
				JOptionPane.INFORMATION_MESSAGE
		);
		cubo.solicitarLadoPorJOptionPane();
		return cubo;
	}

	/**
	 * Devuelve el indice del cubo con mayor volumen.
	 *
	 * @param cubos arreglo de cubos a evaluar
	 * @return indice del cubo con mayor volumen
	 * @throws IllegalArgumentException si el arreglo es nulo o vacio
	 */
	public int obtenerIndiceMayorVolumen(Cubo[] cubos) {
		if (cubos == null || cubos.length == 0) {
			throw new IllegalArgumentException("Debe existir al menos un cubo.");
		}

		int indiceMayor = 0;
		float mayorVolumen = cubos[0].calcularVolumen();

		for (int i = 1; i < cubos.length; i++) {
			float volumenActual = cubos[i].calcularVolumen();
			if (volumenActual > mayorVolumen) {
				mayorVolumen = volumenActual;
				indiceMayor = i;
			}
		}

		return indiceMayor;
	}
}
