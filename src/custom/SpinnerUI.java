package custom;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicSpinnerUI;


public class SpinnerUI extends BasicSpinnerUI {

    @Override
    public void installUI(JComponent jc) {
        super.installUI(jc);
        editor = new Editor(spinner);
        spinner.setEditor(editor);
    }

    @Override
    protected Component createNextButton() {
        cmdn = new ArrowButton(true);
        cmdn.setBackground(Btncolor);
        cmdn.setForeground(BtnFcolor);
        installNextButtonListeners(cmdn);
        return cmdn;
    }

    @Override
    protected Component createPreviousButton() {
        cmdp = new ArrowButton(false);
        cmdp.setBackground(BGcolor);
        cmdp.setForeground(Fcolor);
        installPreviousButtonListeners(cmdp);
        return cmdp;
    }
    
    Editor editor;
    ArrowButton cmdn;
    ArrowButton cmdp;
    private Color BGcolor = new Color(255,255,255);
    private Color Fcolor =  new Color(255,255,0);
    private Color Btncolor = new Color(255,0,255);
    private Color BtnFcolor =  new Color(0,255,255);

    public Color getBGcolor() {
        return BGcolor;
    }

    public void setBGcolor(Color BGcolor) {
        this.BGcolor = BGcolor;
        if (editor != null) {
            editor.setBackground(BGcolor);
        }

    }

    public Color getFcolor() {
        return Fcolor;
    }

    public void setFcolor(Color Fcolor) {
        this.Fcolor = Fcolor;
        if (editor != null) {
            editor.setForeground(Fcolor);
            editor.repaint();
        }
        
    }

    public Color getBtncolor() {
        return Btncolor;
    }

    public void setBtncolor(Color Btncolor) {
        this.Btncolor = Btncolor;
        if (this.cmdn != null) {
            this.cmdn.setBackground(Btncolor);
            this.cmdp.setBackground(Btncolor);
            this.cmdn.repaint();
            this.cmdp.repaint();
        }
        
    }

    public Color getBtnFcolor() {
        return BtnFcolor;
    }

    public void setBtnFcolor(Color BtnFcolor) {
        this.BtnFcolor = BtnFcolor;
        if (this.cmdn != null) {
            this.cmdn.setForeground(BtnFcolor);
            this.cmdp.setForeground(BtnFcolor);
            this.cmdn.repaint();
            this.cmdp.repaint();
        }

    }
    
    
    
    public class Editor extends TextFieldd implements ChangeListener {

        public Editor(JSpinner spinner) {
            this.setRound(getHeight()/2);
            spinner.addChangeListener(this);
            this.setSize(80,60);
            setEditable(false);
            setText("1");
        }

        @Override
        public void stateChanged(ChangeEvent ce) {
            JSpinner spinner = (JSpinner) ce.getSource();
            setText(spinner.getValue().toString());
        }
        
        void setLabelText(String text) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        String getLabelText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
        
    }
    
    
    
    
    
    private class ArrowButton extends JButton {

        private final boolean next;

        public ArrowButton(boolean next) {
            this.next = next;
            setContentAreaFilled(false);
            setFocusable(false);
            setBorder(new EmptyBorder(5, 7, 5, 7));
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent me) {
                    setSelected(true);
                }

                @Override
                public void mouseReleased(MouseEvent me) {
                    setSelected(false);
                }
            });
        }
        
        
        
        @Override
        public void paint(Graphics grphcs) {
            setContentAreaFilled(false);
            super.paint(grphcs);
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fillRoundRect(0, 1, getWidth(), getHeight() - 2, 5, 5);
            if (next) {
                int width = getWidth();
                int height = getHeight();
                int size = 10;
                int x = (width - size) / 2;
                int y = (height - size) / 2;
                int px[] = {x + size / 2, x + size, x};
                int py[] = {y, y + size, y + size};
                if (isSelected()) {
                    //g2.setColor(new Color(181, 181, 181));
                } else {
                    g2.setColor(getForeground());
                }
                g2.fillPolygon(px, py, px.length);
            } else {
                int width = getWidth();
                int height = getHeight();
                int size = 10;
                int x = (width - size) / 2;
                int y = (height - size) / 2;
                int px[] = {x, x + size, x + size / 2};
                int py[] = {y, y, y + size};
                if (isSelected()) {
                    //g2.setColor(new Color(181, 181, 181));
                } else {
                    g2.setColor(getForeground());
                }
                g2.fillPolygon(px, py, px.length);
            }
            g2.dispose();
        }
    }
}