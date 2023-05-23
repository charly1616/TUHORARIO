
package THpaneles;

import THVentanas.VentanaPrincipal;
import THlogica.opcion;
import THlogica.opciones;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import raven.GlassPanePopup;

public class CrearOpc extends javax.swing.JPanel {
    
    
    private int round = 25;
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

        bg = new javax.swing.JPanel();
        creandog = new javax.swing.JLabel();
        Dia = new javax.swing.JLabel();
        Salida = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Cancelar = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BTSALI = new custom.MyButton();
        BTENTRA = new custom.MyButton();
        comboEstudio2 = new javax.swing.JComboBox<>();
        HENTRA = new custom.MySpinner();
        HSALI = new custom.MySpinner();
        ELDIA = new custom.MySpinnerDia();

        setBackground(new java.awt.Color(176, 235, 176));
        setOpaque(false);

        bg.setBackground(new java.awt.Color(169, 209, 142));
        bg.setForeground(new java.awt.Color(0, 0, 0));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        creandog.setBackground(new java.awt.Color(169, 209, 142));
        creandog.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 17)); // NOI18N
        creandog.setForeground(new java.awt.Color(255, 255, 255));
        creandog.setText("CREANDO OPCION");
        bg.add(creandog, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 190, -1));

        Dia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Dia.setForeground(new java.awt.Color(255, 255, 255));
        Dia.setText("Dia");
        bg.add(Dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 50, -1));

        Salida.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Salida.setForeground(new java.awt.Color(255, 255, 255));
        Salida.setText("Salida");
        bg.add(Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 70, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 340, 10));

        Cancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("Entrada");
        bg.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 70, -1));

        jButton1.setBackground(new java.awt.Color(141, 196, 162));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_close_20px.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 30));

        jButton2.setBackground(new java.awt.Color(141, 196, 162));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_save_22px.png"))); // NOI18N
        jButton2.setText("Guardar");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        bg.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        BTSALI.setBackground(new java.awt.Color(84, 130, 53));
        BTSALI.setBorder(null);
        BTSALI.setForeground(new java.awt.Color(255, 255, 255));
        BTSALI.setText("PM");
        BTSALI.setBorderColor(new java.awt.Color(84, 130, 53));
        BTSALI.setBorderPainted(false);
        BTSALI.setColor(new java.awt.Color(84, 130, 53));
        BTSALI.setColorClick(new java.awt.Color(84, 130, 53));
        BTSALI.setColorOver(new java.awt.Color(84, 130, 53));
        BTSALI.setFocusPainted(false);
        BTSALI.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        BTSALI.setRadius(20);
        BTSALI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSALIActionPerformed(evt);
            }
        });
        bg.add(BTSALI, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 60, 20));

        BTENTRA.setBackground(new java.awt.Color(112, 173, 71));
        BTENTRA.setBorder(null);
        BTENTRA.setForeground(new java.awt.Color(255, 255, 255));
        BTENTRA.setText("AM");
        BTENTRA.setBorderColor(new java.awt.Color(112, 173, 71));
        BTENTRA.setBorderPainted(false);
        BTENTRA.setColor(new java.awt.Color(112, 173, 71));
        BTENTRA.setColorClick(new java.awt.Color(112, 173, 71));
        BTENTRA.setColorOver(new java.awt.Color(112, 173, 71));
        BTENTRA.setFocusPainted(false);
        BTENTRA.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        BTENTRA.setRadius(20);
        BTENTRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTENTRAActionPerformed(evt);
            }
        });
        bg.add(BTENTRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 60, 20));

        comboEstudio2.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 18)); // NOI18N
        comboEstudio2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Primaria", "Bachiller", "Técnico", "Pregrado", "Especialista", "Magister", "Doctorado" }));
        bg.add(comboEstudio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 180, -1));

        HENTRA.setBtnBack(new java.awt.Color(153, 195, 172));
        HENTRA.setMinVal(6);
        bg.add(HENTRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        HSALI.setBtnBack(new java.awt.Color(153, 195, 172));
        HSALI.setMaxVal(9);
        bg.add(HSALI, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        ELDIA.setBtnBack(new java.awt.Color(153, 195, 172));
        ELDIA.setTxtBack(new java.awt.Color(204, 255, 204));
        bg.add(ELDIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 379, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if (padre.creada == null) return;
       
       int enplus = (BTENTRA.getText().equals("PM"))?12:0;
       int saplus = (BTSALI.getText().equals("PM"))?12:0;
       padre.creada.creardia(ELDIA.getValue(), HENTRA.getValue()+enplus, HSALI.getValue()+saplus);
       
       padre.UpdateOpcionCards(); 
       GlassPanePopup.closePopupLast();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          GlassPanePopup.closePopupLast();       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BTSALIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSALIActionPerformed
       cmbiarM(this.BTSALI);
       if (BTSALI.getText().equals("PM")) {
            HSALI.setMaxVal(9);
            HSALI.setMinVal(1);
        }else {
            HSALI.setMaxVal(12);
            HSALI.setMinVal(6);
        }
        if (BTENTRA.getText().equals("PM") && BTSALI.getText().equals("AM")) {
            BTENTRA.doClick();
        }
        if (BTENTRA.getText().equals(BTSALI.getText()) && HSALI.getValue() < HENTRA.getValue()) {
            HENTRA.setValue(HSALI.getValue());
        }
        
        
    }//GEN-LAST:event_BTSALIActionPerformed

    private void BTENTRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTENTRAActionPerformed
        cmbiarM(this.BTENTRA);
        
        if (BTENTRA.getText().equals("PM")) {
            HENTRA.setMaxVal(9);
            HENTRA.setMinVal(1);
        }else {
            HENTRA.setMaxVal(12);
            HENTRA.setMinVal(6);
        }
        
        if (BTENTRA.getText().equals("PM") && BTSALI.getText().equals("AM")) {
            BTENTRA.doClick();
        }
        if (BTENTRA.getText().equals(BTSALI.getText()) && HSALI.getValue() < HENTRA.getValue()) {
            HENTRA.setValue(HSALI.getValue());
        }
        
    }//GEN-LAST:event_BTENTRAActionPerformed
    
    
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
    
    
    
    // <editor-fold defaultstate="collapsed" desc="REDONDEADO UWU">      
    @Override
    protected void paintComponent(Graphics grphcs) {
        this.setOpaque(false);
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(bg.getBackground());
        Area area = new Area(createRoundTopLeft());
        if (round > 0) {
            area.intersect(new Area(createRoundTopRight()));
        }
        if (round > 0) {
            area.intersect(new Area(createRoundBottomLeft()));
        }
        if (round > 0) {
            area.intersect(new Area(createRoundBottomRight()));
        }
        g2.fill(area);
        g2.dispose();
        super.paintComponent(grphcs);
    }

    private Shape createRoundTopLeft() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, round);
        int roundY = Math.min(height, round);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(roundX / 2, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, roundY / 2, width, height - roundY / 2)));
        return area;
    }

    private Shape createRoundTopRight() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, round);
        int roundY = Math.min(height, round);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(0, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, roundY / 2, width, height - roundY / 2)));
        return area;
    }

    private Shape createRoundBottomLeft() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, round);
        int roundY = Math.min(height, round);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(roundX / 2, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, 0, width, height - roundY / 2)));
        return area;
    }

    private Shape createRoundBottomRight() {
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, round);
        int roundY = Math.min(height, round);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area(new Rectangle2D.Double(0, 0, width - roundX / 2, height)));
        area.add(new Area(new Rectangle2D.Double(0, 0, width, height - roundY / 2)));
        return area;
    }// </editor-fold> 
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private custom.MyButton BTENTRA;
    private custom.MyButton BTSALI;
    private javax.swing.JLabel Cancelar;
    private javax.swing.JLabel Dia;
    private custom.MySpinnerDia ELDIA;
    private custom.MySpinner HENTRA;
    private custom.MySpinner HSALI;
    private javax.swing.JLabel Salida;
    private javax.swing.JPanel bg;
    private javax.swing.JComboBox<String> comboEstudio2;
    private javax.swing.JLabel creandog;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
