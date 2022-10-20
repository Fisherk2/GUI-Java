package ListasConObjetos;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class ListasJList extends JFrame { //CLASE QUE HEREDA LOS METODOS Y ATRIBUTOS DE LA SUPERCLASE JFRAME (ver API Javax.Swing)
    //ATRIBUTOS

    private JPanel panel; //Declaramos un tipo JPanel para poder usarlo en nuestros metodos de manera libre en esta clase

    public ListasJList() { //Ventana centrada que no puede cambiar de tamaño 
        //VENTANA
        setSize(800, 800); //Establecemos el tamaño de la ventana (ANCHO, LARGO) en pixeles
        setTitle("Listas");//Sirve para establecer un titulo a la ventana
        setLocationRelativeTo(null); //El "null" sirve para centrar la posicion inicial de la ventana 
        setResizable(false); //Establecemos que la ventana no pueda cambiar de tamaño con el argumento FALSE

        //COMPONENTES (CAPAS o LAYOUTS)
        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando se cierre la ventana, esta terminara la ejecucion del programa  
    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarListas();
    }

    private void colocarPaneles() {
        //PANEL 1
        panel = new JPanel(); //Creacion de un panel
        panel.setBackground(Color.pink);//Le damos color al panel (en este caso rosa)
        panel.setLayout(null);//Desactivamos el diseño del panel (LAYOUTS)

        this.getContentPane().add(panel); //Agregamos el panel a la ventana
    }

    private void colocarListas() {
        //LISTA CON OBJETOS
        DefaultListModel modelo = new DefaultListModel();//Creamos un modelo para la lista
        modelo.addElement(new Persona("Fisher", "Mexicano", 24));//Agregamos el objeto al modelo
        modelo.addElement(new Persona("Alberto", "Chileno", 27));//Agregamos el objeto al modelo
        JList lista = new JList(modelo);//Creacion de una lista usando el modelo declarado
        lista.setBounds(20, 20, 200, 300);//Posicion y tamaño de la lista

        panel.add(lista);//Agregamos la lista al panel

        //Deslizador
        JScrollPane scroll = new JScrollPane(lista, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED); //Creacion de un deslizador para la lista
        scroll.setBounds(20, 20, 200, 300);//Posicion y tamaño del scroll
        panel.add(scroll);

    }

}//CLASS
