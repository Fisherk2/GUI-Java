/*
 * NOMBRE: Fisher
 * FECHA: 17/10/22
 * PROYECTO: SIMULACION
 */
package batallaNaval;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * Clase que crea una ventana donde se muestra el tablero del juego.
 *
 * @author Fisherk2
 */
public class Wtablero extends javax.swing.JFrame {

    private final WJReglas WJR;
    private final WJGrid WJG;
    private final Cpu tirador;
    private final int N_BARCOS = 3;
    private Barco[] ships;
    private int tope, shoots;

    public Wtablero() {
        initComponents();
        tirador = new Cpu();
        tope = 0;
        shoots = 0;
        ships = new Barco[N_BARCOS];

        //AGRUPAR RADIOBOTONES
        bgAlignment.add(rbHorizontal);
        bgAlignment.add(rbVertical);
        bgSizes.add(rbSize1);
        bgSizes.add(rbSize2);
        bgSizes.add(rbSize3);
        rbHorizontal.setSelected(true);
        rbSize1.setSelected(true);

        lGameOver.setVisible(false);
        bShoot.setEnabled(false);

        //VENTANAS SECUNDARIAS
        WJR = new WJReglas(this, false);
        WJG = new WJGrid(this, false);
        WJG.setVisible(true);

        //CENTRAR LA VENTANA
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSizes = new javax.swing.ButtonGroup();
        bgAlignment = new javax.swing.ButtonGroup();
        pBatallaNaval = new javax.swing.JPanel();
        lTitulo = new javax.swing.JLabel();
        lColocar = new javax.swing.JLabel();
        lGameOver = new javax.swing.JLabel();
        lCoorX = new javax.swing.JLabel();
        lCoorY = new javax.swing.JLabel();
        lNumShoot = new javax.swing.JLabel();
        lShoots = new javax.swing.JLabel();
        lBarquito1 = new javax.swing.JLabel();
        lBarquito2 = new javax.swing.JLabel();
        lBarquito3 = new javax.swing.JLabel();
        lBarquito4 = new javax.swing.JLabel();
        lBarquito5 = new javax.swing.JLabel();
        lBarquito6 = new javax.swing.JLabel();
        bReglas = new javax.swing.JButton();
        bRestart = new javax.swing.JButton();
        bShoot = new javax.swing.JButton();
        bSet = new javax.swing.JButton();
        cbCoorX = new javax.swing.JComboBox<>();
        cbCoorY = new javax.swing.JComboBox<>();
        cbNumShoot = new javax.swing.JComboBox<>();
        rbSize1 = new javax.swing.JRadioButton();
        rbSize2 = new javax.swing.JRadioButton();
        rbSize3 = new javax.swing.JRadioButton();
        rbVertical = new javax.swing.JRadioButton();
        rbHorizontal = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BATALLA NAVAL");
        setResizable(false);

        pBatallaNaval.setBackground(new java.awt.Color(0, 51, 51));

        lTitulo.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        lTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setText("BATALLA NAVAL");

        lColocar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lColocar.setForeground(new java.awt.Color(51, 255, 51));
        lColocar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lColocar.setText("Colocar 3 barcos: ");

        lGameOver.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lGameOver.setForeground(new java.awt.Color(255, 0, 0));
        lGameOver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lGameOver.setText("JUEGO TERMINADO");

        lCoorX.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lCoorX.setForeground(new java.awt.Color(255, 255, 255));
        lCoorX.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lCoorX.setText("X:");

        lCoorY.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lCoorY.setForeground(new java.awt.Color(255, 255, 255));
        lCoorY.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lCoorY.setText("Y:");

        lNumShoot.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lNumShoot.setForeground(new java.awt.Color(255, 255, 255));
        lNumShoot.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lNumShoot.setText("Numero de disparos:");

        lShoots.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lShoots.setForeground(new java.awt.Color(255, 51, 51));
        lShoots.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lShoots.setText("Disparos:");

        lBarquito1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batallaNaval/Barco.png"))); // NOI18N

        lBarquito2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batallaNaval/Barco.png"))); // NOI18N

        lBarquito3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batallaNaval/Barco.png"))); // NOI18N

        lBarquito4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batallaNaval/Barco.png"))); // NOI18N

        lBarquito5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batallaNaval/Barco.png"))); // NOI18N

        lBarquito6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/batallaNaval/Barco.png"))); // NOI18N

        bReglas.setBackground(new java.awt.Color(102, 255, 204));
        bReglas.setFont(new java.awt.Font("Montserrat SemiBold", 1, 18)); // NOI18N
        bReglas.setForeground(new java.awt.Color(0, 0, 0));
        bReglas.setText("REGLAS");
        bReglas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReglasActionPerformed(evt);
            }
        });

        bRestart.setBackground(new java.awt.Color(255, 255, 0));
        bRestart.setFont(new java.awt.Font("Montserrat SemiBold", 1, 18)); // NOI18N
        bRestart.setForeground(new java.awt.Color(0, 0, 0));
        bRestart.setText("RESTART");
        bRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRestartActionPerformed(evt);
            }
        });

        bShoot.setBackground(new java.awt.Color(204, 0, 0));
        bShoot.setFont(new java.awt.Font("Montserrat SemiBold", 1, 18)); // NOI18N
        bShoot.setForeground(new java.awt.Color(255, 255, 255));
        bShoot.setText("SHOOT!");
        bShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bShootActionPerformed(evt);
            }
        });

        bSet.setBackground(new java.awt.Color(102, 255, 102));
        bSet.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        bSet.setForeground(new java.awt.Color(0, 0, 0));
        bSet.setText("SET");
        bSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSetActionPerformed(evt);
            }
        });

        cbCoorX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));

        cbCoorY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        cbNumShoot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50" }));

        rbSize1.setText("Tamaño 1");
        rbSize1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSize1ActionPerformed(evt);
            }
        });

        rbSize2.setText("Tamaño 2");
        rbSize2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSize2ActionPerformed(evt);
            }
        });

        rbSize3.setText("Tamaño 3");
        rbSize3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSize3ActionPerformed(evt);
            }
        });

        rbVertical.setText("Vertical");
        rbVertical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVerticalActionPerformed(evt);
            }
        });

        rbHorizontal.setText("Horizontal");
        rbHorizontal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHorizontalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBatallaNavalLayout = new javax.swing.GroupLayout(pBatallaNaval);
        pBatallaNaval.setLayout(pBatallaNavalLayout);
        pBatallaNavalLayout.setHorizontalGroup(
            pBatallaNavalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBatallaNavalLayout.createSequentialGroup()
                .addGroup(pBatallaNavalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pBatallaNavalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pBatallaNavalLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pBatallaNavalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lColocar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pBatallaNavalLayout.createSequentialGroup()
                                .addGroup(pBatallaNavalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pBatallaNavalLayout.createSequentialGroup()
                                        .addGroup(pBatallaNavalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lCoorX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lCoorY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(16, 16, 16)
                                        .addGroup(pBatallaNavalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(bSet, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                            .addComponent(cbCoorY, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbCoorX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(26, 26, 26)
                                        .addComponent(lNumShoot)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbNumShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pBatallaNavalLayout.createSequentialGroup()
                                        .addComponent(bReglas, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addGroup(pBatallaNavalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lShoots, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bShoot, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(bRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pBatallaNavalLayout.createSequentialGroup()
                                        .addGroup(pBatallaNavalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pBatallaNavalLayout.createSequentialGroup()
                                                .addComponent(rbSize3)
                                                .addGap(18, 18, 18)
                                                .addComponent(lBarquito3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lBarquito5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lBarquito6))
                                            .addGroup(pBatallaNavalLayout.createSequentialGroup()
                                                .addComponent(rbSize2)
                                                .addGap(18, 18, 18)
                                                .addComponent(lBarquito2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lBarquito4))
                                            .addGroup(pBatallaNavalLayout.createSequentialGroup()
                                                .addComponent(rbSize1)
                                                .addGap(18, 18, 18)
                                                .addComponent(lBarquito1)))
                                        .addGap(37, 37, 37)
                                        .addGroup(pBatallaNavalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbHorizontal)
                                            .addComponent(rbVertical))))
                                .addGap(0, 20, Short.MAX_VALUE))))
                    .addComponent(lGameOver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pBatallaNavalLayout.setVerticalGroup(
            pBatallaNavalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBatallaNavalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lGameOver)
                .addGroup(pBatallaNavalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pBatallaNavalLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pBatallaNavalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbSize1)
                            .addComponent(lBarquito1)))
                    .addGroup(pBatallaNavalLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(rbHorizontal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pBatallaNavalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbSize2)
                    .addComponent(lBarquito2)
                    .addComponent(lBarquito4)
                    .addComponent(rbVertical))
                .addGap(18, 18, 18)
                .addGroup(pBatallaNavalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pBatallaNavalLayout.createSequentialGroup()
                        .addGroup(pBatallaNavalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbSize3)
                            .addComponent(lBarquito3)
                            .addComponent(lBarquito6))
                        .addGap(41, 41, 41)
                        .addComponent(lColocar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pBatallaNavalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCoorX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lCoorX)
                            .addComponent(cbNumShoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lNumShoot))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pBatallaNavalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCoorY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lCoorY))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bSet))
                    .addComponent(lBarquito5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lShoots)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pBatallaNavalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pBatallaNavalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bReglas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bRestart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBatallaNaval, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBatallaNaval, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bReglasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReglasActionPerformed
        WJR.setVisible(true);
    }//GEN-LAST:event_bReglasActionPerformed

    private void bRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRestartActionPerformed
        //RESTABLECEMOS EL TABLERO
        WJG.resetColor();
        //RESTABLECEMOS LOS PARAMETROS
        rbHorizontal.setSelected(true);
        rbSize1.setSelected(true);
        cbCoorX.setSelectedIndex(0);
        cbCoorY.setSelectedIndex(0);
        cbNumShoot.setSelectedIndex(0);
        lGameOver.setVisible(false);
        cbNumShoot.setEnabled(true);
        bSet.setEnabled(true);
        bShoot.setEnabled(false);
        tope = 0;
        shoots = 0;
        ships = new Barco[N_BARCOS];
        lShoots.setText("Disparos: " + shoots);
    }//GEN-LAST:event_bRestartActionPerformed

    private void rbSize1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSize1ActionPerformed
    }//GEN-LAST:event_rbSize1ActionPerformed

    private void bShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bShootActionPerformed
        boolean derrotado = false;
        shoots++;
        do {
            tirador.genDisparo();
        } while (tirador.getX() > 7 || tirador.getY() > 4);
        WJG.cambiarColor(2, tirador.getX(), tirador.getY());
        //VERIFICAR SI DESTRUYO A LOS BARCOS
        for (Barco ship : ships) {
            for (int i = 0; i < ship.getCasillas().size(); i++) {
                if (tirador.getPosicion() == ship.getCasillas().get(i)) {
                    ship.setEstado(false);
                }
            }
            if (!ship.isAlive()) {
                for (int casilla : ship.getCasillas()) {
                    WJG.cambiarColor(2, casilla);
                }
                derrotado = true;
            }
        }
        //VUELVE A VERIFICAR SI TODOS LOS BARCOS ESTAN MUERTOS
        for (Barco ship : ships) {
            if (ship.isAlive()) {
                derrotado = false;
            }
        }

        bSet.setEnabled(false);
        lShoots.setText("Disparos: " + shoots);
        cbNumShoot.setEnabled(false);
        if (shoots == (cbNumShoot.getSelectedIndex() + 1) || derrotado) {
            bShoot.setEnabled(false);
            anunciarGanador();
        }
    }//GEN-LAST:event_bShootActionPerformed

    private void rbSize2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSize2ActionPerformed
    }//GEN-LAST:event_rbSize2ActionPerformed

    private void rbSize3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSize3ActionPerformed
    }//GEN-LAST:event_rbSize3ActionPerformed

    private void rbVerticalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVerticalActionPerformed
    }//GEN-LAST:event_rbVerticalActionPerformed

    private void rbHorizontalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHorizontalActionPerformed
    }//GEN-LAST:event_rbHorizontalActionPerformed

    private void bSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSetActionPerformed
        int x, y, alineacion = 0, tamaño = 0;
        x = cbCoorX.getSelectedIndex();
        y = cbCoorY.getSelectedIndex();
        if (rbVertical.isSelected()) {
            alineacion = 1;
        } else if (rbHorizontal.isSelected()) {
            alineacion = 0;
        }
        if (rbSize1.isSelected()) {
            tamaño = 0;
        } else if (rbSize2.isSelected()) {
            tamaño = 1;
        } else if (rbSize3.isSelected()) {
            tamaño = 2;
        }
        if (revisionCoor(x, y, tamaño, alineacion)) {
            //COLOCAR SOLO 3 BARCOS EN EL TABLERO 
            ships[tope] = new Barco(x, y);
            tope++;
            if (tope == N_BARCOS) {
                bSet.setEnabled(false);
                bShoot.setEnabled(true);
                lGameOver.setText("LISTO PARA LA BATALLA");
                lGameOver.setForeground(Color.GREEN);
                lGameOver.setVisible(true);
            }

            switch (tamaño) {
                case 0:
                    WJG.cambiarColor(1, x, y);
                    break;
                case 1:
                    WJG.cambiarColor(1, x, y);
                    if (alineacion == 0) { //HORIZONTAL
                        WJG.cambiarColor(1, x + 1, y);
                        ships[tope - 1].agregarCasilla(x + 1, y);
                    } else {//VERTICAL
                        WJG.cambiarColor(1, x, y + 1);
                        ships[tope - 1].agregarCasilla(x, y + 1);
                    }
                    break;
                case 2:
                    WJG.cambiarColor(1, x, y);
                    if (alineacion == 0) { //HORIZONTAL
                        WJG.cambiarColor(1, x + 1, y);
                        WJG.cambiarColor(1, x + 2, y);
                        ships[tope - 1].agregarCasilla(x + 1, y);
                        ships[tope - 1].agregarCasilla(x + 2, y);
                    } else {//VERTICAL
                        WJG.cambiarColor(1, x, y + 1);
                        WJG.cambiarColor(1, x, y + 2);
                        ships[tope - 1].agregarCasilla(x, y + 1);
                        ships[tope - 1].agregarCasilla(x, y + 2);
                    }
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR, EL BARCO SE SALE DEL TABLERO, INGRESE OTRA COORDENADA");
        }

    }//GEN-LAST:event_bSetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bReglas;
    private javax.swing.JButton bRestart;
    private javax.swing.JButton bSet;
    private javax.swing.JButton bShoot;
    private javax.swing.ButtonGroup bgAlignment;
    private javax.swing.ButtonGroup bgSizes;
    private javax.swing.JComboBox<String> cbCoorX;
    private javax.swing.JComboBox<String> cbCoorY;
    private javax.swing.JComboBox<String> cbNumShoot;
    private javax.swing.JLabel lBarquito1;
    private javax.swing.JLabel lBarquito2;
    private javax.swing.JLabel lBarquito3;
    private javax.swing.JLabel lBarquito4;
    private javax.swing.JLabel lBarquito5;
    private javax.swing.JLabel lBarquito6;
    private javax.swing.JLabel lColocar;
    private javax.swing.JLabel lCoorX;
    private javax.swing.JLabel lCoorY;
    private javax.swing.JLabel lGameOver;
    private javax.swing.JLabel lNumShoot;
    private javax.swing.JLabel lShoots;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JPanel pBatallaNaval;
    private javax.swing.JRadioButton rbHorizontal;
    private javax.swing.JRadioButton rbSize1;
    private javax.swing.JRadioButton rbSize2;
    private javax.swing.JRadioButton rbSize3;
    private javax.swing.JRadioButton rbVertical;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo que verifica si la configuracion de coordenadas no sale del
     * tablero.
     */
    private boolean revisionCoor(int x, int y, int tamaño, int alineacion) {
        if (alineacion == 0) {//HORIZONTAL
            if (tamaño == 1) {
                if ((x + 1) > 7) {
                    return false;
                }
            } else if (tamaño == 2) {
                if ((x + 2) > 7) {
                    return false;
                }
            }
        } else { //VERTICAL
            if (tamaño == 1) {
                if ((y + 1) > 4) {
                    return false;
                }
            } else if (tamaño == 2) {
                if ((y + 2) > 4) {
                    return false;
                }
            }
        }

        return true; //Si pasa los filtros, puede colocarse el barco

    }

    private void anunciarGanador() {
        boolean ganador = false;
        for (Barco ship : ships) {
            if (ship.isAlive()) {
                ganador = true; //Si uno esta vivo, significa que ganaste
            }
        }
        if (ganador) {
            lGameOver.setVisible(true);
            lGameOver.setText("JUEGO TERMINADO, GANASTE :)");
            lGameOver.setForeground(Color.GREEN);
        } else {
            lGameOver.setVisible(true);
            lGameOver.setText("JUEGO TERMINADO, PERDISTE :(");
            lGameOver.setForeground(Color.RED);
        }

    }

}
