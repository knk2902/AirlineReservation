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

public class UserLogin extends javax.swing.JFrame {

    /**
     * Creates new form UserLogin
     */
    public UserLogin() {
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
        jLabel2 = new javax.swing.JLabel();
        TF1 = new javax.swing.JTextField();
        LOGIN = new javax.swing.JButton();
        HOMEPAGE = new javax.swing.JButton();
        PF1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        SIGNUP = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1440, 900));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setText("USERNAME :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(470, 220, 200, 30);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setText("PASSWORD :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 300, 200, 40);

        TF1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        getContentPane().add(TF1);
        TF1.setBounds(750, 220, 190, 40);

        LOGIN.setFont(new java.awt.Font("Tempus Sans ITC", 3, 48)); // NOI18N
        LOGIN.setText("LOGIN");
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });
        getContentPane().add(LOGIN);
        LOGIN.setBounds(600, 390, 230, 40);

        HOMEPAGE.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        HOMEPAGE.setText("HOME PAGE");
        HOMEPAGE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOMEPAGEActionPerformed(evt);
            }
        });
        getContentPane().add(HOMEPAGE);
        HOMEPAGE.setBounds(1150, 10, 280, 40);

        PF1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        getContentPane().add(PF1);
        PF1.setBounds(750, 300, 190, 40);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("New Users!!!     Register Here");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(410, 600, 330, 30);

        SIGNUP.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        SIGNUP.setText("SIGN UP");
        SIGNUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIGNUPActionPerformed(evt);
            }
        });
        getContentPane().add(SIGNUP);
        SIGNUP.setBounds(740, 590, 230, 40);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 52)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("USER  LOGIN");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(570, 80, 330, 40);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setText("*Enter your name as the username");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(960, 220, 360, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/313904.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1440, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed
try { 
    
Class.forName("com.mysql.jdbc.Driver"); 
Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/flight","root","1234");
Statement st =con.createStatement(); 
Statement st1 =con.createStatement(); 

String uname=TF1.getText(); 
String password= new String (PF1.getPassword()); 
String sql="Select * from users where Name='"+uname+"' and Password='"+password+"';";
ResultSet rs=st1.executeQuery(sql);


while(rs.next()) { 
        String user=rs.getString("Name"); 
        String pwd=rs.getString("Password");
       System.out.println(user+" "+pwd);
       


      if ((uname.equals(user)) && (password.equals(pwd))) {
           
         new BookFlights().setVisible(true);
         dispose();
        }
        
        
        else
            JOptionPane.showMessageDialog(null,"Wrong Credentials!!  Please Try Again!");
           
}     
} 

catch (Exception e){ JOptionPane.showMessageDialog(null, e.getMessage());
}
// TODO add your handling code here:
    }//GEN-LAST:event_LOGINActionPerformed

    private void HOMEPAGEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOMEPAGEActionPerformed
new MainForm().setVisible(true);
   dispose();     


        // TODO add your handling code here:
    }//GEN-LAST:event_HOMEPAGEActionPerformed

    private void SIGNUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIGNUPActionPerformed
new SignUp().setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_SIGNUPActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
TF1.requestFocus(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HOMEPAGE;
    private javax.swing.JButton LOGIN;
    private javax.swing.JPasswordField PF1;
    private javax.swing.JButton SIGNUP;
    private javax.swing.JTextField TF1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
