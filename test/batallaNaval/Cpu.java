/*
 * NOMBRE: Fisher
 * FECHA: 17/10/22
 * PROYECTO: SIMULACION
 */
package batallaNaval;

/**
 * Clase que determina el comportamiento de la CPU del juego de batalla naval.
 *
 * @author Fisherk2
 */
public class Cpu {

    private int x;
    private int y;
    private int posicion;

    /**
     * Metodo que genera un disparo en una posicion determinada de forma
     * pseudoaleatorioa en en tablero.
     */
    public void genDisparo() {
        int yn, a, c, m, xn;
        //PARAMETROS DE LA GENERACION DE NUMEROS ALEATORIOS CONGRUENCIAL MIXTO
        a = 13;
        c = 8;
        m = 20;
        do {
            xn = genSemilla(); //Semilla para X
        } while (xn > 20);
        do {
            yn = genSemilla(); //Semilla para Y
        } while (yn > 20);

        x = ((a * xn) + c) % m;
        y = ((a * yn) + c) % m;
        posicion = x + (y * 8);
    }

    private int genSemilla() {
        //PARAMETROS DE LA GENERACION DE LA SEMILLA CONGRUENCIAL MULTIPLICATIVO
        int a = 3, m = 35, xn = (int)(Math.random()*35);
        xn = (a * xn) % m;
        return xn;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getPosicion() {
        return posicion;
    }

}
