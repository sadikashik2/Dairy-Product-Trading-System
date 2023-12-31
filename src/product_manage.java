
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Acer
 */
public class product_manage extends javax.swing.JFrame {

    /**
     * Creates new form product_manage
     */
    public product_manage() {
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

        back = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        addproduct = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        changeproduct = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1020));
        getContentPane().setLayout(null);

        back.setBackground(new java.awt.Color(208, 252, 197));
        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(0, 0, 77, 31);

        jButton2.setBackground(new java.awt.Color(208, 252, 197));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setText("Show All Products");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1160, 620, 215, 50);

        jButton3.setBackground(new java.awt.Color(208, 252, 197));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton3.setText("Search Product");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(350, 310, 187, 40);

        addproduct.setBackground(new java.awt.Color(208, 252, 197));
        addproduct.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        addproduct.setText("Add Product");
        addproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addproductActionPerformed(evt);
            }
        });
        getContentPane().add(addproduct);
        addproduct.setBounds(90, 590, 210, 50);

        jButton5.setBackground(new java.awt.Color(208, 252, 197));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton5.setText("Delete Product");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(350, 370, 183, 40);

        changeproduct.setBackground(new java.awt.Color(208, 252, 197));
        changeproduct.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        changeproduct.setText("Update Product");
        changeproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeproductActionPerformed(evt);
            }
        });
        getContentPane().add(changeproduct);
        changeproduct.setBounds(90, 660, 210, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 153));
        jLabel1.setText("Product Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 230, 143, 40);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(260, 230, 410, 40);

        jTable1.setBackground(new java.awt.Color(219, 245, 250));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PID", "PName", "Quantity Left(kg)", "Buying Price(tk)/kg", "Selling Price(tk)/kg", "Total Cost"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(740, 200, 1050, 364);

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 51));
        jLabel2.setText("Product Manage");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(773, 3, 350, 58);

        jButton1.setBackground(new java.awt.Color(208, 252, 197));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1760, 910, 111, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\New folder\\product manage.png")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1920, 1020);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new manager_login().setVisible(true);
        new product_manage().setVisible(false);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void addproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addproductActionPerformed
        // TODO add your handling code here:
        new add_product().setVisible(true);
        new product_manage().setVisible(false);
        dispose();
    }//GEN-LAST:event_addproductActionPerformed

    private void changeproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeproductActionPerformed
        // TODO add your handling code here:
        new update_product().setVisible(true);
        new product_manage().setVisible(false);
        dispose();
    }//GEN-LAST:event_changeproductActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        try {
            String driverclass = "com.mysql.jdbc.Driver";
            Class.forName(driverclass);
            String url = "jdbc:mysql://localhost:3306/dairyfarm";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);

            String sql = "select * from productadd";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            String id, pname, price, tc, sellingprice;
            DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
            tbl.getDataVector().removeAllElements();
            while (rs.next()) {
                id = String.valueOf(rs.getInt("PID"));
                pname = rs.getString("PName");
                double pq = rs.getDouble("Quantity");
                price = rs.getString("Price");
                sellingprice = rs.getString("SellingPrice");
                tc = String.valueOf(rs.getInt("TotalCost"));
                
                 String formattedNumber = String.format("%.2f", pq);
        
       
        
        // Store the formatted number in a variable
        String result = formattedNumber;

                String tdata[] = {id, pname, result, price, sellingprice, tc};

                tbl.addRow(tdata);

            }
        } catch (Exception ex) {
            Logger.getLogger(product_manage.class.getName()).log(Level.SEVERE, null, ex);
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
            String name = jTextField1.getText();
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Enter the Product Name");
            } else {

                String sql = "select * from productadd where PName=?";

                PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

                ps.setString(1, name);

                ResultSet r = ps.executeQuery();

                String id, pn, quan, pkg, tp, sp;

                DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
                tb.getDataVector().removeAllElements();

                if (r.next()) {
                    id = String.valueOf(r.getInt("PID"));
                    pn = r.getString("PName");

                    quan = String.valueOf(r.getDouble("Quantity"));
                    pkg = String.valueOf(r.getInt("Price"));
                    sp = String.valueOf(r.getInt("SellingPrice"));
                    tp = String.valueOf(r.getInt("TotalCost"));
                    

                    String td[] = {id, pn, quan, pkg, sp, tp};
                    tb.addRow(td);
                } else {
                    JOptionPane.showMessageDialog(null, "Product not found");
                }

            }
        } catch (Exception ex) {
            Logger.getLogger(product_manage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        // TODO add your handling code here:
        try {
            String driverclass = "com.mysql.jdbc.Driver";
            Class.forName(driverclass);
            String url = "jdbc:mysql://localhost:3306/dairyfarm";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);

            String name = jTextField1.getText();

            if (name.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please!Enter the Product Name");
            } else {

                String checkSql = "select count(*) from productadd where PName = ?";
                PreparedStatement checkStatement = con.prepareStatement(checkSql);
                checkStatement.setString(1, name);

                ResultSet resultSet = checkStatement.executeQuery();
                resultSet.next();
                int rowCount = resultSet.getInt(1);

                if (rowCount > 0) {
                    String sql = "delete from productadd where PName=?";
                    PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
                    ps.setString(1, name);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Successfully Deleted a Product");

                    sql = "select * from productadd";
                    ps = con.prepareStatement(sql);

                    ResultSet rs = ps.executeQuery();

                    String id, pn, quan, pkg, sp, tp;
                    DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
                    tb.getDataVector().removeAllElements();
                    while (rs.next()) {
                        id = String.valueOf(rs.getInt("PID"));
                        pn = rs.getString("PName");

                        quan = String.valueOf(rs.getDouble("Quantity"));
                        pkg = String.valueOf(rs.getInt("Price"));
                        sp = String.valueOf(rs.getInt("SellingPrice"));
                        tp = String.valueOf(rs.getInt("TotalCost"));

                        String td[] = {id, pn, quan, pkg, sp, tp};
                        tb.addRow(td);

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Product Name Not Found");
                }

            }
        } catch (Exception ex) {
            Logger.getLogger(product_manage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new welcome().setVisible(true);
        new product_manage().setVisible(false);
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
            java.util.logging.Logger.getLogger(product_manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(product_manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(product_manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(product_manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new product_manage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addproduct;
    private javax.swing.JButton back;
    private javax.swing.JButton changeproduct;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
