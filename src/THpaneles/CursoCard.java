/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package THpaneles;

import THVentanas.VentanaPrincipal;
import THlogica.*;
import java.awt.Color;
import javax.swing.SwingUtilities;

/**
 *
 * @author User
 */
public class CursoCard extends javax.swing.JPanel {

    private String namee = "";
    private String dias = "";
    private int opciones = 0;
    
    private VentanaPrincipal ventana;
    private curso thisCurso;
    private horario thisCursos;
    
    private boolean chosen = false;
    
    public CursoCard() {
        initComponents();
        
        int r = (int) (Math.random() * 250);
        int g = (int) (Math.random() * 250);
        int b = (int) (Math.random() * 250);
        this.jPanel1.setBackground(new Color(r,g,b));
    }
    
    
    
    private void chose(){
        SwingUtilities.invokeLater(() -> {
            this.data.setLocation(30,40);
            this.delete.setLocation(200,0);
            this.delete.setEnabled(true);
            
            this.jPanel1.setSize(20,60);
            
            this.White.repaint();
        });
    }
    
    
    public void unchose(){
        SwingUtilities.invokeLater(() -> {
            this.data.setLocation(70,40);
            this.delete.setLocation(270,0);
            this.delete.setEnabled(false);
            
            this.jPanel1.setSize(10,60);
            
            this.White.repaint();
        });
    }
    
    
    
    
    
    
    
    
    //<editor-fold defaultstate="collapsed" desc=" setters y getters">
    public String getNamee() {
        return namee;
    }

    public void setNamee(String namee) {
        this.namee = namee;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public int getOpciones() {
        return opciones;
    }

    public void setOpciones(int opciones) {
        this.opciones = opciones;
    }

    public VentanaPrincipal getVentana() {
        return ventana;
    }

    public void setVentana(VentanaPrincipal ventana) {
        this.ventana = ventana;
    }

    public curso getThisCurso() {
        return thisCurso;
    }

    public void setThisCurso(curso thisCurso) {
        this.thisCurso = thisCurso;
        
        this.namee = thisCurso.getNombre();
        this.dias = thisCurso.ndias+"";
        thisCurso.getListaopc().contaropciones();
        this.opciones = thisCurso.getListaopc().nopciones;
        
        this.name.setText(namee);
        this.data.setText(this.dias + "Día | " + this.opciones + " Opciones");
    }

    public horario getThisCursos() {
        return thisCursos;
    }

    public void setThisCursos(horario thisCursos) {
        this.thisCursos = thisCursos;
    }
    
    public boolean isChosen() {
        return chosen;
    }

    public void setChosen(boolean chosen) {
        this.chosen = chosen;
    }
    
    
    //</editor-fold>

    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        White = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        delete = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        White.setBackground(new java.awt.Color(255, 255, 255));
        White.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WhiteMouseClicked(evt);
            }
        });
        White.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        White.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 60));

        name.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(104, 104, 104));
        name.setText("DESARROLLO");
        White.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 130, 30));

        data.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        data.setForeground(new java.awt.Color(204, 204, 204));
        data.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        data.setText("1 dia | 9 opciones");
        White.add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 150, -1));

        delete.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        delete.setForeground(new java.awt.Color(125, 125, 125));
        delete.setText("x");
        delete.setBorder(null);
        delete.setBorderPainted(false);
        delete.setContentAreaFilled(false);
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.setFocusPainted(false);
        delete.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                deleteComponentMoved(evt);
            }
        });
        White.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 30, 60));

        add(White, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void deleteComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_deleteComponentMoved
        
        if (this.chosen) {
            chose();
        } else{
            unchose();
        }
    }//GEN-LAST:event_deleteComponentMoved

    private void WhiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WhiteMouseClicked
        ventana.unchoseChosencurso();
        ventana.setCursoChosen(this.thisCurso);
        ventana.setCursochoosen(this);
        
        this.chosen = true;
        chose();
    }//GEN-LAST:event_WhiteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel White;
    private javax.swing.JLabel data;
    private javax.swing.JButton delete;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
