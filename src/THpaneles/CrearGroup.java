
package THpaneles;

import THVentanas.VentanaPrincipal;
import THlogica.grupos;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;

public class CrearGroup extends javax.swing.JPanel {

    public grupos variable;
    public VentanaPrincipal padre;
    
    public CrearGroup() {
        
        initComponents();
        setLocation(20,20);
    }

    public grupos getVariable() {
        return variable;
    }

    public void setVariable(grupos variable) {
        this.variable = variable;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fond = new javax.swing.JPanel();
        creandog = new javax.swing.JLabel();
        Dia = new javax.swing.JLabel();
        Entrada = new javax.swing.JLabel();
        semestre = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        name = new custom.TextField();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fond.setBackground(new java.awt.Color(176, 235, 176));
        fond.setForeground(new java.awt.Color(0, 0, 0));
        fond.setAutoscrolls(true);
        fond.setFocusCycleRoot(true);
        fond.setInheritsPopupMenu(true);
        fond.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                fondMouseMoved(evt);
            }
        });
        fond.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        creandog.setBackground(new java.awt.Color(169, 209, 142));
        creandog.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 17)); // NOI18N
        creandog.setForeground(new java.awt.Color(255, 255, 255));
        creandog.setText("CREANDO GRUPO");
        fond.add(creandog, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 190, -1));

        Dia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Dia.setForeground(new java.awt.Color(255, 255, 255));
        Dia.setText("Nombre del grupo:");
        fond.add(Dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, 30));

        Entrada.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Entrada.setForeground(new java.awt.Color(255, 255, 255));
        Entrada.setText("Semestre:");
        fond.add(Entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 100, -1));

        semestre.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        semestre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fond.add(semestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 70, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        fond.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 300, 10));

        jButton2.setBackground(new java.awt.Color(141, 196, 162));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_save_22px.png"))); // NOI18N
        jButton2.setText("Guardar");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        fond.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, 30));

        jButton1.setBackground(new java.awt.Color(141, 196, 162));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_close_20px.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        fond.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 30));

        name.setBackground(new java.awt.Color(153, 255, 153));
        name.setBorder(null);
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setText("nombre");
        fond.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 150, 30));

        add(fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       variable.newgrupo(name.getText());
       variable.getAct().setSemestre(this.semestre.getValue().toString());
       
       padre.UpdateGroupCards();
       this.jButton1.doClick();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        padre.getEdit().remove(this);
        padre.getEdit().revalidate();
        padre.getEdit().repaint();
        padre.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fondMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondMouseMoved
        repaint();
    }//GEN-LAST:event_fondMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dia;
    private javax.swing.JLabel Entrada;
    private javax.swing.JLabel creandog;
    private javax.swing.JPanel fond;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    private custom.TextField name;
    private javax.swing.JSpinner semestre;
    // End of variables declaration//GEN-END:variables
}
