package TrenMaya;

/**
 * Clase que guarda los datos de los asientos reservados por Usuario
 *
 * @author Fisher
 */
public class Boleto {

    private String fecha, estacion, paradero;

    public Boleto(String fecha, String estacion, String paradero) {
        this.fecha = fecha;
        this.estacion = estacion;
        this.paradero = paradero;
    }

    public String getFecha() {
        return fecha;
    }

    public String getEstacion() {
        return estacion;
    }

    public String getParadero() {
        return paradero;
    }

}//BOLETO

/**
 * Clase que almacena los datos del asiento que haya sido seleccionado por el
 * Usuario
 *
 * @author Fisher
 */
class Asiento {

    private double precioAsiento;
    private int tramo;
    private String id;

    public Asiento(String id, int tramo) {
        this.id = id;
        this.tramo = tramo;
    }

    public String getId() {
        return id;
    }

    public double getPrecioAsiento() {
        switch (tramo) {
            case 0://TRAMO 1
                precioAsiento = 300.5;
                break;
            case 1://TRAMO 2
                precioAsiento = 430.9;
                break;
            case 2://TRAMO 3
                precioAsiento = 256.7;
                break;
            case 3://TRAMO 4
                precioAsiento = 320;
                break;
            case 4://TRAMO 5 NORTE
                precioAsiento = 455.9;
                break;
            case 5://TRAMO 5 SUR
                precioAsiento = 322.5;
                break;
            case 6://TRAMO 6
                precioAsiento = 334.9;
                break;
            case 7://TRAMO 7
                precioAsiento = 250.9;
                break;
        }

        return precioAsiento;
    }

}//ASIENTO
