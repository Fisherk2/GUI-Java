package JFrameComponentes;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CajaTextoJTextField extends JFrame { //CLASE QUE HEREDA LOS METODOS Y ATRIBUTOS DE LA SUPERCLASE JFRAME (ver API Javax.Swing)
    //ATRIBUTOS

    private JPanel panel; //Declaramos un tipo JPanel para poder usarlo en nuestros metodos de manera libre en esta clase

    public CajaTextoJTextField() { //Ventana centrada que no puede cambiar de tamaño 
        //VENTANA
        setSize(800, 800); //Establecemos el tamaño de la ventana (ANCHO, LARGO) en pixeles
        setTitle("Cajas de texto");//Sirve para establecer un titulo a la ventana
        setLocationRelativeTo(null); //El "null" sirve para centrar la posicion inicial de la ventana 
        setResizable(false); //Establecemos que la ventana no pueda cambiar de tamaño con el argumento FALSE

        //COMPONENTES (CAPAS o LAYOUTS)
        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando se cierre la ventana, esta terminara la ejecucion del programa  
    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarCajaDeTexto();
    }

    private void colocarPaneles() {
        //PANEL 1
        panel = new JPanel(); //Creacion de un panel
        panel.setBackground(Color.pink);//Le damos color al panel (en este caso rosa)
        panel.setLayout(null);//Desactivamos el diseño del panel (LAYOUTS)

        this.getContentPane().add(panel); //Agregamos el panel a la ventana
    }

    private void colocarCajaDeTexto() {
        //CAJAS DE TEXTO
        JTextField cajaTexto1 = new JTextField(); //Creacion de caja de texto de una sola linea
        cajaTexto1.setBounds(50, 50, 200, 20); //Posicion y tamaño de la caja de texto
        cajaTexto1.setText("Ponga su nombre aqui..."); //Insercion de texto dentro de la caja

        JTextField cajaTexto2 = new JTextField("Buenas noches", 20); //Creacion de caja de texto de una sola linea con numero de columnas (Solo funciona activando los LAYOUTS)
        cajaTexto2.setBounds(50, 100, 200, 20); //Posicion y tamaño de la caja de texto
        
        System.out.println("El texto que ingresaste fue: "+"\n"+cajaTexto1.getText()); //Metodo que toma los valores dentro de la caja de texto

        panel.add(cajaTexto1);//Agregamos la caja de texto al panel
        panel.add(cajaTexto2);//Agregamos la caja de texto al panel

    }

}//CLASS
