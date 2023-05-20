/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package THVentanas;

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
    
    
    public VentanaPrincipal() {
        
        initComponents();
        
        GlassPanePopup.install(this);
        
        
        grupos.ReadGrupos();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/THimages/icon.png")));
        setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),18,18));
        setLocationRelativeTo(null);
        
        
        this.GroupCards();
        
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
        cursosed = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        labelcursos = new javax.swing.JLabel();
        add2 = new javax.swing.JButton();
        brush = new javax.swing.JButton();
        opcionsed = new javax.swing.JPanel();
        brush2 = new javax.swing.JButton();
        key = new javax.swing.JButton();
        labelop = new javax.swing.JLabel();
        back2 = new javax.swing.JButton();
        add3 = new javax.swing.JButton();
        CODE = new custom.TextFieldd();
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
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        Jue = new custom.MyButton();
        bttsalida = new custom.MyButton();
        Horamin = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        Espacio1 = new javax.swing.JLabel();
        Espacio2 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        Horas1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bttentrada3 = new custom.MyButton();
        Vie = new custom.MyButton();
        Lun = new custom.MyButton();
        Sab = new custom.MyButton();
        Mar1 = new custom.MyButton();
        Mie2 = new custom.MyButton();
        view = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add.setFocusPainted(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        Gruposed.add(add);
        add.setBounds(288, 24, 20, 20);

        edit.add(Gruposed);
        Gruposed.setBounds(0, 0, 340, 690);

        cursosed.setBackground(new java.awt.Color(209, 243, 222));
        cursosed.setFocusable(false);
        cursosed.setLayout(null);

        back.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        back.setForeground(new java.awt.Color(127, 127, 127));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/editfuntions/backGray20.png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        add2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        brush.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        brush.setFocusPainted(false);
        brush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brushActionPerformed(evt);
            }
        });
        cursosed.add(brush);
        brush.setBounds(220, 14, 20, 20);

        edit.add(cursosed);
        cursosed.setBounds(340, 10, 300, 680);

        opcionsed.setBackground(new java.awt.Color(237, 253, 246));
        opcionsed.setFocusable(false);
        opcionsed.setLayout(null);

        brush2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        brush2.setForeground(new java.awt.Color(127, 127, 127));
        brush2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/THimages/editfuntions/clearGray20.png"))); // NOI18N
        brush2.setContentAreaFilled(false);
        brush2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        back2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        add3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        CODE.setRound(20);
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
        schetxt.setBounds(70, 290, 120, 30);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
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
        schetxt1.setForeground(new java.awt.Color(102, 102, 102));
        schetxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        schetxt1.setText("319");
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
        back3.setBounds(40, 290, 26, 27);

        Horas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Horas.setForeground(new java.awt.Color(102, 102, 102));
        Horas.setText("Dias");
        filts.add(Horas);
        Horas.setBounds(190, 520, 50, 19);

        Horamax.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Horamax.setForeground(new java.awt.Color(102, 102, 102));
        Horamax.setText("Hora Máx.");
        filts.add(Horamax);
        Horamax.setBounds(20, 360, 80, 19);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 6, 1));
        filts.add(jSpinner1);
        jSpinner1.setBounds(100, 520, 70, 20);

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        filts.add(jSpinner2);
        jSpinner2.setBounds(100, 360, 70, 20);

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
        Jue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JueActionPerformed(evt);
            }
        });
        filts.add(Jue);
        Jue.setBounds(30, 630, 60, 20);

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
        bttsalida.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        bttsalida.setRadius(20);
        bttsalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttsalidaActionPerformed(evt);
            }
        });
        filts.add(bttsalida);
        bttsalida.setBounds(200, 390, 40, 17);

        Horamin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Horamin.setForeground(new java.awt.Color(102, 102, 102));
        Horamin.setText("Hora Min.");
        filts.add(Horamin);
        Horamin.setBounds(20, 390, 80, 19);

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        filts.add(jSpinner3);
        jSpinner3.setBounds(100, 390, 70, 20);

        Espacio1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Espacio1.setForeground(new java.awt.Color(102, 102, 102));
        Espacio1.setText("Dias Máx.");
        filts.add(Espacio1);
        Espacio1.setBounds(10, 520, 80, 19);

        Espacio2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Espacio2.setForeground(new java.awt.Color(102, 102, 102));
        Espacio2.setText("Espa. Máx.");
        filts.add(Espacio2);
        Espacio2.setBounds(10, 470, 80, 19);

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        filts.add(jSpinner4);
        jSpinner4.setBounds(100, 470, 70, 20);

        Horas1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Horas1.setForeground(new java.awt.Color(102, 102, 102));
        Horas1.setText("Horas");
        filts.add(Horas1);
        Horas1.setBounds(190, 470, 50, 19);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(127, 127, 127));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Horario recomendado");
        filts.add(jLabel6);
        jLabel6.setBounds(50, 250, 160, 17);

        bttentrada3.setBackground(new java.awt.Color(112, 173, 71));
        bttentrada3.setBorder(null);
        bttentrada3.setForeground(new java.awt.Color(255, 255, 255));
        bttentrada3.setText("AM");
        bttentrada3.setBorderColor(new java.awt.Color(112, 173, 71));
        bttentrada3.setBorderPainted(false);
        bttentrada3.setColor(new java.awt.Color(112, 173, 71));
        bttentrada3.setColorClick(new java.awt.Color(112, 173, 71));
        bttentrada3.setColorOver(new java.awt.Color(112, 173, 71));
        bttentrada3.setFocusPainted(false);
        bttentrada3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        bttentrada3.setRadius(20);
        bttentrada3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttentrada3ActionPerformed(evt);
            }
        });
        filts.add(bttentrada3);
        bttentrada3.setBounds(200, 360, 40, 17);

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
        Lun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LunActionPerformed(evt);
            }
        });
        filts.add(Lun);
        Lun.setBounds(30, 590, 60, 20);

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
        Sab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SabActionPerformed(evt);
            }
        });
        filts.add(Sab);
        Sab.setBounds(170, 630, 60, 20);

        Mar1.setBackground(new java.awt.Color(153, 195, 172));
        Mar1.setBorder(null);
        Mar1.setForeground(new java.awt.Color(255, 255, 255));
        Mar1.setText("Mar");
        Mar1.setBorderColor(new java.awt.Color(153, 195, 172));
        Mar1.setBorderPainted(false);
        Mar1.setColor(new java.awt.Color(153, 195, 172));
        Mar1.setColorClick(new java.awt.Color(153, 195, 172));
        Mar1.setColorOver(new java.awt.Color(153, 195, 172));
        Mar1.setFocusPainted(false);
        Mar1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Mar1.setRadius(20);
        Mar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mar1ActionPerformed(evt);
            }
        });
        filts.add(Mar1);
        Mar1.setBounds(100, 590, 60, 20);

        Mie2.setBorder(null);
        Mie2.setForeground(new java.awt.Color(153, 153, 153));
        Mie2.setText("Mié");
        Mie2.setBorderColor(new java.awt.Color(255, 255, 255));
        Mie2.setBorderPainted(false);
        Mie2.setColorClick(new java.awt.Color(255, 255, 255));
        Mie2.setColorOver(new java.awt.Color(255, 255, 255));
        Mie2.setFocusPainted(false);
        Mie2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        Mie2.setRadius(20);
        Mie2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mie2ActionPerformed(evt);
            }
        });
        filts.add(Mie2);
        Mie2.setBounds(170, 590, 60, 20);

        See.add(filts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 680));

        view.setBackground(new java.awt.Color(237, 253, 246));
        view.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(90, 90, 90));
        jLabel4.setText("Posibles Horarios");
        view.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 35, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(127, 127, 127));
        jLabel5.setText("Horarios generados y sus características ");
        view.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        See.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 920, 670));

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
        
        System.out.println("CARDS: " + cursosed.getComponentCount());
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
        
        for (int i = 0; i < cursoChosen.ndias; i++) {
            CrearOpc nuevo = new CrearOpc();
            nuevo.variable = this.cursoChosen.getListaopc();
            nuevo.setSize(400, 300);

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
    }//GEN-LAST:event_brush2ActionPerformed

    private void brushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brushActionPerformed
        this.groupChosen.getHor().limpiarcurs();
        this.UpdateCursoCards();
        this.UpdateGroupCards();
        this.UpdateOpcionCards();
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
        nuevo.setSize(400, 300);

        GlassPanePopup.showPopup(nuevo);
        
        nuevo.repaint();
        repaint();

    }//GEN-LAST:event_addActionPerformed

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
        // TODO add your handling code here:
    }//GEN-LAST:event_toCustomActionPerformed

    private void back3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_back3ActionPerformed

    private void JueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JueActionPerformed
          cambiarD(Jue);

    }//GEN-LAST:event_JueActionPerformed

    private void bttsalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttsalidaActionPerformed
        cmbiarM(this.bttsalida);
    }//GEN-LAST:event_bttsalidaActionPerformed

    private void bttentrada3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttentrada3ActionPerformed
      cmbiarM(this.bttentrada3);
    }//GEN-LAST:event_bttentrada3ActionPerformed

    private void VieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VieActionPerformed
        cambiarD(Vie);       
    }//GEN-LAST:event_VieActionPerformed

    private void LunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LunActionPerformed

        cambiarD(Lun);
    }//GEN-LAST:event_LunActionPerformed

    private void SabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SabActionPerformed
        cambiarD(Sab);
    }//GEN-LAST:event_SabActionPerformed

    private void Mar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mar1ActionPerformed
       cambiarD(Mar1);
    }//GEN-LAST:event_Mar1ActionPerformed

    private void Mie2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mie2ActionPerformed
       cambiarD(Mie2);
    }//GEN-LAST:event_Mie2ActionPerformed
    
    public void cambiarD(custom.MyButton butn){
        if (butn.isSelected()) {
            butn.setForeground(Color.white);
            butn.setColor(new Color(153,195,172));
            butn.revalidate();
            butn.repaint();
        } else{
            butn.setForeground(new Color(153,153,153));
            butn.setColor(Color.white);
            butn.revalidate();
            butn.repaint();
        }
    }
    
    
    public void cmbiarM(custom.MyButton boton){
        if (boton.getText().equals("AM")){
            boton.setText("PM");
            boton.setBackground(new Color(84,130,53));
            boton.setColor(new Color(84,130,53));
        } else{
            boton.setText("AM");
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
    private javax.swing.JPanel Gruposed;
    private javax.swing.JLabel Horamax;
    private javax.swing.JLabel Horamin;
    private javax.swing.JLabel Horas;
    private javax.swing.JLabel Horas1;
    private custom.MyButton Jue;
    private custom.MyButton Lun;
    private custom.MyButton Mar1;
    private custom.MyButton Mie2;
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
    private custom.MyButton bttentrada3;
    private custom.MyButton bttsalida;
    private javax.swing.JPanel cursosed;
    private javax.swing.JPanel downthing;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel filts;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
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
