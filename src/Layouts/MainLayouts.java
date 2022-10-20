package Layouts;

public class MainLayouts {

    public static void main(String[] args) {

        /* FLOWLAYOUT
        Es el layout que establece el minimo espacio entre todos los componentes del panel.
        
        Cuando se hace mas grande o mas pequeña la ventana, automaticamente se acomodan los componentes, haciendo que no se
        borren de la ventana, podemos modificar la alineacion de nuestros componentes en las propiedades de
        FlowLayout.
        
        Los componentes te lo ordena de izquierda a derecha dependiendo del orden en que se haya colocado los componentes
        en las propiedades de la ventana (de forma descendente).
        
        El vertical y horizontal Gap es el espacio que debe llevar los componentes cuando se este modificando la ventana.
        (Agregue 15 columnas al campo de texto para que no se apachurre al minimo cuando se ponga el layout)
         */
        FlowLayout layoutFlow = new FlowLayout();
        layoutFlow.setVisible(false);

        /* BOXLAYOUT
        Es el layout que puedes alinear componentes de forma horizontal, como verticalmente.
        
        En las propiedades del BoxLayout puedes modificar la alineacion del layout, tanto horizontal y verticalmente.
        (panel rosa=horizontal, panel morado=vertical)
         */
        BoxLayout layoutBox = new BoxLayout();
        layoutBox.setVisible(false);
        
        /*BORDERLAYOUT
        Es el layout que aprovecha al maximo todos los espacios de la ventana cuando se agregan los paneles.
        El border layout se aplica en la ventana directamente.
        Los bordes de los paneles cuando se modifica el tamaño de la ventana no se separan de su posicion, haciendo
        que estos esten pegados en la ventana.
         */
        BorderLayout layoutBorder = new BorderLayout();
        layoutBorder.setVisible(false);
        
        /*GRIDLAYOUT
        Es el layout que hace que un grupo de componentes tenga el mismo tamaño y los muestra en el numero
        solicitado de filas y columnas.
        
        En las propiedades del Grid Layout se puede modificar tanto el numero de filas como de columnas de 
        como estaran acomodados los componentes del panel, ademas del espacio en pixeles entre los componentes.
        
        Cuando se hace grande o pequeña la ventana, esta hara que los botones no se desaparezcan y tengan la misma
        proporcion.
        */
        GridLayout layoutGrid = new GridLayout();
        layoutGrid.setVisible(false);
        
        /*GRIDBAGLAYOUT
        Es un administrador de diseño sofisticado y flexible. Alinea los componentes colocandolos dentro de una
        rejilla de celdas, permitiendo que los componentes abarquen mas de una celda. Las filas en la cuadricula
        pueden tener diferentes altras, y las columnas de cuadricula pueden tener diferentes anchuras.
        
        Debemos hacer click derecho y presionar en "Customize" para poder acceder a estas propiedades avanzadas.
        Grid: En que columna o fila va ir nuestro componente.
        Grid Width: Cuantas columnas o filas va ocupar el componente.
        Fill: Como va crecer o decrecer el componente cuando movamos el tamaño de la ventana.
        Internal Paddig: Es el tamaño del componente por defecto.
        Anchor: La alineacion del componente sobre la celda o las celdas que se establecio.
        Weight: Es la proporcion que va crecer el componente, tanto horizontal como vertical dependiendo de cuanto movamos el tamaño de la ventana.
        Insets: Margen de separacion entre el componente y la celda
        
        
        */
        
        GridBagLayout layoutGridBag = new GridBagLayout();
        layoutGridBag.setVisible(true);
    }

}
