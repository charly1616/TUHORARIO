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
        
//        int r = (int) (Math.random() * 250);
//        int g = (int) (Math.random() * 250);
//        int b = (int) (Math.random() * 250);
//        this.jPanel1.setBackground(new Color(r,g,b));
    }
    
    public void convertTextToColor(String text) {
        int hashCode = text.hashCode();
        this.jPanel1.setBackground(new Color(hashCode));
    }
    
    
    
    public void chose(){
        SwingUtilities.invokeLater(() -> {
            this.data.setLocation(30,40);
            this.delete.setLocation(200,0);
            this.delete.setEnabled(true);
            
            this.bg.setBackground(COLORPALETTE.EnPane);
            this.jPanel1.setSize(18,60);
            
            this.bg.repaint();
        });
    }
    
    
    public void unchose(){
        SwingUtilities.invokeLater(() -> {
            this.data.setLocation(70,40);
            this.delete.setLocation(270,0);
            this.delete.setEnabled(false);
            
            this.bg.setBackground(COLORPALETTE.DisPane);
            this.jPanel1.setSize(6,60);
            
            this.bg.repaint();
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
        String diu = (Integer.parseInt(this.dias) > 1) ? " Días | " : " Día | ";
        String optu = (this.opciones > 1) ? " Opciones" : " Opcion";
        this.data.setText(this.dias + diu + this.opciones + optu);
        this.convertTextToColor(namee);
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

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        delete = new javax.swing.JButton();

        bg.setBackground(new java.awt.Color(245, 245, 245));
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bgMouseClicked(evt);
            }
        });
        bg.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(6, 60));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        bg.add(jPanel1);
        jPanel1.setBounds(0, 0, 6, 60);

        name.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(102, 102, 102));
        name.setText("DESARROLLO");
        bg.add(name);
        name.setBounds(30, 10, 130, 30);

        data.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        data.setForeground(new java.awt.Color(204, 204, 204));
        data.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        data.setText("1 dia | 9 opciones");
        bg.add(data);
        data.setBounds(70, 40, 150, 15);

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
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        bg.add(delete);
        delete.setBounds(240, 0, 30, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_deleteComponentMoved
//        
//        if (this.chosen) {
//            chose();
//        } else{
//            unchose();
//        }
    }//GEN-LAST:event_deleteComponentMoved

    private void bgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseClicked
        
        if (!this.chosen) {
            ventana.unchoseChosencurso();
            ventana.setCursoChosen(this.thisCurso);
            ventana.setCursochoosen(this);
            
            
            ventana.UpdateOpcionCards();
            this.chosen = true;
            chose();
        }else{
            ventana.unchoseChosencurso();
            this.chosen = false;
            this.unchose();
            ventana.UpdateOpcionCards();
        }
    }//GEN-LAST:event_bgMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if (thisCurso == null) {
            return;
        }
        this.thisCursos.deletecurso(thisCurso.getNombre());
        
        ventana.UpdateCursoCards();
        ventana.UpdateOpcionCards();
        ventana.unchoseChosencurso();
        ventana.unchoseChosenopcion();
    }//GEN-LAST:event_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel data;
    private javax.swing.JButton delete;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
