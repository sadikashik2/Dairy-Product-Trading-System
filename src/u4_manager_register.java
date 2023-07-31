
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class u4_manager_register extends javax.swing.JFrame {

    /**
     * Creates new form u4_manager_register
     */
    public u4_manager_register() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        usertxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        agetxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        phonetxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        passtxt = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1020));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("    Manager Registration");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(720, 0, 530, 70);

        back.setBackground(new java.awt.Color(208, 252, 197));
        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(0, 0, 90, 31);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(600, 160, 130, 30);

        nametxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        getContentPane().add(nametxt);
        nametxt.setBounds(760, 150, 480, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("User Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(600, 230, 130, 30);

        usertxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertxtActionPerformed(evt);
            }
        });
        getContentPane().add(usertxt);
        usertxt.setBounds(760, 220, 480, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Gender");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(600, 280, 130, 30);

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        getContentPane().add(male);
        male.setBounds(760, 280, 100, 33);

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        getContentPane().add(female);
        female.setBounds(960, 280, 101, 33);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Age");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(600, 340, 130, 30);

        agetxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(agetxt);
        agetxt.setBounds(760, 340, 480, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("Phone Number");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(600, 410, 160, 30);

        phonetxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(phonetxt);
        phonetxt.setBounds(760, 400, 480, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("Password");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(600, 470, 130, 30);

        passtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(passtxt);
        passtxt.setBounds(760, 470, 480, 40);

        jButton2.setBackground(new java.awt.Color(208, 252, 197));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(810, 650, 152, 47);

        cancel.setBackground(new java.awt.Color(208, 252, 197));
        cancel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        cancel.setText("Reset");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(1040, 650, 146, 47);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(760, 520, 144, 29);

        jButton1.setBackground(new java.awt.Color(208, 252, 197));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1770, 910, 120, 50);

        jLabel9.setText("(Minimum 6 Character)");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(600, 500, 133, 16);

        jLabel10.setIcon(new javax.swing.ImageIcon("E:\\New folder\\admin ragistration.png")); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 1920, 1050);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new managerdetail().setVisible(true);
        new u4_manager_register().setVisible(false);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            String driverclass = "com.mysql.jdbc.Driver";
            Class.forName(driverclass);
            String url = "jdbc:mysql://localhost:3306/dairyfarm";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);

            String sql = "insert into managerlist(Name,UserName,Gender,Age,PhoneNumber,Password) values(?,?,?,?,?,?)";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            String name, username, gender, age, phone, password;
            name = nametxt.getText();
            username = usertxt.getText();
            if (male.isSelected()) {
                gender = male.getText();
            } else {
                gender = female.getText();
            }
            age = agetxt.getText();
            phone = phonetxt.getText();
            password = passtxt.getText();

            if (name.isEmpty() || username.isEmpty() || gender.isEmpty() || age.isEmpty() || phone.isEmpty() || password.isEmpty() || !name.matches("(?!^[. ])[a-zA-Z. ]+") || !username.matches("[^ ].*") || !age.matches("\\d+") || !phone.matches("\\d+") || password.length() < 6) {
                JOptionPane.showMessageDialog(null, "Please fill out every field according to the requirements");
            } else {
                ps.setString(1, name);
                ps.setString(2, username);
                ps.setString(3, gender);
                ps.setString(4, age);
                ps.setString(5, phone);
                ps.setString(6, password);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Successfully Registered.");
                new admin().setVisible(true);
                new u4_manager_register().setVisible(false);
                dispose();
            }

        } catch (Exception ex) {
            Logger.getLogger(u4_manager_register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        nametxt.setText("");
        usertxt.setText("");
        agetxt.setText("");
        phonetxt.setText("");
        passtxt.setText("");
        buttonGroup1.clearSelection();
        jCheckBox1.setSelected(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected())
        {
            passtxt.setEchoChar((char)0);
        }
        else
        {
           passtxt.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new welcome().setVisible(true);
        new u4_manager_register().setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void usertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertxtActionPerformed

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
            java.util.logging.Logger.getLogger(u4_manager_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(u4_manager_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(u4_manager_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(u4_manager_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new u4_manager_register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agetxt;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField nametxt;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JTextField phonetxt;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}