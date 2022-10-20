package JFrameComponentes;

import java.awt.Color;
import javax.swing.JFrame; 
import javax.swing.JPanel; 

public class PanelJPanel extends JFrame { //CLASE QUE HEREDA LOS METODOS Y ATRIBUTOS DE LA SUPERCLASE JFRAME (ver API Javax.Swing)

    public PanelJPanel() { //Ventana centrada que no puede cambiar de tamaño 
        setSize(500, 500); //Establecemos el tamaño de la ventana (ANCHO, LARGO) en pixeles
        setTitle("Paneles");//Sirve para establecer un titulo a la ventana
        setLocationRelativeTo(null); //El "null" sirve para centrar la posicion inicial de la ventana 
        setResizable(false); //Establecemos que la ventana no pueda cambiar de tamaño con el argumento FALSE

        iniciarComponentes(); //Invocamos el panel a la ventana
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando se cierre la ventana, esta terminara la ejecucion del programa  
    }

    private void iniciarComponentes() {
        JPanel panel = new JPanel(); //Creacion de un panel
        
        panel.setBackground(Color.pink);//Le damos color al panel (en este caso rosa)
        this.getContentPane().add(panel); //Agregamos el panel a la ventana
    }
}
