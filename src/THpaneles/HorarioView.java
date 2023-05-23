/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package THpaneles;

import THlogica.curso;
import THlogica.dia;
import THlogica.horario;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author User
 */
public class HorarioView extends javax.swing.JPanel {

    private horario hora;
    private int round = 25;
    public HorarioView() {
        initComponents();
        setSize(840,480);
        
    }

    public horario getHora() {
        return hora;
    }

    public void setHora(horario hora) {
        this.hora = hora;
        createHCursos();
    }
    
    
    public void createHCursos(){
        curso actual = hora.getCabeza();
        while (actual != null){
            System.out.println("DOINN BICH");
            dia actual2 = actual.getChosenone().getAct();
            while (actual2 != null){
                crearHcurso(actual2,actual);
                actual2 = actual2.ant;
            }
            actual = actual.getSig();
        }
    }
    
    
    public void crearHcurso(dia dia, curso curso){
        
        HorarioCurso nue = new HorarioCurso();
        nue.setDIA(dia);
        nue.setCURSO(curso);
        nue.setSize(120, 210);
        nue.setLocation(0, (dia.getHd()-6)*30);
        
        switch (dia.getDia()){
            case 0:
                Lunes.add(nue);
                break;
            case 1:
                Martes.add(nue);
                break;
            case 2:
                Miercoles.add(nue);
                break;
            case 3:
                Jueves.add(nue);
                break;
            case 4:
                Viernes.add(nue);
                break;
            case 5:
                Sabado.add(nue);
                break;
        }
        
        nue.repaint();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        dias = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Horas = new javax.swing.JPanel();
        hora1 = new custom.MyButton();
        hora2 = new custom.MyButton();
        hora3 = new custom.MyButton();
        hora4 = new custom.MyButton();
        hora5 = new custom.MyButton();
        hora6 = new custom.MyButton();
        hora7 = new custom.MyButton();
        hora8 = new custom.MyButton();
        hora9 = new custom.MyButton();
        hora10 = new custom.MyButton();
        hora11 = new custom.MyButton();
        hora12 = new custom.MyButton();
        hora13 = new custom.MyButton();
        hora14 = new custom.MyButton();
        hora15 = new custom.MyButton();
        hora16 = new custom.MyButton();
        Lunes = new javax.swing.JPanel();
        Martes = new javax.swing.JPanel();
        Miercoles = new javax.swing.JPanel();
        Jueves = new javax.swing.JPanel();
        Viernes = new javax.swing.JPanel();
        Sabado = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(720, 8));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8);
        jPanel8.setBounds(120, 220, 720, 5);

        dias.setBackground(new java.awt.Color(255, 255, 255));
        dias.setOpaque(false);
        dias.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(105, 167, 133));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Martes");
        dias.add(jLabel1);
        jLabel1.setBounds(240, 0, 120, 30);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(105, 167, 133));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lunes");
        dias.add(jLabel2);
        jLabel2.setBounds(120, 0, 120, 30);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(105, 167, 133));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Jueves");
        dias.add(jLabel3);
        jLabel3.setBounds(480, 0, 120, 30);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(105, 167, 133));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Miercoles");
        dias.add(jLabel4);
        jLabel4.setBounds(360, 0, 120, 30);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(105, 167, 133));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Viernes");
        dias.add(jLabel5);
        jLabel5.setBounds(600, 0, 120, 30);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(105, 167, 133));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Sabado");
        dias.add(jLabel6);
        jLabel6.setBounds(720, 0, 120, 30);

        jPanel1.add(dias);
        dias.setBounds(0, 0, 840, 30);

        Horas.setBackground(new java.awt.Color(255, 255, 255));
        Horas.setOpaque(false);
        Horas.setPreferredSize(new java.awt.Dimension(90, 90));
        Horas.setLayout(null);

        hora1.setForeground(new java.awt.Color(255, 255, 255));
        hora1.setText("6 am");
        hora1.setBorderPainted(false);
        hora1.setColor(new java.awt.Color(153, 195, 172));
        hora1.setColorClick(new java.awt.Color(153, 195, 172));
        hora1.setColorOver(new java.awt.Color(153, 195, 172));
        hora1.setFocusPainted(false);
        hora1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        hora1.setRadius(25);
        Horas.add(hora1);
        hora1.setBounds(15, 0, 89, 26);

        hora2.setForeground(new java.awt.Color(255, 255, 255));
        hora2.setText("7 am");
        hora2.setBorderPainted(false);
        hora2.setColor(new java.awt.Color(153, 195, 172));
        hora2.setColorClick(new java.awt.Color(153, 195, 172));
        hora2.setColorOver(new java.awt.Color(153, 195, 172));
        hora2.setFocusPainted(false);
        hora2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        hora2.setRadius(25);
        Horas.add(hora2);
        hora2.setBounds(15, 30, 89, 26);

        hora3.setForeground(new java.awt.Color(255, 255, 255));
        hora3.setText("8 am");
        hora3.setBorderPainted(false);
        hora3.setColor(new java.awt.Color(153, 195, 172));
        hora3.setColorClick(new java.awt.Color(153, 195, 172));
        hora3.setColorOver(new java.awt.Color(153, 195, 172));
        hora3.setFocusPainted(false);
        hora3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        hora3.setRadius(25);
        Horas.add(hora3);
        hora3.setBounds(15, 60, 89, 26);

        hora4.setForeground(new java.awt.Color(255, 255, 255));
        hora4.setText("9 am");
        hora4.setBorderPainted(false);
        hora4.setColor(new java.awt.Color(153, 195, 172));
        hora4.setColorClick(new java.awt.Color(153, 195, 172));
        hora4.setColorOver(new java.awt.Color(153, 195, 172));
        hora4.setFocusPainted(false);
        hora4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        hora4.setRadius(25);
        Horas.add(hora4);
        hora4.setBounds(15, 90, 89, 26);

        hora5.setForeground(new java.awt.Color(255, 255, 255));
        hora5.setText("10 am");
        hora5.setBorderPainted(false);
        hora5.setColor(new java.awt.Color(153, 195, 172));
        hora5.setColorClick(new java.awt.Color(153, 195, 172));
        hora5.setColorOver(new java.awt.Color(153, 195, 172));
        hora5.setFocusPainted(false);
        hora5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        hora5.setRadius(25);
        Horas.add(hora5);
        hora5.setBounds(15, 120, 89, 26);

        hora6.setForeground(new java.awt.Color(255, 255, 255));
        hora6.setText("11 am");
        hora6.setBorderPainted(false);
        hora6.setColor(new java.awt.Color(153, 195, 172));
        hora6.setColorClick(new java.awt.Color(153, 195, 172));
        hora6.setColorOver(new java.awt.Color(153, 195, 172));
        hora6.setFocusPainted(false);
        hora6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        hora6.setRadius(25);
        Horas.add(hora6);
        hora6.setBounds(15, 150, 89, 26);

        hora7.setForeground(new java.awt.Color(255, 255, 255));
        hora7.setText("12 pm");
        hora7.setBorderPainted(false);
        hora7.setColor(new java.awt.Color(153, 195, 172));
        hora7.setColorClick(new java.awt.Color(153, 195, 172));
        hora7.setColorOver(new java.awt.Color(153, 195, 172));
        hora7.setFocusPainted(false);
        hora7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        hora7.setRadius(25);
        Horas.add(hora7);
        hora7.setBounds(15, 180, 89, 26);

        hora8.setForeground(new java.awt.Color(255, 255, 255));
        hora8.setText("1 pm");
        hora8.setBorderPainted(false);
        hora8.setColor(new java.awt.Color(153, 195, 172));
        hora8.setColorClick(new java.awt.Color(153, 195, 172));
        hora8.setColorOver(new java.awt.Color(153, 195, 172));
        hora8.setFocusPainted(false);
        hora8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        hora8.setRadius(25);
        Horas.add(hora8);
        hora8.setBounds(15, 210, 89, 26);

        hora9.setForeground(new java.awt.Color(255, 255, 255));
        hora9.setText("2 pm");
        hora9.setBorderPainted(false);
        hora9.setColor(new java.awt.Color(153, 195, 172));
        hora9.setColorClick(new java.awt.Color(153, 195, 172));
        hora9.setColorOver(new java.awt.Color(153, 195, 172));
        hora9.setFocusPainted(false);
        hora9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        hora9.setRadius(25);
        Horas.add(hora9);
        hora9.setBounds(15, 240, 89, 26);

        hora10.setForeground(new java.awt.Color(255, 255, 255));
        hora10.setText("3 pm");
        hora10.setBorderPainted(false);
        hora10.setColor(new java.awt.Color(153, 195, 172));
        hora10.setColorClick(new java.awt.Color(153, 195, 172));
        hora10.setColorOver(new java.awt.Color(153, 195, 172));
        hora10.setFocusPainted(false);
        hora10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        hora10.setRadius(25);
        Horas.add(hora10);
        hora10.setBounds(15, 270, 89, 26);

        hora11.setForeground(new java.awt.Color(255, 255, 255));
        hora11.setText("4 pm");
        hora11.setBorderPainted(false);
        hora11.setColor(new java.awt.Color(153, 195, 172));
        hora11.setColorClick(new java.awt.Color(153, 195, 172));
        hora11.setColorOver(new java.awt.Color(153, 195, 172));
        hora11.setFocusPainted(false);
        hora11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        hora11.setRadius(25);
        Horas.add(hora11);
        hora11.setBounds(15, 300, 89, 26);

        hora12.setForeground(new java.awt.Color(255, 255, 255));
        hora12.setText("5 pm");
        hora12.setBorderPainted(false);
        hora12.setColor(new java.awt.Color(153, 195, 172));
        hora12.setColorClick(new java.awt.Color(153, 195, 172));
        hora12.setColorOver(new java.awt.Color(153, 195, 172));
        hora12.setFocusPainted(false);
        hora12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        hora12.setRadius(25);
        Horas.add(hora12);
        hora12.setBounds(15, 330, 89, 26);

        hora13.setForeground(new java.awt.Color(255, 255, 255));
        hora13.setText("6 pm");
        hora13.setBorderPainted(false);
        hora13.setColor(new java.awt.Color(153, 195, 172));
        hora13.setColorClick(new java.awt.Color(153, 195, 172));
        hora13.setColorOver(new java.awt.Color(153, 195, 172));
        hora13.setFocusPainted(false);
        hora13.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        hora13.setRadius(25);
        Horas.add(hora13);
        hora13.setBounds(15, 360, 89, 26);

        hora14.setForeground(new java.awt.Color(255, 255, 255));
        hora14.setText("7 pm");
        hora14.setBorderPainted(false);
        hora14.setColor(new java.awt.Color(153, 195, 172));
        hora14.setColorClick(new java.awt.Color(153, 195, 172));
        hora14.setColorOver(new java.awt.Color(153, 195, 172));
        hora14.setFocusPainted(false);
        hora14.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        hora14.setRadius(25);
        Horas.add(hora14);
        hora14.setBounds(15, 390, 89, 26);

        hora15.setForeground(new java.awt.Color(255, 255, 255));
        hora15.setText("8 pm");
        hora15.setBorderPainted(false);
        hora15.setColor(new java.awt.Color(153, 195, 172));
        hora15.setColorClick(new java.awt.Color(153, 195, 172));
        hora15.setColorOver(new java.awt.Color(153, 195, 172));
        hora15.setFocusPainted(false);
        hora15.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        hora15.setRadius(25);
        Horas.add(hora15);
        hora15.setBounds(15, 420, 89, 26);

        hora16.setForeground(new java.awt.Color(255, 255, 255));
        hora16.setText("9 pm");
        hora16.setBorderPainted(false);
        hora16.setColor(new java.awt.Color(153, 195, 172));
        hora16.setColorClick(new java.awt.Color(153, 195, 172));
        hora16.setColorOver(new java.awt.Color(153, 195, 172));
        hora16.setFocusPainted(false);
        hora16.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        hora16.setRadius(25);
        Horas.add(hora16);
        hora16.setBounds(15, 450, 89, 26);

        jPanel1.add(Horas);
        Horas.setBounds(0, 30, 120, 480);

        Lunes.setBackground(new java.awt.Color(237, 253, 246));
        Lunes.setLayout(null);
        jPanel1.add(Lunes);
        Lunes.setBounds(120, 30, 120, 480);

        Martes.setBackground(new java.awt.Color(209, 243, 222));
        Martes.setLayout(null);
        jPanel1.add(Martes);
        Martes.setBounds(240, 30, 120, 480);

        Miercoles.setBackground(new java.awt.Color(237, 253, 246));
        Miercoles.setLayout(null);
        jPanel1.add(Miercoles);
        Miercoles.setBounds(360, 30, 120, 480);

        Jueves.setBackground(new java.awt.Color(209, 243, 222));
        Jueves.setLayout(null);
        jPanel1.add(Jueves);
        Jueves.setBounds(480, 30, 120, 480);

        Viernes.setBackground(new java.awt.Color(237, 253, 246));
        Viernes.setLayout(null);
        jPanel1.add(Viernes);
        Viernes.setBounds(600, 30, 120, 480);

        Sabado.setBackground(new java.awt.Color(209, 243, 222));
        Sabado.setLayout(null);
        jPanel1.add(Sabado);
        Sabado.setBounds(720, 30, 120, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="REDONDEADO UWU">      
    @Override
    protected void paintComponent(Graphics grphcs) {
        this.setOpaque(false);
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(dias.getBackground());
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
    private javax.swing.JPanel Horas;
    private javax.swing.JPanel Jueves;
    private javax.swing.JPanel Lunes;
    private javax.swing.JPanel Martes;
    private javax.swing.JPanel Miercoles;
    private javax.swing.JPanel Sabado;
    private javax.swing.JPanel Viernes;
    private javax.swing.JPanel dias;
    private custom.MyButton hora1;
    private custom.MyButton hora10;
    private custom.MyButton hora11;
    private custom.MyButton hora12;
    private custom.MyButton hora13;
    private custom.MyButton hora14;
    private custom.MyButton hora15;
    private custom.MyButton hora16;
    private custom.MyButton hora2;
    private custom.MyButton hora3;
    private custom.MyButton hora4;
    private custom.MyButton hora5;
    private custom.MyButton hora6;
    private custom.MyButton hora7;
    private custom.MyButton hora8;
    private custom.MyButton hora9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
