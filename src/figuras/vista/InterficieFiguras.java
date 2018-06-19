
package figuras.vista;

import java.util.List;
import java.util.Scanner;

/**
 * @version 1
 * @author alumneDAM
 */
public class InterficieFiguras {

    private Scanner lector = new Scanner(System.in);

    /**
     * Metodo que muestra el menu con las pociones del programa y comprueba 
     * que la opcion elegida es valida
     * @return int opcion
     */
    public int mostrarMenuOperacions() {
        int opcio = -1;
        boolean correcte = false;
        do {
            System.out.println("Seleccionar operacion:"
                    + "\n1. Crear Figura"
                    + "\n2. Seleccionar tipo Figura y mostrar datos"
                    + "\n3. Seleccionar y modificar datos"
                    + "\n4. Salida");

            if (lector.hasNextInt()) {
                opcio = lector.nextInt();

                if (opcio > 0 && opcio < 5) {
                    correcte = true;
                }

            } else {
                lector.nextLine();
            }
            if (!correcte) {
                System.out.println("Opcion incorrecta\n");
            }

        } while (!correcte);
        return opcio;
    }

    /**
     * metodo para pedir numeros por teclado
     *
     * @param mensaje String con el mensaje que se mostrara al pedir introducir
     * un numero
     * @return int valor pedido por teclado
     */
    public double pedirnumdouble(String mensaje) {
        System.out.println("Introduce " + mensaje + ": ");
        double valor = 0;
        boolean correcte = false;
        do {
            if (lector.hasNextDouble()) {
                valor = lector.nextDouble();
                correcte = true;
            } else {
                lector.next();
                System.out.println("Valor incorrecte");
            }

        } while (!correcte);
        return valor;
    }

    /**
     * Metodo que muestra un menu donde da la opcion de elgir una figura para 
     * crearla y comprueba que la eleccion es valida
     * @return int opcion
     */
    public int tipoFigura() {
        int opcio = -1;
        boolean correcte = false;
        do {
            System.out.println("Seleccionar Figura:"
                    + "\n1. Circulo"
                    + "\n2. Poligono Regular"
                    + "\n3. Rombo"
                    + "\n4. Rectangulo"
                    + "\n5. Salida");

            if (lector.hasNextInt()) {
                opcio = lector.nextInt();

                if (opcio > 0 && opcio < 6) {
                    correcte = true;
                }

            } else {
                lector.nextLine();
            }
            if (!correcte) {
                System.out.println("Opcion incorrecta\n");
            }

        } while (!correcte);
        return opcio;
    }

    /**
     * Metodo al que se le pasa un String con el nombre del dato a introducir y 
     * comprueba que es un int y lo devuelve
     * @param mensaje String
     * @return int valor
     */
    public int pedirnumint(String mensaje) {
        System.out.println("Introduce numero de " + mensaje);
        int valor = 0;
        boolean correcte = false;
        do {
            if (lector.hasNextInt()) {
                valor = lector.nextInt();
                correcte = true;
            } else {
                lector.next();
                System.out.println("Valor incorrecto");
            }

        } while (!correcte);
        return valor;
    }

    /**
     * Metodo que pide un nombre de una figura y devuleve un string con el nombre
     * @return String nombre
     */
    public String nombreFigura() {
        System.out.println("Introducir nombre figura: ");
        String valor = "";
        boolean correcte = false;
        do {
            if (lector.hasNext()) {
                valor = lector.next();
                correcte = true;
            } else {
                lector.next();
                System.out.println("Valor incorrecto");
            }

        } while (!correcte);
        return valor;
    }

    /**
     * Metodo que imprime un array siempre que tenga bien implementado el metodo 
     * toString
     * @param l Array 
     */
    public void imprimirArray(List l) {
        System.out.println(l);
    }

    /**
     * Metodo que imprime un String 
     * @param s String
     */
    public void imprimirString(String s) {
        System.out.println(s);
    }
}
