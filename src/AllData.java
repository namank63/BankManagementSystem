
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AllData extends javax.swing.JFrame {

    public AllData() {
        initComponents();
        show_user();
    }

    public ArrayList<User> userList() {
        ArrayList<User> usersList = new ArrayList<>();
        try {
            String query = "select * from Bank";
            Statement st = ConnectJDBC.con.createStatement();
            ResultSet rs = st.executeQuery(query);
            User user;
            while (rs.next()) {
                user = new User(rs.getInt("Money"), rs.getString("Name"), rs.getString("Aadhar"), rs.getString("FatherName"), rs.getString("MotherName"), rs.getString("Gender"), rs.getString("DOB"), rs.getString("Caste"), rs.getString("Religion"), rs.getString("Street"), rs.getString("Area"), rs.getString("District"), rs.getString("City"), rs.getString("Pincode"), rs.getString("State"), rs.getString("Mobile"), rs.getString("Email"), rs.getString("Account"));
                usersList.add(user);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return usersList;
    }

    public void show_user() {
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel) TableTable.getModel();
        Object[] row = new Object[18];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getAccount();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getFather();
            row[3] = list.get(i).getMother();
            row[4] = list.get(i).getMoney();
            row[5] = list.get(i).getGender();
            row[6] = list.get(i).getDOB();
            row[7] = list.get(i).getCaste();
            row[8] = list.get(i).getReligion();
            row[9] = list.get(i).getStreet();
            row[10] = list.get(i).getArea();
            row[11] = list.get(i).getDistrict();
            row[12] = list.get(i).getCity();
            row[13] = list.get(i).getPincode();
            row[14] = list.get(i).getState();
            row[15] = list.get(i).getMobile();
            row[16] = list.get(i).getEmail();
            row[17] = list.get(i).getAadhar();
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Account Database");

        TableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account", "Name", "Father", "Mother", "Balance", "Gender", "DOB", "Caste", "Religion", "Street", "Area", "District", "City", "Pincode", "State", "Mobile", "Email", "Aadhar"
            }
        ));
        jScrollPane1.setViewportView(TableTable);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1096, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1112, 552));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AllData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
