package DialogosJOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Clase principal que arroja distintos tipos de Dialogos de mensaje por medio
 * de la subclase JOptionPane
 *
 * @author Fisher
 */
public class JO_MessageDialog {

    public static void main(String[] args) {

        //(Formato de la ventana tipo JFrame, "El mensaje que quieras enviar")
        JOptionPane.showMessageDialog(null, "Este es un mensaje simple"); //No devuelve nada

        /*
        Los iconos se pueden declarar ya sea de forma numerica o explicitamente con alguno de sus constantes:
        - JOptionPane.PLAIN_MESSAGE= -1 (NO MUESTRA NINGUN ICONO)
        - JOptionPane.ERROR_MESSAGE= 0 (ICONO DE ERROR)
        - JOptionPane.INFORMATION_MESSAGE= 1 (ICONO DE INFORMACION, ES EL MISMO DEL DIALOG SIMPLE)
        - JOptionPane.WARNING_MESSAGE= 2 (ICONO DE PELIGRO)
        - JOptionPane.QUESTION_MESSAGE= 3 (ICONO DE PREGUNTA)
         Estos iconos se borran automaticamente cuando se declara una Imagen de tipo ImageIcon
         */
        //(Formato de la ventana tipo JFrame, "El mensaje que quieras enviar", "Titulo de la ventana", Icono)
        JOptionPane.showMessageDialog(null, "Mensaje de riesgo", "PELIGRO", JOptionPane.WARNING_MESSAGE);
        //(Formato de la ventana tipo JFrame, "El mensaje que quieras enviar", "Titulo de la ventana", Icono, Imagen de tipo ImageIcon)
        JOptionPane.showMessageDialog(null, null, "DIALOGO CON IMAGEN", -1, new ImageIcon("shinigamiSama.jpg"));

    }


}
