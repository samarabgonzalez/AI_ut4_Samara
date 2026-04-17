package Cubo;

import javax.swing.JOptionPane;

/**
 * Representa un cubo definido por la longitud de su lado.
 *
 * <p>La clase incluye metodos para calcular area de base y volumen,
 * solicitar el lado por interfaz grafica y mostrar resultados con JOptionPane.</p>
 */
public class Cubo {
    private float lado;

    /**
     * Crea un cubo con el lado indicado.
     *
     * @param lado longitud del lado del cubo (debe ser mayor o igual que 0)
     * @throws IllegalArgumentException si el lado es negativo
     */
    public Cubo(float lado) {
        setLado(lado);
    }

    /**
     * Devuelve la longitud actual del lado.
     *
     * @return lado del cubo
     */
    public float getLado() {
        return lado;
    }

    /**
     * Actualiza la longitud del lado.
     *
     * @param lado nuevo lado (debe ser mayor o igual que 0)
     * @throws IllegalArgumentException si el lado es negativo
     */
    public void setLado(float lado) {
        if (lado < 0) {
            throw new IllegalArgumentException("El lado no puede ser negativo.");
        }
        this.lado = lado;
    }

    /**
     * Calcula el area de la base del cubo.
     *
     * @return area de la base (lado * lado)
     */
    public float calcularAreaBase() {
        return lado * lado;
    }

    /**
     * Calcula el volumen del cubo.
     *
     * @return volumen (lado * lado * lado)
     */
    public float calcularVolumen() {
        return lado * lado * lado;
    }

    /**
     * Solicita el valor del lado al usuario mediante JOptionPane.
     *
     * <p>Si el usuario cancela la entrada, se mantiene el valor actual.
     * Si introduce un valor invalido, se muestra un mensaje y se vuelve a pedir.</p>
     */
    public void solicitarLadoPorJOptionPane() {
        while (true) {
            String entrada = JOptionPane.showInputDialog(
                    null,
                    "Introduce el lado del cubo:",
                    "Dato de entrada",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (entrada == null) {
                return;
            }

            try {
                float nuevoLado = Float.parseFloat(entrada);
                setLado(nuevoLado);
                return;
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(
                        null,
                        "Entrada no valida. Introduce un numero mayor o igual que 0.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }

    /**
     * Muestra el area de la base con JOptionPane.
     */
    public void imprimirAreaPorJOptionPane() {
        JOptionPane.showMessageDialog(
                null,
                String.format("Area de la base del cubo (lado %.2f): %.2f", lado, calcularAreaBase()),
                "Area del cubo",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    /**
     * Muestra el volumen con JOptionPane.
     */
    public void imprimirVolumenPorJOptionPane() {
        JOptionPane.showMessageDialog(
                null,
                String.format("Volumen del cubo (lado %.2f): %.2f", lado, calcularVolumen()),
                "Volumen del cubo",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
