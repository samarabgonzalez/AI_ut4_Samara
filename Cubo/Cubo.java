package Cubo;
import javax.swing.*;

/**
 * Clase que representa un cubo.
 * Permite calcular el área de la base y el volumen.
 */
public class Cubo implements Comparable<Cubo> {

    private float lado;

    /**
     * Constructor que solicita el lado al usuario.
     */
    public Cubo() {
        this.lado = pedirLado();
    }

    /**
     * Constructor que recibe el lado como parámetro.
     *
     * @param lado lado del cubo
     */
    public Cubo(float lado) {
        this.lado = lado;
    }

    /**
     * Calcula el área de la base del cubo.
     *
     * @return área de la base
     */
    public float calcularAreaBase() {
        return lado * lado;
    }

    /**
     * Calcula el volumen del cubo.
     *
     * @return volumen del cubo
     */
    public float calcularVolumen() {
        return lado * lado * lado;
    }

    /**
     * Solicita al usuario el lado del cubo con control de errores.
     *
     * @return lado válido
     */
    public static float pedirLado() {
        float lado = 0;
        boolean valido = false;

        while (!valido) {
            try {
                String texto = JOptionPane.showInputDialog("Introduce el lado del cubo:");

                if (texto == null) {
                    System.exit(0);
                }

                lado = Float.parseFloat(texto);

                if (lado <= 0) {
                    JOptionPane.showMessageDialog(null, "Debe ser mayor que 0");
                } else {
                    valido = true;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: introduce un número válido");
            }
        }

        return lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    /**
     * Compara cubos por volumen.
     */
    @Override
    public int compareTo(Cubo otro) {
        return Float.compare(this.calcularVolumen(), otro.calcularVolumen());
    }

    @Override
    public String toString() {
        return "Cubo - Lado: " + lado + " Volumen: " + calcularVolumen();
    }
}