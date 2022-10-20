package JFrameComponentes;

import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CasillaJCheckBox extends JFrame {

    private JPanel panel = new JPanel();

    public CasillaJCheckBox() {
        //VENTANA
        setSize(600, 200); //Establecemos el tamaño de la ventana (ANCHO, LARGO) en pixeles
        setTitle("Casilla de verificacion: ");//Sirve para establecer un titulo a la ventana
        setLocationRelativeTo(null); //El "null" sirve para centrar la posicion inicial de la ventana 
        setResizable(false); //Establecemos que la ventana no pueda cambiar de tamaño con el argumento FALSE

        //COMPONENTES (CAPAS o LAYOUTS)
        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cuando se cierre la ventana, esta terminara la ejecucion del programa 
    }

    private void iniciarComponentes() {
        colocarPaneles();
        colocarCasilla();

    }

    private void colocarPaneles() {
        //PANEL
        panel = new JPanel(); //Creacion de un panel
        panel.setLayout(null);//Desactivamos el diseño del panel (LAYOUTS)
        panel.setBackground(Color.LIGHT_GRAY);

        this.getContentPane().add(panel); //Agregamos el panel a la ventana

    }

    private void colocarCasilla() {
        //CASILLAS DE VERIFICACION
        JCheckBox checkIngles, checkEspañol, checkFrances;
        checkIngles = new JCheckBox("Ingles");
        checkIngles.setBounds(10, 10, 150, 30); //Posicion y dimension de la etiqueta del CheckBox y su casilla
        panel.add(checkIngles); //Agregamos la casilla al panel
        checkEspañol = new JCheckBox("Español");
        checkEspañol.setBounds(10, 50, 150, 30); //Posicion y dimension de la etiqueta del CheckBox y su casilla
        panel.add(checkEspañol); //Agregamos la casilla al panel
        checkFrances = new JCheckBox("Frances");
        checkFrances.setBounds(10, 90, 150, 30); //Posicion y dimension de la etiqueta del CheckBox y su casilla
        panel.add(checkFrances); //Agregamos la casilla al panel

        eventoCheckBox(checkIngles, checkEspañol, checkFrances); //Enviamos los CheckBox
    }

    private void eventoCheckBox(JCheckBox checkIngles, JCheckBox checkEspañol, JCheckBox checkFrances) {
        //ChangeListener es una clase que se usa en CheckBox ya que el evento puede cambiar dependiendo de que opcion presione el usuario
        ChangeListener evento = new ChangeListener() {

            @Override //Clase abstracta
            public void stateChanged(ChangeEvent e) {
                String strIdioma = "";
                //Condicion dependiendo de que casilla se haya seleccionado
                if (checkIngles.isSelected() == true) {
                    strIdioma = strIdioma + "Ingles ";
                }
                if (checkEspañol.isSelected() == true) {
                    strIdioma = strIdioma + "Español ";
                }
                if (checkFrances.isSelected() == true) {
                    strIdioma = strIdioma + "Frances ";
                }
                setTitle("Casilla de verificacion: "+strIdioma); //Se establecera un nuevo titulo de la ventana dependiendo de las casillas seleccionadas
            }
        };

        checkIngles.addChangeListener(evento);
        checkEspañol.addChangeListener(evento);
        checkFrances.addChangeListener(evento);

    }
}
