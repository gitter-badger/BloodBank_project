package views;


import java.awt.Desktop;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import models.Medecin;
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
public class BankWindow extends javax.swing.JFrame {
   static  ListeMedecins liste=new ListeMedecins();
    /**
     * Creates new form MedcinMainWindow
     */
    public BankWindow() {
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

        jMenu4 = new javax.swing.JMenu();
        jAjouterDoctor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jDbStateBank = new javax.swing.JRadioButton();
        jConsulterAvailableDon = new javax.swing.JButton();
        jSupprimerDoctor = new javax.swing.JButton();
        jStockBank = new javax.swing.JButton();
        jPendingDonors = new javax.swing.JButton();
        jAjouterMedecin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        adminBank = new javax.swing.JMenu();
        jLogoutMenu = new javax.swing.JMenuItem();
        jExitMenu = new javax.swing.JMenuItem();
        jMaintain = new javax.swing.JMenu();
        jDoctorMaintain = new javax.swing.JMenu();
        jAddDoctorMenu = new javax.swing.JMenuItem();
        jRemoveDoctorMenu = new javax.swing.JMenuItem();
        jCheckStock = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jHelp = new javax.swing.JMenuItem();
        jAbout = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        jAjouterDoctor.setText("New Doctor");
        jAjouterDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAjouterDoctorActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bloodbank Manager");

        jPanel1.setLayout(null);

        jDbStateBank.setText("Disconnected");
        jPanel1.add(jDbStateBank);
        jDbStateBank.setBounds(10, 460, 108, 18);

        jConsulterAvailableDon.setText("Check Donors");
        jConsulterAvailableDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsulterAvailableDonActionPerformed(evt);
            }
        });
        jPanel1.add(jConsulterAvailableDon);
        jConsulterAvailableDon.setBounds(30, 200, 230, 50);

        jSupprimerDoctor.setText("Remove Doctor");
        jSupprimerDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSupprimerDoctorActionPerformed(evt);
            }
        });
        jPanel1.add(jSupprimerDoctor);
        jSupprimerDoctor.setBounds(30, 380, 230, 50);

        jStockBank.setText("Check Stock");
        jStockBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStockBankActionPerformed(evt);
            }
        });
        jPanel1.add(jStockBank);
        jStockBank.setBounds(30, 80, 230, 50);

        jPendingDonors.setText("Pending Request/Patient");
        jPendingDonors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPendingDonorsActionPerformed(evt);
            }
        });
        jPanel1.add(jPendingDonors);
        jPendingDonors.setBounds(30, 140, 230, 50);

        jAjouterMedecin.setText("New Doctor");
        jAjouterMedecin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAjouterMedecinActionPerformed(evt);
            }
        });
        jPanel1.add(jAjouterMedecin);
        jAjouterMedecin.setBounds(30, 320, 230, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/img/mainWindowBackground.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 760, 510);

        adminBank.setText("Admin");

        jLogoutMenu.setText("Logout");
        jLogoutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutMenuActionPerformed(evt);
            }
        });
        adminBank.add(jLogoutMenu);

        jExitMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jExitMenu.setText("Exit");
        jExitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitMenuActionPerformed(evt);
            }
        });
        adminBank.add(jExitMenu);

        jMenuBar1.add(adminBank);

        jMaintain.setText("Manage");

        jDoctorMaintain.setText("Doctors");

        jAddDoctorMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        jAddDoctorMenu.setText("Add doctor");
        jDoctorMaintain.add(jAddDoctorMenu);

        jRemoveDoctorMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK));
        jRemoveDoctorMenu.setText("Remove doctor");
        jDoctorMaintain.add(jRemoveDoctorMenu);

        jMaintain.add(jDoctorMaintain);

        jCheckStock.setText("Stock");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem3.setText("Check stock");
        jCheckStock.add(jMenuItem3);

        jMaintain.add(jCheckStock);
        jMaintain.add(jSeparator1);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Pending requests");
        jMaintain.add(jMenuItem1);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Stats");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMaintain.add(jMenuItem5);

        jMenuBar1.add(jMaintain);

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

    private void jLogoutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutMenuActionPerformed
        // TODO add your handling code here:
                new Login();
        this.dispose();
    }//GEN-LAST:event_jLogoutMenuActionPerformed

    private void jAjouterDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAjouterDoctorActionPerformed
        // TODO add your handling code here:
      
      
        
    }//GEN-LAST:event_jAjouterDoctorActionPerformed

    private void jConsulterAvailableDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsulterAvailableDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConsulterAvailableDonActionPerformed

    private void jSupprimerDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSupprimerDoctorActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jSupprimerDoctorActionPerformed

    private void jStockBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStockBankActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jStockBankActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jPendingDonorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPendingDonorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPendingDonorsActionPerformed

    private void jAjouterMedecinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAjouterMedecinActionPerformed
        
        Medecin med= formulaireMedecin.ajouterMedecin();
        
         /*new  formulaireMedecin().setVisible(true);*/
      DefaultTableModel model1= (DefaultTableModel)liste.getListeMedecin().getModel();
       model1.addRow(
       new Object[]  {
           med.getId(),
           med.getName(),
           med.getFirstName(),
           med.getAdresse(),
           med.getMail(),
           med.getPhoneNumber(),
           med.getDateIntegration()
       });
      liste.setVisible(true);
    }//GEN-LAST:event_jAjouterMedecinActionPerformed

    private void jExitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitMenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jExitMenuActionPerformed

    private void jAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAboutActionPerformed
        // TODO add your handling code here:
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
                new BankWindow().setVisible(true);
            }
            
           
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu adminBank;
    private javax.swing.JMenuItem jAbout;
    private javax.swing.JMenuItem jAddDoctorMenu;
    private javax.swing.JButton jAjouterDoctor;
    private javax.swing.JButton jAjouterMedecin;
    private javax.swing.JMenu jCheckStock;
    private javax.swing.JButton jConsulterAvailableDon;
    private javax.swing.JRadioButton jDbStateBank;
    private javax.swing.JMenu jDoctorMaintain;
    private javax.swing.JMenuItem jExitMenu;
    private javax.swing.JMenuItem jHelp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jLogoutMenu;
    private javax.swing.JMenu jMaintain;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jPendingDonors;
    private javax.swing.JMenuItem jRemoveDoctorMenu;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton jStockBank;
    private javax.swing.JButton jSupprimerDoctor;
    // End of variables declaration//GEN-END:variables
// trt it here lol
}
