package TiendaVideojuegos;

//MENU DE LA TIENDA
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Display {

    //METODOS
    public String mostrarMenu() {
        return (String) JOptionPane.showInputDialog(null,
                "Examinar",
                "Tienda de Videojuegos",
                -1,
                new ImageIcon("Menu.png"),
                new String[]{
                    "Crash Team Racing Nitro-Fueled",
                    "Forza Horizon 2 Xbox ONE 10th Anniversary Edition",
                    "Forza Horizon 3 Car Pass",
                    "Forza Horizon 4 Deluxe Edition",
                    "Forza Horizon 4 Expansions Bundle",
                    "Forza Horizon 4",
                    "Forza Motorsport 5",
                    "Forza Motorsport 6",
                    "NASCAR Heat 3",
                    "Need for Speed Payback Deluxe Edition",
                    "Sleeping Dogs Definitive Edition",
                    "The Crew 2 Deluxe Edition",
                    "The Grand Tour Game",
                    "Trials Rising Gold Edition",
                    "Xenon Racer"
                }, "Crash Team Racing Nitro-Fueled");
    }

    public void mostrarDetalle(Games info) {
        JOptionPane.showMessageDialog(null, null, info.nombre + " - " + info.disponibilidad, -1, new ImageIcon(info.imagen));
    }

}
