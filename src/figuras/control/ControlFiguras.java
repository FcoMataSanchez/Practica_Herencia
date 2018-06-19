
package figuras.control;

import figuras.modelo.Circulo;
import figuras.modelo.Figura;
import figuras.modelo.Rectangulo;
import figuras.modelo.Regular;
import figuras.modelo.Rombo;
import figuras.vista.InterficieFiguras;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1
 * @author paco
 */
public class ControlFiguras {
    private InterficieFiguras iFiguras;
    List<Figura> figuras;

    public ControlFiguras() {
        this.iFiguras = new InterficieFiguras();
        figuras = new ArrayList();
    }

    /**
     * Ejecuta el programa
     */
    public void inicia() {

        int opcio;

        do {

            opcio = iFiguras.mostrarMenuOperacions();
            if (opcio != 4) {
                switch (opcio) {
                    case 1:
                        seleccionFigura(iFiguras.tipoFigura());
                        break;
                    case 2:
                        iFiguras.imprimirArray(llistaTipusDeFigura(iFiguras.nombreFigura()));
                        break;
                    case 3:
                        iFiguras.imprimirString(mostrarFigurasConNum());
                        modificarFigura(iFiguras.pedirnumint("posicion"), iFiguras.pedirnumdouble("Nuevo valor"));
                        break;
                    case 4:
                        break;
                }
            }
        } while (opcio != 4);
    }

    /**
     * Metodo que pasandole la opcion de la figura deseada la crea la figura y la añade al array 
     * @param opcion int
     */
    public void seleccionFigura(int opcion) {
        if (opcion != 5) {
            switch (opcion) {
                case 1:
                    afegirFigura(new Circulo(iFiguras.pedirnumint("radio"), iFiguras.nombreFigura()));
                    break;
                case 2:
                    afegirFigura(new Regular(iFiguras.pedirnumdouble("Medida lados"), iFiguras.pedirnumint("Numero de lados"), iFiguras.nombreFigura()));
                    break;
                case 3:
                    afegirFigura(new Rombo(iFiguras.pedirnumint("Lado mayor"), iFiguras.pedirnumint("Lado menor"), 4, iFiguras.nombreFigura()));
                    break;
                case 4:
                    afegirFigura(new Rectangulo(iFiguras.pedirnumint("Lado1"), iFiguras.pedirnumint("Lado1"), 4, iFiguras.nombreFigura()));
                    break;
                case 5:
                    break;
            }
        }
    }

    /**
     * Metodo que devuleve el el array de figuras
     * @return List
     */
    public List<Figura> getFigures() {
        return figuras;
    }

    /**
     * Metodo que añade un objeto al array de figuras
     * @param f objeto
     */
    public void afegirFigura(Figura f) {
        figuras.add(f);
    }

    /**
     * Metodo que recibe el array general de figuras y pasandole un String con
     * el tipo de figura elegido pasa los objetos de ese tipo a otro array y lo devuelve
     * @param tipus String
     * @return List 
     */
    public List<Figura> llistaTipusDeFigura(String tipus) {

        List<Figura> figuresTipus = new ArrayList();

        for (Figura f : figuras) {
            if (f.getClass().getSimpleName().equalsIgnoreCase(tipus)) {
                figuresTipus.add(f);
            }
        }
        return figuresTipus;
    }

    /**
     * Metodo que muestra todos los objetos del array numerados 
     * @return String
     */
    public String mostrarFigurasConNum() {
        int contador = 1;
        String cadena = "";
        for (Figura f : figuras) {
            if (f instanceof Circulo) {
                cadena += "\nID: " + contador++
                        + ((Circulo) f).toString();
            } else if (f instanceof Regular) {
                cadena += "\nID: " + contador++
                        + ((Regular) f).toString();
            } else if (f instanceof Rombo) {
                cadena += "\nID: " + contador++
                        + ((Rombo) f).toString();
            } else if (f instanceof Rectangulo) {
                cadena += "\nID: " + contador++
                        + ((Rectangulo) f).toString();
            }
        }
        return cadena;
    }

    /**
     * Metodo que se le pasa un numero de posicion del array y un valor y modifica el 
     * objeto del array
     * @param numero int
     * @param valor double
     */
    public void modificarFigura(int numero, double valor) {
        numero = numero - 1;
        if (figuras.get(numero) instanceof Circulo) {
            ((Circulo) figuras.get(numero)).setRadio(valor);
        } else if (figuras.get(numero) instanceof Regular) {
            ((Regular) figuras.get(numero)).setMedidalado(valor);
        } else if (figuras.get(numero) instanceof Rombo) {
            ((Rombo) figuras.get(numero)).setDiagonalmin(valor);
            ((Rombo) figuras.get(numero)).setDiagonalmax(iFiguras.pedirnumdouble("Lado Mayor"));
        } else if (figuras.get(numero) instanceof Rectangulo) {
            ((Rectangulo) figuras.get(numero)).setLado1(valor);
            ((Rectangulo) figuras.get(numero)).setLado2(iFiguras.pedirnumdouble("Lado2"));
        }

    }

}
