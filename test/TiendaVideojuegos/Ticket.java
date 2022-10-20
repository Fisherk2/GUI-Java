package TiendaVideojuegos;

//OPERACIONES QUE SE ALMACENAN EN LA CONSOLA 
public class Ticket {

    //ATRIBUTOS
    String nombre, disponibilidad;
    double precio; //PENDIENTE

    Videojuego juego = new Videojuego();

    //METODOS
    public void imprimir(Games info) {
        System.out.println("TITULO: "+info.nombre
                +"\nESTADO: "+info.disponibilidad
                +"\n_____________________\n");
    }
}
