package Menus;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class SubMenuManual extends JFrame {

    private JPanel panel = new JPanel();

    public SubMenuManual() {
        //VENTANA
        setSize(300, 300); //Establecemos el tamaño de la ventana (ANCHO, LARGO) en pixeles
        setTitle("SubMenu");//Sirve para establecer un titulo a la ventana
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
        //MENU OPCIONES
        JMenu menuOpciones, menuTamaño, menuColor;
        menuOpciones = new JMenu("Opciones");
        barraDeMenu.add(menuOpciones); //Colocamos el menu en la barra
        //SUBMENU DE OPCIONES
        menuTamaño = new JMenu("Tamaño de la ventana");
        menuOpciones.add(menuTamaño); //Colocamos el SUBMENU en el menu de opciones
        menuColor = new JMenu("Color de la ventana");
        menuOpciones.add(menuColor); //Colocamos el SUBMENU en el menu de opciones
        //ITEMS
        JMenuItem tamaño1, tamaño2, color1, color2; //Opcion que se mostrara en la lista desplegable del SUBMENU seleccionado
        tamaño1 = new JMenuItem("500x500");
        menuTamaño.add(tamaño1); //Colocamos los items en los SUBMENUS correspondientes
        tamaño2 = new JMenuItem("800x600");
        menuTamaño.add(tamaño2); //Colocamos los items en los SUBMENUS correspondientes
        color1 = new JMenuItem("VERDE");
        menuColor.add(color1);//Colocamos los items en los SUBMENUS correspondientes
        color2 = new JMenuItem("VIOLETA");
        menuColor.add(color2);//Colocamos los items en los SUBMENUS correspondientes

        eventoAccionOpciones(tamaño1, tamaño2, color1, color2); //Se envia de argumento los items dependiendo de la opcion que se presione
    }

    private void eventoAccionOpciones(JMenuItem tamaño1, JMenuItem tamaño2, JMenuItem color1, JMenuItem color2) {
        ActionListener evento = new ActionListener() {

            @Override //Se sobreescribe ya que es una clase abstracta
            public void actionPerformed(ActionEvent e) {
                //Condicion dependiendo de que SUBMENU se haya presionado
                if (e.getSource() == tamaño1) {
                    setSize(500, 500); //Se cambia el tamaño de la ventana
                }
                if (e.getSource() == tamaño2) {
                    setSize(800, 600); //Se cambia el tamaño de la ventana
                }
                if (e.getSource() == color1) {
                    panel.setBackground(Color.GREEN); //Se cambia el color del Panel
                }
                if (e.getSource() == color2) {
                    panel.setBackground(new Color(139, 0, 255)); //Se cambia el color del Panel
                }

            }
        };//OBJETO

        tamaño1.addActionListener(evento);
        tamaño2.addActionListener(evento);
        color1.addActionListener(evento);
        color2.addActionListener(evento);

    }

}
