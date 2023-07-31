
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class add_product extends javax.swing.JFrame {

    /**
     * Creates new form add_product
     */
    public add_product() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1020));
        getContentPane().setLayout(null);

        back.setBackground(new java.awt.Color(208, 252, 197));
        back.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(0, 0, 81, 33);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 61, 226));
        jLabel1.setText("Add Product");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(862, 10, 265, 58);

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 51));
        jLabel2.setText("Product Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(620, 140, 170, 27);

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 51));
        jLabel3.setText("Quantity(kg)");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(620, 220, 150, 32);

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 51));
        jLabel4.setText("Buying Price/kg(taka)");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(620, 300, 250, 32);

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 51));
        jLabel5.setText("Date");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(620, 480, 220, 32);

        jButton2.setBackground(new java.awt.Color(208, 252, 197));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(880, 620, 117, 47);

        jButton3.setBackground(new java.awt.Color(208, 252, 197));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1120, 620, 113, 47);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(850, 130, 510, 50);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(850, 210, 510, 50);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(850, 290, 510, 50);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(850, 380, 510, 50);

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 51));
        jLabel6.setText("Selling Price/kg(taka)");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(620, 390, 250, 32);

        jButton1.setBackground(new java.awt.Color(208, 252, 197));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1770, 910, 115, 50);

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(850, 470, 510, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon("E:\\New folder\\aaaaaaaaaaaaaaaa.png")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1920, 1020);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new product_manage().setVisible(true);
        new add_product().setVisible(false);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            String driverclass = "com.mysql.jdbc.Driver";
            Class.forName(driverclass);
            String url = "jdbc:mysql://localhost:3306/dairyfarm";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);

            String sql = "insert into productadd(PName,Quantity,Price,SellingPrice,TotalCost)values(?,?,?,?,?)";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

            String pname, date;

            pname = jTextField1.getText();
            
            date=((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
            


            String text3 = jTextField3.getText();
            String text5 = jTextField5.getText();
            String text2 = jTextField2.getText();

            if (!date.matches("^\\d{4}-(0[1-9]|1[0-2])-([12][0-9]|0[1-9]|3[01])$")||date.isEmpty()||pname.isEmpty()||text2.isEmpty() || text3.isEmpty() || text5.isEmpty()||!pname.matches("(?!^[. ])[a-zA-Z. ]+")||!text2.matches("(\\d+\\.\\d+)|(\\d+)")||!text5.matches("\\d+")||!text3.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "Please fill out every field according to the requirements");
            } else {

                int  price;
                double quan = Double.parseDouble(jTextField2.getText()),tc;
                price = Integer.parseInt(jTextField3.getText());
                
                int sellingprice = Integer.parseInt(jTextField5.getText());
                tc = quan * price;

                ps.setString(1, pname);

                ps.setDouble(2, quan);
                ps.setInt(3, price);
                ps.setInt(4, sellingprice);

                ps.setDouble(5, tc);

                 ps.executeUpdate();
                

                JOptionPane.showMessageDialog(null, "Successfully added a product");
                sql = "insert into productdate (PName,Quantity,Date) values(?,?,?)";
                ps = con.prepareStatement(sql);

                ps.setString(1, pname);
                ps.setDouble(2, quan);
              
              ps.setString(3, date);

                ps.executeUpdate();

                new product_manage().setVisible(true);
                new add_product().setVisible(false);
                dispose();

            }

        } catch (Exception ex) {
            Logger.getLogger(add_product.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
       
        jTextField5.setText("");
       jDateChooser1.setDate(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new welcome().setVisible(true);
        new add_product().setVisible(false);
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
            java.util.logging.Logger.getLogger(add_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

   
}
