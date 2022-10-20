/*
CLASE QUE ENSEÑA LA FIGURA CON SUS DIMENSIONES
 */
package AppletsFiguras;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DisplayFigura extends JApplet {

    //OBJETOS
    Figura figura1;

    //ATRIBUTOS
    int respuesta;

    //METODOS
    @Override
    public void init() {
        this.setSize(800, 800); //TAMAÑO DE VENTANA
    }

    @Override
    public void paint(Graphics lapiz) {
        do {
            respuesta = seleccionFigura();
            if (respuesta != 5) {
                figura1 = new Figura(respuesta); //Se envia la respuesta al constructor
                figura1.setDatos(respuesta); //Se envia la respuesta al metodo que calcula la Figura
                System.out.println(figura1.toString()); //RESULTADOS EN CONSOLA
                dibujarFiguras(lapiz);
            } else {
                JOptionPane.showMessageDialog(null, "PROGRAMA TERMINADO");
            }
        } while (respuesta != 5);
    }

    /**
     * Menu que enseña que figura debe seleccionar el usuario.
     * @return r
     */
    public int seleccionFigura() {
        //Respuesta del usuario
        int r = Integer.parseInt(JOptionPane.showInputDialog("¿QUE FIGURA DESEA SELECCIONAR?"
                + "\n1.- Cuadrado"
                + "\n2.- Rectangulo"
                + "\n3.- Triangulo"
                + "\n4.- Circulo"
                + "\n5.- Salir"));
        return r;
    }

    /**
     * Se establecen los Fonts y colores de los textos que se van a imprimir, ademas de la figura dependiendo de la respuesta del usuario.
     * @param lapiz 
     */
    public void dibujarFiguras(Graphics lapiz) {
        lapiz.setFont(new Font("Arial", Font.BOLD, 30));
        lapiz.setColor(Color.MAGENTA);
        switch (respuesta) { //Dependiendo de la respuesta del usuario, se le dibujara una figura
            case 1:
                dibujarCuadrado(lapiz);
                break;
            case 2:
                dibujarRectangulo(lapiz);
                break;
            case 3:
                dibujarTriangulo(lapiz);
                break;
            case 4:
                dibujarCirculo(lapiz);
                break;
        }
    }

    public void dibujarCuadrado(Graphics lapiz) {
        //IMAGEN DE LA FIGURA
        lapiz.drawImage(new ImageIcon("Cuadrado.png").getImage(), 0, 0, null);
        //NOMBRE
        lapiz.drawString(figura1.getNombre(), 330, 50);
        //DIMENSIONES
        lapiz.drawString(String.valueOf(figura1.getLadoA()), 370, 135);
        //AREA
        lapiz.drawString(String.valueOf(figura1.getArea()), 370, 387);
        //PERIMETRO
        lapiz.drawString(String.valueOf(figura1.getPerimetro()), 370, 432);
    }

    public void dibujarRectangulo(Graphics lapiz) {
        //IMAGEN DE LA FIGURA
        lapiz.drawImage(new ImageIcon("Rectangulo.png").getImage(), 0, 0, null);
        //NOMBRE
        lapiz.drawString(figura1.getNombre(), 330, 50);
        //DIMENSIONES
        lapiz.drawString(String.valueOf(figura1.getLadoA()), 290, 150);
        lapiz.drawString(String.valueOf(figura1.getLadoB()), 720, 470);
        //AREA
        lapiz.drawString(String.valueOf(figura1.getArea()), 290, 450);
        //PERIMETRO
        lapiz.drawString(String.valueOf(figura1.getPerimetro()), 290, 495);
    }

    public void dibujarTriangulo(Graphics lapiz) {
        //IMAGEN DE LA FIGURA
        lapiz.drawImage(new ImageIcon("Triangulo.png").getImage(), 0, 0, null);
        //NOMBRE
        lapiz.drawString(figura1.getNombre(), 330, 50);
        //DIMENSIONES
        lapiz.drawString(String.valueOf(figura1.getLadoA()), 170, 345);
        lapiz.drawString(String.valueOf(figura1.getLadoB()), 675, 345);
        lapiz.drawString(String.valueOf(figura1.getLadoC()), 370, 730);
        //AREA
        lapiz.drawString(String.valueOf(figura1.getArea()), 370, 545);
        //PERIMETRO
        lapiz.drawString(String.valueOf(figura1.getPerimetro()), 370, 590);
    }

    public void dibujarCirculo(Graphics lapiz) {
        //IMAGEN DE LA FIGURA
        lapiz.drawImage(new ImageIcon("Circulo.png").getImage(), 0, 0, null);
        //NOMBRE
        lapiz.drawString(figura1.getNombre(), 330, 50);
        //DIMENSIONES
        lapiz.drawString(String.valueOf(figura1.getLadoA()), 510, 450);
        //AREA
        lapiz.drawString(String.valueOf(figura1.getArea()), 380, 545);
        //PERIMETRO
        lapiz.drawString(String.valueOf(figura1.getPerimetro()), 380, 590);
    }

}
