
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class FrontEndClass extends javax.swing.JFrame {

    public FrontEndClass() {
        initComponents();
        setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BankManagementSystem = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Management System");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        getContentPane().setLayout(null);

        BankManagementSystem.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BankManagementSystem.setForeground(new java.awt.Color(204, 204, 204));
        BankManagementSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Bank.png"))); // NOI18N
        BankManagementSystem.setText("Bank Management System");
        getContentPane().add(BankManagementSystem);
        BankManagementSystem.setBounds(30, 20, 340, 46);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Account.png"))); // NOI18N
        jButton1.setText("Account");
        jButton1.setPreferredSize(new java.awt.Dimension(196, 60));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 110, 200, 60);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AllAccount.png"))); // NOI18N
        jButton3.setText("Show all A/C");
        jButton3.setPreferredSize(new java.awt.Dimension(196, 60));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(390, 320, 200, 60);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Deposit.png"))); // NOI18N
        jButton4.setText("Deposit");
        jButton4.setPreferredSize(new java.awt.Dimension(196, 60));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(30, 210, 200, 60);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Withdrawal.png"))); // NOI18N
        jButton5.setText("Withdrawal");
        jButton5.setPreferredSize(new java.awt.Dimension(196, 60));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(390, 210, 200, 60);

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Balance.png"))); // NOI18N
        jButton10.setText("Check Balance");
        jButton10.setPreferredSize(new java.awt.Dimension(196, 60));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(390, 110, 200, 60);

        jButton13.setBackground(new java.awt.Color(0, 0, 0));
        jButton13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/MoneyTransfer.png"))); // NOI18N
        jButton13.setText("Cash Transfer");
        jButton13.setPreferredSize(new java.awt.Dimension(196, 60));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(30, 320, 200, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 630, 420);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setText("Create Table");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(400, 430, 110, 25);

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton6.setText("Reset Table");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(510, 430, 100, 25);

        jLabel2.setBackground(new java.awt.Color(98, 3, 3));
        jLabel2.setForeground(new java.awt.Color(98, 3, 3));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 410, 640, 70);

        setSize(new java.awt.Dimension(636, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        AccountClass acc = new AccountClass();
        acc.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        CashTransferClass object = new CashTransferClass();
        object.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        CheckBalanceClass object = new CheckBalanceClass();
        object.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        AllData object = new AllData();
        object.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        WithdrawalClass obj = new WithdrawalClass();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DepositClass obj = new DepositClass();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Statement stmt = ConnectJDBC.con.createStatement();
            ResultSet fn = stmt.executeQuery("create table Bank(\n"
                    + "Name varchar(30) not null, \n"
                    + "Aadhar varchar(12) not null, \n"
                    + "FatherName varchar(30) not null, \n"
                    + "MotherName varchar(30) not null, \n"
                    + "Gender varchar(6) not null, \n"
                    + "DOB Date not null, \n"
                    + "Caste varchar(7) not null, \n"
                    + "Religion varchar(9) not null, \n"
                    + "Street varchar(20), \n"
                    + "Area varchar(20) not null, \n"
                    + "District varchar(20) not null, \n"
                    + "City varchar(20) not null, \n"
                    + "Pincode varchar(6) not null, \n"
                    + "State varchar(20) not null,\n"
                    + "Mobile varchar(10) not null, \n"
                    + "Email varchar(30), \n"
                    + "Account varchar(10) not null, \n"
                    + "Money int,\n"
                    + "primary key (Account, Aadhar)\n"
                    + ")");
            JOptionPane.showMessageDialog(null, "Table Created!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Table Already Exist!!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            Statement stmt = ConnectJDBC.con.createStatement();
            ResultSet fn = stmt.executeQuery("drop table Bank");
            ResultSet fnn = stmt.executeQuery("create table Bank(\n"
                    + "Name varchar(30) not null, \n"
                    + "Aadhar varchar(12) not null, \n"
                    + "FatherName varchar(30) not null, \n"
                    + "MotherName varchar(30) not null, \n"
                    + "Gender varchar(6) not null, \n"
                    + "DOB Date not null, \n"
                    + "Caste varchar(7) not null, \n"
                    + "Religion varchar(9) not null, \n"
                    + "Street varchar(20), \n"
                    + "Area varchar(20) not null, \n"
                    + "District varchar(20) not null, \n"
                    + "City varchar(20) not null, \n"
                    + "Pincode varchar(6) not null, \n"
                    + "State varchar(20) not null,\n"
                    + "Mobile varchar(10) not null, \n"
                    + "Email varchar(30), \n"
                    + "Account varchar(10) not null, \n"
                    + "Money int,\n"
                    + "primary key (Account, Aadhar)\n"
                    + ")");
            JOptionPane.showMessageDialog(null, "Reset Done!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrontEndClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontEndClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontEndClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontEndClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontEndClass().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BankManagementSystem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
