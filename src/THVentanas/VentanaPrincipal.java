/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package THVentanas;

import THlogica.grupos;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import javax.swing.*;


public class VentanaPrincipal extends javax.swing.JFrame {

    grupos grupos = new grupos();
    
    public VentanaPrincipal() {
        
        initComponents();
        grupos.ReadGrupos();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/THimages/icon.png")));
        setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),24,24));
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        move = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        toCustom = new javax.swing.JButton();
        toEDIT = new javax.swing.JButton();
        toGENER = new javax.swing.JButton();
        downthing = new javax.swing.JPanel();
        switchven = new javax.swing.JTabbedPane();
        edit = new javax.swing.JPanel();
        Gruposed = new javax.swing.JPanel();
        labelgrupos = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        cursosed = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        labelcursos = new javax.swing.JLabel();
        add2 = new javax.swing.JButton();
        brush = new javax.swing.JButton();
        opcionsed = new javax.swing.JPanel();
        brush2 = new javax.swing.JButton();
        key = new javax.swing.JButton();
        labelop = new javax.swing.JLabel();
        back2 = new javax.swing.JButton();
        add3 = new javax.swing.JButton();
        textField2 = new custom.TextField();
        See = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(169, 209, 142));
        header.setPreferredSize(new java.awt.Dimension(1180, 95));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        move.setFont(new java.awt.Font("Segoe UI", 0, 80)); // NOI18N
        move.setForeground(new java.awt.Color(102, 204, 255));
        move.setText("•");
        move.setToolTipText("");
        move.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        move.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveMouseDragged(evt);
            }
        });
        header.add(move, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, -10, -1, 50));

        min.setFont(new java.awt.Font("Segoe UI", 0, 80)); // NOI18N
        min.setForeground(new java.awt.Color(255, 255, 102));
        min.setText("•");
        min.setToolTipText("");
        min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });
        header.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, -10, -1, 50));

        exit.setFont(new java.awt.Font("Segoe UI", 0, 80)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 102, 102));
        exit.setText("•");
        exit.setToolTipText("");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        header.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, -10, -1, 50));

        name.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("#TUHORARIO");
        header.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 220, 20));

        toCustom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/customWhite35.png"))); // NOI18N
        toCustom.setContentAreaFilled(false);
        toCustom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toCustom.setDefaultCapable(false);
        toCustom.setFocusPainted(false);
        header.add(toCustom, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 30, 30));

        toEDIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/editWhite35.png"))); // NOI18N
        toEDIT.setContentAreaFilled(false);
        toEDIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toEDIT.setDefaultCapable(false);
        toEDIT.setFocusPainted(false);
        toEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toEDITActionPerformed(evt);
            }
        });
        header.add(toEDIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 30, 30));

        toGENER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/menuWhite35.png"))); // NOI18N
        toGENER.setBorderPainted(false);
        toGENER.setContentAreaFilled(false);
        toGENER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toGENER.setDefaultCapable(false);
        toGENER.setFocusPainted(false);
        toGENER.setHideActionText(true);
        toGENER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toGENERActionPerformed(evt);
            }
        });
        header.add(toGENER, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 30, 30));

        downthing.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout downthingLayout = new javax.swing.GroupLayout(downthing);
        downthing.setLayout(downthingLayout);
        downthingLayout.setHorizontalGroup(
            downthingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        downthingLayout.setVerticalGroup(
            downthingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        header.add(downthing, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 45, 30, 6));

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 60));

        switchven.setBackground(new java.awt.Color(237, 253, 246));
        switchven.setToolTipText("");

        edit.setBackground(new java.awt.Color(204, 204, 204));
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Gruposed.setBackground(new java.awt.Color(237, 253, 246));
        Gruposed.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelgrupos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        labelgrupos.setForeground(new java.awt.Color(127, 127, 127));
        labelgrupos.setText("Grupos");
        Gruposed.add(labelgrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, 20));

        add.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        add.setForeground(new java.awt.Color(127, 127, 127));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/editfuntions/addGray20.png"))); // NOI18N
        add.setContentAreaFilled(false);
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.setFocusPainted(false);
        Gruposed.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 20, 20));

        edit.add(Gruposed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 670));

        cursosed.setBackground(new java.awt.Color(209, 243, 222));
        cursosed.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        back.setForeground(new java.awt.Color(127, 127, 127));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/editfuntions/backGray20.png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.setFocusPainted(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        cursosed.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 20, 20));

        labelcursos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        labelcursos.setForeground(new java.awt.Color(127, 127, 127));
        labelcursos.setText("Cursos");
        cursosed.add(labelcursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));

        add2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        add2.setForeground(new java.awt.Color(127, 127, 127));
        add2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/editfuntions/addGray20.png"))); // NOI18N
        add2.setContentAreaFilled(false);
        add2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add2.setFocusPainted(false);
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });
        cursosed.add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 20, 20));

        brush.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        brush.setForeground(new java.awt.Color(127, 127, 127));
        brush.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/editfuntions/clearGray20.png"))); // NOI18N
        brush.setContentAreaFilled(false);
        brush.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brush.setFocusPainted(false);
        brush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brushActionPerformed(evt);
            }
        });
        cursosed.add(brush, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 20, 20));

        edit.add(cursosed, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 300, 670));

        opcionsed.setBackground(new java.awt.Color(237, 253, 246));
        opcionsed.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brush2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        brush2.setForeground(new java.awt.Color(127, 127, 127));
        brush2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/editfuntions/clearGray20.png"))); // NOI18N
        brush2.setContentAreaFilled(false);
        brush2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brush2.setFocusPainted(false);
        brush2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brush2ActionPerformed(evt);
            }
        });
        opcionsed.add(brush2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 20, 20));

        key.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        key.setForeground(new java.awt.Color(127, 127, 127));
        key.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/editfuntions/keyGray20.png"))); // NOI18N
        key.setContentAreaFilled(false);
        key.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        key.setFocusPainted(false);
        key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyActionPerformed(evt);
            }
        });
        opcionsed.add(key, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, 20));

        labelop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        labelop.setForeground(new java.awt.Color(127, 127, 127));
        labelop.setText("Opciones");
        opcionsed.add(labelop, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));

        back2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        back2.setForeground(new java.awt.Color(127, 127, 127));
        back2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/editfuntions/backGray20.png"))); // NOI18N
        back2.setContentAreaFilled(false);
        back2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back2.setFocusPainted(false);
        back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back2ActionPerformed(evt);
            }
        });
        opcionsed.add(back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 20, 20));

        add3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        add3.setForeground(new java.awt.Color(127, 127, 127));
        add3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/editfuntions/addGray20.png"))); // NOI18N
        add3.setContentAreaFilled(false);
        add3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add3.setFocusPainted(false);
        add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add3ActionPerformed(evt);
            }
        });
        opcionsed.add(add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 20, 20));

        textField2.setBackground(new java.awt.Color(169, 209, 142));
        textField2.setBorder(null);
        textField2.setForeground(new java.awt.Color(255, 255, 255));
        textField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField2.setText("Codigo");
        textField2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        textField2.setRound(15);
        opcionsed.add(textField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 360, 20));

        edit.add(opcionsed, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 540, 670));

        switchven.addTab("tab1", edit);

        See.setBackground(new java.awt.Color(204, 255, 204));
        See.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        See.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 220, 480));

        switchven.addTab("tab2", See);
        switchven.addTab("tab3", jPanel2);

        getContentPane().add(switchven, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1180, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void moveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMouseDragged
        PointerInfo pointerInfo = MouseInfo.getPointerInfo();
        int x = pointerInfo.getLocation().x;
        int y = pointerInfo.getLocation().y;
        
        setLocation(x-move.getX()-15,y+move.getY()-25);
    }//GEN-LAST:event_moveMouseDragged

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add2ActionPerformed

    private void brushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brushActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brushActionPerformed

    private void keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyActionPerformed

    private void brush2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brush2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brush2ActionPerformed

    private void back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_back2ActionPerformed

    private void toEDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toEDITActionPerformed
        
        this.switchven.setSelectedIndex(0);
        SwingUtilities.invokeLater(() -> {
            this.toEDIT.setLocation(toEDIT.getX(), 10);
            this.toGENER.setLocation(toGENER.getX(), 20);
            this.downthing.setLocation(toEDIT.getX(),downthing.getY());
        });
    }//GEN-LAST:event_toEDITActionPerformed

    private void toGENERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toGENERActionPerformed

        this.switchven.setSelectedIndex(1);
        SwingUtilities.invokeLater(() -> {
            this.toEDIT.setLocation(this.toEDIT.getX(), 20);
            this.toGENER.setLocation(this.toGENER.getX(), 10);
            this.downthing.setLocation(this.toGENER.getX(), this.downthing.getY());
        });
    }//GEN-LAST:event_toGENERActionPerformed

    private void add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add3ActionPerformed

    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Gruposed;
    private javax.swing.JPanel See;
    private javax.swing.JButton add;
    private javax.swing.JButton add2;
    private javax.swing.JButton add3;
    private javax.swing.JButton back;
    private javax.swing.JButton back2;
    private javax.swing.JButton brush;
    private javax.swing.JButton brush2;
    private javax.swing.JPanel cursosed;
    private javax.swing.JPanel downthing;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton key;
    private javax.swing.JLabel labelcursos;
    private javax.swing.JLabel labelgrupos;
    private javax.swing.JLabel labelop;
    private javax.swing.JLabel min;
    private javax.swing.JLabel move;
    private javax.swing.JLabel name;
    private javax.swing.JPanel opcionsed;
    private javax.swing.JTabbedPane switchven;
    private custom.TextField textField2;
    private javax.swing.JButton toCustom;
    private javax.swing.JButton toEDIT;
    private javax.swing.JButton toGENER;
    // End of variables declaration//GEN-END:variables
}
