package JFrameComponentes;

import java.awt.Color;
import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class TablaJTable extends JFrame { //CLASE QUE HEREDA LOS METODOS Y ATRIBUTOS DE LA SUPERCLASE JFRAME (ver API Javax.Swing)
    //ATRIBUTOS

    private JPanel panel; //Declaramos un tipo JPanel para poder usarlo en nuestros metodos de manera libre en esta clase

    public TablaJTable() { //Ventana centrada que no puede cambiar de tamaño 
        //VENTANA
        setSize(800, 800); //Establecemos el tamaño de la ventana (ANCHO, LARGO) en pixeles
        setTitle("Tablas");//Sirve para establecer un titulo a la ventana
        setLocationRelativeTo(null); //El "null" sirve para centrar la posicion inicial de la ventana 
        setResizable(false); //Establecemos que la ventana no pueda cambiar de tamaño con el argumento FALSE

        //COMPONENTES (CAPAS o LAYOUTS)
        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando se cierre la ventana, esta terminara la ejecucion del programa  
    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarTablas();
    }

    private void colocarPaneles() {
        //PANEL 1
        panel = new JPanel(); //Creacion de un panel
        panel.setBackground(Color.pink);//Le damos color al panel (en este caso rosa)
        panel.setLayout(null);//Desactivamos el diseño del panel (LAYOUTS)

        this.getContentPane().add(panel); //Agregamos el panel a la ventana
    }

    private void colocarTablas() {
        //TABLA
        DefaultTableModel modelo = new DefaultTableModel(); //Creacion de un modelo para la tabla
        modelo.addColumn("NOMBRE");//Agregamos columnas a la tabla
        modelo.addColumn("EDAD"); //Agregamos columnas a la tabla
        modelo.addColumn("NACIONALIDAD");//Agregamos columnas a la tabla

        String[] persona1 = {"Alberto", "24", "Mexicano"}; //Arreglo de datos que nos servira de ejemplo para rellenar las filas de la tabla
        String[] persona2 = {"Fisher", "27", "Chileno"}; //Arreglo de datos que nos servira de ejemplo para rellenar las filas de la tabla
        modelo.addRow(persona1);//Agregamos valores a las filas
        modelo.addRow(persona2);//Agregamos valores a las filas

        JTable tabla = new JTable(modelo); //Creacion de una tabla con el modelo como argumento
        tabla.setBounds(20, 20, 300, 200);//Posicion y tamaño de la tabla

        panel.add(tabla);//Agregamos la tabla al panel

        //Deslizador (Nos sirve para visualizar nuestras columnas de manera grafica)
        JScrollPane deslizador = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);//Agregamos un scroll vertical y horizontal cuando sea necesario a la tabla
        deslizador.setBounds(20, 20, 300, 200);//Posicion y tamaño del deslizador

        panel.add(deslizador); //Agregamos el deslizador al panel

    }

}//CLASS
