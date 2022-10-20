package TrenMaya;

import java.io.IOException;

/** Clase principal
 * @author Fisher
 * 
 */
public class MainReservacion {

    public static void main(String[] args) throws IOException {
        
        Interfaz ventana = new Interfaz();
        
        ventana.llenarUsuario();
        ventana.reservarBoleto();
        ventana.imprimirBoleto();
        
    }
    
}
