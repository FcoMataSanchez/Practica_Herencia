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
final public class Rombo extends NoRegular {

    private double diagonalMax;
    private double diagonalMin;


    /**
     * Contructo del objeto rombo
     * @param diagonalMax double
     * @param diagonalMin double
     * @param lado int
     * @param nombre String
     */
    public Rombo(double diagonalMax, double diagonalMin, int lado, String nombre) {
        super(lado, nombre);
        this.diagonalMax = diagonalMax;
        this.diagonalMin = diagonalMin;

    }

    /**
     * Getters y Setters del objeto rombo 
     * @return double diagonalmax y diagonalmin
     */
    public double getDiagonalmax() {
        return diagonalMax;
    }

    public void setDiagonalmax(double diagonalMax) {
        this.diagonalMax = diagonalMax;
    }

    public double getDiagonalmin() {
        return diagonalMin;
    }

    public void setDiagonalmin(double diagonalMin) {
        this.diagonalMin = diagonalMin;
    }

    /**
     * Metodo que calcula el area de un objeto rombo
     * @return double area
     */
    @Override
    public double calcularArea() {
        return (diagonalMax * diagonalMin) / 2;
    }

    /**
     * Metodo que calcula el perimetro de un objeto rombo
     * @return double perimetro
     */
    @Override
    public double calcularPerimetro() {
        return 4 * (Math.sqrt(Math.pow(diagonalMax, 2) + Math.pow(diagonalMin, 2)) / 2);
    }

    /**
     * Metodo que devulevelos datos del objeto rombo
     * @return String toString
     */
    @Override
    public String toString() {
        return super.toString() + " Cantidad lados: " + numLados + " Area: " + calcularArea() + " Perimetro: " + calcularPerimetro();
    }
}
