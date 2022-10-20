package TiendaVideojuegos;

//VIDEOJUEGOS DISPONIBLES EN LA TIENDA
public class Videojuego {

    //ATRIBUTOS
    Games[] catalogo;

    //CONSTRUCTOR
    Videojuego() {
        catalogo = new Games[]{
            new Games("Crash Team Racing Nitro-Fueled", "NO DISPONIBLE", "Crash Team Racing Nitro-Fueled.png"),
            new Games("Forza Horizon 2 Xbox ONE 10th Anniversary Edition", "NO DISPONIBLE", "Forza Horizon 2 Xbox ONE 10th Anniversary Edition.png"),
            new Games("Forza Horizon 3 Car Pass", "NO DISPONIBLE", "Forza Horizon 3 Car Pass.png"),
            new Games("Forza Horizon 4 Deluxe Edition", "NO DISPONIBLE", "Forza Horizon 4 Deluxe Edition.png"),
            new Games("Forza Horizon 4 Expansions Bundle", "DISPONIBLE", "Forza Horizon 4 Expansions Bundle.png"),
            new Games("Forza Horizon 4", "DISPONIBLE", "Forza Horizon 4.png"),
            new Games("Forza Motorsport 5", "NO DISPONIBLE", "Forza Motorsport 5.png"),
            new Games("Forza Motorsport 6", "NO DISPONIBLE", "Forza Motorsport 6.png"),
            new Games("NASCAR Heat 3", "DISPONIBLE", "NASCAR Heat 3.png"),
            new Games("Need for Speed Payback Deluxe Edition", "NO DISPONIBLE", "Need for Speed Payback Deluxe Edition.png"),
            new Games("Sleeping Dogs Definitive Edition", "NO DISPONIBLE", "Sleeping Dogs Definitive Edition.png"),
            new Games("The Crew 2 Deluxe Edition", "NO DISPONIBLE", "The Crew 2 Deluxe Edition.png"),
            new Games("The Grand Tour Game", "NO DISPONIBLE", "The Grand Tour Game.png"),
            new Games("Trials Rising Gold Edition", "NO DISPONIBLE", "Trials Rising Gold Edition.png"),
            new Games("Xenon Racer", "DISPONIBLE", "Xenon Racer.png")
        };
    }

    //METODOS
    public Games buscar(String nombreVideojuego) {
        for (int i = 0; i < catalogo.length; i++) {
            if (catalogo[i].nombre.equals(nombreVideojuego)) {
                return catalogo[i];
            }
        }
        return null;
    }
    
}

//CLASE 
class Games {

    //ATRIBUTOS
    String nombre, disponibilidad, imagen;

    //CONSTRUCTOR
    Games(String n, String d, String i) {
        nombre = n;
        disponibilidad = d;
        imagen = i;
    }

}
