
package figuras.modelo;

/**
 * @version 1
 * @author alumneDAM
 */
public abstract class Poligono extends Figura {

    protected int numLados;

    /**
     * Constructor del objeto Poligono.
     * @param numLados int
     * @param nombre String
     */
    public Poligono(int numLados, String nombre) {
        super(nombre);
        this.numLados = numLados;
    }
    
    /**
     * Getter del objeto Poligono devuelve el numero de lados
     * @return int numero de lados
     */
    public int getNumlados() {
        return numLados;
    }

}
