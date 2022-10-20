package JFrameComponentes;

import java.awt.Dimension;
import javax.swing.JFrame; 

public class VentanaJFrame extends JFrame { //CLASE QUE HEREDA LOS METODOS Y ATRIBUTOS DE LA SUPERCLASE JFRAME (ver API Javax.Swing)

    public VentanaJFrame() {
//        ventanaTipo1();//Ventana usando dos metodos para el tamaño y posicion
//        ventanaTipo2();//Ventana usando solo un metodo para el tamaño y posicion, ademas de establecer un tamaño minimo que el usuario pueda manipular
        ventanaTipo3();//Ventana centrada que no puede cambiar de tamaño el usuario
    }

    //Ventana usando dos metodos para el tamaño y posicion
    public void ventanaTipo1() {
        setSize(500, 500); //Establecemos el tamaño de la ventana (ANCHO, LARGO) en pixeles
        setTitle("Ventana del Fisher 1");//Sirve para establecer un titulo a la ventana
        setLocation(100, 200);//Establecemos la posicion inicial de la ventana

        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando se cierre la ventana, esta terminara la ejecucion del programa  
    }

    //Ventana usando solo un metodo para el tamaño y posicion, ademas de establecer un tamaño minimo que el usuario pueda manipular
    public void ventanaTipo2() {
        setBounds(300, 400, 500, 500);//Establece el tamaño y posicion de la ventana (LocX, LocY, SizX, SizY)
        setTitle("Ventana del Fisher 2");//Sirve para establecer un titulo a la ventana
        setMinimumSize(new Dimension(500, 500));//Establece un tamaño minimo

        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando se cierre la ventana, esta terminara la ejecucion del programa
    }

    //Ventana centrada que no puede cambiar de tamaño el usuario
    public void ventanaTipo3() {
        setSize(500, 500); //Establecemos el tamaño de la ventana (ANCHO, LARGO) en pixeles
        setTitle("Ventana del Fisher 3");//Sirve para establecer un titulo a la ventana
        setLocationRelativeTo(null); //El "null" sirve para centrar la posicion inicial de la ventana 
        setResizable(false); //Establecemos que la ventana no pueda cambiar de tamaño con el argumento FALSE

        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando se cierre la ventana, esta terminara la ejecucion del programa  

    }
}
