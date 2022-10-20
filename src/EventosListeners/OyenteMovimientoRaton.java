package EventosListeners;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
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
public class OyenteMovimientoRaton extends JFrame {
    //ATRIBUTOS (Todos los objetos GUI que necesitamos para poder manipularlo en esta clase)

    private JPanel panel;
    private JTextArea areaText;

    //CONSTRUCTOR
    public OyenteMovimientoRaton() {
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

        eventoMovimientoRaton(); //Tanto componentes, como contenedores, podemos hacer interaccion con los eventos
    }

    private void eventoMovimientoRaton() {
        MouseMotionListener oyenteMovimientoRaton = new MouseMotionListener() {
            //Importamos todos los metodos abstractos del interface
            @Override
            //Cada pixel que muevas o arrastres, se va ejecutar
            public void mouseDragged(MouseEvent e) { //Se va ejecutar cuando se de click y se arrastre al mismo tiempo
                areaText.append("Usted ha hecho click y arrastrado un elemento dentro del panel\n");
            }

            @Override
            public void mouseMoved(MouseEvent e) { //Se va ejecutar mientras se este moviendo el raton
                areaText.append("Usted esta moviendo el raton dentro del panel\n");
            }
        };
        //Toda accion con el raton, sera interactuando con el panel
        panel.addMouseMotionListener(oyenteMovimientoRaton); //Agregamos el evento al panel

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

}
