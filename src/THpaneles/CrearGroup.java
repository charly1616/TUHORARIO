
package THpaneles;

import THVentanas.VentanaPrincipal;
import THlogica.grupos;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import raven.GlassPanePopup;

public class CrearGroup extends javax.swing.JPanel {
    
    private int round = 25;
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

        bg = new javax.swing.JPanel();
        creandog = new javax.swing.JLabel();
        Dia = new javax.swing.JLabel();
        Entrada = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        name = new custom.TextFieldd();
        semestre = new custom.MySpinner();

        setBackground(new java.awt.Color(169, 209, 142));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(400, 222));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(169, 209, 142));
        bg.setForeground(new java.awt.Color(176, 235, 176));
        bg.setAutoscrolls(true);
        bg.setFocusCycleRoot(true);
        bg.setInheritsPopupMenu(true);
        bg.setOpaque(false);
        bg.setPreferredSize(new java.awt.Dimension(400, 222));
        bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bgMouseMoved(evt);
            }
        });
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        creandog.setBackground(new java.awt.Color(169, 209, 142));
        creandog.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 17)); // NOI18N
        creandog.setForeground(new java.awt.Color(255, 255, 255));
        creandog.setText("CREANDO GRUPO");
        bg.add(creandog, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 190, -1));

        Dia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Dia.setForeground(new java.awt.Color(255, 255, 255));
        Dia.setText("Nombre del grupo:");
        bg.add(Dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 160, 20));

        Entrada.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Entrada.setForeground(new java.awt.Color(255, 255, 255));
        Entrada.setText("Semestre:");
        bg.add(Entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 100, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 320, 10));

        jButton2.setBackground(new java.awt.Color(141, 196, 162));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_save_22px.png"))); // NOI18N
        jButton2.setText("Guardar");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        bg.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, 30));

        jButton1.setBackground(new java.awt.Color(141, 196, 162));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_close_20px.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, 30));

        name.setBackground(new java.awt.Color(204, 255, 204));
        name.setBorder(null);
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setText("nombre");
        name.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        name.setRound(25);
        bg.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 150, 20));

        semestre.setBtnBack(new java.awt.Color(153, 195, 172));
        bg.add(semestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 220));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       variable.newgrupo(name.getText());
       variable.getAct().setSemestre(this.semestre.getValue()+"");
       
       padre.UpdateGroupCards();
       GlassPanePopup.closePopupLast();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GlassPanePopup.closePopupLast();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bgMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseMoved
        repaint();
    }//GEN-LAST:event_bgMouseMoved
    
    
    
    
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
    private javax.swing.JLabel Dia;
    private javax.swing.JLabel Entrada;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel creandog;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    private custom.TextFieldd name;
    private custom.MySpinner semestre;
    // End of variables declaration//GEN-END:variables
}
