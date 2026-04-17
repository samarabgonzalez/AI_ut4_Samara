/**
 * Clase principal que ejecuta un proceso iterativo
 * de cálculo hasta que se alcanza un valor límite.
 */

public class Main {

    /**
     * Método principal del programa.
     *
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        int incrementoBase = 15;
        int valorAcumulado = 0;

        calcularAcumulado(incrementoBase, valorAcumulado);
    }

    /**
     * Realiza cálculos iterativos sobre un acumulador
     * hasta que su valor sea mayor o igual a 100.
     *
     * @param incrementoBase valor usado para calcular el incremento
     * @param valorAcumulado valor que se va acumulando en cada iteración
     */
    private static void calcularAcumulado(int incrementoBase, int valorAcumulado) {
        int resultadoTemporal;
        int valorCalculado;

        do {
            valorCalculado = 10 + incrementoBase;
            valorAcumulado = valorAcumulado + valorCalculado;
            valorAcumulado++;

            if (valorAcumulado < 10) {
                resultadoTemporal = 15;
                valorAcumulado = valorAcumulado - 1;
            } else {
                resultadoTemporal = 10;
                valorAcumulado = valorAcumulado - 1;
            }

            int auxiliar = valorAcumulado;
            resultadoTemporal = auxiliar;

        } while (valorAcumulado < 100);
    }
}
