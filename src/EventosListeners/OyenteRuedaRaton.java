package EventosListeners;

import java.awt.Color;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author Fisher
 */
public class OyenteRuedaRaton extends JFrame {
    //ATRIBUTOS (Todos los objetos GUI que necesitamos para poder manipularlo en esta clase)

    private JPanel panel;
    private JTextArea areaText;

    //CONSTRUCTOR
    public OyenteRuedaRaton() {
        //VENTANA
        setSize(500, 500);
        setTitle("Oyente movimiento de raton");
        setResizable(false); //El tamaño no puede moverse por el usuario
        setLocationRelativeTo(null);//Centrado a la pantalla del usuario

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);//Terminar el programa al cerrar la ventana
    }

    //METODOS
    private void iniciarComponentes() {
        colocarPanel();
        colocarAreaTexto();
    }

    private void colocarPanel() {
        panel = new JPanel(); //Creacion de un panel
        panel.setSize(500, 500);
        panel.setLayout(null);//Lo desactivamos para poder acomodar etiquetas y demas elementos en nuestro panel
        panel.setBackground(Color.blue);//Establecemos fondo de nuestro panel

        this.add(panel);//Agregamos el panel a la ventana

        eventoDeRuedaRaton(); //Los eventos los puedes poner en un contenedor como a un componente

    }

    private void colocarAreaTexto() {
        areaText = new JTextArea(); //Creacion de area de texto
        areaText.setBounds(20, 20, 400, 300);

        panel.add(areaText);//Agregamos el area de texto al panel

        //deslizador
        JScrollPane deslizador = new JScrollPane(areaText, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        deslizador.setBounds(20, 20, 400, 300);

        panel.add(deslizador);

    }

    private void eventoDeRuedaRaton() {
        MouseWheelListener ruedaRaton = new MouseWheelListener() {
            //Importamos todos los metodos abstractos del interface
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {//Se va ejecutar cuando muevas la rueda del raton

//                areaText.append("Estas moviendo la rueda del raton sobre el panel\n");
                
                //Para saber para donde se movio la rueda del raton
                if (e.getPreciseWheelRotation() == -1) {//Valores negativos significa que la rueda fue hacia arriba, mientras que positivos fue hacia abajo
                    areaText.append("MOVIMIENTO HACIA ARRIBA\n");
                } if (e.getPreciseWheelRotation() == 1) {
                    areaText.append("MOVIMIENTO HACIA ABAJO\n");
                }
            }
        };

        //Toda accion con el raton, sera interactuando con el panel
        panel.addMouseWheelListener(ruedaRaton);//Agregamos el evento al panel

    }
}
