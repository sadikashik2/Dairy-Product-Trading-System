import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class managerdetail extends javax.swing.JFrame {

    /**
     * Creates new form managerdetail
     */
    public managerdetail() {
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

        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jmid = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        registermanager = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1020));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("  Manager Detail");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(720, 13, 360, 70);

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

        jTable1.setBackground(new java.awt.Color(255, 255, 216));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FullName", "UserName", "Gender", "Age", "PhoneNumber", "Password"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(488, 159, 1320, 490);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Manager ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 220, 122, 33);

        jmid.setBackground(new java.awt.Color(204, 204, 204));
        jmid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jmid);
        jmid.setBounds(160, 220, 200, 35);

        jButton2.setBackground(new java.awt.Color(208, 252, 197));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setText("Delete Manager");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 350, 210, 45);

        jButton3.setBackground(new java.awt.Color(208, 252, 197));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton3.setText("Search Manager");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(150, 290, 210, 45);

        jButton4.setBackground(new java.awt.Color(208, 252, 197));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton4.setText("Show Manager List");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1020, 700, 243, 50);

        registermanager.setBackground(new java.awt.Color(208, 252, 197));
        registermanager.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        registermanager.setText("Register Manager");
        registermanager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registermanagerActionPerformed(evt);
            }
        });
        getContentPane().add(registermanager);
        registermanager.setBounds(20, 610, 213, 50);

        jButton1.setBackground(new java.awt.Color(208, 252, 197));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1780, 910, 111, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\New folder\\detailss.png")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -30, 2190, 1320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registermanagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registermanagerActionPerformed

        new u4_manager_register().setVisible(true);
        new managerdetail().setVisible(false);
        dispose();
    }//GEN-LAST:event_registermanagerActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new admin().setVisible(true);
        new managerdetail().setVisible(false);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            String driverclass = "com.mysql.jdbc.Driver";
            Class.forName(driverclass);
            String url = "jdbc:mysql://localhost:3306/dairyfarm";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);

            String sql = "select * from managerlist";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            String id, name, username, gender, age, phone, password;
            DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
            tbl.getDataVector().removeAllElements();
            while (rs.next()) {
                id = String.valueOf(rs.getInt("ID"));
                name = rs.getString("Name");
                username = rs.getString("UserName");
                gender = rs.getString("Gender");
                age = rs.getString("Age");

                phone = rs.getString("PhoneNumber");
                password = rs.getString("Password");

                String tdata[] = {id, name, username, gender, age, phone, password};

                tbl.addRow(tdata);

            }
        } catch (Exception ex) {
            Logger.getLogger(managerdetail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            String driverclass = "com.mysql.jdbc.Driver";
            Class.forName(driverclass);
            String url = "jdbc:mysql://localhost:3306/dairyfarm";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);

            String mid = jmid.getText();

            if (mid.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please!Enter the Manager ID");
            } else {

                String checkSql = "select count(*) from managerlist where ID = ?";
                PreparedStatement checkStatement = con.prepareStatement(checkSql);
                checkStatement.setString(1, mid);

                ResultSet resultSet = checkStatement.executeQuery();
                resultSet.next();
                int rowCount = resultSet.getInt(1);

                if (rowCount > 0) {
                    String sql = "delete from managerlist where ID=?";
                    PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
                    ps.setString(1, mid);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Successfully Deleted a Manager");

                    sql = "select * from managerlist";
                    ps = con.prepareStatement(sql);

                    ResultSet rs = ps.executeQuery();

                    String id, name, username, gender, age, phone, password;
                    DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
                    tbl.getDataVector().removeAllElements();
                    while (rs.next()) {
                        id = String.valueOf(rs.getInt("ID"));
                        name = rs.getString("Name");
                        username = rs.getString("UserName");
                        gender = rs.getString("Gender");
                        age = rs.getString("Age");

                        phone = rs.getString("PhoneNumber");
                        password = rs.getString("Password");

                        String tdata[] = {id, name, username, gender, age, phone, password};

                        tbl.addRow(tdata);

                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Manager ID Not Found");
                }

            }
        } catch (Exception ex) {
            Logger.getLogger(managerdetail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            String driverclass = "com.mysql.jdbc.Driver";
            Class.forName(driverclass);
            String url = "jdbc:mysql://localhost:3306/dairyfarm";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);

            String mid = jmid.getText();

            if (mid.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Enter the Manager ID");
            } else {

                String sql = "select * from managerlist where ID=?";
                PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
                ps.setString(1, mid);
                ResultSet rs = ps.executeQuery();
                String id, name, username, gender, age, phone, password;

                if (rs.next()) {
                    id = String.valueOf(rs.getInt("ID"));
                    name = rs.getString("Name");
                    username = rs.getString("UserName");
                    gender = rs.getString("Gender");
                    age = rs.getString("Age");

                    phone = rs.getString("PhoneNumber");
                    password = rs.getString("Password");

                    String tdata[] = {id, name, username, gender, age, phone, password};
                    DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
                    tbl.getDataVector().removeAllElements();

                    tbl.addRow(tdata);
                } else {
                    JOptionPane.showMessageDialog(null, "Manager hasn't been register yet");
                }

            }

        } catch (Exception ex) {
            Logger.getLogger(managerdetail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new welcome().setVisible(true);
        new managerdetail().setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(managerdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managerdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managerdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managerdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerdetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jmid;
    private javax.swing.JButton registermanager;
    // End of variables declaration//GEN-END:variables
}
