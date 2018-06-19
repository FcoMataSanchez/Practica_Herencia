/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras.modelo;

/**
 * @version 1
 * @author alumneDAM
 */
final public class Regular extends Poligono {

    private double medidaLado;

    /**
     * Constructor del objeto Regular
     * @param medidaLado double
     * @param numLados int
     * @param nombre String
     */
    public Regular(double medidaLado, int numLados, String nombre) {
        super(numLados, nombre);
        this.medidaLado = medidaLado;
        this.numLados = numLados;
    }

    /**
     * Getter y Setter del objeto Regular
     * @param medidalado double
     */
    public void setMedidalado(double medidalado) {
        this.medidaLado = medidalado;
    }

    public double getMedidalado() {
        return medidaLado;
    }

    /**
     * Metodo calcular area devuleve el area del objeto
     * @return double area
     */
    @Override
    public double calcularArea() {
        double apotema = medidaLado / (2 * Math.tan((360 / numLados) / 2));
        return ((numLados * this.medidaLado) * apotema) / 2;
    }

    /**
     * Metodo calcular perimetro del objeto
     * @return double perimetro
     */
    @Override
    public double calcularPerimetro() {
        return medidaLado * numLados;
    }

    /**
     * Metodo que devuelve los datos del objeto
     * @return String toString
     */
    @Override
    public String toString() {
        return super.toString() + " Cantidad lados: " + numLados + " Area: " + calcularArea() + " Perimetro: " + calcularPerimetro();
    }
}
