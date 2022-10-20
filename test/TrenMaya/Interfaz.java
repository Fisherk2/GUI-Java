/*
FALTA LLENAR ARREGLOS DE ESTACIONES, PARADAS, ASIENTOS Y FECHAS
 */
package TrenMaya;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Clase que muestra los diferentes menus que sirve como entrada de datos para
 * la clase Usuario, Boleto y Asiento
 *
 * @author Fisher
 */
public class Interfaz {

    private Usuario viajero;
    private Boleto ticket;
    private Asiento silla;
    private String[] estaciones, paradas, fechas, asientos;

    public void llenarUsuario() {
        String nombre, telefono, correo, tarjetaBancaria;
        int sexo;
        //Mensaje de bienvenida
        JOptionPane.showMessageDialog(null,
                "Bienvenido porfavor, para poder reservar un asiento debera ingresar los siguientes datos: "
                + "\n-Nombre" + "\n-Sexo" + "\n-Correo" + "\n-Telefono" + "\n-Tarjeta Bancaria",
                "TREN MAYA",
                -1,
                new ImageIcon("Inicio.png"));
        //Entradas para datos de usuario
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");

        sexo = JOptionPane.showOptionDialog(null, "Seleccione su sexo",
                null,
                -1,
                JOptionPane.WARNING_MESSAGE,
                null,
                new String[]{"MASCULINO", "FEMENINO"}, "MASCULINO");

        correo = JOptionPane.showInputDialog("Ingrese su correo");
        telefono = JOptionPane.showInputDialog("Ingrese su telefono");
        tarjetaBancaria = JOptionPane.showInputDialog("Ingrese su tarjeta Bancaria");

        viajero = new Usuario(nombre, telefono, correo, tarjetaBancaria, sexo);
    }

    public void reservarBoleto() {
        int tramo = elegirTramo();
        String destino[] = elegirDestino(tramo);
        String fecha = elegirFecha();
        String id = elegirAsiento();
        silla = new Asiento(id, tramo);
        ticket = new Boleto(fecha, destino[0], destino[1]); // 0=Estacion, 1=Parada

    }

    public void imprimirBoleto() throws IOException {
        File factura = new File("Factura.txt");
        FileWriter impresora = new FileWriter(factura);

        impresora.write("RESERVA DEL DIA 09/11/21"
                + "\n__________________________"
                + "\nNOMBRE DEL TITULAR: " + viajero.getNombre()
                + "\nSEXO: " + viajero.getSexo()
                + "\nTELEFONO: " + viajero.getTelefono()
                + "\nCORREO: " + viajero.getCorreo()
                + "\nTARGETA DE CREDITO: " + viajero.getTarjetaBancaria()
                + "\n__________________________"
                + "\nFECHA DE SALIDA: " + ticket.getFecha()
                + "\nESTACION: " + ticket.getEstacion()
                + "\nPARADA: " + ticket.getParadero()
                + "\nN° DE ASIENTO: " + silla.getId()
                + "\nPRECIO POR ASIENTO: $" + silla.getPrecioAsiento());
        impresora.close();

        //Para comprobar si se imprimio correctamente en el archivo
        System.out.println("RESERVA DEL DIA 09/11/21"
                + "\n__________________________"
                + "\nNOMBRE DEL TITULAR: " + viajero.getNombre()
                + "\nSEXO: " + viajero.getSexo()
                + "\nTELEFONO: " + viajero.getTelefono()
                + "\nCORREO: " + viajero.getCorreo()
                + "\nTARGETA DE CREDITO: " + viajero.getTarjetaBancaria()
                + "\n__________________________"
                + "\nFECHA DE SALIDA: " + ticket.getFecha()
                + "\nESTACION: " + ticket.getEstacion()
                + "\nPARADA: " + ticket.getParadero()
                + "\nN° DE ASIENTO: " + silla.getId()
                + "\nPRECIO POR ASIENTO: $" + silla.getPrecioAsiento());

    }

    private int elegirTramo() {
        int tramo = JOptionPane.showOptionDialog(null,
                "Seleccione el tramo el cual va viajar"
                + "\nTramo 1: $300.5"
                + "\nTramo 2: $430.9"
                + "\nTramo 3: $256.7"
                + "\nTramo 4: $320"
                + "\nTramo 5 Norte: $455.9"
                + "\nTramo 5 Sur: $322.5"
                + "\nTramo 6: $334.9"
                + "\nTramo 7: $250.9",
                "Mapa de rutas",
                -1,
                -1,
                new ImageIcon("Mapa.png"),
                new String[]{"Tramo 1", "Tramo 2", "Tramo 3", "Tramo 4", "Tramo 5 Norte", "Tramo 5 Sur", "Tramo 6", "Tramo 7"}, "Tramo 1");
        return tramo;
    }

    private String[] elegirDestino(int tramo) {
        ImageIcon imageTramo = new ImageIcon();
        //Dependiendo del tramo seleccionado, ese se mostrara en el Input
        switch (tramo) { 
            case 0:
                imageTramo = new ImageIcon("Tramo1.png");
                estaciones = new String[]{"Palenque, Chiapas", "Boca del Cerro, Tabasco", "El triunfo, Tabasco"};
                paradas = new String[]{"Tenosique, Tabasco", "Candelaria, Tabasco"};
                break;
            case 1:
                imageTramo = new ImageIcon("Tramo2.png");
                estaciones = new String[]{"Escárcega,Campeche", "Edzná,Campeche", "San Fracisco,de Campeche,Campeche"};
                paradas = new String[]{"Carrillo Puerto", "Tenabo,Campeche", "Hecelchakán,Campeche", "Calkiní,Campeche"};
                break;
            case 2:
                imageTramo = new ImageIcon("Tramo3.png");
                estaciones = new String[]{"Mérida Aeropuerto,Yucatán", "Teya,Yucatán", "Izamal,Yucatán"};
                paradas = new String[]{"Maxcanú,Yucatán", "Tixkokob,Yucatán", "Xibalbá,Yucatán"};
                break;
            case 3:
                imageTramo = new ImageIcon("Tramo4.png");
                estaciones = new String[]{"Chichen Itzá,Yucatán", "Valladolid,Yucatán", "Nuevo Xcán,Quintana Roo"};
                paradas = new String[]{"N/A"};
                break;
            case 4:
                imageTramo = new ImageIcon("Tramo5.png");
                estaciones = new String[]{"Cancún Aeropuerto,Quinana Roo", "Puerto Morelos,Quintana Roo", "Playa del Carmen,Quintana Roo"};
                paradas = new String[]{"N/A"};
                break;
            case 5:
                imageTramo = new ImageIcon("Tramo5sur.png");
                estaciones = new String[]{"Tulum,Quintana Roo", "Tulum Aeropuerto,Quintana Roo"};
                paradas = new String[]{"Xcaret,Quintana Roo", "Puerto Aventuras,Quintana Roo", "Akumal,Quintana Roo"};
                break;
            case 6:
                imageTramo = new ImageIcon("Tramo6.png");
                estaciones = new String[]{"Felipe Carrilo Puerto,Quintana Roo", "Bacalar,Quintana Roo", "Chetumal,Quintana Roo"};
                paradas = new String[]{"Limones,Othón P.Blanco,Quintana Roo"};
                break;
            case 7:
                imageTramo = new ImageIcon("Tramo7.png");
                estaciones = new String[]{"Xpujil,Campeche"};
                paradas = new String[]{"N/A"};
                break;
        }

        String estacion = (String) JOptionPane.showInputDialog(null, "Seleccione la estacion ", "Tramo n° " + (tramo + 1), -1, imageTramo, estaciones, estaciones[0]);
        String parada = (String) JOptionPane.showInputDialog(null, "Seleccione la parada ", "Tramo n° " + (tramo + 1), -1, imageTramo, paradas, paradas[0]);
        return new String[]{estacion, parada};
    }

    private String elegirAsiento() {

        asientos = new String[]{"1A", "1C", "2A", "2C", "2F", "3A", "3C", "3F", "3D",
            "4A", "4C", "4F", "4D", "5A", "5C", "5D", "5F", "6A", "6C", "6D", "6F",
            "7A", "7C", "7D", "7F", "8A", "8C", "8D", "8F", "9A", "9C", "9D", "9F",
            "10A", "10C", "10D", "10F", "11A", "11C", "11D", "11F", "12A", "12C",
            "12D", "12F", "13A", "13C", "13D", "13F", "14A", "14C", "14D", "14F",
            "15A", "15C", "15D", "15F"};
        String asiento = (String) JOptionPane.showInputDialog(null, "Seleccione su asiento ", "ASIENTOS DISPONIBLES", -1, new ImageIcon("Asientos.png"), asientos, asientos[0]);
        return asiento;
    }

    private String elegirFecha() {
        fechas = new String[]{"11/11/21", "13/11/21", "25/11/21", "10/12/21"}; 
        String fecha = (String) JOptionPane.showInputDialog(null, "Seleccione una fecha",
                "FECHAS DISPONIBLES",
                -1,
                null,
                fechas,
                fechas[0]);
        return fecha;
    }

}
