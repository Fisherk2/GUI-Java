package Menus;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class BarraMenuManual extends JFrame {

    private JPanel panel = new JPanel();

    public BarraMenuManual() {
        //VENTANA
        setSize(400, 300); //Establecemos el tamaño de la ventana (ANCHO, LARGO) en pixeles
        setTitle("Menu manual");//Sirve para establecer un titulo a la ventana
        setLocationRelativeTo(null); //El "null" sirve para centrar la posicion inicial de la ventana 
        setResizable(false); //Establecemos que la ventana no pueda cambiar de tamaño con el argumento FALSE

        //COMPONENTES (CAPAS o LAYOUTS)
        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando se cierre la ventana, esta terminara la ejecucion del programa 
    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarBarraMenu();
    }

    private void colocarPaneles() {
        //PANEL
        panel = new JPanel(); //Creacion de un panel
        panel.setLayout(null);//Desactivamos el diseño del panel (LAYOUTS)

        this.getContentPane().add(panel); //Agregamos el panel a la ventana

    }

    private void colocarBarraMenu() {
        //BARRA DE MENUS
        JMenuBar barraDeMenu = new JMenuBar(); //SOLO SE PUEDE CREAR UNA BARRA DE MENU POR VENTANA
        setJMenuBar(barraDeMenu); //Agregamos la barra a la ventana

        JMenu menu1 = new JMenu("Opciones");
        barraDeMenu.add(menu1); //Colocamos el menu en la barra

        JMenuItem opcion1, opcion2, opcion3; //Opcion que se mostrara en la lista desplegable del menu seleccionado

        opcion1 = new JMenuItem("Rojo");
        menu1.add(opcion1);

        opcion2 = new JMenuItem("Verde");
        menu1.add(opcion2);

        opcion3 = new JMenuItem("Azul");
        menu1.add(opcion3);

        eventoAccionOpciones(opcion1, opcion2, opcion3); //Se envia de argumento los items dependiendo de la opcion que se presione
    }

    private void eventoAccionOpciones(JMenuItem opcion1, JMenuItem opcion2, JMenuItem opcion3) { 
        ActionListener evento = new ActionListener() {

            @Override //Se sobreescribe ya que es una clase abstracta
            public void actionPerformed(ActionEvent e) {

                //Condiciones dependiendo de que item se seleccione
                if (e.getSource() == opcion1) { //Rojo
                    panel.setBackground(Color.RED);
                }
                if (e.getSource() == opcion2) { //Verde
                    panel.setBackground(Color.GREEN);
                }
                if (e.getSource() == opcion3) { //Azul
                    panel.setBackground(Color.BLUE);
                }
            }
        };//OBJETO

        opcion1.addActionListener(evento);
        opcion2.addActionListener(evento);
        opcion3.addActionListener(evento);

    }

}
