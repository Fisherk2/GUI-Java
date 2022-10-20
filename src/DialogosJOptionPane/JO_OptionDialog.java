package DialogosJOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Clase principal que una ventana con distintos tipos de opciones con mensaje
 * por medio de la subclase JOptionPane
 *
 * @author Fisher
 */
public class JO_OptionDialog {

    public static void main(String[] args) {

        /*
        Son opciones que muestran una diversa variedad de botones personalizados con un arreglo solo de STRINGS
        Este devuelve valores enteros dependiendo del boton seleccionado, conforme este posicionado en el arreglo de botones personalizables.
        
        Los tipo de botones se pueden declarar ya sea de forma numerica o explicitamente con alguno de sus constantes:
        JOptionPane.DEFAULT_OPTION = -1 (Solo boton de ACEPTAR)
        JOptionPane.YES_NO_OPTION = 0 (Boton SI y NO)
        JOptionPane.YES_NO_CANCEL_OPTION = 1 (Boton SI, NO y CANCELAR)
        JOptionPane.OK_CANCEL_OPTION = 2 (Boton ACEPTAR y CANCELAR)
        Estos tipos de botones se borran automaticamente cuando se declara un arreglo de botones personalizable
        
        Los iconos se pueden declarar ya sea de forma numerica o explicitamente con alguno de sus constantes:
        - JOptionPane.PLAIN_MESSAGE= -1 (NO MUESTRA NINGUN ICONO)
        - JOptionPane.ERROR_MESSAGE= 0 (ICONO DE ERROR)
        - JOptionPane.INFORMATION_MESSAGE= 1 (ICONO DE INFORMACION, ES EL MISMO DEL DIALOG SIMPLE)
        - JOptionPane.WARNING_MESSAGE= 2 (ICONO DE PELIGRO)
        - JOptionPane.QUESTION_MESSAGE= 3 (ICONO DE PREGUNTA)
         Estos iconos se borran automaticamente cuando se declara una Imagen de tipo ImageIcon
         */
        String[] botones = new String[]{"Pastor", "Chorizo", "Bistek", "Barbacoa"};
        //(Formato de la ventana tipo JFrame,"El mensaje que quieras enviar","Titulo de la ventana",Tipo de opciones ,Icono, Imagen tipo ImageIcon, Botones, Valor inicial del boton)
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione un boton", "ELIGE SU TACO", -1, JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
        System.out.println(seleccion);

        /*
        Son opciones que muestran una diversa variedad de botones personalizados con un arreglo de tipo OBJECT (con todo los tipos de datos)
        Puedes agregar otros tipos de componentes, como Listas desplegables o Casillas dentro del arreglo tipo OBJECT
        Este devuelve valores enteros dependiendo del componente seleccionado, conforme este posicionado en nuestro arreglo declarado en en parametro.
         */
        JCheckBox casilla = new JCheckBox("Presione aqui");
        Object[] componente = new Object[]{"ACEPTAR", 'F', 33, 1.9f, casilla};
        //(Formato de la ventana tipo JFrame,"El mensaje que quieras enviar","Titulo de la ventana",Tipo de opciones ,Icono, Imagen tipo ImageIcon, Botones, Valor inicial del boton)
        int eleccion = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "ELIJA LO QUE LE CONVENGA", -1, -1, new ImageIcon("shinigamiSama.jpg"), componente, componente[0]);
        if (casilla.isSelected() && eleccion == 0) {
            System.out.println("Usted presiono la casilla");
        } else {
            System.out.println("Usted solo presiono un boton");
        }

        /*
        Ademas puedes usar componentes usando el tipo OBJECT en el segundo parametro
        Este devolvera un entero dependiendo del boton presionado, puedes ingresar una condicion dependiendo de lo que se haya escrito en las cajas
        JOptionPane.CLOSED_OPTION = -1 (sucede cuando presionas salir de la ventana)
        JOptionPane.YES_OPTION ó JOptionPane.OK_OPTION= 0
        JOptionPane.NO_OPTION = 1
        JOptionPane.CANCEL_OPTION = 2
         */
        JTextField cajaUsuario = new JTextField("Aqui va su nombre de usuario");
        JPasswordField cajaContraseña = new JPasswordField();
        Object[] cajasDeTexto = new Object[]{"Ingrese su contraseña", cajaUsuario, cajaContraseña};
        //(Formato de la ventana tipo JFrame,Componentes que usaras,"Titulo de la ventana",Tipo de opciones ,Icono, Imagen tipo ImageIcon, Botones, Valor inicial del boton)
        int acceso = JOptionPane.showOptionDialog(null, cajasDeTexto, "INICIAR SESION", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
        if (acceso == JOptionPane.OK_OPTION) {
            String contraseña = new String(cajaContraseña.getPassword()); //.getPassword devuelve un arreglo de caracteres, por eso se convierte a String
            System.out.println(cajaUsuario.getText() + " " + contraseña);
        }

    }

}
