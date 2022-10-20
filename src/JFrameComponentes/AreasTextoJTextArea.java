package JFrameComponentes;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AreasTextoJTextArea extends JFrame { //CLASE QUE HEREDA LOS METODOS Y ATRIBUTOS DE LA SUPERCLASE JFRAME (ver API Javax.Swing)
    //ATRIBUTOS

    private JPanel panel; //Declaramos un tipo JPanel para poder usarlo en nuestros metodos de manera libre en esta clase

    public AreasTextoJTextArea() { //Ventana centrada que no puede cambiar de tamaño 
        //VENTANA
        setSize(800, 800); //Establecemos el tamaño de la ventana (ANCHO, LARGO) en pixeles
        setTitle("Area de texto");//Sirve para establecer un titulo a la ventana
        setLocationRelativeTo(null); //El "null" sirve para centrar la posicion inicial de la ventana 
        setResizable(false); //Establecemos que la ventana no pueda cambiar de tamaño con el argumento FALSE

        //COMPONENTES (CAPAS o LAYOUTS)
        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando se cierre la ventana, esta terminara la ejecucion del programa  
    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarAreaDeTexto();
    }

    private void colocarPaneles() {
        //PANEL 1
        panel = new JPanel(); //Creacion de un panel
        panel.setBackground(Color.pink);//Le damos color al panel (en este caso rosa)
        panel.setLayout(null);//Desactivamos el diseño del panel (LAYOUTS)

        this.getContentPane().add(panel); //Agregamos el panel a la ventana
    }

    private void colocarAreaDeTexto() {
        //AREA DE TEXTO
        JTextArea areaText = new JTextArea();//Creacion de un area de texto
        areaText.setBounds(20, 20, 300, 200);//Posicion y tamaño del area de texto
        areaText.setText("Describe aqui...");//Establece un texto inicial en la area de texto
        areaText.append("\nPORFAVOR"); //Añade mas texto a la area
        areaText.setEditable(false); //Podemos restringir que el usuario modifique el area de texto

        System.out.println("El texto que ingresaste fue: " + "\n" + areaText.getText());//Obtener el contenido del area de texto

        panel.add(areaText);//Agregamos el area de texto en el panel
    }

}//CLASS
