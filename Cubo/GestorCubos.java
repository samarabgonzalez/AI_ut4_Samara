package Cubo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * Gestiona operaciones sobre colecciones de cubos.
 */
public class GestorCubos {

    /**
     * Inicializa y puebla una lista con los cubos recibidos.
     *
     * @param cubosIniciales cubos a incluir en la lista
     * @return nueva lista con los cubos indicados
     * @throws IllegalArgumentException si el arreglo es nulo o contiene cubos nulos
     */
    public List<Cubo> inicializarYPoblarLista(Cubo... cubosIniciales) {
        if (cubosIniciales == null) {
            throw new IllegalArgumentException("La coleccion inicial no puede ser nula.");
        }

        List<Cubo> listaCubos = new ArrayList<>();
        for (Cubo cubo : cubosIniciales) {
            if (cubo == null) {
                throw new IllegalArgumentException("No se permiten cubos nulos en la lista.");
            }
            listaCubos.add(cubo);
        }

        return listaCubos;
    }

    /**
     * Pide al usuario cuantos cubos quiere crear y sus lados por ventanas.
     *
     * @return lista de cubos creada con datos introducidos por el usuario
     */
    public List<Cubo> inicializarYPoblarListaDesdeVentanas() {
        int cantidad = pedirCantidadCubos();
        List<Cubo> cubos = new ArrayList<>();

        for (int i = 1; i <= cantidad; i++) {
            float lado = pedirLado(i);
            cubos.add(new Cubo(lado));
        }

        return cubos;
    }

    /**
     * Ordena la lista de cubos por tamano de menor a mayor.
     *
     * @param cubos lista de cubos a ordenar
     * @throws IllegalArgumentException si la lista es nula o contiene cubos nulos
     */
    public void ordenarPorTamano(List<Cubo> cubos) {
        if (cubos == null) {
            throw new IllegalArgumentException("La lista de cubos no puede ser nula.");
        }
        if (cubos.contains(null)) {
            throw new IllegalArgumentException("La lista contiene cubos nulos.");
        }

        for (int i = 0; i < cubos.size() - 1; i++) {
            for (int j = i + 1; j < cubos.size(); j++) {
                if (cubos.get(i).getLado() > cubos.get(j).getLado()) {
                    Cubo temporal = cubos.get(i);
                    cubos.set(i, cubos.get(j));
                    cubos.set(j, temporal);
                }
            }
        }
    }

    /**
     * Indica si el primer cubo cabe dentro del segundo.
     *
     * @param cuboInterno cubo que se quiere introducir
     * @param cuboExterno cubo contenedor
     * @return true si el lado del primero es menor que el del segundo
     * @throws IllegalArgumentException si alguno de los cubos es nulo
     */
    public boolean cabeExactamenteDentro(Cubo cuboInterno, Cubo cuboExterno) {
        if (cuboInterno == null || cuboExterno == null) {
            throw new IllegalArgumentException("Los cubos a comparar no pueden ser nulos.");
        }

        return cuboInterno.getLado() < cuboExterno.getLado();
    }

    private int pedirCantidadCubos() {
        while (true) {
            String entrada = JOptionPane.showInputDialog(
                    null,
                    "Cuantos cubos quieres crear (minimo 2):",
                    "Cantidad de cubos",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (entrada == null) {
                throw new IllegalArgumentException("Operacion cancelada por el usuario.");
            }

            try {
                int cantidad = Integer.parseInt(entrada);
                if (cantidad > 1) {
                    return cantidad;
                }
                JOptionPane.showMessageDialog(
                        null,
                        "Debes crear al menos 2 cubos.",
                        "Dato no valido",
                        JOptionPane.ERROR_MESSAGE
                );
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                        null,
                        "Debes introducir un numero entero.",
                        "Dato no valido",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }

    private float pedirLado(int numeroCubo) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(
                    null,
                    "Introduce el lado del cubo " + numeroCubo + ":",
                    "Lado del cubo",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (entrada == null) {
                throw new IllegalArgumentException("Operacion cancelada por el usuario.");
            }

            try {
                float lado = Float.parseFloat(entrada);
                if (lado >= 0) {
                    return lado;
                }
                JOptionPane.showMessageDialog(
                        null,
                        "El lado no puede ser negativo.",
                        "Dato no valido",
                        JOptionPane.ERROR_MESSAGE
                );
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                        null,
                        "Debes introducir un numero valido.",
                        "Dato no valido",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }
}

