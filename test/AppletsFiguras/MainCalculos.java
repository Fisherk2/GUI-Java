/*
CLASE PRINCIPAL
 */
package AppletsFiguras;

import javax.swing.JOptionPane;

public class MainCalculos {

    public static void main(String[] geometria) {

        //OBJETOS
        Figura figura1;

        //Menu de opciones
        int r; //Eleccion del usuario
        do {
            r = Integer.parseInt(JOptionPane.showInputDialog("¿QUE FIGURA DESEA SELECCIONAR?"
                    + "\n1.- Cuadrado"
                    + "\n2.- Rectangulo"
                    + "\n3.- Triangulo"
                    + "\n4.- Circulo"
                    + "\n5.- SALIR"));

            if (r != 5) {
                figura1 = new Figura(r);
                figura1.setDatos(r);
                System.out.println(figura1.toString()); //RESULTADOS EN CONSOLA
            } else {
                System.out.println("PROGRAMA TERMINADO");
            }

        } while (r != 5);

    }

}
