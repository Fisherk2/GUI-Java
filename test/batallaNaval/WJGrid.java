/*
 * NOMBRE: Fisher
 * FECHA: 17/10/22
 * PROYECTO: SIMULACION
 */
package batallaNaval;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;

/**
 * Clase que muestra el tablero donde se colocaran los barcos.
 *
 * @author Fisherk2
 */
public class WJGrid extends JDialog {

    private final GridLayout LAYOUT;
    public final int N_ESPACIOS = 40;
    private JButton casilla[];
    private int posicion;

    public WJGrid(Frame parent, boolean modal) {
        super(parent, modal);
        this.setTitle("TABLERO");
        this.setSize(800, 500);
        LAYOUT = new GridLayout(5, 8);
        this.setLayout(LAYOUT);
        iniciarComponentes();

        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
    }

    private void iniciarComponentes() {
        casilla = new JButton[N_ESPACIOS];
        //AGREGAR TABLERO
        for (int i = 0; i < casilla.length; i++) {
            casilla[i] = new JButton();
            casilla[i].setBackground(Color.DARK_GRAY);
            casilla[i].setEnabled(false);
            add(casilla[i]);
        }
    }

    /**
     * Metodo que cambia de color cualquier casilla del tablero
     *
     * @param color 0=Gris; 1 = Verde; 2=Rosa
     * @param x Coordenada en X
     * @param y Coordenada en Y
     */
    public void cambiarColor(int color, int x, int y) {
        posicion = x + (y * 8);
        switch (color) {
            case 0:
                casilla[posicion].setBackground(Color.DARK_GRAY);
                break;
            case 1:
                casilla[posicion].setBackground(Color.GREEN);
                break;
            case 2:
                casilla[posicion].setBackground(Color.PINK);
                break;
        }
    }

    /**
     * Metodo que cambia de color cualquier casilla del tablero
     *
     * @param color 0=Gris; 1 = Verde; 2=Rosa
     * @param pos
     */
    public void cambiarColor(int color, int pos) {
        switch (color) {
            case 0:
                casilla[pos].setBackground(Color.DARK_GRAY);
                break;
            case 1:
                casilla[pos].setBackground(Color.GREEN);
                break;
            case 2:
                casilla[pos].setBackground(Color.PINK);
                break;
        }
    }

    public void resetColor() {
        for (JButton casilla1 : casilla) {
            casilla1.setBackground(Color.DARK_GRAY);
        }
    }
}
