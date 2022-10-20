package TopCiudades;

public class Top10CiudadesBellas {

    public static void main(String[] args) {
        Pantalla panasonic = new Pantalla();
        ListaTop10 lista = new ListaTop10();

        String ciudad;

        while ((ciudad = panasonic.mostrarMenú()) != null) {
            panasonic.mostrarDetalle(lista.buscar(ciudad));
            
        }

    }
}
