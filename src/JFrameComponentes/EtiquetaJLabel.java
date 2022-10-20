package JFrameComponentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 
import javax.swing.SwingConstants;

public class EtiquetaJLabel extends JFrame { //CLASE QUE HEREDA LOS METODOS Y ATRIBUTOS DE LA SUPERCLASE JFRAME (ver API Javax.Swing)

    public EtiquetaJLabel() { //Ventana centrada que no puede cambiar de tamaño 
        //VENTANA
        setSize(800, 800); //Establecemos el tamaño de la ventana (ANCHO, LARGO) en pixeles
        setTitle("Etiquetas");//Sirve para establecer un titulo a la ventana
        setLocationRelativeTo(null); //El "null" sirve para centrar la posicion inicial de la ventana 
        setResizable(false); //Establecemos que la ventana no pueda cambiar de tamaño con el argumento FALSE

        //COMPONENTES (CAPAS o LAYOUTS)
        iniciarComponentesSoloTexto(); 
        iniciarComponentesImagenesYTexto();

        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando se cierre la ventana, esta terminara la ejecucion del programa  
    }

    private void iniciarComponentesSoloTexto() {
        //PANEL
        JPanel panel = new JPanel(); //Creacion de un panel
        panel.setBackground(Color.pink);//Le damos color al panel (en este caso rosa)
        panel.setLayout(null);//Desactivamos el diseño del panel (LAYOUTS)

        this.getContentPane().add(panel); //Agregamos el panel a la ventana
        //ETIQUETAS DE TEXTO
        JLabel etiqueta1 = new JLabel("HELLO THERE");//Creacion de una etiqueta de texto directamente del constructor
        etiqueta1.setText("GENERAL KENOBI"); //Etiqueta de texto por medio de un metodo
        etiqueta1.setForeground(Color.blue); //Le damos color al texto de la etiqueta (en este caso azul)
        etiqueta1.setBounds(100, 100, 130, 130); //Posicion y tamaño de la etiqueta de texto
        etiqueta1.setOpaque(true); //Permiso para poder cambiar el fondo de la etiqueta
        etiqueta1.setBackground(Color.WHITE); //Cambiamos el color de fondo de la etiqueta (en este caso blanco)

        JLabel etiqueta2 = new JLabel("HELLO THERE", SwingConstants.CENTER);//Creacion de una etiqueta de texto directamente del constructor con argumentos de posicion
        etiqueta2.setText("GENERAL KENOBI"); //Etiqueta de texto por medio de un metodo
        etiqueta2.setHorizontalAlignment(SwingConstants.CENTER); //Alineamos el texto por medio de un metodo
        etiqueta2.setForeground(Color.WHITE); //Le damos color al texto de la etiqueta (en este caso azul)
        etiqueta2.setBounds(250, 250, 150, 100); //Posicion y tamaño de la etiqueta de texto
        etiqueta2.setOpaque(true); //Permiso para poder cambiar el fondo de la etiqueta
        etiqueta2.setBackground(Color.BLACK); //Cambiamos el color de fondo de la etiqueta (en este caso blanco)
        etiqueta2.setFont(new Font("complex", 1, 10)); //Establecemos la fuente del texto (Tipo de texto, forma de texto, tamaño de texto)

        panel.add(etiqueta1);// Agregamos la etiqueta al panel
        panel.add(etiqueta2);// Agregamos la etiqueta al panel

    }

    private void iniciarComponentesImagenesYTexto() {
        //PANEL
        JPanel panel = new JPanel(); //Creacion de un panel
        panel.setBackground(Color.pink);//Le damos color al panel (en este caso rosa)
        panel.setLayout(null);//Desactivamos el diseño del panel (LAYOUTS)

        this.getContentPane().add(panel); //Agregamos el panel a la ventana
        //ETIQUETA DE TEXTO
        JLabel etiqueta1 = new JLabel("FISHER", SwingConstants.CENTER);//Creacion de una etiqueta de texto directamente del constructor con argumentos de posicion
        etiqueta1.setForeground(Color.WHITE); //Le damos color al texto de la etiqueta (en este caso azul)
        etiqueta1.setBounds(85, 10, 300, 80); //Posicion y tamaño de la etiqueta de texto
        etiqueta1.setOpaque(true); //Permiso para poder cambiar el fondo de la etiqueta
        etiqueta1.setBackground(Color.BLACK); //Cambiamos el color de fondo de la etiqueta (en este caso blanco)
        etiqueta1.setFont(new Font("complex", 0, 40)); //Establecemos la fuente del texto (Tipo de texto, forma de texto, tamaño de texto)
        //ETIQUETAS DE IMAGEN
        JLabel etiqueta2 = new JLabel(new ImageIcon("shinigamiSama.jpg"));//Creacion de una etiqueta que toma una imagen de la carpeta del proyecto directamente del constructor con argumentos de tipo ICON
        etiqueta2.setIcon(new ImageIcon("shinigamiSama.jpg"));//Establecer la imagen por medio de un metodo
        etiqueta2.setBounds(10, 80, 630, 630); //Establecemos la posicion y el tamaño de pixeles de la etiqueta (630x630 pixeles)

        ImageIcon imagen = new ImageIcon("deadmau5.jpg"); //Otra forma de establecer una imagen por medio de la Clase ImageIcon
        JLabel etiqueta3 = new JLabel(); //Creacion de una etiqueta
        etiqueta3.setBounds(20, 90, 300, 300);// Posicion y tamaño de la etiqueta (150x150 pixeles ORIGINAL)
        etiqueta3.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta3.getWidth(), etiqueta3.getHeight(), Image.SCALE_SMOOTH))); //Modificador de la forma de la imagen, en este caso con escalado suave (ancho, alto, forma de escalado)
        
        //DEPENDIENDO DE COMO COLOQUES EL ORDEN DE LA ADICION DE ETIQUETAS, ES COMO SE VA MOSTRAR EN EL PANEL, EN POCAS PALABRAS, SE SOBREPONEN
        panel.add(etiqueta1);// Agregamos la etiqueta al panel (TEXTO)
        panel.add(etiqueta3);// Agregamos la etiqueta al panel (IMAGEN)
        panel.add(etiqueta2);// Agregamos la etiqueta al panel (IMAGEN)

    }
}
