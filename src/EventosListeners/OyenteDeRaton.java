package EventosListeners;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class OyenteDeRaton extends JFrame {

    //ATRIBUTOS (Todos los objetos GUI que necesitamos para poder manipularlo en esta clase)
    private JPanel panel;
    private JButton boton;
    private JTextArea areaText;

    //CONSTRUCTOR
    public OyenteDeRaton() {
        //VENTANA
        setSize(500, 500);
        setTitle("Oyente de Raton");
        setResizable(false); //El tamaño no puede moverse por el usuario
        setLocationRelativeTo(null);//Centrado a la pantalla del usuario

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);//Terminar el programa al cerrar la ventana
    }

    //METODOS
    private void iniciarComponentes() {
        colocarPanel();
        colocarBoton();
        colocarAreaTexto();
    }

    private void colocarPanel() {
        panel = new JPanel(); //Creacion de un panel
        panel.setSize(500, 500);
        panel.setLayout(null);//Lo desactivamos para poder acomodar etiquetas y demas elementos en nuestro panel
        panel.setBackground(Color.blue);//Establecemos fondo de nuestro panel

        this.add(panel);//Agregamos el panel a la ventana
    }

    private void colocarAreaTexto() {
        areaText = new JTextArea(); //Creacion de area de texto
        areaText.setBounds(20, 20, 400, 300);

        panel.add(areaText);//Agregamos el area de texto al panel

    }

    private void colocarBoton() {
        boton = new JButton();//Creamos el boton
        boton.setBounds(130, 350, 200, 50);
        boton.setText("CLICK AQUI");
        boton.setForeground(Color.WHITE);//Color de letra
        boton.setBackground(Color.black);//Color del boton

        panel.add(boton);//Agregamos boton al panel

        eventoOyenteDeRaton();

    }

    private void eventoOyenteDeRaton() {
        //Agregamos un oyente de raton
        MouseListener raton1 = new MouseListener() {//Creacion de oyente de raton sobrescribiendo todos los metodos abstractos de la clase MouseListener
            @Override
            public void mouseClicked(MouseEvent e) {
                //Es un evento cada que el usuario haga click en algun componente, en este caso, el boton del panel
                areaText.append("Has hecho click al boton\n");//Añadimos un texto al area del panel
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //Es un evento cada que el usuario haga presion constante en algun componente, en este caso, el boton del panel
                areaText.append("Has presionado el boton\n");//Añadimos un texto al area del panel
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //Es un evento cada que el usuario haga click y suelte afuera o adentro de algun componente, en este caso, el boton del panel
                areaText.append("Has presionado el boton soltando afuera\n");//Añadimos un texto al area del panel
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //Es un evento cada que el usuario pase la flecha del raton en algun componente, en este caso, el boton del panel
                areaText.append("Has pasado la flecha del raton\n");//Añadimos un texto al area del panel
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //Es un evento cada que el usuario pase la flecha del raton afuera de algun componente, en este caso, el boton del panel
                areaText.append("Has sacado la flecha del boton\n");//Añadimos un texto al area del panel
            }

        };//OBJETO 

        //Toda accion con el raton, sera interactuando con el boton
        boton.addMouseListener(raton1);//Vaciamos el argumento con el objeto de la clase MouseListener
    }

}
