package DialogosJOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Clase principal que arroja distintos tipos de Entradas con mensaje por medio
 * de la subclase JOptionPane
 *
 * @author Fisher
 */
public class JO_InputDialog {

    public static void main(String[] args) {

        /*
        Son dialogos que muestran una caja de texto en el cual el usuario ingresa sus datos y los devuelve en forma de String
        Puedes convertir el valor devuelto con el metodo (Dato primitivo).parse(Dato primitivo)
        Muestran por defecto 2 botones de confirmacion (ACEPTAR Y CANCELAR):
        JOptionPane.CLOSED_OPTION = null (sucede cuando presionas salir de la ventana)
        JOptionPane.OK_OPTION= El valor que hayas ingresado o seleccionado
        JOptionPane.CANCEL_OPTION = null
         */
        //("El mensaje que quieras enviar")
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        short edad = Short.parseShort(JOptionPane.showInputDialog("Ingrese su edad"));
        //(Formato de la ventana tipo JFrame,"El mensaje que quieras enviar")
        String direccion = JOptionPane.showInputDialog(null, "Ingrese su direccion");
        //("El mensaje que quieras enviar","Texto por default dentro de la caja de texto")
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido", "FAVOR DE USAR MAYUSCULAS");
        //(Formato de la ventana tipo JFrame,"El mensaje que quieras enviar","Texto por default dentro de la caja de texto")
        String color = JOptionPane.showInputDialog(null, "¿Color favorito?", "ELIGE ENTRE ROJO Y AZUL");

        /*
        Los iconos se pueden declarar ya sea de forma numerica o explicitamente con alguno de sus constantes:
        - JOptionPane.PLAIN_MESSAGE= -1 (NO MUESTRA NINGUN ICONO)
        - JOptionPane.ERROR_MESSAGE= 0 (ICONO DE ERROR)
        - JOptionPane.INFORMATION_MESSAGE= 1 (ICONO DE INFORMACION, ES EL MISMO DEL DIALOG SIMPLE)
        - JOptionPane.WARNING_MESSAGE= 2 (ICONO DE PELIGRO)
        - JOptionPane.QUESTION_MESSAGE= 3 (ICONO DE PREGUNTA)
         Estos iconos se borran automaticamente cuando se declara una Imagen de tipo ImageIcon
         */
        //(Formato de la ventana tipo JFrame,"El mensaje que quieras enviar","Titulo de la ventana", Icono)
        float estatura = Float.parseFloat(JOptionPane.showInputDialog(null, "¿Cual es su tamaño?", "ESCRIBE SU ESTATURA", JOptionPane.WARNING_MESSAGE));

        /*
        Son dialogos que muestran una lista desplegable en el cual el usuario debe escoger, lo devuelve por defecto en forma de Object 
        Puedes convertir el valor devuelto con el metodo (Dato primitivo).parse(Dato primitivo) o haciendo un cast si se trata de otro objeto
         */
        String[] listaDesplegable = new String[]{"Techno", "PsyTrance", "Future House"};
        //(Formato de la ventana tipo JFrame,"El mensaje que quieras enviar","Titulo de la ventana", Icono, Imagen tipo ImageIcon, Lista desplegable, Valor inicial de la lista desplegable)
        String musica = (String) JOptionPane.showInputDialog(null, "¿Cual es tu musica favorita?", "SOLO SUBGENEROS", -1, new ImageIcon("deadmau5.jpg"), listaDesplegable, listaDesplegable[0]);
        System.out.println(musica);
    }

}
