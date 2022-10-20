package DiseñadorInterfaces;


public class MainJFrames {

    public static void main(String[] args) {

        Ventana ejemploATS = new Ventana();
        ejemploATS.setVisible(false);

        /*ESTILOS DE VENTANAS CON LOOKANDFEEL
        Para agregar un estilo de ventana, primero debemos importar la clase UIManager y declararlo dentro del PSVM
        del codigo fuente de la interfaz.
        Dentro de la documentacion, los paquetes que tienen la terminacion javax.swing.plaf.(estilo), sera la ubicacion de la clase
        que enviaremos de argumento al UIManager.setLookAndFeel("Nombre del paquete.LookAndFeel")
        
        Para descargar mas estilos, puedes ir a la pagina http://www.jtattoo.net/ , o buscar LookAndFeel Windows en el buscador
        Despues, en la carpeta "Libraries" debemos agregar el .JAR para poder importar la libreria que descargamos.
       
        Las ventanas descargables solo se pueden arrancar dentro del PSVM del codigo fuente de la interfaz.
         */
        EstilosDeVentana lookAndFeel = new EstilosDeVentana();
        lookAndFeel.setVisible(false);
        
        /*VENTANAS SECUNDARIAS CON JDIALOG
        Las ventana secundarias solo aparece en su titulo la opcion de cerrar, a diferencia de las principales que podemos minimizar o maximizar
        
        Para crear una ventana secundaria debemos crear una clase de tipo JDialog form cuando hacemos click
        derecho sobre el paquete donde este nuestra ventana principal.
        Si queremos abrir la ventana secundaria desde otra ventana diferente (ya sea por medio de un boton u otro componente) debemos crear un
        objeto de la ventana secundaria dentro del ActionPerformed de la ventana principal o la que vamos a llamar a la secundaria.
       
        Dentro de los argumentos de la clase JDialog debemos pasarle estos argumentos:
        (Un objeto tipo JFrame o JDialog del origen de la llamada para la ventana secundaria, un booleano)
        TRUE: Significa que la ventana principal se va bloquear hasta que se cierre la secundaria.
        FALSE: Significa que la ventana principal se va poder acceder aunque este la ventana secundaria abierta, aunque se duplican
        las ventanas cada vez que quieras abrir la ventana secundaria desde la ventan principal.
        
        El metodo para cerrar la ventana secundaria y no terminar con todo el programa es dispose( );
        */
        VentanaSecundaria ventanaSecundaria = new VentanaSecundaria();
        ventanaSecundaria.setVisible(false);
        
        /*MOSTRAR DATOS EN FORMA DE ARBOL JERARQUICO CON JTREE
        Es un componente de arbol de muestra donde se enseñan datos en multiples ramificaciones.
        
        Para agregar un JTree esta en la seccion de Swing Control de la paleta.
        Para crear un modelo debemos modificar desde el codigo fuente con DefaultTreeModel, y para pasarse ese modelo debemos ir a las
        propiedades del JTree y picarle los tres puntos en el renglo de "model", despues en la lista desplegable poner custom model y poner el nombre
        del objeto que hicimos del DefaultTreeModel.
        
        Para cargar los datos del Modelo que queremos que aparesca en el arbol, se hace un metodo aparte que determine las hojas padre, secundarias y hojas.
        
        Para agregar Eventos a los arboles debemos ir a las propiedades del JTree y en el menu de "Code" buscamos la fila "Post-init Code", esto para poder
        agregar mas codigo al que esta bloqueado por defecto cuando se inician componentes del JFrame.
        */
        DatosArbolJTree arbolDatos = new DatosArbolJTree();
        arbolDatos.setVisible(false);
        //Arbol con eventos
        EventosEnJTree arbolEventos = new EventosEnJTree();
        arbolEventos.setVisible(true);
    }
}
