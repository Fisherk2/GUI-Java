package DiseñadorInterfaces;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Fisher
 */
public class DatosArbolJTree extends javax.swing.JFrame {

    //Debemos pasarle un TreeNode de la clase DefaultMutableTreeNode a nuestra clase DefaultTreeModel
    DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Raiz"); //Raiz padre
    DefaultTreeModel modeloParaArbol = new DefaultTreeModel(raiz);

    public DatosArbolJTree() {
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arbol de datos JTree");

        arbol.setModel(modeloParaArbol);
        jScrollPane1.setViewportView(arbol);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(509, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(DatosArbolJTree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosArbolJTree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosArbolJTree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosArbolJTree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosArbolJTree().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbol;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
