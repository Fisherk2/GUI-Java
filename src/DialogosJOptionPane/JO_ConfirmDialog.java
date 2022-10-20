package DialogosJOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Clase principal que arroja distintos tipos de Dialogos de confirmacion por
 * medio de la subclase JOptionPane
 *
 * @author Fisher
 */
public class JO_ConfirmDialog {

    public static void main(String[] args) {

        /*
        Son dialogos que muestran por defecto 3 botones de confirmacion (SI, NO Y CANCELAR) y te devuelve un entero dependiendo de la respuesta:
        JOptionPane.CLOSED_OPTION = -1 (sucede cuando presionas salir de la ventana)
        JOptionPane.YES_OPTION ó JOptionPane.OK_OPTION= 0
        JOptionPane.NO_OPTION = 1
        JOptionPane.CANCEL_OPTION = 2
         */
        //(Formato de la ventana tipo JFrame, "El mensaje de confirmacion que quieras enviar")
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres seguir con los mensajes?");

        /*
        Son dialogos que muestran diferentes tipo de botones, dependiendo del ultimo parametro:
        JOptionPane.DEFAULT_OPTION = -1 (Solo boton de ACEPTAR)
        JOptionPane.YES_NO_OPTION = 0 (Boton SI y NO)
        JOptionPane.YES_NO_CANCEL_OPTION = 1 (Boton SI, NO y CANCELAR)
        JOptionPane.OK_CANCEL_OPTION = 2 (Boton ACEPTAR y CANCELAR)
         */
        //(Formato de la ventana tipo JFrame, "El mensaje que quieras enviar", "Titulo de la ventana", Tipo de opciones )
        int confirmacion1 = JOptionPane.showConfirmDialog(null, "¿Estas seguro?", "ELIGE CORRECTAMENTE", JOptionPane.YES_NO_OPTION);

        /*
        Los iconos se pueden declarar ya sea de forma numerica o explicitamente con alguno de sus constantes:
        - JOptionPane.PLAIN_MESSAGE= -1 (NO MUESTRA NINGUN ICONO)
        - JOptionPane.ERROR_MESSAGE= 0 (ICONO DE ERROR)
        - JOptionPane.INFORMATION_MESSAGE= 1 (ICONO DE INFORMACION, ES EL MISMO DEL DIALOG SIMPLE)
        - JOptionPane.WARNING_MESSAGE= 2 (ICONO DE PELIGRO)
        - JOptionPane.QUESTION_MESSAGE= 3 (ICONO DE PREGUNTA)
        Estos iconos se borran automaticamente cuando se declara una Imagen de tipo ImageIcon
         */
        //(Formato de la ventana tipo JFrame, "El mensaje que quieras enviar", "Titulo de la ventana", Tipo de opciones, Icono)
        int confirmacion2 = JOptionPane.showConfirmDialog(null, "¿Seguro?", "ELIGE BIEN", 2, JOptionPane.ERROR_MESSAGE);
        //(Formato de la ventana tipo JFrame, "El mensaje que quieras enviar", "Titulo de la ventana", Tipo de opciones, Icono, Imagen con ImageIcon)
        int confirmacion3 = JOptionPane.showConfirmDialog(null, "¿Ves a un raton?", "CONFIRMACION", 0, -1, new ImageIcon("deadmau5.jpg"));
    }

}
