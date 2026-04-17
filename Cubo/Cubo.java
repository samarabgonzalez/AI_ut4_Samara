package Cubo;

/**
 * La clase Cubo representa un cubo con atributos de área, lado y volumen. Proporciona métodos para calcular el área de la base y el volumen del cubo, así como getters y setters para sus atributos.
 */

public class Cubo {
    private float area;
    private float lado;
    private float volumen;

    /**
     * Constructor del cubo que recibe el area, el lado y el volumen del cubo
     * @param area
     * @param lado
     * @param volumen
     */
    public Cubo(float area, float lado, float volumen) {
        this.area = area;
        this.lado = lado;
        this.volumen = volumen;
    }

    /**
     * El método recibe uno de los lados del cubo
     * @param lado
     * @return El área de la base del cubo, que es un cuadrado con lados iguales al lado del cubo.
     */

    public float calcularAreaBase(float lado) {
        return lado * lado;
    }

    /**
     * El método recibe uno de los lados del cubo
     * @param lado
     * @return El volumen del cubo, que es lado al cubo.
     */

    public float calcularVolumen(float lado) {
        return lado * lado * lado;
    }

    /**
     * Getter del área
     * @return
     */
    public float getArea() {
        return area;
    }

    /**
     * Setter del área
     * @param area
     */
    public void setArea(float area) {
        this.area = area;
    }

    /**
     * Getter del lado
     * @return
     */
    public float getLado() {
        return lado;
    }

    /**
     * Setter del lado
     * @param lado
     */
    public void setLado(float lado) {
        this.lado = lado;
    }

    /**
     * Getter del volumen
     * @return
     */
    public float getVolumen() {
        return volumen;
    }

    /**
     * Setter del volumen
     * @param volumen
     */
    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    /**
     * Método para imprimir
     * @return
     */
    @Override
    public String toString() {
        return "Cubo{" +
                "area=" + area +
                ", lado=" + lado +
                ", volumen=" + volumen +
                '}';
    }
}
