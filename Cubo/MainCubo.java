package Cubo;

import java.util.List;

import javax.swing.JOptionPane;

/**
 * Punto de entrada de la aplicacion de cubos.
 */
public class MainCubo {

	/**
	 * Demuestra ordenacion y comprobacion de encaje usando la clase de gestion.
	 *
	 * @param args argumentos de linea de comandos (no se usan)
	 */
	public static void main(String[] args) {
		GestorCubos gestor = new GestorCubos();
		List<Cubo> cubos;
		try {
			cubos = gestor.inicializarYPoblarListaDesdeVentanas();
		} catch (IllegalArgumentException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(), "Operacion cancelada", JOptionPane.WARNING_MESSAGE);
			return;
		}

		gestor.ordenarPorTamano(cubos);
		StringBuilder mensaje = new StringBuilder("Cubos ordenados (lado):\n");
		for (Cubo cubo : cubos) {
			mensaje.append(String.format("- Lado: %.2f | Volumen: %.2f%n", cubo.getLado(), cubo.calcularVolumen()));
		}

		Cubo cuboPequeno = cubos.get(0);
		Cubo cuboGrande = cubos.get(cubos.size() - 1);
		boolean encaja = gestor.cabeExactamenteDentro(cuboPequeno, cuboGrande);
		mensaje.append(String.format("%nEl cubo de lado %.2f %s dentro del cubo de lado %.2f.",
				cuboPequeno.getLado(),
				encaja ? "cabe" : "no cabe",
				cuboGrande.getLado()));

		JOptionPane.showMessageDialog(null, mensaje.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}
