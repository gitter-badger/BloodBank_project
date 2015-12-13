package views;


import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import views.MedcinMainWindow;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fcmam5
 */
public class LabMainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MedcinMainWindow
     */
    public LabMainWindow() {
        initComponents();
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
        jDbState = new javax.swing.JRadioButton();
        jAnalyser = new javax.swing.JButton();
        jContacterDoneur = new javax.swing.JButton();
        jConsulterDonor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jLogoutMenu = new javax.swing.JMenuItem();
        jExitMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jHelp = new javax.swing.JMenuItem();
        jAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Laboratory");

        jPanel1.setLayout(null);

        jDbState.setText("Disconnected");
        jPanel1.add(jDbState);
        jDbState.setBounds(10, 460, 108, 18);

        jAnalyser.setText("Analyse");
        jAnalyser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnalyserActionPerformed(evt);
            }
        });
        jPanel1.add(jAnalyser);
        jAnalyser.setBounds(40, 200, 230, 50);

        jContacterDoneur.setText("Contact donors");
        jContacterDoneur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jContacterDoneurActionPerformed(evt);
            }
        });
        jPanel1.add(jContacterDoneur);
        jContacterDoneur.setBounds(40, 320, 230, 50);

        jConsulterDonor.setText("Check pending donors");
        jConsulterDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsulterDonorActionPerformed(evt);
            }
        });
        jPanel1.add(jConsulterDonor);
        jConsulterDonor.setBounds(40, 260, 230, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/img/mainWindowBackground.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 760, 510);

        jMenu1.setText("User");

        jLogoutMenu.setText("Logout");
        jLogoutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutMenuActionPerformed(evt);
            }
        });
        jMenu1.add(jLogoutMenu);

        jExitMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jExitMenu.setText("Exit");
        jExitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitMenuActionPerformed(evt);
            }
        });
        jMenu1.add(jExitMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Maintain");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("New Donor");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem5.setText("Check donors");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        jHelp.setText("Help");
        jMenu3.add(jHelp);

        jAbout.setText("About");
        jAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAboutActionPerformed(evt);
            }
        });
        jMenu3.add(jAbout);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jLogoutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutMenuActionPerformed
        // TODO add your handling code here:
        new Login();
        this.dispose();

    }//GEN-LAST:event_jLogoutMenuActionPerformed

    private void jAnalyserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnalyserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAnalyserActionPerformed

    private void jContacterDoneurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jContacterDoneurActionPerformed
        try {
            // TODO add your handling code here:
            
            
            java.awt.Desktop.getDesktop().mail(URI.create("dz@dz.dz"));
        } catch (IOException ex) {
            Logger.getLogger(LabMainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jContacterDoneurActionPerformed

    private void jConsulterDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsulterDonorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConsulterDonorActionPerformed

    private void jExitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitMenuActionPerformed
        // TODO add your handling code here:
                this.dispose();

    }//GEN-LAST:event_jExitMenuActionPerformed

    private void jAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAboutActionPerformed
        
            
        try {
            Desktop.getDesktop().browse(java.net.URI.create("http://fcmam5.github.io/BloodBank_project/"));
        } catch (IOException ex) {
            Logger.getLogger(LabMainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }




    }//GEN-LAST:event_jAboutActionPerformed

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
            java.util.logging.Logger.getLogger(MedcinMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedcinMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedcinMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedcinMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedcinMainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAbout;
    private javax.swing.JButton jAnalyser;
    private javax.swing.JButton jConsulterDonor;
    private javax.swing.JButton jContacterDoneur;
    private javax.swing.JRadioButton jDbState;
    private javax.swing.JMenuItem jExitMenu;
    private javax.swing.JMenuItem jHelp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jLogoutMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
