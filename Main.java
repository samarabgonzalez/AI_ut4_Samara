public class Main {
    /** * @param args the command line arguments
     */
    public static void main(final String[] args) {
        int contador = 0;
        int variableInicial = 15;
        int variableCalculada = 20;
        int acumulador = 0;
        extracted(variableInicial, acumulador);
    }

    /**
     *
     */
    private static void extracted(int variableInicial, int acumulador) {
        int contador;
        int variableCalculada;
        do {
            variableCalculada = 10 + variableInicial;
            acumulador = acumulador + variableCalculada;
            acumulador++;
            if (acumulador < 10) {
                contador = 15;
                acumulador = acumulador - 1;
            } else {
                contador = 10;
                acumulador = acumulador - 1;
            }
            int aux;
            aux = acumulador;
            contador = aux;
        } while (acumulador < 100);
    }
}
