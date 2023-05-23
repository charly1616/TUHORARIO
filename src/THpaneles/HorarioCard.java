/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package THpaneles;

import THVentanas.VentanaPrincipal;
import THlogica.Hopcion;
import THlogica.dia;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class HorarioCard extends javax.swing.JPanel {
    
    private VentanaPrincipal ventana;
    private int Line = 0;
    private int Page = 0;
    
    private int round;
    private Hopcion horario;
    
    public HorarioCard() {
        round = 25;
        initComponents();
    }

    public Hopcion getHorario() {
        return horario;
    }

    public void setHorario(Hopcion horario) {
        this.horario = horario;
        this.Days.setText(horario.getDiastogo()+"");
        this.Hmax.setText(dia.convertirHora(horario.getHMAX()));
        this.Hmin.setText(dia.convertirHora(horario.getHMIN()));
        this.VoidHours.setText(horario.getHuecos()+"");
        setDiasIcon(horario.getDiastogo());
        
        
        this.sun2.setForeground(OptionCard.Hourcolor(horario.getHMIN()));
        this.sun1.setForeground(OptionCard.Hourcolor(horario.getHMAX()));
    }
    
    
    private void setDiasIcon(int dias){
        String ruta = "/THImages/CirclesFilled/Circle"+ dias + ".png";
        
        this.Days.setIcon(new ImageIcon(getClass().getResource(ruta)));
    }
    
    
    public VentanaPrincipal getVentana() {
        return ventana;
    }

    public void setVentana(VentanaPrincipal ventana) {
        this.ventana = ventana;
    }

    public int getPage() {
        return Page;
    }

    public void setPage(int Page) {
        this.Page = Page;
    }
    
    
    
    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getLine() {
        return Line;
    }

    public void setLine(int Line) {
        this.Line = Line;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        VoidHours = new javax.swing.JLabel();
        sun1 = new javax.swing.JLabel();
        Days = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Hmax = new javax.swing.JLabel();
        sun2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Hmin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(210, 100));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setOpaque(false);
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bgMouseClicked(evt);
            }
        });
        bg.setLayout(null);

        VoidHours.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        VoidHours.setForeground(new java.awt.Color(102, 102, 102));
        VoidHours.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VoidHours.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/CirclesFilled/void.png"))); // NOI18N
        VoidHours.setText("4");
        VoidHours.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg.add(VoidHours);
        VoidHours.setBounds(110, 5, 35, 35);

        sun1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 75)); // NOI18N
        sun1.setForeground(new java.awt.Color(47, 85, 151));
        sun1.setText("•");
        sun1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                sun1ComponentMoved(evt);
            }
        });
        bg.add(sun1);
        sun1.setBounds(130, 60, 30, 40);

        Days.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Days.setForeground(new java.awt.Color(255, 255, 255));
        Days.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Days.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/CirclesFilled/Circle1.png"))); // NOI18N
        Days.setText("1");
        Days.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg.add(Days);
        Days.setBounds(20, 5, 35, 37);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Horas");
        bg.add(jLabel1);
        jLabel1.setBounds(150, 20, 40, 16);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("H Max.");
        bg.add(jLabel2);
        jLabel2.setBounds(30, 75, 70, 15);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Dias");
        bg.add(jLabel3);
        jLabel3.setBounds(60, 20, 30, 15);

        Hmax.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Hmax.setForeground(new java.awt.Color(102, 102, 102));
        Hmax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hmax.setText("5 PM");
        bg.add(Hmax);
        Hmax.setBounds(70, 70, 60, 20);

        sun2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 75)); // NOI18N
        sun2.setForeground(new java.awt.Color(47, 85, 151));
        sun2.setText("•");
        sun2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sun2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                sun2ComponentMoved(evt);
            }
        });
        bg.add(sun2);
        sun2.setBounds(130, 35, 30, 40);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("H Min.");
        bg.add(jLabel5);
        jLabel5.setBounds(30, 55, 70, 15);

        Hmin.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Hmin.setForeground(new java.awt.Color(102, 102, 102));
        Hmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hmin.setText("9 PM");
        bg.add(Hmin);
        Hmin.setBounds(70, 50, 60, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sun1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_sun1ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_sun1ComponentMoved

    private void sun2ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_sun2ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_sun2ComponentMoved

    private void bgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseClicked
        System.out.println(this.Page);
        ventana.getGroupChosen().getHor().ChooseElH(horario);
        ventana.HORARIO();
    }//GEN-LAST:event_bgMouseClicked
    
    
    
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="REDONDEADO UWU">      
    @Override
    protected void paintComponent(Graphics grphcs) {
        this.setOpaque(false);
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
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
    
    
    
    
//    private Shape createRounds(){
//        Area area = new Area(new RoundRectangle2D(0,0,this.getWidth(), this.getHeight(),15 ,15));
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Days;
    private javax.swing.JLabel Hmax;
    private javax.swing.JLabel Hmin;
    private javax.swing.JLabel VoidHours;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel sun1;
    private javax.swing.JLabel sun2;
    // End of variables declaration//GEN-END:variables
}
