package Cubo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Tests de la clase Cubo.
 */
public class Pruebas {

	@Test
	public void testArea() {
		Cubo c = new Cubo(5);
		Assertions.assertEquals(25, c.calcularAreaBase(), 0.001);
	}

	@Test
	public void testVolumen() {
		Cubo c = new Cubo(5);
		Assertions.assertEquals(125, c.calcularVolumen(), 0.001);
	}

	@Test
	public void testOrdenacion() {
		ArrayList<Cubo> lista = new ArrayList<>();

		lista.add(new Cubo(4)); // 64
		lista.add(new Cubo(2)); // 8
		lista.add(new Cubo(3)); // 27

		Collections.sort(lista);

		Assertions.assertEquals(2, lista.get(0).getLado(), 0.001);
		Assertions.assertEquals(3, lista.get(1).getLado(), 0.001);
		Assertions.assertEquals(4, lista.get(2).getLado(), 0.001);
	}
}