
package THpaneles;

import THVentanas.VentanaPrincipal;
import THlogica.opcion;
import THlogica.opciones;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import raven.GlassPanePopup;

public class CrearOpc extends javax.swing.JPanel {

    public opciones variable;
    public VentanaPrincipal padre;
    public CrearOpc() {
        initComponents();
        
    }

    public void setPadre(VentanaPrincipal padre) {
        this.padre = padre;
    }

    public opciones getVariable() {
        return variable;
    }

    public void setVariable(opciones variable) {
        this.variable = variable;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        creandog = new javax.swing.JLabel();
        Dia = new javax.swing.JLabel();
        Salida = new javax.swing.JLabel();
        dias = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        Cancelar = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bttsalida = new custom.MyButton();
        bttentrada2 = new custom.MyButton();
        comboEstudio2 = new javax.swing.JComboBox<>();
        nEntrada = new custom.MySpinner();
        nSalida = new custom.MySpinner();

        jPanel1.setBackground(new java.awt.Color(176, 235, 176));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        creandog.setBackground(new java.awt.Color(169, 209, 142));
        creandog.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 17)); // NOI18N
        creandog.setForeground(new java.awt.Color(255, 255, 255));
        creandog.setText("CREANDO OPCION");
        jPanel1.add(creandog, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 190, -1));

        Dia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Dia.setForeground(new java.awt.Color(255, 255, 255));
        Dia.setText("Dia");
        jPanel1.add(Dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 50, -1));

        Salida.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Salida.setForeground(new java.awt.Color(255, 255, 255));
        Salida.setText("Salida");
        jPanel1.add(Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 70, -1));

        dias.setBackground(new java.awt.Color(209, 243, 222));
        dias.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        dias.setForeground(new java.awt.Color(102, 102, 102));
        dias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" }));
        dias.setSelectedItem(dias);
        dias.setBorder(null);
        dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diasActionPerformed(evt);
            }
        });
        jPanel1.add(dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 160, 20));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 300, 10));

        Cancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("Entrada");
        jPanel1.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 70, -1));

        jButton1.setBackground(new java.awt.Color(141, 196, 162));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_close_20px.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 30));

        jButton2.setBackground(new java.awt.Color(141, 196, 162));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_save_22px.png"))); // NOI18N
        jButton2.setText("Guardar");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        bttsalida.setBackground(new java.awt.Color(84, 130, 53));
        bttsalida.setBorder(null);
        bttsalida.setForeground(new java.awt.Color(255, 255, 255));
        bttsalida.setText("PM");
        bttsalida.setBorderColor(new java.awt.Color(84, 130, 53));
        bttsalida.setBorderPainted(false);
        bttsalida.setColor(new java.awt.Color(84, 130, 53));
        bttsalida.setColorClick(new java.awt.Color(84, 130, 53));
        bttsalida.setColorOver(new java.awt.Color(84, 130, 53));
        bttsalida.setFocusPainted(false);
        bttsalida.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        bttsalida.setRadius(35);
        bttsalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttsalidaActionPerformed(evt);
            }
        });
        jPanel1.add(bttsalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 80, 30));

        bttentrada2.setBackground(new java.awt.Color(112, 173, 71));
        bttentrada2.setBorder(null);
        bttentrada2.setForeground(new java.awt.Color(255, 255, 255));
        bttentrada2.setText("AM");
        bttentrada2.setBorderColor(new java.awt.Color(112, 173, 71));
        bttentrada2.setBorderPainted(false);
        bttentrada2.setColor(new java.awt.Color(112, 173, 71));
        bttentrada2.setColorClick(new java.awt.Color(112, 173, 71));
        bttentrada2.setColorOver(new java.awt.Color(112, 173, 71));
        bttentrada2.setFocusPainted(false);
        bttentrada2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        bttentrada2.setRadius(35);
        bttentrada2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttentrada2ActionPerformed(evt);
            }
        });
        jPanel1.add(bttentrada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 80, 30));

        comboEstudio2.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 18)); // NOI18N
        comboEstudio2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Primaria", "Bachiller", "Técnico", "Pregrado", "Especialista", "Magister", "Doctorado" }));
        jPanel1.add(comboEstudio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 180, -1));
        jPanel1.add(nEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));
        jPanel1.add(nSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

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
       variable.nuevaopcion(true);
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          GlassPanePopup.closePopupLast();       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bttsalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttsalidaActionPerformed
       cmbiarM(this.bttsalida);
    }//GEN-LAST:event_bttsalidaActionPerformed

    private void bttentrada2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttentrada2ActionPerformed
        cmbiarM(this.bttentrada2);
        
    }//GEN-LAST:event_bttentrada2ActionPerformed

    private void diasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diasActionPerformed
      
    }//GEN-LAST:event_diasActionPerformed
    
    
    public void cmbiarM(custom.MyButton boton){
        if (boton.getText().equals("AM")){
            boton.setText("PM");
            boton.setBackground(new Color(84,130,53));
            boton.setBorderColor(new Color(84,130,53));
            boton.setColor(new Color(84,130,53));
            boton.setColorClick(new Color(84,130,53));
            boton.setColorOver(new Color(84,130,53));
        } else{
            boton.setText("AM");
            boton.setBackground(new Color(112,173,71));
            boton.setBorderColor(new Color(112,173,71));
            boton.setColor(new Color(112,173,71));
            boton.setColorClick(new Color(112,173,71));
            boton.setColorOver(new Color(112,173,71));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cancelar;
    private javax.swing.JLabel Dia;
    private javax.swing.JLabel Salida;
    private custom.MyButton bttentrada2;
    private custom.MyButton bttsalida;
    private javax.swing.JComboBox<String> comboEstudio2;
    private javax.swing.JLabel creandog;
    private javax.swing.JComboBox<String> dias;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private custom.MySpinner nEntrada;
    private custom.MySpinner nSalida;
    // End of variables declaration//GEN-END:variables
}
