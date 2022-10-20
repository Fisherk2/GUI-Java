/*
PROGRAMA QUE MUESTRA E IMPRIME UN TICKET DE COMPRA
 */
package TiendaVideojuegos;

//CLASE PRINCIPAL
public class MainTienda {

    public static void main(String[] gamers) {
        
        //OBJETOS
        Display screen01 = new Display();
        Videojuego juego = new Videojuego();
        Ticket pago = new Ticket();
        
        //ATRIBUTOS
        String videogames;
        
        System.out.println("FACTURA DEL DIA 10/09/21");
        while((videogames = screen01.mostrarMenu())!=null){
            screen01.mostrarDetalle(juego.buscar(videogames));
            pago.imprimir(juego.buscar(videogames));
        }
        
    }
    
}
