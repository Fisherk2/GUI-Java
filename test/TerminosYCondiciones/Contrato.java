/*
 Interfaz que muestra un checkbox y un boton
 */
package TerminosYCondiciones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Clase Contrato que hereda los metodos de JFrame y agrega los metodos de
 * ActionListener y ChangeListener
 *
 * @author Fisher
 */
public class Contrato extends JFrame implements ActionListener, ChangeListener {

    //COMPONENTES QUE VAMOS A USAR
    private JPanel panel; 
    private JButton boton;
    private JCheckBox casilla;
    private JLabel etiqueta;

    public Contrato() {

        setSize(450, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("TERMINOS Y CONDICIONES");

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarComponentes() {
        colocarPanel();
        colocarEtiqueta();
        colocarCasilla();
        colocarBoton();
    }

    private void colocarPanel() {
        //PANEL
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        this.getContentPane().add(panel); //Agregamos el panel a la ventana
    }

    private void colocarCasilla() {
        casilla = new JCheckBox("Acepto");
        casilla.setBounds(10, 50, 100, 30);
        casilla.addChangeListener(this); //Enviamos el argumento de tipo ChangeListener al metodo, que es el mismo que el de la clase
        panel.add(casilla); //Agregamos la casilla al panel
    }

    private void colocarBoton() {
        boton = new JButton("Continuar");
        boton.setBounds(10, 100, 100, 30);
        boton.addActionListener(this); //Enviamos el argumento de tipo ActionListener al metodo, que es el mismo que el de la clase
        boton.setEnabled(false); //Estara bloqueado el boton hasta que se presione la casilla
        panel.add(boton);

    }

    private void colocarEtiqueta() {
        etiqueta = new JLabel("ACEPTAR TERMINOS Y CONDICIONES");
        etiqueta.setBounds(10, 10, 400, 30);
        panel.add(etiqueta); //Agregamos la etiqueta al panel
    }

    /**
     * Metodos abstractos de la clase ActionListener para los eventos del boton
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        //Condicion dependiendo si el evento se origino en el boton
        if (e.getSource() == boton) {
            System.exit(0); //El programa se va terminar
        }

    }

    /**
     * Metodos abstractos de la clase ChangeListener para los eventos de la
     * casilla
     */
    @Override
    public void stateChanged(ChangeEvent e) {
        //Condicion dependiendo si el usuario acepta o no los terminos y condiciones
        if (casilla.isSelected() == true) {
            boton.setEnabled(true); //Se habilita el boton
        } else {
            boton.setEnabled(false); //Sigue bloqueado el boton
        }
    }

}
