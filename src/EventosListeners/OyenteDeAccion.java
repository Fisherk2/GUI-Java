package EventosListeners;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class OyenteDeAccion extends JFrame {

    //ATRIBUTOS (Todos los objetos GUI que necesitamos para poder manipularlo en esta clase)
    private JPanel panel;
    private JLabel etiqueta, saludo;
    private JTextField cajaTexto;
    private JButton boton;

    //CONSTRUCTOR
    public OyenteDeAccion() {
        //VENTANA
        setSize(500, 500);
        setTitle("Oyente de Accion");
        setResizable(false); //El tamaño no puede moverse por el usuario
        setLocationRelativeTo(null);//Centrado a la pantalla del usuario

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);//Terminar el programa al cerrar la ventana
    }

    //METODOS
    private void iniciarComponentes() {
        colocarPanel();
        colocarEtiqueta();
        colocarCajaDeTexto();
        colocarBoton();
    }

    private void colocarPanel() {
        panel = new JPanel(); //Creacion de un panel
        panel.setSize(500, 500);
        panel.setLayout(null);//Lo desactivamos para poder acomodar etiquetas y demas elementos en nuestro panel
        panel.setBackground(Color.yellow);//Establecemos fondo de nuestro panel

        this.add(panel);//Agregamos el panel a la ventana
    }

    private void colocarEtiqueta() {
        etiqueta = new JLabel("INGRESE SU NOMBRE");//Creacion de etiqueta
        etiqueta.setBounds(130, 20, 200, 30);
        etiqueta.setFont(new Font("chiller", 1, 20));
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//Alineamos el texto al centro de la etiqueta

        panel.add(etiqueta);//Agregamos la etiqueta al panel
    }

    private void colocarCajaDeTexto() {
        cajaTexto = new JTextField();//Creamos la caja de texto
        cajaTexto.setBounds(130, 100, 200, 20);
        cajaTexto.setText("Aqui va su nombre...");//Texto que estara dentro de la caja

        panel.add(cajaTexto); //Agregamos la caja de texto en el panel
    }

    private void colocarBoton() {
        boton = new JButton();//Creamos el boton
        boton.setBounds(130, 150, 200, 50);
        boton.setText("Generar nombre");
        boton.setForeground(Color.WHITE);//Color de letra
        boton.setBackground(Color.black);//Color del boton

        panel.add(boton);//Agregamos boton al panel

        eventoOyenteDeAccion();

    }

    private void eventoOyenteDeAccion() {
        //Saludo que va generar en el panel cuando pulsamos el boton
        saludo = new JLabel();
        saludo.setBounds(130, 200, 200, 50);
        saludo.setFont(new Font("complex", 1, 20));
        saludo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(saludo); //Agregamos la etiqueta al panel
        
        //Agregamos evento de tipo ActionListener
        ActionListener accion1 = new ActionListener() {//Implementamos el oyente de accion para poder darlo de argumento en el metodo del boton
            @Override //Sobreescribimos el metodo abstracto de la clase ActionListener y creamos un metodo anonimo
            public void actionPerformed(ActionEvent e) {
                //Aqui va el bloque de codigo que va efectuarse cuando se presione el boton
                saludo.setText("Hola " + cajaTexto.getText());

            }//METODO ANONIMO
        };//OBJETO

        //Enviamos el argumento de tipo ActionListener al metodo
        boton.addActionListener(accion1);
    }

}
