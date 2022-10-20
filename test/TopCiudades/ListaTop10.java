package TopCiudades;

public class ListaTop10 {

    Ciudad[] lista;

    ListaTop10() {
        lista = new Ciudad[]{new Ciudad("Venecia", "Europa", "Venecia.jpg"),
            new Ciudad("Estambul", "Asia", "Estambul.jpg"),
            new Ciudad("Nueva York", "América", "Nueva York.jpg"),
            new Ciudad("Beirut", "Medio Oriente", "Beirut.jpg"),
            new Ciudad("Ámsterdam", "Europa", "Ámsterdam.jpg"),
            new Ciudad("Londres", "Europa", "Londres.jpg"),
            new Ciudad("Ciudad del Cabo", "África", "Ciudad del Cabo.jpg"),
            new Ciudad("Brujas", "Europa", "Brujas.jpg"),
            new Ciudad("Roma", "Europa", "Roma.jpg")
        };
    }

    public Ciudad buscar(String nombreCiudad) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].nombre.equals(nombreCiudad)) {
                return lista[i];
            }
        }
        return null;
    }
}

class Ciudad {

    String nombre, región, imagen;

    Ciudad(String n, String r, String i) {
        nombre = n;
        región = r;
        imagen = i;
    }
}
