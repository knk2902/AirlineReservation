/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kaustubh
 */
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
public class MainForm extends javax.swing.JFrame {

    Statement st=null;
    /**
     * Creates new form Main
     */
    public MainForm() {
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

        jButton4 = new javax.swing.JButton();
        FLIGHTDETAILS = new javax.swing.JButton();
        USERLOGIN = new javax.swing.JButton();
        SIGNUP = new javax.swing.JButton();
        ADMINLOGIN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1440, 900));
        getContentPane().setLayout(null);

        FLIGHTDETAILS.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        FLIGHTDETAILS.setText("CHECK FLIGHT DETAILS");
        FLIGHTDETAILS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FLIGHTDETAILSActionPerformed(evt);
            }
        });
        getContentPane().add(FLIGHTDETAILS);
        FLIGHTDETAILS.setBounds(490, 730, 461, 57);

        USERLOGIN.setFont(new java.awt.Font("Calibri", 3, 48)); // NOI18N
        USERLOGIN.setText("USER LOGIN");
        USERLOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USERLOGINActionPerformed(evt);
            }
        });
        getContentPane().add(USERLOGIN);
        USERLOGIN.setBounds(260, 270, 280, 69);

        SIGNUP.setFont(new java.awt.Font("Calibri", 3, 48)); // NOI18N
        SIGNUP.setText("SIGN UP");
        SIGNUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIGNUPActionPerformed(evt);
            }
        });
        getContentPane().add(SIGNUP);
        SIGNUP.setBounds(610, 400, 210, 69);

        ADMINLOGIN.setFont(new java.awt.Font("Calibri", 3, 48)); // NOI18N
        ADMINLOGIN.setText("ADMIN LOGIN");
        ADMINLOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMINLOGINActionPerformed(evt);
            }
        });
        getContentPane().add(ADMINLOGIN);
        ADMINLOGIN.setBounds(870, 270, 330, 69);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 52)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AIRCARE AIRLINE BOOKING SYSTEM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 90, 940, 64);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/313904.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLabel2.setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -90, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FLIGHTDETAILSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FLIGHTDETAILSActionPerformed
try{
        String s=JOptionPane.showInputDialog("Enter Unique Code");
if(s!=null){
    new TicketDetails().setVisible(true);
    dispose();
    DefaultTableModel tm=(DefaultTableModel)TicketDetails.T1.getModel();
    Class.forName("com.mysql.jdbc.Driver"); 
    Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/flight","root","1234");
    Statement st =con.createStatement();
    String sql="select * from reserved where unique_code = "+s+";";
    ResultSet rs = st.executeQuery(sql);
    System.out.println(sql);
while(rs.next()){
    Object ob[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10)};
tm.addRow(ob);
}
}
    
}
catch(Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage());
}
        // TODO add your handling code here:
    }//GEN-LAST:event_FLIGHTDETAILSActionPerformed

    private void USERLOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USERLOGINActionPerformed
new UserLogin().setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_USERLOGINActionPerformed

    private void SIGNUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIGNUPActionPerformed
new SignUp().setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_SIGNUPActionPerformed

    private void ADMINLOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMINLOGINActionPerformed

        new AdminLogin().setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_ADMINLOGINActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADMINLOGIN;
    private javax.swing.JButton FLIGHTDETAILS;
    private javax.swing.JButton SIGNUP;
    private javax.swing.JButton USERLOGIN;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
