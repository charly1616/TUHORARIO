
package THpaneles;

import THlogica.grupos;
import java.awt.geom.RoundRectangle2D;

public class CrearGrupo extends javax.swing.JPanel {

    grupos variable;
    public CrearGrupo() {
        initComponents();
       
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

        jPanel1 = new javax.swing.JPanel();
        creandoGr = new javax.swing.JLabel();
        NG = new javax.swing.JLabel();
        Semestre = new javax.swing.JLabel();
        nsemestre = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        Cancelar = new javax.swing.JLabel();
        Guardar = new javax.swing.JLabel();
        name = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(176, 235, 176));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        creandoGr.setBackground(new java.awt.Color(169, 209, 142));
        creandoGr.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 17)); // NOI18N
        creandoGr.setForeground(new java.awt.Color(255, 255, 255));
        creandoGr.setText("CREANDO GRUPO");
        jPanel1.add(creandoGr, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 190, -1));

        NG.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        NG.setForeground(new java.awt.Color(255, 255, 255));
        NG.setText("Nombre del grupo:");
        jPanel1.add(NG, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, -1));

        Semestre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Semestre.setForeground(new java.awt.Color(255, 255, 255));
        Semestre.setText("Semestre:");
        jPanel1.add(Semestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 90, -1));

        nsemestre.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        nsemestre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(nsemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 70, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 300, 10));

        Cancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_close_20px.png"))); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarMouseClicked(evt);
            }
        });
        jPanel1.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 100, -1));

        Guardar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_save_22px.png"))); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarMouseClicked(evt);
            }
        });
        jPanel1.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 100, -1));

        name.setBackground(new java.awt.Color(209, 243, 222));
        name.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        name.setForeground(new java.awt.Color(127, 127, 127));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 190, -1));

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

    private void CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CancelarMouseClicked

    private void GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseClicked
      variable.newgrupo(name.getText());
    }//GEN-LAST:event_GuardarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cancelar;
    private javax.swing.JLabel Guardar;
    private javax.swing.JLabel NG;
    private javax.swing.JLabel Semestre;
    private javax.swing.JLabel creandoGr;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField name;
    private javax.swing.JSpinner nsemestre;
    // End of variables declaration//GEN-END:variables
}
