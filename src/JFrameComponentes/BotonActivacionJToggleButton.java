package JFrameComponentes;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JFrame; 
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class BotonActivacionJToggleButton extends JFrame { //CLASE QUE HEREDA LOS METODOS Y ATRIBUTOS DE LA SUPERCLASE JFRAME (ver API Javax.Swing)
    //ATRIBUTOS

    private JPanel panel; //Declaramos un tipo JPanel para poder usarlo en nuestros metodos de manera libre en esta clase

    public BotonActivacionJToggleButton() { //Ventana centrada que no puede cambiar de tamaño 
        //VENTANA
        setSize(800, 800); //Establecemos el tamaño de la ventana (ANCHO, LARGO) en pixeles
        setTitle("Boton de activacion");//Sirve para establecer un titulo a la ventana
        setLocationRelativeTo(null); //El "null" sirve para centrar la posicion inicial de la ventana 
        setResizable(false); //Establecemos que la ventana no pueda cambiar de tamaño con el argumento FALSE

        //COMPONENTES (CAPAS o LAYOUTS)
        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando se cierre la ventana, esta terminara la ejecucion del programa  
    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarBotonDeActivacion();
    }

    private void colocarPaneles() {
        //PANEL 1
        panel = new JPanel(); //Creacion de un panel
        panel.setBackground(Color.pink);//Le damos color al panel (en este caso rosa)
        panel.setLayout(null);//Desactivamos el diseño del panel (LAYOUTS)

        this.getContentPane().add(panel); //Agregamos el panel a la ventana
    }

    private void colocarBotonDeActivacion() {
        //BOTON DE ACTIVACION (funciona como un radio boton)
        JToggleButton botonActivador1 = new JToggleButton("Opcion 1", true);//Creacion de un boton de activacion con texto y si esta marcado automaticamente al arrancar o no
        botonActivador1.setBounds(50, 100, 100, 40); //Posicion y tamaño del boton activador
        botonActivador1.setEnabled(false); //Deshabilitamos el boton de activacion para que no pueda ser pulsado

        JToggleButton botonActivador2 = new JToggleButton("Opcion 2", false);//Creacion de un boton de activacion con texto y si esta marcado automaticamente al arrancar o no
        botonActivador2.setText("Programacion"); //Establecemos texto del boton de activacion con su metodo
        botonActivador2.setBounds(50, 150, 120, 40); //Posicion y tamaño del boton activador

        JToggleButton botonActivador3 = new JToggleButton("Opcion 3", false);//Creacion de un boton de activacion con texto y si esta marcado automaticamente al arrancar o no
        botonActivador3.setFont(new Font("consolas", 2, 20)); //Establecemos el tipo de fuente a nuestro texto
        botonActivador3.setBounds(50, 200, 150, 40); //Posicion y tamaño del boton activador

        //Grupo de botones (Sirve para que cuando se presione un boton, el otro se desmarque)
        ButtonGroup grupoBotonesActivados = new ButtonGroup();
        grupoBotonesActivados.add(botonActivador1); //Agregamos el boton al grupo de botones
        grupoBotonesActivados.add(botonActivador2); //Agregamos el boton al grupo de botones
        grupoBotonesActivados.add(botonActivador3); //Agregamos el boton al grupo de botones

        panel.add(botonActivador1);//Añadimos el boton de activacion al panel
        panel.add(botonActivador2);//Añadimos el boton de activacion al panell
        panel.add(botonActivador3);//Añadimos el boton de activacion al panel

    }

}//CLASS
