package JFrameComponentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame; 
import javax.swing.JPanel; 

public class BotonJButton extends JFrame { //CLASE QUE HEREDA LOS METODOS Y ATRIBUTOS DE LA SUPERCLASE JFRAME (ver API Javax.Swing)
    //ATRIBUTOS

    private JPanel panel; //Declaramos un tipo JPanel para poder usarlo en nuestros metodos de manera libre en esta clase

    public BotonJButton() { //Ventana centrada que no puede cambiar de tamaño 
        //VENTANA
        setSize(800, 800); //Establecemos el tamaño de la ventana (ANCHO, LARGO) en pixeles
        setTitle("Botones");//Sirve para establecer un titulo a la ventana
        setLocationRelativeTo(null); //El "null" sirve para centrar la posicion inicial de la ventana 
        setResizable(false); //Establecemos que la ventana no pueda cambiar de tamaño con el argumento FALSE

        //COMPONENTES (CAPAS o LAYOUTS)
        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando se cierre la ventana, esta terminara la ejecucion del programa  
    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarBotones();
    }

    private void colocarPaneles() {
        //PANEL 1
        panel = new JPanel(); //Creacion de un panel
        panel.setBackground(Color.pink);//Le damos color al panel (en este caso rosa)
        panel.setLayout(null);//Desactivamos el diseño del panel (LAYOUTS)

        this.getContentPane().add(panel); //Agregamos el panel a la ventana
    }

    private void colocarBotones() {
        //BOTON 1
        JButton boton1 = new JButton("CLICK"); //Creacion de un boton con texto incluido
        boton1.setBounds(100, 100, 150, 40); //Establecemos la posicion y tamaño del boton
        boton1.setText("PRESIONAR"); //Podemos agregar texto por un metodo 
        boton1.setEnabled(true); //Establecemos la interaccion al boton (TRUE = Se puede presionar, FALSE = No se puede presionar)
        boton1.setMnemonic('a'); //Establecemos la interaccion del boton alt + letra como si estuvieramos presionandolo
        boton1.setForeground(Color.magenta); //Establecemos el color del texto del boton
        boton1.setFont(new Font("cooper black", 2, 14)); //Establecemos la fuente del texto del boton

        //BOTON 2 (IMAGEN)
        JButton boton2 = new JButton(); //Creacion de un boton
        boton2.setBounds(100, 200, 100, 50); //Establecemos posicion y tamaño del boton
        boton2.setBackground(Color.ORANGE); //Establecemos el color del boton
        ImageIcon imagenBoton = new ImageIcon("boton.png");//Agregamos una imagen
        boton2.setIcon(new ImageIcon(imagenBoton.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));//Acomodamos la imagen escalandolo del tamaño del boton

        panel.add(boton1);
        panel.add(boton2);
    }
}
