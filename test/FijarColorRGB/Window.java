/*
GUI que muestra 3 listado con parametros para los colores RGB
 */
package FijarColorRGB;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Fisher
 */
public class Window extends JFrame implements ActionListener {

    private JLabel etiquetaR, etiquetaG, etiquetaB;
    private JComboBox listaR, listaG, listaB;
    private JButton boton;

    public Window() {
        setLayout(null);

        etiquetaR = new JLabel("Rojo");
        etiquetaR.setBounds(10, 10, 100, 10);
        add(etiquetaR);

        listaR = new JComboBox();
        listaR.setBounds(120, 10, 50, 30);
        for (int i = 0; i <= 255; i++) { //Para ahorrar escribir los 256 numeros
            listaR.addItem(String.valueOf(i));
        }
        add(listaR);

        etiquetaG = new JLabel("Verde");
        etiquetaG.setBounds(10, 50, 100, 10);
        add(etiquetaG);
        listaG = new JComboBox();
        listaG.setBounds(120, 50, 50, 30);
        for (int i = 0; i <= 255; i++) { //Para ahorrar escribir los 256 numeros
            listaG.addItem(String.valueOf(i));
        }
        add(listaG);

        etiquetaB = new JLabel("Azul");
        etiquetaB.setBounds(10, 90, 100, 10);
        add(etiquetaB);
        listaB = new JComboBox();
        listaB.setBounds(120, 90, 50, 30);
        for (int i = 0; i <= 255; i++) { //Para ahorrar escribir los 256 numeros
            listaB.addItem(String.valueOf(i));
        }
        add(listaB);

        boton = new JButton("FIJAR COLOR");
        boton.setBounds(10, 130, 150, 30);
        add(boton);
        boton.addActionListener(this); //Este va ser el boton que va tener el evento

    }

    @Override //Se sobreescribe ya que es una clase abstracta
    public void actionPerformed(ActionEvent e) { //Bloque de codigo que se realizara cuando se presione el boton

        String strRojo, strVerde, strAzul;
        int intRojo,intAzul,intVerde;

        if (e.getSource() == boton) { //El evento debe originarse por el boton que vamos a presionar

            strRojo = listaR.getSelectedItem().toString(); //Convertimos el objeto JComboBox a String con el metodo toString()
            strVerde = listaG.getSelectedItem().toString();
            strAzul = listaB.getSelectedItem().toString();

            intRojo = Integer.parseInt(strRojo); //Lo convertimos a entero
            intVerde = Integer.parseInt(strVerde);
            intAzul = Integer.parseInt(strAzul);
            
            Color rgb = new Color(intRojo,intVerde,intAzul); //Dependiendo del item seleccionado de la lista, esta se almacenara en los parametros de la clase Color
            boton.setBackground(rgb); //Asignamos el color al boton 

        }

    }

}
