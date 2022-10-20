/*
EVENTOS 
 */
package EventosListeners;

public class MainListener {

    public static void main(String[] args) {
        //OBJETOS
        OyenteDeAccion ventana1 = new OyenteDeAccion();
        OyenteDeRaton ventana2 = new OyenteDeRaton();
        OyenteDeTeclado ventana3 = new OyenteDeTeclado();
        OyenteMovimientoRaton ventana4 = new OyenteMovimientoRaton();
        OyenteRuedaRaton ventana5 = new OyenteRuedaRaton();

        ventana1.setVisible(true);//Hacemos visible la ventana
        ventana2.setVisible(true);//Hacemos visible la ventana
        ventana3.setVisible(true);//Hacemos visible la ventana
        ventana4.setVisible(true);//Hacemos visible la ventana
        ventana5.setVisible(true);//Hacemos visible la ventana

    }

}
