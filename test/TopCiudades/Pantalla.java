package TopCiudades;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Pantalla {

    public String mostrarMenú() {
        return (String) JOptionPane.showInputDialog(null,
                "Elija",
                "Top 10 ciudades bellas",
                -1,
                new ImageIcon("portada.png"),
                new String[]{"Venecia", "Estambul", "Nueva York", "Beirut", "Ámsterdam",
                    "Londres", "París", "Ciudad del Cabo", "Brujas", "Roma"},
                "Venecia");
    }

    public int mostrarMenúB() {
        return JOptionPane.showOptionDialog(null,
                "Elija",
                "Top 10 ciudades bellas",
                -1,
                -1,
                new ImageIcon("portada.png"),
                new String[]{"Venecia", "Estambul", "Nueva York"},
                "Venecia");
    }

    public void mostrarDetalle(Ciudad x) {
        JOptionPane.showMessageDialog(null, null, x.nombre + " - " + x.región, -1, new ImageIcon(x.imagen));
    }
}
