
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class product_detail extends javax.swing.JFrame {

    /**
     * Creates new form product_detail
     */
    public void ProductDetail() {
        try {
            String driverclass = "com.mysql.jdbc.Driver";
            Class.forName(driverclass);
            String url = "jdbc:mysql://localhost:3306/dairyfarm";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);

            String sql = "select * from productadd where PName=?";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

            String pn;
            pn = jComboBox1.getSelectedItem().toString();

            ps.setString(1, pn);

            ResultSet r, rs = ps.executeQuery();

            String sq, x;
            double pq, ts, tl;

            String a, b, c;

            DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();

            while (rs.next()) {
                pn = rs.getString("PName");
                pq = rs.getDouble("Quantity");
               
                ts = 0;
                tl = pq;
                
                

                sq = "select sum(Quantity) from billhistory where PName=?";

                ps = con.prepareStatement(sq);
                ps.setString(1, pn);

                r = ps.executeQuery();
                if (r.next()) {
                    x = r.getString("sum(Quantity)");
                    if (x != null) {
                        ts = Double.parseDouble(x);
                    }
                }

                pq += ts;
                 String formattedNumber = String.format("%.2f", pq);
        
       
        
        // Store the formatted number in a variable
        String result1 = formattedNumber;
        String formattedNumber2 = String.format("%.2f", tl);
        
       
        
        // Store the formatted number in a variable
        String result2 = formattedNumber2;
        
                String formattedNumber3 = String.format("%.2f", ts);
        
       
        
        // Store the formatted number in a variable
        String result3 = formattedNumber3;

//                a = String.valueOf(pq);
//                b = String.valueOf(ts);
//                c = String.valueOf(tl);

                String dt[] = {pn,result1,result3,result2};

                tb.addRow(dt);
            }
        } catch (Exception ex) {
            Logger.getLogger(product_detail.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Combo() {
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

            String p;

            while (rs.next()) {

                p = rs.getString("PName");

                jComboBox1.addItem(p);
            }
        } catch (Exception ex) {
            Logger.getLogger(update_product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public product_detail() {
        initComponents();
        Combo();

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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Product Detail");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(790, 0, 310, 80);

        jTable1.setBackground(new java.awt.Color(255, 255, 216));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PName", "Total Quantity(kg)", "Total Sold(kg)", "Total Left(kg)"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(350, 150, 1250, 310);

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 6, 150));
        jLabel3.setText("Select Product");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 600, 147, 40);

        jComboBox1.setBackground(new java.awt.Color(208, 252, 197));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(200, 600, 200, 40);

        jButton2.setBackground(new java.awt.Color(208, 252, 197));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setText("Show");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(230, 670, 121, 40);

        jButton1.setBackground(new java.awt.Color(208, 252, 197));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setText("Log Out\n");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1760, 910, 130, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\New folder\\detailss.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1920, 1020);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new admin().setVisible(true);
        new product_detail().setVisible(false);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Remove all rows from the table
        ProductDetail();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new welcome().setVisible(true);
        new product_detail().setVisible(false);
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
            java.util.logging.Logger.getLogger(product_detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(product_detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(product_detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(product_detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new product_detail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}