package ListasConObjetos;

/**
 * CLASE PRINCIPAL QUE SE USARA PARA ARRANCAR VENTANAS CON SUS RESPECTIVOS
 * COMPONENTES DE EJEMPLO.
 * @author Fisher
 */
public class MainListasObjetos {

    public static void main(String[] args) {
        
        //Modelo para listas desplegables para la ocupacion de objetos con DefaultComboBox
        ListaDesplegableDefaultComboBox defaultComboBox = new ListaDesplegableDefaultComboBox();
        defaultComboBox.setVisible(false);
        
        //Como crear listas con manipulacion de objetos con JList
        ListasJList listas = new ListasJList();
        listas.setVisible(true);
        
    }

}
