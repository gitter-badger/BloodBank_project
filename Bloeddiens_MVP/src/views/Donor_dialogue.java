package views;
import models.Adresse;
import models.Donor;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Donor_dialogue extends javax.swing.JDialog {
byte motivation; 
    /**
     * Creates new form Donor_dialogue
     */
    public Donor_dialogue(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Donor");
    }

    private Donor_dialogue() {
        initComponents();
        this.setTitle("Donor");
      
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
        j_NOM = new javax.swing.JLabel();
        j_PRENOM = new javax.swing.JLabel();
        j_ADRESSE = new javax.swing.JLabel();
        j_MOTIVATION = new javax.swing.JLabel();
        j_QUANTITE = new javax.swing.JLabel();
        j_GROUPAGE = new javax.swing.JLabel();
        jLabelAge = new javax.swing.JLabel();
        j_NUM_DONER = new javax.swing.JLabel();
        jNameDon = new javax.swing.JTextField();
        jFirstNDon = new javax.swing.JTextField();
        jWilayaDon = new javax.swing.JTextField();
        jIdDon = new javax.swing.JTextField();
        jGroupageDon = new javax.swing.JTextField();
        jQuantiteDon = new javax.swing.JTextField();
        jNumTelDon = new javax.swing.JTextField();
        jRadioButton1_Motivation_oui = new javax.swing.JRadioButton();
        jButton1_Reset = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton_ok_Enregistrer = new javax.swing.JButton();
        jRadioButton_MOTIVATION_non = new javax.swing.JRadioButton();
        j_NUM_Télephone1 = new javax.swing.JLabel();
        jAgeDon = new javax.swing.JTextField();
        jDayraDon1 = new javax.swing.JTextField();
        jPoidsDon = new javax.swing.JTextField();
        jPoidsDonor = new javax.swing.JLabel();
        jLabelAge1 = new javax.swing.JLabel();
        jMailDon = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(670, 570));
        setModal(true);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        j_NOM.setText("First name");
        jPanel1.add(j_NOM);
        j_NOM.setBounds(30, 60, 100, 35);

        j_PRENOM.setText("Name");
        jPanel1.add(j_PRENOM);
        j_PRENOM.setBounds(30, 110, 100, 35);

        j_ADRESSE.setText("ADRESSE");
        jPanel1.add(j_ADRESSE);
        j_ADRESSE.setBounds(30, 370, 100, 35);

        j_MOTIVATION.setText("Motivated ?");
        jPanel1.add(j_MOTIVATION);
        j_MOTIVATION.setBounds(30, 200, 100, 35);

        j_QUANTITE.setText("Quantity");
        jPanel1.add(j_QUANTITE);
        j_QUANTITE.setBounds(30, 160, 100, 35);

        j_GROUPAGE.setText("Blood group");
        jPanel1.add(j_GROUPAGE);
        j_GROUPAGE.setBounds(30, 240, 100, 35);

        jLabelAge.setText("Age");
        jPanel1.add(jLabelAge);
        jLabelAge.setBounds(30, 320, 100, 35);

        j_NUM_DONER.setText("ID");
        jPanel1.add(j_NUM_DONER);
        j_NUM_DONER.setBounds(30, 20, 100, 35);

        jNameDon.setBackground(new java.awt.Color(204, 204, 255));
        jNameDon.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jNameDon.setText(" ");
        jNameDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNameDonActionPerformed(evt);
            }
        });
        jPanel1.add(jNameDon);
        jNameDon.setBounds(150, 70, 271, 35);

        jFirstNDon.setBackground(new java.awt.Color(204, 204, 255));
        jFirstNDon.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jFirstNDon.setText(" ");
        jPanel1.add(jFirstNDon);
        jFirstNDon.setBounds(150, 110, 271, 35);

        jWilayaDon.setBackground(new java.awt.Color(204, 204, 255));
        jWilayaDon.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jWilayaDon.setText(" ");
        jPanel1.add(jWilayaDon);
        jWilayaDon.setBounds(290, 370, 130, 35);

        jIdDon.setBackground(new java.awt.Color(204, 204, 255));
        jIdDon.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jIdDon.setText(" ");
        jIdDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIdDonActionPerformed(evt);
            }
        });
        jPanel1.add(jIdDon);
        jIdDon.setBounds(150, 20, 271, 35);

        jGroupageDon.setBackground(new java.awt.Color(204, 204, 255));
        jGroupageDon.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jGroupageDon.setText(" ");
        jGroupageDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGroupageDonActionPerformed(evt);
            }
        });
        jPanel1.add(jGroupageDon);
        jGroupageDon.setBounds(150, 240, 271, 35);

        jQuantiteDon.setBackground(new java.awt.Color(204, 204, 255));
        jQuantiteDon.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jQuantiteDon.setText(" ");
        jPanel1.add(jQuantiteDon);
        jQuantiteDon.setBounds(150, 160, 271, 35);

        jNumTelDon.setBackground(new java.awt.Color(204, 204, 255));
        jNumTelDon.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jNumTelDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumTelDonActionPerformed(evt);
            }
        });
        jPanel1.add(jNumTelDon);
        jNumTelDon.setBounds(150, 410, 270, 35);

        jRadioButton1_Motivation_oui.setText("Yes");
        jRadioButton1_Motivation_oui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_Motivation_ouiActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1_Motivation_oui);
        jRadioButton1_Motivation_oui.setBounds(150, 200, 90, 18);

        jButton1_Reset.setText("Reset");
        jButton1_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_ResetActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_Reset);
        jButton1_Reset.setBounds(315, 494, 88, 34);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(209, 494, 88, 34);

        jButton_ok_Enregistrer.setText("OK");
        jButton_ok_Enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ok_EnregistrerActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_ok_Enregistrer);
        jButton_ok_Enregistrer.setBounds(99, 494, 88, 34);

        jRadioButton_MOTIVATION_non.setText("No");
        jRadioButton_MOTIVATION_non.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_MOTIVATION_nonActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton_MOTIVATION_non);
        jRadioButton_MOTIVATION_non.setBounds(280, 200, 39, 18);

        j_NUM_Télephone1.setText("PHONE_NUMBER");
        jPanel1.add(j_NUM_Télephone1);
        j_NUM_Télephone1.setBounds(30, 410, 100, 35);

        jAgeDon.setBackground(new java.awt.Color(204, 204, 255));
        jAgeDon.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jAgeDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgeDonActionPerformed(evt);
            }
        });
        jPanel1.add(jAgeDon);
        jAgeDon.setBounds(150, 320, 271, 35);

        jDayraDon1.setBackground(new java.awt.Color(204, 204, 255));
        jDayraDon1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jDayraDon1.setText(" ");
        jPanel1.add(jDayraDon1);
        jDayraDon1.setBounds(150, 370, 120, 35);

        jPoidsDon.setBackground(new java.awt.Color(204, 204, 255));
        jPoidsDon.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPoidsDon.setText(" ");
        jPoidsDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPoidsDonActionPerformed(evt);
            }
        });
        jPanel1.add(jPoidsDon);
        jPoidsDon.setBounds(150, 280, 271, 35);

        jPoidsDonor.setText("Poids");
        jPanel1.add(jPoidsDonor);
        jPoidsDonor.setBounds(30, 280, 100, 35);

        jLabelAge1.setText("e-Mail");
        jPanel1.add(jLabelAge1);
        jLabelAge1.setBounds(30, 450, 100, 35);

        jMailDon.setBackground(new java.awt.Color(204, 204, 255));
        jMailDon.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jMailDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMailDonActionPerformed(evt);
            }
        });
        jPanel1.add(jMailDon);
        jMailDon.setBounds(150, 450, 271, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/img/mainWindowBackground.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 680, 570);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 670, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNameDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNameDonActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jNameDonActionPerformed
      
    private void jRadioButton1_Motivation_ouiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_Motivation_ouiActionPerformed
        // TODO add your handling code here:
        jRadioButton_MOTIVATION_non.setSelected(false);
        motivation=1;
    }//GEN-LAST:event_jRadioButton1_Motivation_ouiActionPerformed

    private void jButton1_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_ResetActionPerformed

        jNameDon.setText(null);
        jFirstNDon.setText(null);
        jQuantiteDon.setText(null);
        jWilayaDon.setText(null);
        jGroupageDon.setText(null);
        jIdDon.setText(null);
        jNumTelDon.setText(null);
        jRadioButton1_Motivation_oui.setSelected(false);
        jRadioButton_MOTIVATION_non.setSelected(false);
        jGroupageDon.setText(null);
        jAgeDon.setText(null);
        jWilayaDon.setText(null);
        jDayraDon1.setText(null);
        jNumTelDon.setText(null);
        jMailDon.setText(null);
        jPoidsDon.setText(null);
       
        // TODO add your handlin.scode here:
    }//GEN-LAST:event_jButton1_ResetActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton_ok_EnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ok_EnregistrerActionPerformed

        setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton_ok_EnregistrerActionPerformed

    private void jRadioButton_MOTIVATION_nonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_MOTIVATION_nonActionPerformed
        jRadioButton1_Motivation_oui.setSelected(false); 
        motivation = 0;
    }//GEN-LAST:event_jRadioButton_MOTIVATION_nonActionPerformed

    private void jNumTelDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumTelDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNumTelDonActionPerformed

    private void jGroupageDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGroupageDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGroupageDonActionPerformed

    private void jAgeDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgeDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAgeDonActionPerformed

    private void jIdDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIdDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIdDonActionPerformed

    private void jPoidsDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPoidsDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPoidsDonActionPerformed

    private void jMailDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMailDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMailDonActionPerformed

    public Donor getDonor (){
        
        int id;
           id = Integer.parseInt(jIdDon.getText().trim());
        Adresse adrDon=new Adresse(jDayraDon1.getText(),jWilayaDon.getText());
        int age = Integer.parseInt(jAgeDon.getText().trim());
        int quantite = Integer.parseInt(jQuantiteDon.getText().trim());
        double poids= Double.parseDouble(jPoidsDon.getText().trim());
        
      
    Donor donor = new Donor(
            id,
            jNameDon.getText(), // i can't wait netbeant hahahha
            jFirstNDon.getText(),
            age,
            jGroupageDon.getText(),
            adrDon,
            jNumTelDon.getText(),
            jMailDon.getText(),
            poids,
            quantite,
            motivation
    );
        
        
      
        return donor;
    }
   
    // creation d'un nouveau formulaire
    public static Donor ajouterDonor(){
        Donor_dialogue formulaireDon=new Donor_dialogue();
        formulaireDon.setVisible(true);
        Donor don;
        don = formulaireDon.getDonor();
        
               
        return don;
        
    }
    
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Donor_dialogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Donor_dialogue dialog = new Donor_dialogue(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAgeDon;
    private javax.swing.JButton jButton1_Reset;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_ok_Enregistrer;
    private javax.swing.JTextField jDayraDon1;
    private javax.swing.JTextField jFirstNDon;
    private javax.swing.JTextField jGroupageDon;
    private javax.swing.JTextField jIdDon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelAge1;
    private javax.swing.JTextField jMailDon;
    private javax.swing.JTextField jNameDon;
    private javax.swing.JTextField jNumTelDon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPoidsDon;
    private javax.swing.JLabel jPoidsDonor;
    private javax.swing.JTextField jQuantiteDon;
    private javax.swing.JRadioButton jRadioButton1_Motivation_oui;
    private javax.swing.JRadioButton jRadioButton_MOTIVATION_non;
    private javax.swing.JTextField jWilayaDon;
    private javax.swing.JLabel j_ADRESSE;
    private javax.swing.JLabel j_GROUPAGE;
    private javax.swing.JLabel j_MOTIVATION;
    private javax.swing.JLabel j_NOM;
    private javax.swing.JLabel j_NUM_DONER;
    private javax.swing.JLabel j_NUM_Télephone1;
    private javax.swing.JLabel j_PRENOM;
    private javax.swing.JLabel j_QUANTITE;
    // End of variables declaration//GEN-END:variables
}
