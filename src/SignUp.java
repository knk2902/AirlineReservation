


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
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
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
        jLabel2 = new javax.swing.JLabel();
        TF1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TF2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TF6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TF7 = new javax.swing.JTextField();
        PF1 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        YES = new javax.swing.JCheckBox();
        NO = new javax.swing.JCheckBox();
        SIGNUP = new javax.swing.JButton();
        BACK = new javax.swing.JButton();
        C1 = new javax.swing.JComboBox<>();
        C2 = new javax.swing.JComboBox<>();
        C3 = new javax.swing.JComboBox<>();
        L1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1440, 900));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 52)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AIRCARE   AIRLINES   REGISTRATION   FORM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 100, 950, 64);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setText("Full Name *:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 210, 190, 44);

        TF1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        TF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF1ActionPerformed(evt);
            }
        });
        getContentPane().add(TF1);
        TF1.setBounds(840, 210, 230, 40);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel3.setText("E-Mail *:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(360, 260, 150, 44);

        TF2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        getContentPane().add(TF2);
        TF2.setBounds(840, 260, 230, 40);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel4.setText("Password *:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 310, 190, 44);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel5.setText("DOB :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(360, 360, 120, 44);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel8.setText("Country *:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(360, 410, 160, 44);

        TF6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        getContentPane().add(TF6);
        TF6.setBounds(840, 406, 230, 40);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel9.setText("Mobile  No.*:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(360, 460, 220, 44);

        TF7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        getContentPane().add(TF7);
        TF7.setBounds(840, 456, 230, 40);

        PF1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        PF1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PF1FocusGained(evt);
            }
        });
        getContentPane().add(PF1);
        PF1.setBounds(840, 310, 230, 36);

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel11.setText("I agree with the Terms and Conditions of AIRCARE AIRLINES");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(380, 550, 610, 25);

        buttonGroup1.add(YES);
        YES.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        YES.setText("Yes");
        YES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YESActionPerformed(evt);
            }
        });
        getContentPane().add(YES);
        YES.setBounds(380, 590, 63, 39);

        buttonGroup1.add(NO);
        NO.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        NO.setText("No");
        NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOActionPerformed(evt);
            }
        });
        getContentPane().add(NO);
        NO.setBounds(470, 590, 57, 39);

        SIGNUP.setFont(new java.awt.Font("Tempus Sans ITC", 3, 48)); // NOI18N
        SIGNUP.setText("SIGN UP");
        SIGNUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIGNUPActionPerformed(evt);
            }
        });
        getContentPane().add(SIGNUP);
        SIGNUP.setBounds(440, 790, 240, 73);

        BACK.setFont(new java.awt.Font("Tempus Sans ITC", 3, 48)); // NOI18N
        BACK.setText("BACK");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });
        getContentPane().add(BACK);
        BACK.setBounds(800, 790, 169, 73);

        C1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        C1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        getContentPane().add(C1);
        C1.setBounds(840, 360, 71, 36);

        C2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        C2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(C2);
        C2.setBounds(940, 360, 83, 36);

        C3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        C3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YYYY", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019" }));
        getContentPane().add(C3);
        C3.setBounds(1050, 360, 89, 36);

        L1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        L1.setText("Enter Upto 8 -15 Characters");
        getContentPane().add(L1);
        L1.setBounds(1090, 320, 290, 30);

        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        jButton3.setText("HOME PAGE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1150, 10, 280, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/313904.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1440, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF1ActionPerformed

    private void SIGNUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIGNUPActionPerformed
String name = TF1.getText(); 
String email = TF2.getText(); 
String password = new String(PF1.getPassword()); 
String mobile = TF7.getText(); 
String country = TF6.getText(); 

Object d =C1.getSelectedItem(); 
Object m = C2.getSelectedItem(); 
Object y = C3.getSelectedItem();
String date = (y+"-"+m +"-"+d);
        System.out.println(date);
        
        
 if(TF1.getText()==null){
     JOptionPane.showMessageDialog(null,"Enter Your Name"); 
 }
 else if(password.length()>15){
     JOptionPane.showMessageDialog(null,"Password Should Contain Not More Than 15 characters");
 }
 else if(password.length()<8){
     JOptionPane.showMessageDialog(null,"Password Should Contain Atleast 8 characters");
    }
else if(mobile.length()!=10){  
    JOptionPane.showMessageDialog(null,"Invalid Mobile No."); 
}
else if(d=="DD" && m=="MM" && y=="YYYY"){
        JOptionPane.showMessageDialog(null,"Enter DOB");
}   
 
 
else { 
 try { 
        Class.forName("java.sql.DriverManager"); 
    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/flight", "root","1234"); 
    Statement st =con.createStatement(); 
    Statement st1 = con.createStatement(); 
    String query="INSERT INTO users VALUES ('"+name+"','"+email+"','"+password+"','"+date+"','"+country+"','"+mobile+"');"; 
    st.executeUpdate(query); 
    } 
    catch (Exception e) { 
        JOptionPane.showMessageDialog (null, e.getMessage()); 
    }
 }
 
    
    JOptionPane.showMessageDialog(null,"Successfully Signed Up!!!!       Login To Book Tickets!!!");
    new MainForm().setVisible(true);
 dispose();
    


 
        // TODO add your handling code here:
    }//GEN-LAST:event_SIGNUPActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
NO.setSelected(true);
SIGNUP.setVisible(false);
L1.setVisible(false);
TF1.requestFocus(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void YESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YESActionPerformed

    SIGNUP.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_YESActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C1ActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
try { 
    new MainForm().setVisible(true); 
} 
catch (Exception e) {
    JOptionPane.showMessageDialog(null, e.getMessage()); 
} 
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_BACKActionPerformed

    private void PF1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PF1FocusGained
L1.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_PF1FocusGained

    private void NOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOActionPerformed
if(NO.isSelected()==true)
    SIGNUP.setVisible(false);
else   SIGNUP.setVisible(true);

        // TODO add your ;handling code here:
    }//GEN-LAST:event_NOActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new MainForm().setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JComboBox<String> C1;
    private javax.swing.JComboBox<String> C2;
    private javax.swing.JComboBox<String> C3;
    private javax.swing.JLabel L1;
    private javax.swing.JCheckBox NO;
    private javax.swing.JPasswordField PF1;
    private javax.swing.JButton SIGNUP;
    private javax.swing.JTextField TF1;
    private javax.swing.JTextField TF2;
    private javax.swing.JTextField TF6;
    private javax.swing.JTextField TF7;
    private javax.swing.JCheckBox YES;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
