package ListasConObjetos;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame; 
import javax.swing.JPanel; 

public class ListaDesplegableDefaultComboBox extends JFrame { //CLASE QUE HEREDA LOS METODOS Y ATRIBUTOS DE LA SUPERCLASE JFRAME (ver API Javax.Swing)
    //ATRIBUTOS

    private JPanel panel; //Declaramos un tipo JPanel para poder usarlo en nuestros metodos de manera libre en esta clase

    public ListaDesplegableDefaultComboBox() { //Ventana centrada que no puede cambiar de tamaño 
        //VENTANA
        setSize(800, 800); //Establecemos el tamaño de la ventana (ANCHO, LARGO) en pixeles
        setTitle("Lista desplegable con DefaultComboBox");//Sirve para establecer un titulo a la ventana
        setLocationRelativeTo(null); //El "null" sirve para centrar la posicion inicial de la ventana 
        setResizable(false); //Establecemos que la ventana no pueda cambiar de tamaño con el argumento FALSE

        //COMPONENTES (CAPAS o LAYOUTS)
        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando se cierre la ventana, esta terminara la ejecucion del programa  
    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarListaDesplegable();
    }

    private void colocarPaneles() {
        //PANEL 1
        panel = new JPanel(); //Creacion de un panel
        panel.setBackground(Color.pink);//Le damos color al panel (en este caso rosa)
        panel.setLayout(null);//Desactivamos el diseño del panel (LAYOUTS)

        this.getContentPane().add(panel); //Agregamos el panel a la ventana
    }

    private void colocarListaDesplegable() {
        Persona sujeto1 = new Persona("Fisher", "Mexicano", 24);
        Persona sujeto2 = new Persona("Alberto", "Frances", 27);
        Persona sujeto3 = new Persona("Zuñiga", "Chileno", 18);

        //LISTA DESPLEGABLE DE OBJETOS
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();//Creacion de un modelo de lista desplegable
        JComboBox listaDesple = new JComboBox(modelo); //Creacion de una lista desplegable

        listaDesple.setBounds(20, 20, 200, 30); //Posicion y tamaño del arreglo
        modelo.addElement(sujeto1);//Agregamos objeto extra a la lista desplegable
        modelo.addElement(sujeto2);//Agregamos objeto extra a la lista desplegable
        modelo.addElement(sujeto3);//Agregamos objeto extra a la lista desplegable

        modelo.setSelectedItem(sujeto2);//Seleccionamos el segundo objeto visto de la lista al arrancar el programa

        panel.add(listaDesple);//Agregamos la lista desplegable al panel
    }

}//CLASS
