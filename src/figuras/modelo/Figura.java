package figuras.modelo;

/**
 *@version 1
 * @author alumneDAM
 */
public abstract class Figura {

    protected String nombre;

    /**
     * Contructor del objeto Figura  
     * @param nombre String
     */
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter del objeto figura 
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodos abstractos calcularArea y calcularPerimetro
     * @return 
     */
    protected abstract double calcularArea();
    protected abstract double calcularPerimetro();

    /**
     * Metodo toString del objeto figura devuelve el nombre de la figura
     * @return 
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }

}
