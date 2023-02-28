package JFrameComponentes;

/**
 * CLASE PRINCIPAL QUE SE USARA PARA ARRANCAR VENTANAS CON SUS RESPECTIVOS
 * COMPONENTES DE EJEMPLO.
 *
 * @author Fisher
 */
public class MainJFrame {

    public static void main(String[] args) {

        //Como crear una ventana con JFrame
        VentanaJFrame ventanas = new VentanaJFrame();
        ventanas.setVisible(false);

        //Como crear Paneles con JPanel
        PanelJPanel paneles = new PanelJPanel();
        paneles.setVisible(false);

        //Como crear Etiquetas con JLabel
        EtiquetaJLabel etiquetas = new EtiquetaJLabel();
        etiquetas.setVisible(false);

        //Como crear Botones con JButton
        BotonJButton botones = new BotonJButton();
        botones.setVisible(false);

        //Como crear Radio botones con JRadioButton
        RadioBotonJRadioButton radioBotones = new RadioBotonJRadioButton();
        radioBotones.setVisible(false);

        //Como crear Boton de activacion con JToggleButton
        BotonActivacionJToggleButton botonesActivacion = new BotonActivacionJToggleButton();
        botonesActivacion.setVisible(false);
        
        //Como crear Cajas de texto con JTextField
        CajaTextoJTextField cajasTexto = new CajaTextoJTextField();
        cajasTexto.setVisible(false);
        
        //Como crear Areas de texto con JTextArea
        AreasTextoJTextArea areasTexto = new AreasTextoJTextArea();
        areasTexto.setVisible(false);
        
        //Como crear una barra de desplazamiento con JScrollPane
        DeslizadorJScrollPane deslizador = new DeslizadorJScrollPane();
        deslizador.setVisible(false);
        
        //Como crear Casillas de verificacion con JCheckBox
        CasillaJCheckBox casillas = new CasillaJCheckBox();
        casillas.setVisible(false);
        
        //Como crear listas desplegables con JComboBox
        ListaDesplegableJComboBox listasDesplegables = new ListaDesplegableJComboBox();
        listasDesplegables.setVisible(true);
        
        //Como crear Campos con contraseña con JPasswordField
        ContraseñaJPasswordField campoContraseña = new ContraseñaJPasswordField();
        campoContraseña.setVisible(false);
        
        //Como crear Tablas con JTable
        TablaJTable tablas = new TablaJTable();
        tablas.setVisible(false);
        
    }

}
