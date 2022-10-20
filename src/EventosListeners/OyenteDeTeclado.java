package EventosListeners;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class OyenteDeTeclado extends JFrame {

    //ATRIBUTOS (Todos los objetos GUI que necesitamos para poder manipularlo en esta clase)
    private JPanel panel;
    private JTextArea areaText;
    private JTextField cajaText;

    //CONSTRUCTOR
    public OyenteDeTeclado() {
        //VENTANA
        setSize(500, 500);
        setTitle("Oyente de Teclado");
        setResizable(false); //El tamaño no puede moverse por el usuario
        setLocationRelativeTo(null);//Centrado a la pantalla del usuario

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);//Terminar el programa al cerrar la ventana
    }

    //METODOS
    private void iniciarComponentes() {
        colocarPanel();
        colocarCajaTexto();
        colocarAreaTexto();
    }

    private void colocarPanel() {
        panel = new JPanel(); //Creacion de un panel
        panel.setSize(500, 500);
        panel.setLayout(null);//Lo desactivamos para poder acomodar etiquetas y demas elementos en nuestro panel
        panel.setBackground(Color.red);//Establecemos fondo de nuestro panel

        this.add(panel);//Agregamos el panel a la ventana
    }

    private void colocarAreaTexto() {
        areaText = new JTextArea(); //Creacion de area de texto
        areaText.setBounds(200, 20, 250, 300);

        panel.add(areaText);//Agregamos el area de texto al panel

    }

    private void colocarCajaTexto() {
        cajaText = new JTextField(); //Creacion de caja de texto de una sola linea
        cajaText.setBounds(20, 20, 100, 25);

        panel.add(cajaText);//Agregamos la caja de texto al panel

        eventoOyenteDeTeclado();

    }

    private void eventoOyenteDeTeclado() {
        //Agregamos un oyente de teclado
        KeyListener eventoTecla = new KeyListener() { //Creacion de objeto
            @Override
            public void keyTyped(KeyEvent e) {
                //Evento que sucede al presionar caracteres UNICODE (no ALT, Control, Supr, etc...)
                areaText.append("Has presionado un caracter UNICODE\n");//Agregamos texto al area 
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //Evento que sucede al presionar cualquier tecla en el componente, en este caso, en la caja de texto
                areaText.append("Has presionado cualquier tecla\n");//Agregamos texto al area 
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //Evento que sucede al presionar y soltar cualquier tecla, en este caso, en la caja de texto

                if (e.getKeyChar() == 'F') { //Condicion si presiona una tecla especifica, en este caso P
                    areaText.append("Has presionado F\n");
                }
                if (e.getKeyChar() == '\n') {//Condicion si presiona una tecla especifica, en este caso ENTER
                    areaText.append("Has presionado ENTER\n");
                }
                if (e.getKeyChar() == ' ') {//Condicion si presiona una tecla especifica, en este caso ESPACIO
                    areaText.append("Has presionado ESPACIO\n");
                }
            }

        };//OBJETO

        cajaText.addKeyListener(eventoTecla);//Todo evento que involucre al teclado sera dentro de la caja de texto
    }

}
