
package custom;

import java.awt.Graphics;


public class MySpinner extends javax.swing.JPanel {
    
    private int MaxVal = 10;
    private int MinVal = 0;
    private int Value = 0;
    private int Step = 1;
    public MySpinner() {
        
        initComponents();
        modifyInitedComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inerpanel = new javax.swing.JPanel();
        editor = new custom.TextFieldd();
        left = new custom.MyButton();
        right = new custom.MyButton();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inerpanel.setOpaque(false);
        inerpanel.setPreferredSize(new java.awt.Dimension(80, 20));
        inerpanel.setLayout(null);

        editor.setBorder(null);
        editor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editor.setText("0");
        editor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        editor.setRound(13);
        inerpanel.add(editor);
        editor.setBounds(20, 0, 40, 20);

        left.setBorder(null);
        left.setForeground(new java.awt.Color(255, 255, 255));
        left.setText(">");
        left.setToolTipText("");
        left.setColor(new java.awt.Color(169, 209, 142));
        left.setFocusPainted(false);
        left.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        left.setRadius(10);
        left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftActionPerformed(evt);
            }
        });
        inerpanel.add(left);
        left.setBounds(60, 0, 20, 20);

        right.setBorder(null);
        right.setForeground(new java.awt.Color(255, 255, 255));
        right.setText("<");
        right.setColor(new java.awt.Color(169, 209, 142));
        right.setFocusPainted(false);
        right.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        right.setRadius(10);
        right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightActionPerformed(evt);
            }
        });
        inerpanel.add(right);
        right.setBounds(0, 0, 20, 20);

        add(inerpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightActionPerformed
        if (Value - Step <= MinVal) {
            Value = MinVal;
        } else{
            Value -= Step;
        }
        this.editor.setText(Value+"");
    }//GEN-LAST:event_rightActionPerformed

    private void leftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftActionPerformed
        if (Value + Step >= MaxVal) {
            Value = MaxVal;
        } else {
            Value += Step;
        }
        this.editor.setText(Value+"");
    }//GEN-LAST:event_leftActionPerformed

    
    private void modifyInitedComponents(){
        //tamaño minimo
        if (getHeight() < 20) setSize(getWidth(), 20);
        if (getWidth() < 80) setSize(80, getHeight());
        //Colocar el tamaño del panel y la posicion
        this.inerpanel.setBounds(0,0, getWidth(),getHeight());
        
        this.left.setBounds(getWidth()-20, 0,20,this.getHeight());
        
        this.right.setLocation(0,0);
        right.setSize(20,this.getHeight());
        
        
        this.editor.setBounds(right.getWidth(), 0,getWidth()-40, getHeight());
        
        
        inerpanel.revalidate();
        inerpanel.repaint();
        right.revalidate();
        left.revalidate();
        right.repaint();
        left.repaint();
        this.revalidate();
        this.repaint();
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private custom.TextFieldd editor;
    private javax.swing.JPanel inerpanel;
    private custom.MyButton left;
    private custom.MyButton right;
    // End of variables declaration//GEN-END:variables
}
