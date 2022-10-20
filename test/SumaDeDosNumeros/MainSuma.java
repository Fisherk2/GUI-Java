/*
Interfaz que suma dos valores
 */
package SumaDeDosNumeros;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Fisher
 */
public class MainSuma {

    public static void main(String[] sumatoria) {
        
        Window ventana = new Window();
        
        ventana.setBounds(0, 0, 400, 160);
        ventana.setVisible(true);
        ventana.setTitle("Suma de dos numeros");
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null); //Se centra en el centro del monitor
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE); //Se termina el programa cuando se cierra
        
    }
    
}
