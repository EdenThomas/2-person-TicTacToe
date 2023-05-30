import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.Color;

public class TicTacToe extends javax.swing.JFrame {
    
    public TicTacToe() {
        initComponents();
    }
    
    private String currentSymbol ="X";
    
    private void select_X_O()
    {
        if(currentSymbol.equals("X"))
        {
            currentSymbol="O";
        }
        else
        {
            currentSymbol="X";
        }
    }
    
    
    private void gameLogic()
    {
        String box1 = b1.getText();
        String box2 = b2.getText();
        String box3 = b3.getText();
        String box4 = b4.getText();
        String box5 = b5.getText();
        String box6 = b6.getText();
        String box7 = b7.getText();
        String box8 = b8.getText();
        String box9 = b9.getText();
        
        if(box1 == "X" && box2 == "X" && box3 == "X")
        {
            JOptionPane.showMessageDialog(this,"X is the winner!","Game Over",JOptionPane.INFORMATION_MESSAGE);
            b1.setBackground(Color.RED);
            b2.setBackground(Color.RED);
            b3.setBackground(Color.RED);
        }
        
        if(box4 == "X" && box5 == "X" && box6 == "X")
        {
            JOptionPane.showMessageDialog(this,"X is the winner!","Game Over",JOptionPane.INFORMATION_MESSAGE);
            b4.setBackground(Color.RED);
            b5.setBackground(Color.RED);
            b6.setBackground(Color.RED);
        }
        
        if(box7=="X" && box8 == "X" && box9=="X")
        {
            JOptionPane.showMessageDialog(this,"X is the winner!","Game Over",JOptionPane.INFORMATION_MESSAGE);
            b7.setBackground(Color.RED);
            b8.setBackground(Color.RED);
            b9.setBackground(Color.RED);
        }
        
        if(box1 == "X" && box4 == "X" && box7 == "X")
        {
            JOptionPane.showMessageDialog(this,"X is the winner!","Game Over",JOptionPane.INFORMATION_MESSAGE);
            b1.setBackground(Color.RED);
            b4.setBackground(Color.RED);
            b7.setBackground(Color.RED);
        }
        
        if(box2 == "X" && box5 == "X" && box8 == "X")
        {
            JOptionPane.showMessageDialog(this,"X is the winner!","Game Over",JOptionPane.INFORMATION_MESSAGE);
            b2.setBackground(Color.RED);
            b5.setBackground(Color.RED);
            b8.setBackground(Color.RED);
        }
        
        if(box3 == "X" && box6 == "X" && box9 == "X")
        {
            JOptionPane.showMessageDialog(this,"X is the winner!","Game Over",JOptionPane.INFORMATION_MESSAGE);
            b3.setBackground(Color.RED);
            b6.setBackground(Color.RED);
            b9.setBackground(Color.RED);
        }
        
        if(box1 == "X" && box5 == "X" && box9 == "X")
        {
            JOptionPane.showMessageDialog(this,"X is the winner!","Game Over",JOptionPane.INFORMATION_MESSAGE);
            b1.setBackground(Color.RED);
            b5.setBackground(Color.RED);
            b9.setBackground(Color.RED);
        }
        
        if(box3 == "X" && box5 == "X" && box7 == "X")
        {
            JOptionPane.showMessageDialog(this,"X is the winner!","Game Over",JOptionPane.INFORMATION_MESSAGE);
            b3.setBackground(Color.RED);
            b5.setBackground(Color.RED);
            b7.setBackground(Color.RED);
        }
        
        if(box1 == "O" && box2 == "O" && box3 == "O")
        {
            JOptionPane.showMessageDialog(this,"O is the winner!","Game Over",JOptionPane.INFORMATION_MESSAGE);
            b1.setBackground(Color.RED);
            b2.setBackground(Color.RED);
            b3.setBackground(Color.RED);
        }
        
        if(box4 == "O" && box5 == "O" && box6 == "O")
        {
            JOptionPane.showMessageDialog(this,"O is the winner!","Game Over",JOptionPane.INFORMATION_MESSAGE);
            b4.setBackground(Color.RED);
            b5.setBackground(Color.RED);
            b6.setBackground(Color.RED);
        }
        
        if(box7 == "O" && box8 == "O" && box9 == "O")
        {
            JOptionPane.showMessageDialog(this,"O is the winner!","Game Over",JOptionPane.INFORMATION_MESSAGE);
            b7.setBackground(Color.RED);
            b8.setBackground(Color.RED);
            b9.setBackground(Color.RED);
        }
        
        if(box1 == "O" && box4 == "O" && box7 == "O")
        {
            JOptionPane.showMessageDialog(this,"O is the winner!","Game Over",JOptionPane.INFORMATION_MESSAGE);
            b1.setBackground(Color.RED);
            b4.setBackground(Color.RED);
            b7.setBackground(Color.RED);
        }
        
        if(box2 == "O" && box5 == "O" && box8 == "O")
        {
            JOptionPane.showMessageDialog(this,"O is the winner!","Game Over",JOptionPane.INFORMATION_MESSAGE);
            b2.setBackground(Color.RED);
            b5.setBackground(Color.RED);
            b8.setBackground(Color.RED);
        }
        
        if(box3 == "O" && box6 == "O" && box9 == "O")
        {
            JOptionPane.showMessageDialog(this,"O is the winner!","Game Over",JOptionPane.INFORMATION_MESSAGE);
            b3.setBackground(Color.RED);
            b6.setBackground(Color.RED);
            b9.setBackground(Color.RED);
        }
        
        if(box1 == "O" && box5 == "O" && box9 == "O")
        {
            JOptionPane.showMessageDialog(this,"O is the winner!","Game Over",JOptionPane.INFORMATION_MESSAGE);
            b1.setBackground(Color.RED);
            b5.setBackground(Color.RED);
            b9.setBackground(Color.RED);
        }
        
        if(box3 == "O" && box5 == "O" && box7 == "O")
        {
            JOptionPane.showMessageDialog(this,"O is the winner!","Game Over",JOptionPane.INFORMATION_MESSAGE);
            b3.setBackground(Color.RED);
            b5.setBackground(Color.RED);
            b7.setBackground(Color.RED);
        }
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        restart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(230, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(250, 270));

        jPanel1.setLayout(null);

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(30, 40, 40, 40);

        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2);
        b2.setBounds(90, 40, 40, 40);

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3);
        b3.setBounds(150, 40, 40, 40);

        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4);
        b4.setBounds(30, 90, 40, 40);

        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5);
        b5.setBounds(90, 90, 40, 40);

        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6);
        b6.setBounds(150, 90, 40, 40);

        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel1.add(b7);
        b7.setBounds(30, 140, 40, 40);

        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8);
        b8.setBounds(90, 140, 40, 40);

        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel1.add(b9);
        b9.setBounds(150, 140, 40, 40);

        restart.setText("Restart");
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });
        jPanel1.add(restart);
        restart.setBounds(80, 220, 72, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 230, 270);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
    b1.setText(currentSymbol);
    
    if(currentSymbol.equals("X"))
    {
        b1.setText("X");
    }
    else
    {
        b1.setText("O");
    }
    
    select_X_O();
    gameLogic();
    
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
    b2.setText(currentSymbol);
    
    if(currentSymbol.equals("X"))
    {
        b2.setText("X");
    }
    else
    {
        b2.setText("O");
    }
    
    select_X_O();
    gameLogic();
    
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
    b3.setText(currentSymbol);
    
    if(currentSymbol.equals("X"))
    {
        b3.setText("X");
    }
    else
    {
        b3.setText("O");
    }
    
    select_X_O();
    gameLogic();
    
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
    b4.setText(currentSymbol);
        
    if(currentSymbol.equals("X"))
    {
        b4.setText("X");
    }
    else
    {
        b4.setText("O");
    }
    
    select_X_O();
    gameLogic();
    
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
    b5.setText(currentSymbol);
        
    if(currentSymbol.equals("X"))
    {
        b5.setText("X");
    }
    else
    {     
        b5.setText("O");
    }
    
    select_X_O();
    gameLogic();
    
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
    b6.setText(currentSymbol);
        
    if(currentSymbol.equals("X"))
    {
        b6.setText("X");
    }
    else
    {
        b6.setText("O");
    }
    
    select_X_O();
    gameLogic();
    
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
    b7.setText(currentSymbol);
        
    if(currentSymbol.equals("X"))
    {
        b7.setText("X");
    }
    else
    {
        b7.setText("O");
    }
    
    select_X_O();
    gameLogic();
    
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
    b8.setText(currentSymbol);
    
    if(currentSymbol.equals("X"))
    {
        b8.setText("X");
    }
    else
    {
        b8.setText("O");
    }
    
    select_X_O();
    gameLogic();
    
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
    b9.setText(currentSymbol);
        
    if(currentSymbol.equals("X"))
    {
        b9.setText("X");
    }
    else
    {
        b9.setText("O");
    }
    
    select_X_O();
    gameLogic();
    
    }//GEN-LAST:event_b9ActionPerformed

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
    b1.setText(null);
    b2.setText(null);
    b3.setText(null);
    b4.setText(null);
    b5.setText(null);
    b6.setText(null);
    b7.setText(null);
    b8.setText(null);
    b9.setText(null);
    
    Color backgroundColor = new Color(255, 255, 255);
    
    b1.setBackground(backgroundColor);
    b2.setBackground(backgroundColor);
    b3.setBackground(backgroundColor);
    b4.setBackground(backgroundColor);
    b5.setBackground(backgroundColor);
    b6.setBackground(backgroundColor);
    b7.setBackground(backgroundColor);
    b8.setBackground(backgroundColor);
    b9.setBackground(backgroundColor);
    }//GEN-LAST:event_restartActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton restart;
    // End of variables declaration//GEN-END:variables
}
