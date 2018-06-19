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
final public class Circulo extends Figura {

    private double radio;

    /**
     * Constructor del objeto Circulo
     * @param radio int
     * @param nombre String
     */
    public Circulo(int radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    /**
     * Getter y Setter del objeto Circulo
     * @return double radio
     */
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Metodo que devuelve el area de un circulo 
     * @return double area
     */
    @Override
    final public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    
    /**
     * Metodo que devuelve el perimetro de un circulo
     * @return double perimetro
     */
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
    
    /**
     * Metodo que devuelve los datos del objeto
     * @return String toString
     */
    @Override
    public String toString() {
        return super.toString() + " Cantidad lados: " + radio + " Area: " + calcularArea() + " Perimetro: " + calcularPerimetro();
    }

}
