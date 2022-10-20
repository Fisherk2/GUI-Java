/*
GUI que mostrara dos cajas de texto
 */
package SumaDeDosNumeros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Fisher
 */
public class Window extends JFrame implements ActionListener { //Se hereda los metodos y atributos de JFrame que a su vez, se agrega los de la clase ActionListener

    private JTextField cajaTexto1, cajaTexto2;
    private JLabel etiqueta1, etiqueta2, etiqueta3;
    private JButton boton1;
    
    public Window() {
        
        setLayout(null);
        
        etiqueta1 = new JLabel("Valor 1: ");
        etiqueta1.setBounds(50, 5, 100, 30);
        add(etiqueta1);
        
        etiqueta2 = new JLabel("Valor 2: ");
        etiqueta2.setBounds(50, 35, 100, 30);
        add(etiqueta2);
        
        etiqueta3 = new JLabel("Resultado: ");
        etiqueta3.setBounds(120, 80, 100, 30);
        add(etiqueta3);
        
        cajaTexto1 = new JTextField();
        cajaTexto1.setBounds(120, 10, 150, 20);
        add(cajaTexto1);
        
        cajaTexto2 = new JTextField();
        cajaTexto2.setBounds(120, 40, 150, 20);
        add(cajaTexto2);
        
        boton1 = new JButton("Sumar");
        boton1.setBounds(10, 80, 100, 30);
        add(boton1);
        boton1.addActionListener(this); //Este es el boton que va tener el evento de accion

    }
    
    @Override //Se sobreescribe ya que es una clase Abstracta
    public void actionPerformed(ActionEvent e) { //Por lo tanto se genera por obligacion este metodo, Aqui va el bloque de codigo que va efectuarse cuando se presione el boton

        int valor1 = 0, valor2 = 0, resultado;
        
        if (e.getSource() == boton1) { //Si el evento es generado por el boton

            //Convertimos nuestro dato ingresado en la caja de texto a entero
            valor1 = Integer.parseInt(cajaTexto1.getText());
            valor2 = Integer.parseInt(cajaTexto2.getText());
            
            resultado = valor1 + valor2;
            
            etiqueta3.setText("Resultado: " + resultado); //Se agrega el resultado
            
        }
    }
    
}
