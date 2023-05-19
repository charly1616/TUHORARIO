
package THpaneles;

import THVentanas.VentanaPrincipal;
import THlogica.Listacursos;
import THlogica.grupos;
import THlogica.horario;
import java.awt.geom.RoundRectangle2D;
import raven.GlassPanePopup;

public class CrearCurso extends javax.swing.JPanel {
    Listacursos list;
    public horario variable;
    public VentanaPrincipal padre;
    public CrearCurso() {
        initComponents();
       
    }

    public Listacursos getList() {
        return list;
    }

    public void setList(Listacursos list) {
        this.list = list;
    }

    public horario getVariable() {
        return variable;
    }

    public void setVariable(horario variable) {
        this.variable = variable;
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        creandog = new javax.swing.JLabel();
        Dia = new javax.swing.JLabel();
        Entrada = new javax.swing.JLabel();
        ndias = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        name = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(176, 235, 176));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        creandog.setBackground(new java.awt.Color(169, 209, 142));
        creandog.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 17)); // NOI18N
        creandog.setForeground(new java.awt.Color(255, 255, 255));
        creandog.setText("CREANDO CURSO");
        jPanel1.add(creandog, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 190, -1));

        Dia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Dia.setForeground(new java.awt.Color(255, 255, 255));
        Dia.setText("Nombre del curso:");
        jPanel1.add(Dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, -1));

        Entrada.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Entrada.setForeground(new java.awt.Color(255, 255, 255));
        Entrada.setText("Numero de dias:");
        jPanel1.add(Entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 170, -1));

        ndias.setModel(new javax.swing.SpinnerNumberModel(1, 1, 3, 1));
        ndias.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(ndias, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 70, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 300, 10));

        jButton2.setBackground(new java.awt.Color(141, 196, 162));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_save_22px.png"))); // NOI18N
        jButton2.setText("Guardar");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        jButton1.setBackground(new java.awt.Color(141, 196, 162));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_close_20px.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 30));

        name.setBackground(new java.awt.Color(209, 243, 222));
        name.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       variable.nuevocurso(name.getText(),Integer.parseInt( ndias.toString()), list, "");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       GlassPanePopup.closePopupLast();       
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dia;
    private javax.swing.JLabel Entrada;
    private javax.swing.JLabel creandog;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField name;
    private javax.swing.JSpinner ndias;
    // End of variables declaration//GEN-END:variables
}
