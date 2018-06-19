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
final public class Rectangulo extends NoRegular {

    private double lado1;
    private double lado2;

    /**
     * Construvtor del objeto rectangulo
     * @param lado1 double
     * @param lado2 double
     * @param numlados int Constante
     * @param nombre String
     */
    public Rectangulo(double lado1, double lado2, int numlados, String nombre) {
        super(numlados, nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     * Getters y Setters del objeto rectangulo
     * @param lado1 double
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    /**
     * Metodo que calcula el area de un rectangulo
     * @return double area
     */
    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }

    /**
     * Metodo que calcula el perimetro de un rectangulo
     * @return double perimetro
     */
    @Override
    public double calcularPerimetro() {
        return 2 * (lado1 + lado2);
    }

    /**
     * Metodo que devuelve los datos del objeto rectangulo
     * @return String toString
     */
    @Override
    public String toString() {
        return super.toString() + " Cantidad lados: " + numLados + " Area: " + calcularArea() + " Perimetro: " + calcularPerimetro();
    }

}
