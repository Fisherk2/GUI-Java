package JFrameComponentes;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup; //Paquete que necesitamos exportar para utilizar los botones agrupados
import javax.swing.JFrame; //Paquete que necesitamos exportar para utilizar las graficas en JAVA
import javax.swing.JPanel; //Paquete que necesitamos exportar para utilizar los paneles en JAVA
import javax.swing.JRadioButton;//Paquete que necesitamos exportar para usar los Radio Botones

public class RadioBotonJRadioButton extends JFrame { //CLASE QUE HEREDA LOS METODOS Y ATRIBUTOS DE LA SUPERCLASE JFRAME (ver API Javax.Swing)
    //ATRIBUTOS

    private JPanel panel; //Declaramos un tipo JPanel para poder usarlo en nuestros metodos de manera libre en esta clase

    public RadioBotonJRadioButton() { //Ventana centrada que no puede cambiar de tamaño 
        //VENTANA
        setSize(800, 800); //Establecemos el tamaño de la ventana (ANCHO, LARGO) en pixeles
        setTitle("Radio botones");//Sirve para establecer un titulo a la ventana
        setLocationRelativeTo(null); //El "null" sirve para centrar la posicion inicial de la ventana 
        setResizable(false); //Establecemos que la ventana no pueda cambiar de tamaño con el argumento FALSE

        //COMPONENTES (CAPAS o LAYOUTS)
        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando se cierre la ventana, esta terminara la ejecucion del programa  
    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarRadioBotones();
    }

    private void colocarPaneles() {
        //PANEL 1
        panel = new JPanel(); //Creacion de un panel
        panel.setBackground(Color.pink);//Le damos color al panel (en este caso rosa)
        panel.setLayout(null);//Desactivamos el diseño del panel (LAYOUTS)

        this.getContentPane().add(panel); //Agregamos el panel a la ventana
    }

    private void colocarRadioBotones() {
        //RADIO BOTON
        JRadioButton rBoton = new JRadioButton("Opcion 1", true); //Creacion de un radio boton con texto y si esta marcado automaticamente al arrancar o no
        rBoton.setBounds(50, 100, 100, 50); //Establecemos la posicion y tamaño del radio boton
        rBoton.setEnabled(false); //Deshabilitamos el radio boton para que no pueda ser pulsado

        JRadioButton rBoton2 = new JRadioButton("Opcion 2", false); //Creacion de un radio boton con texto y si esta marcado automaticamente al arrancar o no
        rBoton2.setBounds(50, 150, 120, 50); //Establecemos la posicion y tamaño del radio boton
        rBoton2.setText("Programacion"); //Establecemos texto del boton con su metodo

        JRadioButton rBoton3 = new JRadioButton("Opcion 3", false); //Creacion de un radio boton con texto y si esta marcado automaticamente al arrancar o no
        rBoton3.setBounds(50, 200, 150, 50); //Establecemos la posicion y tamaño del radio boton
        rBoton3.setFont(new Font("consolas", 2, 20)); //Establecemos el tipo de fuente a nuestro texto

        //GRUPO DE BOTONES
        ButtonGroup grupoBoton = new ButtonGroup(); //Creacion de grupo de botones
        grupoBoton.add(rBoton);
        grupoBoton.add(rBoton2); //Agrupamos nuestros botones para que no puedan ser marcadas al mismo tiempo, solo uno de tres
        grupoBoton.add(rBoton3);

        panel.add(rBoton);//Añadimos el radio boton al panel
        panel.add(rBoton2);//Añadimos el radio boton al panel
        panel.add(rBoton3);//Añadimos el radio boton al panel

    }

}//CLASS
