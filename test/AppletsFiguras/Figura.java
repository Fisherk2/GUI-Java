/*
 CLASE FIGURAS GEOMETRICAS
 */
package AppletsFiguras;

import javax.swing.JOptionPane;

public class Figura {

    //ATRIBUTOS
    public final double PI = 3.1416f;
    private String nombre;
    private double ladoA, ladoB, ladoC, perimetro, area;

    //CONTRUCTORES
    public Figura() {
        ladoA = ladoB = ladoC = 0;
        nombre = "FIGURA";
    }

    public Figura(int r) {
        switch (r) {
            case 1:
                nombre = "Cuadrado";
                break;
            case 2:
                nombre = "Rectangulo";
                break;
            case 3:
                nombre = "Triangulo";
                break;
            case 4:
                nombre = "Circulo";
                break;
        }
    }

    //METODOS
    
    /**
     *  Esta funcion almacena los valores que seran impresas en la consola o en el Display dependiendo de la respuesta del usuario.
     * @param r 
     */
    public void setDatos(int r) {
        switch (r) {
            case 1: //CUADRADO
                ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la dimension del lado de la figura"));
                perimetro = ladoA * 4;
                area = ladoA * ladoA;
                break;
            case 2: //RECTANGULO
                ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la dimension del lado A de la figura"));
                ladoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la dimension del lado B de la figura"));
                perimetro = (ladoA * 2) + (ladoB * 2);
                area = ladoA * ladoB;
                break;
            case 3: //TRIANGULO
                ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la dimension del lado A de la figura"));
                ladoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la dimension del lado B de la figura"));
                ladoC = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la dimension del lado C de la figura"));
                perimetro = ladoA + ladoB + ladoC;
                double s = perimetro / 2; //5
                area = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
                break;
            case 4: //CIRCULO
                ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la dimension del radio de la figura"));
                perimetro = PI * 2 * ladoA;
                area = PI * ladoA * ladoA;
                break;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public String toString() {
        return "Nombre de la figura: " + nombre
                + "\nArea: " + area + " Unidades cuadradas"
                + "\nPerimetro: " + perimetro + " Unidades"
                + "\n_________________________________________";
    }

}
