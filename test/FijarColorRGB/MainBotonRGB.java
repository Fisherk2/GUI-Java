/*
Interfaz que muestra un listado de parametros de cambio de colores para el boton
 */
package FijarColorRGB;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Fisher
 */
public class MainBotonRGB {

    public static void main(String[] botonRGB) {
        
        Window ventana = new Window();
        
        ventana.setBounds(0, 0, 400, 220);
        ventana.setVisible(true);
        ventana.setTitle("Color del boton");
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null); //Se centra en el centro del monitor
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE); //Se termina el programa cuando se cierra
        
    }
    
}
