/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public admin() {
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

        managerdetail = new javax.swing.JButton();
        productdetail = new javax.swing.JButton();
        profitbills = new javax.swing.JButton();
        createadmin = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.black);
        setPreferredSize(new java.awt.Dimension(1920, 1020));
        getContentPane().setLayout(null);

        managerdetail.setBackground(new java.awt.Color(208, 252, 197));
        managerdetail.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        managerdetail.setText("Manager Detail");
        managerdetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerdetailActionPerformed(evt);
            }
        });
        getContentPane().add(managerdetail);
        managerdetail.setBounds(845, 252, 212, 50);

        productdetail.setBackground(new java.awt.Color(208, 252, 197));
        productdetail.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        productdetail.setText("Product Detail");
        productdetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productdetailActionPerformed(evt);
            }
        });
        getContentPane().add(productdetail);
        productdetail.setBounds(845, 346, 212, 50);

        profitbills.setBackground(new java.awt.Color(208, 252, 197));
        profitbills.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        profitbills.setText("Profit & Bills");
        profitbills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profitbillsActionPerformed(evt);
            }
        });
        getContentPane().add(profitbills);
        profitbills.setBounds(845, 438, 212, 50);

        createadmin.setBackground(new java.awt.Color(208, 252, 197));
        createadmin.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        createadmin.setText("Create Admin");
        createadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createadminActionPerformed(evt);
            }
        });
        getContentPane().add(createadmin);
        createadmin.setBounds(845, 161, 212, 50);

        jButton7.setBackground(new java.awt.Color(208, 252, 197));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton7.setText("Log out");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(1750, 910, 143, 55);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("       Admin Directory");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(690, 10, 450, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\New folder\\admin.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1920, 1050);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productdetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productdetailActionPerformed
        // TODO add your handling code here:
        new product_detail().setVisible(true);
        new admin().setVisible(false);
        dispose();
    }//GEN-LAST:event_productdetailActionPerformed

    private void managerdetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerdetailActionPerformed
        new managerdetail().setVisible(true);
        new admin().setVisible(false);
        dispose();
    }//GEN-LAST:event_managerdetailActionPerformed

    private void createadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createadminActionPerformed
        // TODO add your handling code here:
        new u3_signup_admin().setVisible(true);
        new admin().setVisible(false);
        dispose();
    }//GEN-LAST:event_createadminActionPerformed

    private void profitbillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profitbillsActionPerformed
        // TODO add your handling code here:
        new profit_admin().setVisible(true);
        new admin().setVisible(false);
        dispose();
    }//GEN-LAST:event_profitbillsActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new welcome().setVisible(true);
        new admin().setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createadmin;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton managerdetail;
    private javax.swing.JButton productdetail;
    private javax.swing.JButton profitbills;
    // End of variables declaration//GEN-END:variables
}
