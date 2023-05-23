/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package THVentanas;

import THlogica.Hopcion;
import THlogica.curso;
import THlogica.grupo;
import THlogica.grupos;
import THlogica.horario;
import THlogica.opcion;
import THlogica.opciones;
import THpaneles.*;





import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import raven.GlassPanePopup;


public class VentanaPrincipal extends javax.swing.JFrame {

    private grupos grupos = new grupos();
    
    private grupo groupChosen = null;
    private GroupCard groupchoosen;
    private ArrayList <GroupCard>grupo = new ArrayList <GroupCard>(); //GroupCard
    
    
    private curso cursoChosen = null;
    private CursoCard cursochoosen;
    private ArrayList <CursoCard>curso = new ArrayList <CursoCard>();
    
    
    private opcion opcionChosen = null;
    private OptionCard opcionchoosen;
    private ArrayList <OptionCard>opcion = new ArrayList <OptionCard>();
    
    
    
    private ArrayList <HorarioCard>Hopcions = new ArrayList <HorarioCard>();
    private int totalpages = 0;
    private int Page = 0;
    
    public opcion creada = null;
    
    public VentanaPrincipal() {
        
       
        initComponents();
        
        GlassPanePopup.install(this);
        
        
        grupos.ReadGrupos();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/THimages/icon.png")));
        setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),18,18));
        setLocationRelativeTo(null);
        
        
        this.GroupCards();
       Ngrupenc.setVisible(false);
       Ncursoenc.setVisible(true);
       Ngrupesc.setVisible(true);
       Ncursoesc.setVisible(true);
       Nopcenc.setVisible(true);
       Nhorarios.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        move = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        toCustom = new javax.swing.JButton();
        toEDIT = new javax.swing.JButton();
        toGENER = new javax.swing.JButton();
        downthing = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        switchven = new javax.swing.JTabbedPane();
        edit = new javax.swing.JPanel();
        Gruposed = new javax.swing.JPanel();
        labelgrupos = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        Ngrupenc = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cursosed = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        labelcursos = new javax.swing.JLabel();
        add2 = new javax.swing.JButton();
        brush = new javax.swing.JButton();
        Ngrupesc = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Ncursoenc = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        opcionsed = new javax.swing.JPanel();
        brush2 = new javax.swing.JButton();
        key = new javax.swing.JButton();
        labelop = new javax.swing.JLabel();
        back2 = new javax.swing.JButton();
        add3 = new javax.swing.JButton();
        CODE = new custom.TextFieldd();
        Ncursoesc = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Nopcenc = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        See = new javax.swing.JPanel();
        filts = new javax.swing.JPanel();
        schetxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        schetxt1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        back3 = new javax.swing.JButton();
        Horas = new javax.swing.JLabel();
        Horamax = new javax.swing.JLabel();
        Jue = new custom.MyButton();
        Hmin = new custom.MyButton();
        Horamin = new javax.swing.JLabel();
        Espacio1 = new javax.swing.JLabel();
        Espacio2 = new javax.swing.JLabel();
        Horas1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Hmax = new custom.MyButton();
        Vie = new custom.MyButton();
        Lun = new custom.MyButton();
        Sab = new custom.MyButton();
        Mar = new custom.MyButton();
        Mie = new custom.MyButton();
        Filt = new javax.swing.JLabel();
        hormax = new custom.MySpinner();
        hormin = new custom.MySpinner();
        espmax = new custom.MySpinner();
        diasmax = new custom.MySpinner();
        horarioCard5 = new THpaneles.HorarioCard();
        view = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nhorarios = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(169, 209, 142));
        header.setPreferredSize(new java.awt.Dimension(1180, 95));
        header.setLayout(null);

        move.setFont(new java.awt.Font("Segoe UI", 0, 80)); // NOI18N
        move.setForeground(new java.awt.Color(102, 204, 255));
        move.setText("•");
        move.setToolTipText("");
        move.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        move.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveMouseDragged(evt);
            }
        });
        header.add(move);
        move.setBounds(1080, -10, 33, 50);

        min.setFont(new java.awt.Font("Segoe UI", 0, 80)); // NOI18N
        min.setForeground(new java.awt.Color(255, 255, 102));
        min.setText("•");
        min.setToolTipText("");
        min.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });
        header.add(min);
        min.setBounds(1110, -10, 33, 50);

        exit.setFont(new java.awt.Font("Segoe UI", 0, 80)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 102, 102));
        exit.setText("•");
        exit.setToolTipText("");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        header.add(exit);
        exit.setBounds(1140, -10, 33, 50);

        name.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("#TUHORARIO");
        header.add(name);
        name.setBounds(60, 20, 220, 20);

        toCustom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/customWhite35.png"))); // NOI18N
        toCustom.setContentAreaFilled(false);
        toCustom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toCustom.setDefaultCapable(false);
        toCustom.setFocusPainted(false);
        toCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toCustomActionPerformed(evt);
            }
        });
        header.add(toCustom);
        toCustom.setBounds(520, 20, 30, 30);

        toEDIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/editWhite35.png"))); // NOI18N
        toEDIT.setContentAreaFilled(false);
        toEDIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toEDIT.setDefaultCapable(false);
        toEDIT.setFocusPainted(false);
        toEDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toEDITActionPerformed(evt);
            }
        });
        header.add(toEDIT);
        toEDIT.setBounds(590, 10, 30, 30);

        toGENER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/menuWhite35.png"))); // NOI18N
        toGENER.setBorderPainted(false);
        toGENER.setContentAreaFilled(false);
        toGENER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toGENER.setDefaultCapable(false);
        toGENER.setFocusPainted(false);
        toGENER.setHideActionText(true);
        toGENER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toGENERActionPerformed(evt);
            }
        });
        header.add(toGENER);
        toGENER.setBounds(660, 20, 30, 30);

        downthing.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout downthingLayout = new javax.swing.GroupLayout(downthing);
        downthing.setLayout(downthingLayout);
        downthingLayout.setHorizontalGroup(
            downthingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        downthingLayout.setVerticalGroup(
            downthingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        header.add(downthing);
        downthing.setBounds(590, 45, 30, 6);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icono.png"))); // NOI18N
        header.add(jLabel1);
        jLabel1.setBounds(10, 10, 40, 40);

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 60));

        switchven.setBackground(new java.awt.Color(237, 253, 246));
        switchven.setToolTipText("");
        switchven.setFocusable(false);
        switchven.setRequestFocusEnabled(false);

        edit.setBackground(new java.awt.Color(204, 204, 204));
        edit.setFocusable(false);
        edit.setLayout(null);

        Gruposed.setBackground(new java.awt.Color(237, 253, 246));
        Gruposed.setFocusable(false);
        Gruposed.setLayout(null);

        labelgrupos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        labelgrupos.setForeground(new java.awt.Color(127, 127, 127));
        labelgrupos.setText("Grupos");
        Gruposed.add(labelgrupos);
        labelgrupos.setBounds(28, 24, 50, 20);

        add.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        add.setForeground(new java.awt.Color(127, 127, 127));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/editfuntions/addGray20.png"))); // NOI18N
        add.setContentAreaFilled(false);
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.setFocusPainted(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        Gruposed.add(add);
        add.setBounds(288, 24, 20, 20);

        Ngrupenc.setBackground(new java.awt.Color(255, 255, 255));
        Ngrupenc.setOpaque(false);

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(105, 167, 133));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Crea tu grupo y disfrútalo ");

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 19)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(105, 167, 133));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("encontrado");

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 19)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(105, 167, 133));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ningún grupo ");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_nothing_found_100px.png"))); // NOI18N

        javax.swing.GroupLayout NgrupencLayout = new javax.swing.GroupLayout(Ngrupenc);
        Ngrupenc.setLayout(NgrupencLayout);
        NgrupencLayout.setHorizontalGroup(
            NgrupencLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NgrupencLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(NgrupencLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NgrupencLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NgrupencLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NgrupencLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        NgrupencLayout.setVerticalGroup(
            NgrupencLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NgrupencLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel9)
                .addGap(10, 10, 10)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Gruposed.add(Ngrupenc);
        Ngrupenc.setBounds(40, 190, 250, 250);

        edit.add(Gruposed);
        Gruposed.setBounds(0, 0, 340, 690);

        cursosed.setBackground(new java.awt.Color(209, 243, 222));
        cursosed.setFocusable(false);
        cursosed.setLayout(null);

        back.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        back.setForeground(new java.awt.Color(127, 127, 127));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/editfuntions/backGray20.png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.setFocusPainted(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        cursosed.add(back);
        back.setBounds(250, 14, 20, 20);

        labelcursos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        labelcursos.setForeground(new java.awt.Color(127, 127, 127));
        labelcursos.setText("Cursos");
        cursosed.add(labelcursos);
        labelcursos.setBounds(30, 14, 48, 20);

        add2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        add2.setForeground(new java.awt.Color(127, 127, 127));
        add2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/editfuntions/addGray20.png"))); // NOI18N
        add2.setContentAreaFilled(false);
        add2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add2.setFocusPainted(false);
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });
        cursosed.add(add2);
        add2.setBounds(190, 14, 20, 20);

        brush.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        brush.setForeground(new java.awt.Color(127, 127, 127));
        brush.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/editfuntions/clearGray20.png"))); // NOI18N
        brush.setContentAreaFilled(false);
        brush.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brush.setFocusPainted(false);
        brush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brushActionPerformed(evt);
            }
        });
        cursosed.add(brush);
        brush.setBounds(220, 14, 20, 20);

        Ngrupesc.setOpaque(false);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_lost_and_found_100px_1.png"))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 19)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(105, 167, 133));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Ningún grupo escogido");

        jLabel22.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(105, 167, 133));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Selecciona el grupo para");

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(105, 167, 133));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("poder editarlo");

        javax.swing.GroupLayout NgrupescLayout = new javax.swing.GroupLayout(Ngrupesc);
        Ngrupesc.setLayout(NgrupescLayout);
        NgrupescLayout.setHorizontalGroup(
            NgrupescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NgrupescLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NgrupescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NgrupescLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NgrupescLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NgrupescLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        NgrupescLayout.setVerticalGroup(
            NgrupescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NgrupescLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel20)
                .addGap(0, 0, 0)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        cursosed.add(Ngrupesc);
        Ngrupesc.setBounds(20, 80, 260, 240);

        Ncursoenc.setOpaque(false);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_nothing_found_100px.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 19)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(105, 167, 133));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Ningún curso");

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 19)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(105, 167, 133));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("encontrado");

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(105, 167, 133));
        jLabel14.setText("Crea un curso para poder editar ");

        javax.swing.GroupLayout NcursoencLayout = new javax.swing.GroupLayout(Ncursoenc);
        Ncursoenc.setLayout(NcursoencLayout);
        NcursoencLayout.setHorizontalGroup(
            NcursoencLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NcursoencLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(NcursoencLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NcursoencLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NcursoencLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        NcursoencLayout.setVerticalGroup(
            NcursoencLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NcursoencLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        cursosed.add(Ncursoenc);
        Ncursoenc.setBounds(20, 340, 260, 220);

        edit.add(cursosed);
        cursosed.setBounds(340, 10, 300, 680);

        opcionsed.setBackground(new java.awt.Color(237, 253, 246));
        opcionsed.setFocusable(false);
        opcionsed.setLayout(null);

        brush2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        brush2.setForeground(new java.awt.Color(127, 127, 127));
        brush2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/editfuntions/clearGray20.png"))); // NOI18N
        brush2.setContentAreaFilled(false);
        brush2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brush2.setFocusPainted(false);
        brush2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brush2ActionPerformed(evt);
            }
        });
        opcionsed.add(brush2);
        brush2.setBounds(440, 20, 20, 20);

        key.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        key.setForeground(new java.awt.Color(127, 127, 127));
        key.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/editfuntions/keyGray20.png"))); // NOI18N
        key.setContentAreaFilled(false);
        key.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        key.setFocusPainted(false);
        key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyActionPerformed(evt);
            }
        });
        opcionsed.add(key);
        key.setBounds(440, 60, 26, 20);

        labelop.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        labelop.setForeground(new java.awt.Color(127, 127, 127));
        labelop.setText("Opciones");
        opcionsed.add(labelop);
        labelop.setBounds(30, 20, 64, 20);

        back2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        back2.setForeground(new java.awt.Color(127, 127, 127));
        back2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/editfuntions/backGray20.png"))); // NOI18N
        back2.setContentAreaFilled(false);
        back2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back2.setFocusPainted(false);
        back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back2ActionPerformed(evt);
            }
        });
        opcionsed.add(back2);
        back2.setBounds(470, 20, 20, 20);

        add3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        add3.setForeground(new java.awt.Color(127, 127, 127));
        add3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/editfuntions/addGray20.png"))); // NOI18N
        add3.setContentAreaFilled(false);
        add3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add3.setFocusPainted(false);
        add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add3ActionPerformed(evt);
            }
        });
        opcionsed.add(add3);
        add3.setBounds(410, 20, 20, 20);

        CODE.setBackground(new java.awt.Color(169, 209, 142));
        CODE.setBorder(null);
        CODE.setForeground(new java.awt.Color(255, 255, 255));
        CODE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CODE.setText("codigo");
        CODE.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        CODE.setRound(24);
        CODE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CODEFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CODEFocusLost(evt);
            }
        });
        CODE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CODEMouseClicked(evt);
            }
        });
        opcionsed.add(CODE);
        CODE.setBounds(110, 60, 300, 25);

        Ncursoesc.setOpaque(false);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_lost_and_found_100px_1.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 19)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(105, 167, 133));
        jLabel11.setText("Ningún curso escogido");

        jLabel25.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(105, 167, 133));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Selecciona el curso para poder editar sus opciones ");

        javax.swing.GroupLayout NcursoescLayout = new javax.swing.GroupLayout(Ncursoesc);
        Ncursoesc.setLayout(NcursoescLayout);
        NcursoescLayout.setHorizontalGroup(
            NcursoescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NcursoescLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(NcursoescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NcursoescLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NcursoescLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        NcursoescLayout.setVerticalGroup(
            NcursoescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NcursoescLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel13)
                .addGap(0, 0, 0)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        opcionsed.add(Ncursoesc);
        Ncursoesc.setBounds(40, 110, 440, 210);

        Nopcenc.setOpaque(false);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_nothing_found_100px.png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 19)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(105, 167, 133));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Ninguna opción encontrada ");

        jLabel26.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(105, 167, 133));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Ingresa las opciones del curso para ");

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(105, 167, 133));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("generar los horarios");

        javax.swing.GroupLayout NopcencLayout = new javax.swing.GroupLayout(Nopcenc);
        Nopcenc.setLayout(NopcencLayout);
        NopcencLayout.setHorizontalGroup(
            NopcencLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NopcencLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(NopcencLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NopcencLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NopcencLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NopcencLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        NopcencLayout.setVerticalGroup(
            NopcencLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NopcencLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        opcionsed.add(Nopcenc);
        Nopcenc.setBounds(90, 380, 360, 210);

        edit.add(opcionsed);
        opcionsed.setBounds(640, 10, 540, 680);

        switchven.addTab("tab1", edit);

        See.setBackground(new java.awt.Color(237, 253, 246));
        See.setFocusable(false);
        See.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        filts.setBackground(new java.awt.Color(209, 243, 222));
        filts.setLayout(null);

        schetxt.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        schetxt.setForeground(new java.awt.Color(102, 102, 102));
        schetxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        schetxt.setText("Filtros");
        filts.add(schetxt);
        schetxt.setBounds(60, 290, 140, 30);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(105, 167, 133));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dias restringidos");
        filts.add(jLabel2);
        jLabel2.setBounds(50, 560, 160, 19);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(127, 127, 127));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Horarios generados");
        filts.add(jLabel3);
        jLabel3.setBounds(50, 90, 160, 17);

        schetxt1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 56)); // NOI18N
        schetxt1.setForeground(new java.awt.Color(90, 90, 90));
        schetxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        schetxt1.setText("0");
        filts.add(schetxt1);
        schetxt1.setBounds(50, 20, 160, 60);

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(123, 123, 123));
        filts.add(jSeparator1);
        jSeparator1.setBounds(20, 110, 230, 10);

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(123, 123, 123));
        filts.add(jSeparator2);
        jSeparator2.setBounds(20, 280, 230, 10);

        back3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        back3.setForeground(new java.awt.Color(127, 127, 127));
        back3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/editfuntions/backGray20.png"))); // NOI18N
        back3.setContentAreaFilled(false);
        back3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        back3.setFocusPainted(false);
        back3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back3ActionPerformed(evt);
            }
        });
        filts.add(back3);
        back3.setBounds(30, 290, 26, 27);

        Horas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Horas.setForeground(new java.awt.Color(102, 102, 102));
        Horas.setText("Dias");
        filts.add(Horas);
        Horas.setBounds(200, 500, 50, 19);

        Horamax.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Horamax.setForeground(new java.awt.Color(102, 102, 102));
        Horamax.setText("Hora Máx.");
        filts.add(Horamax);
        Horamax.setBounds(20, 360, 80, 19);

        Jue.setBackground(new java.awt.Color(153, 195, 172));
        Jue.setBorder(null);
        Jue.setForeground(new java.awt.Color(255, 255, 255));
        Jue.setText("Jue");
        Jue.setBorderColor(new java.awt.Color(153, 195, 172));
        Jue.setBorderPainted(false);
        Jue.setColor(new java.awt.Color(153, 195, 172));
        Jue.setColorClick(new java.awt.Color(153, 195, 172));
        Jue.setColorOver(new java.awt.Color(153, 195, 172));
        Jue.setFocusPainted(false);
        Jue.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Jue.setRadius(20);
        Jue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JueMouseClicked(evt);
            }
        });
        Jue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JueActionPerformed(evt);
            }
        });
        filts.add(Jue);
        Jue.setBounds(30, 630, 60, 20);

        Hmin.setBackground(new java.awt.Color(112, 173, 71));
        Hmin.setBorder(null);
        Hmin.setForeground(new java.awt.Color(255, 255, 255));
        Hmin.setText("AM");
        Hmin.setBorderColor(new java.awt.Color(84, 130, 53));
        Hmin.setBorderPainted(false);
        Hmin.setColor(new java.awt.Color(112, 173, 71));
        Hmin.setColorClick(new java.awt.Color(84, 130, 53));
        Hmin.setColorOver(new java.awt.Color(84, 130, 53));
        Hmin.setFocusPainted(false);
        Hmin.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        Hmin.setRadius(20);
        Hmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HminActionPerformed(evt);
            }
        });
        filts.add(Hmin);
        Hmin.setBounds(200, 390, 40, 17);

        Horamin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Horamin.setForeground(new java.awt.Color(102, 102, 102));
        Horamin.setText("Hora Min.");
        filts.add(Horamin);
        Horamin.setBounds(20, 390, 80, 19);

        Espacio1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Espacio1.setForeground(new java.awt.Color(102, 102, 102));
        Espacio1.setText("Dias Máx.");
        filts.add(Espacio1);
        Espacio1.setBounds(20, 500, 80, 19);

        Espacio2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Espacio2.setForeground(new java.awt.Color(102, 102, 102));
        Espacio2.setText("Espa. Máx.");
        filts.add(Espacio2);
        Espacio2.setBounds(20, 450, 80, 19);

        Horas1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Horas1.setForeground(new java.awt.Color(102, 102, 102));
        Horas1.setText("Horas");
        filts.add(Horas1);
        Horas1.setBounds(200, 450, 50, 19);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(127, 127, 127));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Horario recomendado");
        filts.add(jLabel6);
        jLabel6.setBounds(50, 250, 160, 17);

        Hmax.setBackground(new java.awt.Color(84, 130, 53));
        Hmax.setBorder(null);
        Hmax.setForeground(new java.awt.Color(255, 255, 255));
        Hmax.setText("PM");
        Hmax.setBorderColor(new java.awt.Color(112, 173, 71));
        Hmax.setBorderPainted(false);
        Hmax.setColor(new java.awt.Color(84, 130, 53));
        Hmax.setColorClick(new java.awt.Color(112, 173, 71));
        Hmax.setColorOver(new java.awt.Color(112, 173, 71));
        Hmax.setFocusPainted(false);
        Hmax.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        Hmax.setRadius(20);
        Hmax.setSelected(true);
        Hmax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HmaxActionPerformed(evt);
            }
        });
        filts.add(Hmax);
        Hmax.setBounds(200, 360, 40, 17);

        Vie.setBorder(null);
        Vie.setForeground(new java.awt.Color(153, 153, 153));
        Vie.setText("Vie");
        Vie.setBorderColor(new java.awt.Color(255, 255, 255));
        Vie.setBorderPainted(false);
        Vie.setColorClick(new java.awt.Color(255, 255, 255));
        Vie.setColorOver(new java.awt.Color(255, 255, 255));
        Vie.setFocusPainted(false);
        Vie.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Vie.setRadius(20);
        Vie.setSelected(true);
        Vie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VieMouseClicked(evt);
            }
        });
        Vie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VieActionPerformed(evt);
            }
        });
        filts.add(Vie);
        Vie.setBounds(100, 630, 60, 20);

        Lun.setBorder(null);
        Lun.setForeground(new java.awt.Color(153, 153, 153));
        Lun.setText("Lun");
        Lun.setBorderColor(new java.awt.Color(255, 255, 255));
        Lun.setBorderPainted(false);
        Lun.setColorClick(new java.awt.Color(255, 255, 255));
        Lun.setColorOver(new java.awt.Color(255, 255, 255));
        Lun.setFocusPainted(false);
        Lun.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Lun.setRadius(20);
        Lun.setSelected(true);
        Lun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LunMouseClicked(evt);
            }
        });
        Lun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LunActionPerformed(evt);
            }
        });
        filts.add(Lun);
        Lun.setBounds(30, 600, 60, 20);

        Sab.setBorder(null);
        Sab.setForeground(new java.awt.Color(153, 153, 153));
        Sab.setText("Sab");
        Sab.setBorderColor(new java.awt.Color(255, 255, 255));
        Sab.setBorderPainted(false);
        Sab.setColorClick(new java.awt.Color(255, 255, 255));
        Sab.setColorOver(new java.awt.Color(255, 255, 255));
        Sab.setFocusPainted(false);
        Sab.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Sab.setRadius(20);
        Sab.setSelected(true);
        Sab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SabMouseClicked(evt);
            }
        });
        Sab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SabActionPerformed(evt);
            }
        });
        filts.add(Sab);
        Sab.setBounds(170, 630, 60, 20);

        Mar.setBackground(new java.awt.Color(153, 195, 172));
        Mar.setBorder(null);
        Mar.setForeground(new java.awt.Color(255, 255, 255));
        Mar.setText("Mar");
        Mar.setBorderColor(new java.awt.Color(153, 195, 172));
        Mar.setBorderPainted(false);
        Mar.setColor(new java.awt.Color(153, 195, 172));
        Mar.setColorClick(new java.awt.Color(153, 195, 172));
        Mar.setColorOver(new java.awt.Color(153, 195, 172));
        Mar.setFocusPainted(false);
        Mar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Mar.setRadius(20);
        Mar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MarMouseClicked(evt);
            }
        });
        Mar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarActionPerformed(evt);
            }
        });
        filts.add(Mar);
        Mar.setBounds(100, 600, 60, 20);

        Mie.setBorder(null);
        Mie.setForeground(new java.awt.Color(153, 153, 153));
        Mie.setText("Mié");
        Mie.setBorderColor(new java.awt.Color(255, 255, 255));
        Mie.setBorderPainted(false);
        Mie.setColorClick(new java.awt.Color(255, 255, 255));
        Mie.setColorOver(new java.awt.Color(255, 255, 255));
        Mie.setFocusPainted(false);
        Mie.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Mie.setRadius(20);
        Mie.setSelected(true);
        Mie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MieMouseClicked(evt);
            }
        });
        Mie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MieActionPerformed(evt);
            }
        });
        filts.add(Mie);
        Mie.setBounds(170, 600, 60, 20);

        Filt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Filt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_schedule_20px.png"))); // NOI18N
        Filt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Filt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FiltMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FiltMouseEntered(evt);
            }
        });
        filts.add(Filt);
        Filt.setBounds(200, 290, 30, 30);

        hormax.setBtnBack(new java.awt.Color(153, 195, 172));
        hormax.setMaxVal(9);
        hormax.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                hormaxMouseMoved(evt);
            }
        });
        hormax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hormaxMouseClicked(evt);
            }
        });
        hormax.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                hormaxPropertyChange(evt);
            }
        });
        filts.add(hormax);
        hormax.setBounds(110, 360, 80, 20);

        hormin.setBtnBack(new java.awt.Color(153, 195, 172));
        hormin.setMinVal(6);
        hormin.setValue(6);
        hormin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                horminPropertyChange(evt);
            }
        });
        filts.add(hormin);
        hormin.setBounds(110, 390, 80, 20);

        espmax.setBtnBack(new java.awt.Color(153, 195, 172));
        filts.add(espmax);
        espmax.setBounds(110, 450, 80, 20);

        diasmax.setBtnBack(new java.awt.Color(153, 195, 172));
        diasmax.setMaxVal(6);
        filts.add(diasmax);
        diasmax.setBounds(110, 500, 80, 20);
        filts.add(horarioCard5);
        horarioCard5.setBounds(30, 130, 210, 100);

        See.add(filts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 680));

        view.setBackground(new java.awt.Color(237, 253, 246));
        view.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(90, 90, 90));
        jLabel4.setText("Posibles Horarios");
        view.add(jLabel4);
        jLabel4.setBounds(70, 20, 313, 43);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(127, 127, 127));
        jLabel5.setText("Horarios generados y sus características ");
        view.add(jLabel5);
        jLabel5.setBounds(80, 60, 285, 20);

        Nhorarios.setOpaque(false);
        Nhorarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/icons8_nothing_found_100px.png"))); // NOI18N
        Nhorarios.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        jLabel28.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 19)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(105, 167, 133));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("No hay ningún horario encontrado ");
        Nhorarios.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 140, -1, -1));

        jLabel29.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(105, 167, 133));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("No hay horarios generados ");
        Nhorarios.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 170, -1, -1));

        view.add(Nhorarios);
        Nhorarios.setBounds(230, 180, 390, 240);

        jButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(151, 215, 194));
        jButton1.setText(">");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        view.add(jButton1);
        jButton1.setBounds(590, 600, 50, 50);

        jButton2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        jButton2.setForeground(new java.awt.Color(151, 215, 194));
        jButton2.setMnemonic(' ');
        jButton2.setText("<");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        view.add(jButton2);
        jButton2.setBounds(210, 600, 50, 50);

        See.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 900, 670));

        switchven.addTab("tab2", See);

        getContentPane().add(switchven, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1180, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void moveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMouseDragged
        PointerInfo pointerInfo = MouseInfo.getPointerInfo();
        int x = pointerInfo.getLocation().x;
        int y = pointerInfo.getLocation().y;
        
        setLocation(x-move.getX()-15,y+move.getY()-25);
    }//GEN-LAST:event_moveMouseDragged

    
    //<editor-fold defaultstate="collapsed" desc=" GROUPCARDS METODOS">
    
    private void GroupCards(){
        grupo actual = grupos.getHead();
        
        int comp = 0;
        while (actual != null){
            
            GroupCard nueva = new GroupCard();
            nueva.setVentana(this);
            nueva.setThisGrupo(actual);
            nueva.setThisGrupos(grupos);
            
            
            this.Gruposed.add(nueva);
            nueva.setLocation(30, 70 + comp*80);
            nueva.setSize(270, 60);
            
            grupo.add(nueva);
            
            actual = actual.getNext();
            comp++;
            
            
        }
        if (grupo.isEmpty()) {
       Ngrupenc.setVisible(true);
       Ncursoenc.setVisible(true);
       Ngrupesc.setVisible(true);
       Ncursoesc.setVisible(true);
       Nopcenc.setVisible(true);
       Nhorarios.setVisible(true);
        }else{
             Ngrupenc.setVisible(false);
       Ncursoenc.setVisible(false);
       Ngrupesc.setVisible(false);
       Ncursoesc.setVisible(false);
       Nopcenc.setVisible(false);
       Nhorarios.setVisible(false);
        }
    }
    
    public void unchoseChosen(){
        if (this.groupChosen == null) { return; }
        this.groupChosen = null;
        
        groupchoosen.unchose();
        groupchoosen.setChosen(false);
        
        this.unchoseChosencurso();
        this.unchoseChosenopcion();
        
        
        UpdateCursoCards();
        UpdateOpcionCards();
    }
    
    
    public void UpdateGroupCards(){
        RemoveGroupscards();
        GroupCards();
    }
    
    
    private void RemoveGroupscards(){
        if (this.groupChosen == null) {
            return;
        }
        
        //System.out.println(this.groupChosen.toString());
        for (int i = 0; i < grupo.size(); i++) {
            Component group = grupo.get(i);
            //System.out.println(group.toString());
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    Gruposed.remove(group);
                    Gruposed.revalidate();
                    Gruposed.repaint();
                }
            });
        }
        this.grupo.clear();
        this.repaint();
    }
    //</editor-fold>
    
    
    
    
    
    
    //<editor-fold defaultstate="collapsed" desc=" CURSOCARDS METODOS">
    private void CursoCards(){
        if (groupChosen == null) return; 
        curso actual = groupChosen.getHora().getCabeza();
        
        int comp = 0;
        while (actual != null){
            
            CursoCard nueva = new CursoCard();
            nueva.setVentana(this);
            nueva.setThisCursos(groupChosen.getHora());
            nueva.setThisCurso(actual);
            nueva.setDias(actual.ndias+"");
            actual.getListaopc().contaropciones();
            nueva.setOpciones(actual.getListaopc().nopciones);
            
            
            this.cursosed.add(nueva);
            nueva.setLocation(30, 90 + comp*80);
            nueva.setSize(240, 60);
            
            curso.add(nueva);
            
            actual = actual.getSig();
            comp++;
        
            
        }
        if (!grupo.isEmpty()) {
        Ncursoenc.setVisible(false);
        Ngrupesc.setVisible(false);
        }else{
             Ncursoenc.setVisible(true);
             Ngrupesc.setVisible(true);
        }
    }
    
    public void unchoseChosencurso(){
        if (this.cursoChosen == null) {
            return;
        }
        this.cursoChosen = null;
        
        cursochoosen.unchose();
        cursochoosen.setChosen(false);
        
        this.unchoseChosenopcion();
        
        UpdateOpcionCards();
        
    }
    
    
    public void UpdateCursoCards(){
        RemoveCursocards();
        CursoCards();
    }
    
    
    private void RemoveCursocards(){
        
        //System.out.println("CARDS: " + cursosed.getComponentCount());
        for (int i = 0; i < curso.size(); i++) {
            
            
            Component cruse = curso.get(i);
            
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    cursosed.remove(cruse);
                    See.repaint();
                }
            });
        }
        
        if (cursosed.getComponentCount() <= 4) {
            this.curso.clear();
        }
        
        this.repaint();
    }
    //</editor-fold>
    
    
    
    
    
    
    
    //<editor-fold defaultstate="collapsed" desc=" OPCIONCARDS METODOS">
    private void OpcionCards(){
        if (cursoChosen == null) {return; }
        opcion actual = cursoChosen.getListaopc().getCabeza();
        int lasth = 0;
        
        int comp = 0;
        while (actual != null){
            
            OptionCard nueva = new OptionCard();
            nueva.setThisOpciones(cursoChosen.getListaopc());
            nueva.setVentana(this);
            nueva.setThisOpcion(actual);
            
            
            this.opcionsed.add(nueva);
            
            
            if (comp%2 == 0) {
                lasth = 120 + (10 + 15*actual.getNdias()) * comp;
                nueva.setLocation(60, (lasth));
            } else {
                
                nueva.setLocation(290, (lasth));
            }
            
            
            opcion.add(nueva);
            
            actual = actual.getSig();
            comp++;
        
            
        }
        if (grupo.isEmpty()) {
             Ncursoesc.setVisible(true);
              Nopcenc.setVisible(true);
        }else{
            Ncursoesc.setVisible(false);
       Nopcenc.setVisible(false);
        }
        
    }
    
    public void unchoseChosenopcion(){
        if (this.opcionChosen == null) {
            return;
        }
        this.opcionChosen = null;
        
        opcionchoosen.unchose();
        opcionchoosen.setChosen(false);
    }
    
    
    public void UpdateOpcionCards(){
        
        CODE.setText("codigo");
        RemoveOpcioncards();
        OpcionCards();
    }
    
    
    private void RemoveOpcioncards(){
        
        for (int i = 0; i < opcion.size(); i++) {
            Component op = opcion.get(i);
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    opcionsed.remove(op);
                    opcionsed.revalidate();
                    opcionsed.repaint();
                }
            });
            
            
        }
        
        this.opcion.clear();
        this.repaint();
    }
    //</editor-fold>
    
    
    
    
    
    
    
    
    //<editor-fold defaultstate="collapsed" desc="HORARIOOOOOOOOOO CAAAAAAAAAAAAAAAARDS">
    private void HorarioCards(){
        if (groupChosen == null) return;
        horario hor = this.groupChosen.getHor();
        
        totalpages = 1;
        int step = 0;
        Hopcion actual = hor.getHhead();
        System.out.println(actual);
        while (actual != null){
            HorarioCard nuevo = new HorarioCard();
            nuevo.setHorario(actual);
            nuevo.setVentana(this);
            nuevo.setSize(210, 102);
            int uwu = 50*((int)(Math.floor(step/3))%2);
//            System.out.println(70 + (230*(step%3)) + uwu);
            nuevo.setLocation(60 + (int)(900*Math.floor(step/12)) + (260*(step%3)) + uwu, 110 + (122 *((int)(Math.floor(step/3))%4) ));
            nuevo.setPage((int)(Math.floor(step/12)));
            nuevo.setLine(((int)(Math.floor(step/3))%4));
            //if (step > 24) nuevo.setVisible(false);
            
            if (step%12 == 0) totalpages++;
            
            
            Hopcions.add(nuevo);
            this.view.add(nuevo);
            
            step++;
            actual = actual.sig;
        }
        view.revalidate();
        view.repaint();
        if (grupo.isEmpty()) {
       Nhorarios.setVisible(true);
        }else{
            
       Nhorarios.setVisible(false);
        }
    }
    
    
    private void RemoveHorariocards(){
        
        for (int i = 0; i < Hopcions.size(); i++) {
            Component op = Hopcions.get(i);
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    view.remove(op);
                    view.revalidate();
                    view.repaint();
                }
            });
        }
        this.Hopcions.clear();
        this.repaint();
    }
    
    
    
    
    private void moveAllHorarios(int dir){
        System.out.println(Hopcions.size());
        for (int i = 0; i < Hopcions.size(); i++) {
            HorarioCard here = Hopcions.get(i);
            if (here.getPage() == Page || here.getPage() == Page - dir) {
                here.setVisible(true);
            } else{
                //here.setVisible(false);
                //here.setLocation(here.getX()-920*dir, here.getY());
            }
        }

        Timer timer = new Timer(2, new ActionListener() {
            private int counter = 0;
            private final int totalFrames = 20;
            private final int totalDistance = 1420;

            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                float t = (float) counter%totalFrames / totalFrames;

                for (int i = 0; i < Hopcions.size(); i++) {
                    HorarioCard here = Hopcions.get(i);
                    int distance = (int) (totalDistance/totalFrames * easeOut(t));
                    
                    if (here.getPage() == Page || here.getPage() == Page - dir || true) {
                        
                        if (here.getLine() == Math.floor(counter/totalFrames)) {
                            here.setLocation(here.getX() + distance * dir, here.getY());
                        }
                    }
                }

                if (counter >= totalFrames*4) {
                    ((Timer) e.getSource()).stop();
                }
            }
        });

        timer.start();


        SwingUtilities.invokeLater(() -> {
            Page-=dir;
        });
    }
    
    private float easeOut(float t) {
        return 1 - (1 - t) * (1 - t);
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" setters y getters">

    
    
    public CursoCard getCursochoosen() {
        return cursochoosen;
    }

    public void setCursochoosen(CursoCard cursochosen) {
        this.cursochoosen = cursochosen;
    }
    
    
    public GroupCard getGroupchoosen() {
        return groupchoosen;
    }

    public void setGroupchoosen(GroupCard groupchosen) {
        this.groupchoosen = groupchosen;
    }

    public grupo getGroupChosen() {
        return groupChosen;
    }

    public void setGroupChosen(grupo groupChosen) {
        this.groupChosen = groupChosen;
        this.unchoseChosencurso();
        this.unchoseChosenopcion();
        this.UpdateCursoCards();
        GetandSetFiltros(groupChosen.getHor());
    }

    public curso getCursoChosen() {
        return cursoChosen;
    }

    public void setCursoChosen(curso cursoChosen) {
        this.cursoChosen = cursoChosen;
        this.unchoseChosenopcion();
        this.UpdateOpcionCards();
    }
    
    public JPanel getEdit() {
        return edit;
    }
    
    
    //</editor-fold>
    
    public opcion getOpcionChosen() {
        return opcionChosen;
    }

    public void setOpcionChosen(opcion opcionChosen) {
        this.unchoseChosenopcion();
        this.opcionChosen = opcionChosen;
    }

    public OptionCard getOpcionchoosen() {
        return opcionchoosen;
    }

    public void setOpcionchoosen(OptionCard opcionchoosen) {
        this.opcionchoosen = opcionchoosen;
    }
    
    
    
    
    
    private void toEDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toEDITActionPerformed
        
        this.switchven.setSelectedIndex(0);
        SwingUtilities.invokeLater(() -> {
            this.toEDIT.setLocation(toEDIT.getX(), 10);
            this.toGENER.setLocation(toGENER.getX(), 20);
            this.downthing.setLocation(toEDIT.getX(),downthing.getY());
        });
    }//GEN-LAST:event_toEDITActionPerformed

    private void toGENERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toGENERActionPerformed

        this.switchven.setSelectedIndex(1);
        SwingUtilities.invokeLater(() -> {
            this.toEDIT.setLocation(this.toEDIT.getX(), 20);
            this.toGENER.setLocation(this.toGENER.getX(), 10);
            this.downthing.setLocation(this.toGENER.getX(), this.downthing.getY());
        });
    }//GEN-LAST:event_toGENERActionPerformed

    private void add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add3ActionPerformed
        if (this.cursoChosen == null) return;
        
        creada = cursoChosen.getListaopc().nuevaopcion(false);
        
        if (creada == null) return;
        
        for (int i = 0; i < cursoChosen.ndias; i++) {
            CrearOpc nuevo = new CrearOpc();
            nuevo.variable = this.cursoChosen.getListaopc();
            nuevo.setSize(400, 300);
            nuevo.setPadre(this);
            
            GlassPanePopup.showPopup(nuevo);

            nuevo.repaint();
            repaint();
        }
        
    }//GEN-LAST:event_add3ActionPerformed

    private void back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back2ActionPerformed
        this.cursoChosen.getListaopc().Undo();
        
        CursoCard u = this.cursochoosen;
        this.UpdateOpcionCards();
        this.UpdateCursoCards();
        u.chose();
        this.cursochoosen = u;
        this.cursoChosen = u.getThisCurso();
    }//GEN-LAST:event_back2ActionPerformed

    private void keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyActionPerformed
        if (this.CODE.getText().equals("codigo") || this.CODE.getText().equals("")) {
            this.CODE.setText(this.cursoChosen.getListaopc().encript());
        } else {
            this.cursoChosen.getListaopc().deencript(CODE.getText());
            this.CODE.setText("codigo");
            this.UpdateOpcionCards();
        }
    }//GEN-LAST:event_keyActionPerformed

    private void brush2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brush2ActionPerformed
        this.cursoChosen.getListaopc().clearopcions();
        
        CursoCard u = this.cursochoosen;
        this.UpdateOpcionCards();
        this.UpdateCursoCards();
        u.chose();
        this.cursochoosen = u;
        this.cursoChosen = u.getThisCurso();
        
        
         Ncursoesc.setVisible(true);
       Nopcenc.setVisible(true);
        
    }//GEN-LAST:event_brush2ActionPerformed

    private void brushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brushActionPerformed
        this.groupChosen.getHor().limpiarcurs();
        this.UpdateCursoCards();
        this.UpdateGroupCards();
        this.UpdateOpcionCards();
        
       Ncursoenc.setVisible(true);
       Ngrupesc.setVisible(true);
        
    }//GEN-LAST:event_brushActionPerformed

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
        if (this.groupChosen == null) {
            return;
        }
        
        
        CrearCurso nuevo = new CrearCurso();
        nuevo.variable = this.groupChosen.getHora();
        nuevo.setPadre(this);
        nuevo.setSize(400, 300);

        GlassPanePopup.showPopup(nuevo);

        nuevo.repaint();
        repaint();
    }//GEN-LAST:event_add2ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.groupChosen.getHor().Undo();
        this.UpdateCursoCards();
    }//GEN-LAST:event_backActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        CrearGroup nuevo = new CrearGroup();
        nuevo.padre = this;
        nuevo.variable = grupos;
        nuevo.setSize(400, 222);

        GlassPanePopup.showPopup(nuevo);
        
        nuevo.repaint();
        repaint();

    }//GEN-LAST:event_addActionPerformed
    
    public void HORARIO(){
        HorarioView nuevo = new HorarioView();
        nuevo.setSize(880, 510);
        
        GlassPanePopup.showPopup(nuevo);
        
        nuevo.setHora(this.groupChosen.getHor());
        nuevo.repaint();
        repaint();
    }
    
    
    
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved

    }//GEN-LAST:event_formMouseMoved

    private void CODEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CODEMouseClicked
        if (this.CODE.getText().equals("codigo")) {
            this.CODE.setText("");
        }
    }//GEN-LAST:event_CODEMouseClicked

    private void CODEFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CODEFocusLost
        if (this.CODE.getText().equals("")) {
            this.CODE.setText("codigo");
        }
    }//GEN-LAST:event_CODEFocusLost

    private void CODEFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CODEFocusGained
        if (this.CODE.getText().equals("codigo")) {
            this.CODE.setText("");
        }
    }//GEN-LAST:event_CODEFocusGained

    private void toCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toCustomActionPerformed
        this.grupos.SaveGrupos();
    }//GEN-LAST:event_toCustomActionPerformed

    private void back3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back3ActionPerformed
        if (this.groupChosen == null) return;
        this.limpiarFilts();
    }//GEN-LAST:event_back3ActionPerformed

    private void JueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JueActionPerformed

    }//GEN-LAST:event_JueActionPerformed

    private void HminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HminActionPerformed
        cmbiarM(Hmin);
        if (Hmin.isSelected()) {
            hormin.setMaxVal(9);
            hormin.setMinVal(1);
        }else {
            hormin.setMaxVal(12);
            hormin.setMinVal(6);
        }
        
        if (Hmin.getText().equals(Hmax.getText()) && hormax.getValue() < hormin.getValue()) {
            hormin.setValue(hormax.getValue());
        }
        
    }//GEN-LAST:event_HminActionPerformed

    private void HmaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HmaxActionPerformed
        cmbiarM(Hmax);
        if (Hmax.isSelected()) {
            hormax.setMaxVal(9);
            hormax.setMinVal(1);
        }else {
            hormax.setMaxVal(12);
            hormax.setMinVal(6);
        }
        
        if (Hmin.getText().equals("PM") && Hmax.getText().equals("AM")) {
            Hmin.doClick();
        }
        if (Hmin.getText().equals(Hmax.getText()) && hormax.getValue() < hormin.getValue()) {
            hormin.setValue(hormax.getValue());
        }
        
    }//GEN-LAST:event_HmaxActionPerformed

    private void VieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VieActionPerformed
    
    }//GEN-LAST:event_VieActionPerformed

    private void LunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LunActionPerformed

    }//GEN-LAST:event_LunActionPerformed

    private void SabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SabActionPerformed

    }//GEN-LAST:event_SabActionPerformed

    private void MarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarActionPerformed

    }//GEN-LAST:event_MarActionPerformed

    private void MieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MieActionPerformed

    }//GEN-LAST:event_MieActionPerformed

    private void FiltMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FiltMouseClicked
        Page = 0;
        if (Hmin.getText().equals(Hmax.getText()) && hormax.getValue() < hormin.getValue()) {
            hormin.setValue(hormax.getValue());
        }
        
        if (groupChosen == null)return;
        this.setFiltros();
        groupChosen.getHora().generarH();
        RemoveHorariocards();
        HorarioCards();
        
        this.schetxt1.setText(Hopcions.size()+"");
        if (schetxt1.getText().equals("0")) {
            Nhorarios.setVisible(true);
        }
    }//GEN-LAST:event_FiltMouseClicked

    private void FiltMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FiltMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltMouseEntered

    private void LunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LunMouseClicked
        cambiarD(Lun);
    }//GEN-LAST:event_LunMouseClicked

    private void MarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MarMouseClicked
        cambiarD(Mar);
    }//GEN-LAST:event_MarMouseClicked

    private void MieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MieMouseClicked
        cambiarD(Mie);
    }//GEN-LAST:event_MieMouseClicked

    private void JueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JueMouseClicked
        cambiarD(Jue);
    }//GEN-LAST:event_JueMouseClicked

    private void VieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VieMouseClicked
        cambiarD(Vie);
    }//GEN-LAST:event_VieMouseClicked

    private void SabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SabMouseClicked
        cambiarD(Sab);
    }//GEN-LAST:event_SabMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (Page > 0) {
            moveAllHorarios(1);
            System.out.println("Pagina   "+Page);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (Page < totalpages) {
            moveAllHorarios(-1);
            System.out.println("yolo");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void hormaxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_hormaxPropertyChange
        
    }//GEN-LAST:event_hormaxPropertyChange

    private void horminPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_horminPropertyChange
        
    }//GEN-LAST:event_horminPropertyChange

    private void hormaxMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hormaxMouseMoved

    }//GEN-LAST:event_hormaxMouseMoved

    private void hormaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hormaxMouseClicked
        if (Hmin.getText().equals(Hmax.getText()) && hormax.getValue() < hormin.getValue()) {
            
            hormin.setValue(hormax.getValue());
        }
    }//GEN-LAST:event_hormaxMouseClicked
    
    
    
    
    public void setFiltros(){
        horario  ho = groupChosen.getHora();
        
        ho.setDiasmax(diasmax.getValue());
        ho.setHuecomax(espmax.getValue());
        
        int maxplus = (Hmax.isSelected()) ? 12:0;
        int minplus = (Hmin.isSelected()) ? 12:0;
        
        ho.setHoramaxm(this.hormax.getValue()+maxplus);
        ho.setHoraminm(this.hormin.getValue()+minplus);
        
        boolean [] restin = {!Lun.isSelected(),!Mar.isSelected(), !Mie.isSelected(),!Jue.isSelected(),!Vie.isSelected(),!Sab.isSelected()};
        ho.setDiasrestrin(restin);
        
        System.out.println(diasmax.getValue() + " | " + espmax.getValue() + " | " + diasmax.getValue() + " | " + ho.getHoramaxm() + " : " + ho.getHoraminm() +" :::" +  restin[0] + " " + restin[1] + " " + restin[2]+ " " + restin[3] + " " + restin[4] + " " + restin[5]);

    }
    
    public void limpiarFilts(){
        horario  ho = groupChosen.getHora();
        
        ho.Limpiarfilt();
        
        GetandSetFiltros(ho);
    }
    
    
    public void GetandSetFiltros(horario  ho){
        diasmax.setValue(ho.getDiasmax());
        espmax.setValue(ho.getHuecomax());
        
        if (ho.getHoramaxm() > 12){
            if (!Hmax.isSelected()) Hmax.doClick(); 
            hormax.setValue(ho.getHoramaxm()-12);
        }else {
            if (Hmax.isSelected()) Hmax.doClick();

            hormax.setValue(ho.getHoramaxm());
        }
        
        
        if (ho.getHoraminm() > 12){
            if (!Hmin.isSelected()) Hmin.doClick();

            hormin.setValue(ho.getHoraminm()-12);
        }else{
            if (Hmin.isSelected()) Hmin.doClick();
            hormin.setValue(ho.getHoraminm());
        }
        
        boolean [] restin = ho.getDiasrestrin();
        System.out.println(diasmax.getValue() + " | " + espmax.getValue() + " | " + diasmax.getValue() + " | " + ho.getHoramaxm() + " : " + ho.getHoraminm() +" :::" +  restin[0] + " " + restin[1] + " " + restin[2]+ " " + restin[3] + " " + restin[4] + " " + restin[5]);
        
        if (restin[0] == Lun.isSelected()) { cambiarD(Lun); }
        if (restin[1] == Mar.isSelected()) { cambiarD(Mar); }
        if (restin[2] == Mie.isSelected()) { cambiarD(Mie); }
        if (restin[3] == Jue.isSelected()) { cambiarD(Jue); }
        if (restin[4] == Vie.isSelected()) { cambiarD(Vie); }
        if (restin[5] == Sab.isSelected()) { cambiarD(Sab); }
    }
    
    public void cambiarD(custom.MyButton butn){
        if (butn.isSelected()) {
            butn.setSelected(false);
            butn.setForeground(Color.white);
            butn.setColor(new Color(153,195,172));
            butn.revalidate();
            butn.repaint();
        } else{
            butn.setSelected(true);
            butn.setForeground(new Color(153,153,153));
            butn.setColor(Color.white);
            butn.revalidate();
            butn.repaint();
        }
    }
    
    
    
    public void cmbiarM(custom.MyButton boton){
        if (boton.getText().equals("AM")){
            boton.setSelected(true);
            boton.setText("PM");
            boton.setBackground(new Color(84,130,53));
            boton.setColor(new Color(84,130,53));
        } else{
            boton.setText("AM");
            boton.setSelected(false);
            boton.setBackground(new Color(112,173,71));
            boton.setColor(new Color(112,173,71));
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private custom.TextFieldd CODE;
    private javax.swing.JLabel Espacio1;
    private javax.swing.JLabel Espacio2;
    private javax.swing.JLabel Filt;
    private javax.swing.JPanel Gruposed;
    private custom.MyButton Hmax;
    private custom.MyButton Hmin;
    private javax.swing.JLabel Horamax;
    private javax.swing.JLabel Horamin;
    private javax.swing.JLabel Horas;
    private javax.swing.JLabel Horas1;
    private custom.MyButton Jue;
    private custom.MyButton Lun;
    private custom.MyButton Mar;
    private custom.MyButton Mie;
    private javax.swing.JPanel Ncursoenc;
    private javax.swing.JPanel Ncursoesc;
    private javax.swing.JPanel Ngrupenc;
    private javax.swing.JPanel Ngrupesc;
    private javax.swing.JPanel Nhorarios;
    private javax.swing.JPanel Nopcenc;
    private custom.MyButton Sab;
    private javax.swing.JPanel See;
    private custom.MyButton Vie;
    private javax.swing.JButton add;
    private javax.swing.JButton add2;
    private javax.swing.JButton add3;
    private javax.swing.JButton back;
    private javax.swing.JButton back2;
    private javax.swing.JButton back3;
    private javax.swing.JButton brush;
    private javax.swing.JButton brush2;
    private javax.swing.JPanel cursosed;
    private custom.MySpinner diasmax;
    private javax.swing.JPanel downthing;
    private javax.swing.JPanel edit;
    private custom.MySpinner espmax;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel filts;
    private javax.swing.JPanel header;
    private THpaneles.HorarioCard horarioCard5;
    private custom.MySpinner hormax;
    private custom.MySpinner hormin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton key;
    private javax.swing.JLabel labelcursos;
    private javax.swing.JLabel labelgrupos;
    private javax.swing.JLabel labelop;
    private javax.swing.JLabel min;
    private javax.swing.JLabel move;
    private javax.swing.JLabel name;
    private javax.swing.JPanel opcionsed;
    private javax.swing.JLabel schetxt;
    private javax.swing.JLabel schetxt1;
    private javax.swing.JTabbedPane switchven;
    private javax.swing.JButton toCustom;
    private javax.swing.JButton toEDIT;
    private javax.swing.JButton toGENER;
    private javax.swing.JPanel view;
    // End of variables declaration//GEN-END:variables
}
