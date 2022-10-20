package Menus;

/**
 *
 * @author Fisher
 */
public class MainMenus {

    public static void main(String[] args) {
        
        /*BARRAS DE MENU
        Es un componente conformado por varios items de la parte superior de las ventanas.
        Solo se puede colocar una barra de menu por ventana, ya que esta se la coloca directamente a la misma.
        
        Primero si o si se debe inserta el "Menu Bar" para poder crear los demas items y submenus. 
        Para agregar mas menus, se debe arrastrar "Menu" a un lado de la barra.
        Para agregar un item, agarramos "Menu Item" y lo arrastramos al menu donde queremos ver el item.
        Para agregar un separador entre items, seleccionamos "Separator" y lo arrastramos debajo o encima del item
        que queramos separar.
        Podemos agregar iconos dentro de las propiedades del Item.
        Se puede agregar Eventos al hacer click derecho sobre el item que queremos que tenga interaccion.
        */
        BarraMenu menu = new BarraMenu();
        menu.setVisible(false); //La forma de crear un menu con el uso del diseñador de interfaces del NetBeans
        BarraMenuManual menuManual = new BarraMenuManual();
        menuManual.setVisible(false);//La forma manual de crear un menu con items
        
        /*SUBMENU
        Es un item que tiene una flecha que puede desplegar mas items, osea, este item que posee la flecha es un
        submenu.
        
        Para agregar un submenu, debemos arrastrar "Menu" dentro de un menu ya aplicado en la barra de menus.
        Para agregar items, solo debemos agarrar "Menu Item" y arrastrarlo donde se encuentra nuestro submenu.
        Para poder agrupar los menu Radio Buttons debemos crear un grupo de botones con la opcion "Button Group" en Swing Control arrastrandolo
        directamente a la ventana.
        */
        SubMenus subMenu = new SubMenus();
        subMenu.setVisible(false);//La forma de crear submenus con el uso del diseñador de interfaces del NetBeans
        SubMenuManual subMenuManual = new SubMenuManual();
        subMenuManual.setVisible(false);//La forma manual de crear un submenu con items
        
        /*MENU DESPLEGABLE JPOPUPMENU
        Es un menu que aparece cuando hacemos click derecho sobre algun elemeno de la ventana.
        
        Para agregar un item o un menu a ese Popup, debemos hacer click derecho sobre el componente y seleccionar "Add From Palette".
        Tenemos que agregar un evento de mouse para que nuestra ventana desplegable pueda actuar sobre la ventana o el panel.
        Al igual que los menus y submenus, se pueden agregar separadores.
        
        */
        MenuDesplegable menuDesplegable = new MenuDesplegable();
        menuDesplegable.setVisible(true);
    }
    
}
