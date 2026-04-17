package Cubo;

import java.util.List;

/**
 * Pruebas basicas de funcionamiento para la aplicacion de cubos.
 */
public class Pruebas {

	/**
	 * Ejecuta pruebas rapidas de calculo y logica principal.
	 *
	 * @param args argumentos de linea de comandos (no se usan)
	 */
	public static void main(String[] args) {
		probarCalculos();
		probarSetter();
		probarInicializacionYOrden();
		probarEncajeExacto();
		System.out.println("Todas las pruebas han finalizado correctamente.");
	}

	/**
	 * Verifica area y volumen para un lado conocido.
	 */
	private static void probarCalculos() {
		Cubo cubo = new Cubo(3);
		assertCasiIgual(9f, cubo.calcularAreaBase(), "Error al calcular el area base");
		assertCasiIgual(27f, cubo.calcularVolumen(), "Error al calcular el volumen");
	}

	/**
	 * Verifica actualizacion del lado mediante setter.
	 */
	private static void probarSetter() {
		Cubo cubo = new Cubo(2);
		cubo.setLado(5);
		assertCasiIgual(5f, cubo.getLado(), "Error en getter/setter de lado");
	}

	/**
	 * Verifica inicializacion de lista y ordenacion ascendente por lado.
	 */
	private static void probarInicializacionYOrden() {
		GestorCubos gestor = new GestorCubos();
		List<Cubo> cubos = gestor.inicializarYPoblarLista(new Cubo(4), new Cubo(1), new Cubo(2));

		gestor.ordenarPorTamano(cubos);

		assertCasiIgual(1f, cubos.get(0).getLado(), "Orden incorrecto en posicion 0");
		assertCasiIgual(2f, cubos.get(1).getLado(), "Orden incorrecto en posicion 1");
		assertCasiIgual(4f, cubos.get(2).getLado(), "Orden incorrecto en posicion 2");
	}

	/**
	 * Verifica la comprobacion de encaje entre dos cubos.
	 */
	private static void probarEncajeExacto() {
		GestorCubos gestor = new GestorCubos();
		Cubo cuboPequeno = new Cubo(2);
		Cubo cuboGrande = new Cubo(3);
		Cubo cuboMismoTamano = new Cubo(2);

		if (!gestor.cabeExactamenteDentro(cuboPequeno, cuboGrande)) {
			throw new AssertionError("Un cubo pequeno deberia caber dentro de uno mayor.");
		}

		if (gestor.cabeExactamenteDentro(cuboPequeno, cuboMismoTamano)) {
			throw new AssertionError("Un cubo no debe caber dentro de otro del mismo tamano.");
		}
	}

	/**
	 * Compara dos valores float con tolerancia pequena.
	 *
	 * @param esperado valor esperado
	 * @param real valor obtenido
	 * @param mensaje mensaje de error
	 */
	private static void assertCasiIgual(float esperado, float real, String mensaje) {
		float tolerancia = 0.0001f;
		if (Math.abs(esperado - real) > tolerancia) {
			throw new AssertionError(mensaje + ". Esperado: " + esperado + ", obtenido: " + real);
		}
	}
}
