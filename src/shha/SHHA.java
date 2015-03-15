
package shha;

import javax.swing.*;

/**
 *
 * @author Sheldon Gray
 */


public class SHHA extends JFrame {

   
    public static void main(String[] args) {
        
        //Custom Look and Feel Style 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        //Run Program
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginGUI2().setVisible(true);
            }
        });
    
    }
    
}
