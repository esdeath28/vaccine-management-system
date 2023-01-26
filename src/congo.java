
import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class congo extends javax.swing.JFrame {

        //mouse drag
    int mouseX;
    int mouseY;
    // screen pos
    int wid = (Toolkit.getDefaultToolkit().getScreenSize().width)/2-350;
    int hit = (Toolkit.getDefaultToolkit().getScreenSize().height)/2-300;
    
    public congo(int x, int y) {
        initComponents();
        // position
        this.setLocation(x,y);
        
        //icon image
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }
    
    public congo() {
        initComponents();
        // position
        this.setLocation(wid,hit);
        
        //icon image
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quit_ = new javax.swing.JLabel();
        drag_ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quit_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/x30w.png"))); // NOI18N
        quit_.setToolTipText("Exit");
        quit_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quit_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quit_MouseClicked(evt);
            }
        });
        getContentPane().add(quit_, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 20, 30, 30));

        drag_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/success.png"))); // NOI18N
        drag_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                drag_MouseDragged(evt);
            }
        });
        drag_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drag_MousePressed(evt);
            }
        });
        getContentPane().add(drag_, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 642, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quit_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quit_MouseClicked
        // TODO add your handling code here:
        this.dispose();
        accessibility ac = new accessibility();
        ac.setVisible(true);
    }//GEN-LAST:event_quit_MouseClicked

    private void drag_MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drag_MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-mouseX, y-mouseY);
    }//GEN-LAST:event_drag_MouseDragged

    private void drag_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drag_MousePressed
        // TODO add your handling code here:
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_drag_MousePressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(congo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(congo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(congo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(congo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new congo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel drag_;
    private javax.swing.JLabel quit_;
    // End of variables declaration//GEN-END:variables
}
