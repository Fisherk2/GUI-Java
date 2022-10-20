package JFrameComponentes;

import java.awt.Color;
import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.JPasswordField;

public class ContraseñaJPasswordField extends JFrame { //CLASE QUE HEREDA LOS METODOS Y ATRIBUTOS DE LA SUPERCLASE JFRAME (ver API Javax.Swing)
    //ATRIBUTOS

    private JPanel panel; //Declaramos un tipo JPanel para poder usarlo en nuestros metodos de manera libre en esta clase

    public ContraseñaJPasswordField() { //Ventana centrada que no puede cambiar de tamaño 
        //VENTANA
        setSize(800, 800); //Establecemos el tamaño de la ventana (ANCHO, LARGO) en pixeles
        setTitle("Contraseñas");//Sirve para establecer un titulo a la ventana
        setLocationRelativeTo(null); //El "null" sirve para centrar la posicion inicial de la ventana 
        setResizable(false); //Establecemos que la ventana no pueda cambiar de tamaño con el argumento FALSE

        //COMPONENTES (CAPAS o LAYOUTS)
        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando se cierre la ventana, esta terminara la ejecucion del programa  
    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarCampoContraseña();
    }

    private void colocarPaneles() {
        //PANEL 1
        panel = new JPanel(); //Creacion de un panel
        panel.setBackground(Color.pink);//Le damos color al panel (en este caso rosa)
        panel.setLayout(null);//Desactivamos el diseño del panel (LAYOUTS)

        this.getContentPane().add(panel); //Agregamos el panel a la ventana
    }

    private void colocarCampoContraseña() {
        //CAMPO DE CONTRASEÑA
        JPasswordField campoContraseña = new JPasswordField(); //Creacion de un campo de contraseña
        campoContraseña.setBounds(20, 20, 150, 30); //Posicion y tamaño
        campoContraseña.setText("Buenos dias"); //Texto en la caja de contraseña por defecto
        
        panel.add(campoContraseña);//Agregamos el campo de contraseña al panel
        
        //CONVERSION DE CHAR[ ] A STRING
        String contraseña="";
        for (int i=0;i<campoContraseña.getPassword().length;i++){
            contraseña += campoContraseña.getPassword()[i];//getPassword retorna un arreglo de caracteres, por lo que se almacena todos los valores uno por uno en una cadena de texto
        }
        System.out.println("La contraseña que ingresaste fue: "+contraseña);
    }

}//CLASS
