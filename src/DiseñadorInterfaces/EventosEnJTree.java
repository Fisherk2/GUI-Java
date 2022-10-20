package DiseñadorInterfaces;

import javax.swing.ImageIcon;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Fisher
 */
public class EventosEnJTree extends javax.swing.JFrame {

    //Debemos pasarle un TreeNode de la clase DefaultMutableTreeNode a nuestra clase DefaultTreeModel
    DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Raiz"); //Raiz padre
    DefaultTreeModel modeloParaArbol = new DefaultTreeModel(raiz);

    public EventosEnJTree() {
        cargarDatosModeloTree();//Es para establecer las hojas y raices secundarias, se debe poner antes de iniciar los componentes
        initComponents();
    }

    private void cargarDatosModeloTree() {
        DefaultMutableTreeNode colores = new DefaultMutableTreeNode("Colores");//Raiz hija
        DefaultMutableTreeNode colorRojo = new DefaultMutableTreeNode("Rojo");//Hojas
        DefaultMutableTreeNode colorVerde = new DefaultMutableTreeNode("Verde");//Hojas
        //Hojas
        colores.add(colorRojo);
        colores.add(colorVerde);

        DefaultMutableTreeNode deportes = new DefaultMutableTreeNode("Deportes");//Raiz hija
        DefaultMutableTreeNode tenis = new DefaultMutableTreeNode("tenis");//Hojas
        DefaultMutableTreeNode futbol = new DefaultMutableTreeNode("futbol");//Rama terciaria
        DefaultMutableTreeNode sala = new DefaultMutableTreeNode("sala");//Hojas
        DefaultMutableTreeNode fut7 = new DefaultMutableTreeNode("futbol 7");//Hojas
        //Hojas de la raiz terciaria
        futbol.add(sala);
        futbol.add(fut7);

        //Hojas y raices
        deportes.add(tenis);//Hojas
        deportes.add(futbol);//Raiz terciario

        //Raices hijas
        raiz.add(colores);//Raiz secundaria
        raiz.add(deportes);//Raiz secundaria
    }
    /**
     * Metodo que dependiendo de la hoja seleccionada, este iniciara un Evento de seleccion
     * @param nodoSeleccionado 
     */
    public void eventosNodosSeleccionados(DefaultMutableTreeNode nodoSeleccionado) {
        //Dependiendo de que hoja se seleccione, se mostrara una imagen a la etiqueta (Puedes cambiar pos Switch para mas condicionales)
        if(nodoSeleccionado.toString().equals("Rojo")){
            etiquetaPic.setIcon(new ImageIcon(getClass().getResource("/DiseñadorInterfaces/colorrojo.png")));//La etiqueta imagen va establecer una imagen del proyecto
        }if(nodoSeleccionado.toString().equals("Verde")){
            etiquetaPic.setIcon(new ImageIcon(getClass().getResource("/DiseñadorInterfaces/colorverde.png")));//La etiqueta imagen va establecer una imagen del proyecto
        }if(nodoSeleccionado.toString().equals("tenis")){
            etiquetaPic.setIcon(new ImageIcon(getClass().getResource("/DiseñadorInterfaces/tenis.jpg")));//La etiqueta imagen va establecer una imagen del proyecto
        }if(nodoSeleccionado.toString().equals("sala")){
            etiquetaPic.setIcon(new ImageIcon(getClass().getResource("/DiseñadorInterfaces/futbolSala.jpg")));//La etiqueta imagen va establecer una imagen del proyecto
        }if(nodoSeleccionado.toString().equals("futbol 7")){
            etiquetaPic.setIcon(new ImageIcon(getClass().getResource("/DiseñadorInterfaces/futbol7.jpg")));//La etiqueta imagen va establecer una imagen del proyecto
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        etiquetaPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arbol de datos JTree");

        arbol.setModel(modeloParaArbol);
        /*
        TODO ESTE CODIGO SE HIZO EN POST - INIT CODE EN LAS PROPIEDADES DEL COMPONENTE ARBOL
        */
        TreeSelectionListener oyenteArbol = new TreeSelectionListener(){
            //Declaramos los metodos abstractos de la clase
            @Override
            public void valueChanged(TreeSelectionEvent e){
                /*
                Creamos una varieble de tipo DefaultMutableTreeNode (son las raices y hojas del componente) para almacenar la hoja que se va seleccionar.
                Hacemos un cast al componente seleccionado del arbol con el tipo DefaultMutableTreeNode, ya que este devuelve una variable de tipo Object
                */
                DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode)arbol.getLastSelectedPathComponent();
                eventosNodosSeleccionados(nodoSeleccionado);//Dependiendo de la hoja seleccionada, esta hara un Evento de seleccion
            }
        };

        //Al modelo que implementamos, le agregamos un evento de seleccion
        arbol.getSelectionModel().addTreeSelectionListener(oyenteArbol);
        jScrollPane1.setViewportView(arbol);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264)
                .addComponent(etiquetaPic, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addGap(429, 429, 429))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(etiquetaPic, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EventosEnJTree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventosEnJTree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventosEnJTree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventosEnJTree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventosEnJTree().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbol;
    private javax.swing.JLabel etiquetaPic;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
