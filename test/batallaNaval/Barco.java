/*
 * NOMBRE: Fisher
 * FECHA: 17/10/22
 * PROYECTO: SIMULACION
 */
package batallaNaval;

import java.util.ArrayList;

/**
 * Clase que almacena las coordenadas de los barcos y sus casillas ocupantes.
 *
 * @author Fisherk2
 */
public class Barco {

    private ArrayList<Integer> casillas; //Almacena el valor en la reticula dependiendo de las coordenadas
    private boolean alive;

    public Barco(int x, int y) {
        casillas = new ArrayList();
        alive = true;
        casillas.add(generarPosicion(x, y));
    }

    private int generarPosicion(int x, int y) {
        return x + (y * 8);
    }

    public void agregarCasilla(int x, int y) {
        casillas.add(generarPosicion(x, y));
    }

    public ArrayList<Integer> getCasillas() {
        return casillas;
    }

    public void setEstado(boolean estado) {
        this.alive = estado;
    }

    public boolean isAlive() {
        return alive;
    }
    

}
