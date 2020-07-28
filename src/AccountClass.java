
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AccountClass extends javax.swing.JFrame {

    public AccountClass() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jTextField16 = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Account Management");
        setSize(new java.awt.Dimension(700, 575));

        jPanel1.setBackground(new java.awt.Color(43, 43, 43));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Personal Details");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 16, 114, 20);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        jLabel2.setPreferredSize(new java.awt.Dimension(25, 15));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(19, 54, 88, 22);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Father's Name");
        jLabel3.setMaximumSize(new java.awt.Dimension(25, 14));
        jLabel3.setPreferredSize(new java.awt.Dimension(25, 15));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(19, 82, 88, 24);

        jTextField1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(140, 50, 180, 21);

        jTextField2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(140, 80, 180, 21);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mother's Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(19, 115, 88, 16);

        jTextField3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(140, 110, 180, 21);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address & Contact");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 180, 140, 19);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Street No.");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 210, 56, 16);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Area/Locality");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 240, 74, 16);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("District ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 270, 66, 16);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("City");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(390, 270, 39, 16);

        jTextField4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(140, 210, 218, 21);

        jTextField5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(140, 240, 218, 21);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("State");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 300, 30, 16);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Mobile No.");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 330, 58, 16);

        jTextField9.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField9);
        jTextField9.setBounds(140, 270, 218, 21);

        jTextField10.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField10);
        jTextField10.setBounds(140, 330, 218, 21);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Email Id");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(390, 330, 44, 16);

        jTextField11.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField11KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField11);
        jTextField11.setBounds(440, 330, 160, 21);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(406, 370, 69, 23);

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Caste");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(19, 141, 40, 16);

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Religion");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(340, 140, 45, 16);

        jComboBox4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "OBC", "SC", "ST" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4);
        jComboBox4.setBounds(140, 140, 100, 21);

        jComboBox5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hindu ", "Muslim ", "Sikh", "Christian" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox5);
        jComboBox5.setBounds(420, 140, 100, 21);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(490, 370, 80, 23);

        jTextField6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(440, 270, 163, 21);

        jTextField7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField7);
        jTextField7.setBounds(140, 300, 218, 21);

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Aadhar");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(340, 50, 41, 16);

        jTextField8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField8);
        jTextField8.setBounds(420, 50, 144, 21);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Gender");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(340, 80, 41, 16);

        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(420, 80, 66, 21);

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Date of Birth");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(340, 110, 70, 16);

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Pincode");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(390, 300, 46, 16);

        jTextField13.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField13KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField13);
        jTextField13.setBounds(440, 300, 90, 21);

        jLabel21.setText("(0 for N/A)");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(618, 308, 52, 14);

        jDateChooser1.setDateFormatString("dd-MMM-yyyy");
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(420, 110, 91, 20);

        jTabbedPane1.addTab("Create A/c", jPanel1);

        jPanel2.setBackground(new java.awt.Color(43, 43, 43));
        jPanel2.setLayout(null);

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Update Account");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(31, 31, 150, 20);

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Select Field to Update");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(129, 199, 122, 16);

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Account Number");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(129, 118, 95, 16);

        jTextField14.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField14KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField14);
        jTextField14.setBounds(269, 117, 230, 21);

        jComboBox2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "FatherName", "MotherName", "DOB", "Mobile", "Email" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jComboBox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBox2KeyTyped(evt);
            }
        });
        jPanel2.add(jComboBox2);
        jComboBox2.setBounds(269, 197, 230, 21);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setText("Check Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(269, 148, 119, 25);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(430, 300, 73, 25);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton5.setText("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(350, 300, 65, 25);

        jTextField15.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField15KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField15);
        jTextField15.setBounds(269, 260, 130, 21);

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Enter New Value");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(129, 264, 93, 16);

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton6.setText("Check Value");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(129, 224, 103, 25);

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(51, 102, 0));
        jTextField16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField16KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField16);
        jTextField16.setBounds(269, 227, 230, 21);

        jDateChooser2.setDateFormatString("dd-MMM-yyyy");
        jPanel2.add(jDateChooser2);
        jDateChooser2.setBounds(410, 260, 95, 20);

        jTabbedPane1.addTab("Update A/c", jPanel2);

        jPanel4.setBackground(new java.awt.Color(43, 43, 43));
        jPanel4.setLayout(null);

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("View User Account");
        jPanel4.add(jLabel25);
        jLabel25.setBounds(31, 35, 167, 24);

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Account Number");
        jPanel4.add(jLabel26);
        jLabel26.setBounds(140, 150, 100, 15);

        jTextField17.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField17KeyTyped(evt);
            }
        });
        jPanel4.add(jTextField17);
        jTextField17.setBounds(268, 147, 167, 21);

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Name");
        jPanel4.add(jLabel27);
        jLabel27.setBounds(140, 180, 33, 16);

        jTextField18.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        jTextField18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField18KeyTyped(evt);
            }
        });
        jPanel4.add(jTextField18);
        jTextField18.setBounds(268, 179, 167, 21);

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton7.setText("View");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7);
        jButton7.setBounds(374, 232, 61, 23);

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton8.setText("Close");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8);
        jButton8.setBounds(268, 232, 65, 23);

        jTabbedPane1.addTab("View A/C", jPanel4);

        jPanel3.setBackground(new java.awt.Color(43, 43, 43));
        jPanel3.setLayout(null);

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Delete Account");
        jPanel3.add(jLabel28);
        jLabel28.setBounds(30, 35, 134, 24);

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Account Number");
        jPanel3.add(jLabel29);
        jLabel29.setBounds(159, 150, 95, 16);

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Name");
        jPanel3.add(jLabel30);
        jLabel30.setBounds(159, 183, 33, 16);

        jTextField19.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextField19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField19KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField19);
        jTextField19.setBounds(279, 147, 160, 22);

        jTextField20.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });
        jTextField20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField20KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField20);
        jTextField20.setBounds(279, 180, 160, 22);

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton9.setText("Delete");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);
        jButton9.setBounds(370, 230, 69, 25);

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton10.setText("Close");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10);
        jButton10.setBounds(280, 230, 65, 25);

        jTabbedPane1.addTab("Delete A/c", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(636, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String Account = jTextField14.getText();
            int i = 0;
            PreparedStatement st = ConnectJDBC.con.prepareStatement("select Account from Bank");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String Value = rs.getString("Account");
                if (Account.equals(Value)) {
                    i = 1;
                    if (jTextField14.getText().equals(" ")) {
                        JOptionPane.showMessageDialog(null, "Invalid Input");
                    } else {
                        SingleAccount Object = new SingleAccount();
                        Object.ShowDetails(Account);
                        Object.setVisible(true);
                    }
                }
            }
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Account Not Found!!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || jTextField13.getText().length() >= 6) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextField13KeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || jTextField8.getText().length() >= 12) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed

    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        char c = evt.getKeyChar();
        if (jTextField7.getText().length() >= 20) {
            evt.consume();
        }
        if (Character.isLetter(c) || Character.isISOControl(c) || c == KeyEvent.VK_SPACE) {
            evt = evt;
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        char c = evt.getKeyChar();
        if (jTextField6.getText().length() >= 20) {
            evt.consume();
        }
        if (Character.isLetter(c) || Character.isISOControl(c) || c == KeyEvent.VK_SPACE) {
            evt = evt;
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String Name = jTextField1.getText();
        String Father = jTextField2.getText();
        String Mother = jTextField3.getText();
        String Street = jTextField4.getText();
        String Area = jTextField5.getText();
        String City = jTextField6.getText();
        String State = jTextField7.getText();
        String Aadhar = jTextField8.getText();
        String District = jTextField9.getText();
        String Mobile = jTextField10.getText();
        String Email = jTextField11.getText();
        if (jTextField11.getText().equals("")) {
            Email = "N/A";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        String DOB;
        DOB = sdf.format(jDateChooser1.getDate());
        String Pincode = jTextField13.getText();
        String Caste = jComboBox4.getSelectedItem().toString();
        String Religion = jComboBox5.getSelectedItem().toString();
        String Gender = jComboBox1.getSelectedItem().toString();
        if (Pincode.length() != 6 || Mobile.length() != 10 || Aadhar.length() != 12) {
            JOptionPane.showMessageDialog(null, "Invalid Aadhar, Mobile or Pincode");
        } else {
            int Money = 0;
            long Account = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
            Statement stmt = null;
            try {
                stmt = ConnectJDBC.con.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(AccountClass.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                ResultSet fn = stmt.executeQuery("insert into Bank values('" + Name + "','" + Aadhar + "','" + Father + "','" + Mother + "','" + Gender + "','" + DOB + "','" + Caste + "','" + Religion + "','" + Street + "','" + Area + "','" + District + "','" + City + "'," + Pincode + ",'" + State + "','" + Mobile + "','" + Email + "','" + Account + "','" + Money + "')");
                jTextField1.setText(Long.toString(Account));
                String m = JOptionPane.showInputDialog("Account Created\nA/C No: ", Account);
                System.out.println(m);
                dispose();
                FrontEndClass temp = new FrontEndClass();
                temp.setVisible(true);
                dispose();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Please fill Complete form!!");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed

    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed

    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FrontEndClass temp = new FrontEndClass();
        temp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyTyped
        char c = evt.getKeyChar();
        if (jTextField11.getText().length() >= 30 || c == KeyEvent.VK_SPACE) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextField11KeyTyped

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || jTextField10.getText().length() >= 10) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextField10KeyTyped

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed

    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        char c = evt.getKeyChar();
        if (jTextField9.getText().length() >= 20) {
            evt.consume();
        }
        if (Character.isLetter(c) || Character.isISOControl(c) || c == KeyEvent.VK_SPACE) {
            evt = evt;
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        char c = evt.getKeyChar();
        if (jTextField5.getText().length() >= 20) {
            evt.consume();
        }
        if (Character.isLetter(c) || Character.isISOControl(c) || c == KeyEvent.VK_SPACE) {
            evt = evt;
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed

    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        char c = evt.getKeyChar();
        if (jTextField4.getText().length() >= 20) {
            evt.consume();
        }
        if (Character.isLetter(c) || Character.isISOControl(c) || c == KeyEvent.VK_SPACE) {
            evt = evt;
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char c = evt.getKeyChar();
        if (jTextField3.getText().length() >= 30) {
            evt.consume();
        }
        if (Character.isLetter(c) || Character.isISOControl(c) || c == KeyEvent.VK_SPACE) {
            evt = evt;
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char c = evt.getKeyChar();
        if (jTextField2.getText().length() >= 30) {
            evt.consume();
        }
        if (Character.isLetter(c) || Character.isISOControl(c) || c == KeyEvent.VK_SPACE) {
            evt = evt;
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
        if (jTextField1.getText().length() >= 30) {
            evt.consume();
        }
        if (Character.isLetter(c) || Character.isISOControl(c) || c == KeyEvent.VK_SPACE) {
            evt = evt;
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed

    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || jTextField14.getText().length() >= 10) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextField14KeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        FrontEndClass temp = new FrontEndClass();
        temp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String Account = jTextField14.getText();
        String field = jComboBox2.getSelectedItem().toString();
        String Value = jTextField15.getText();
        Statement stmt = null;
        if (field.equals("DOB")) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
            String DOB;
            DOB = sdf.format(jDateChooser2.getDate());
            try {
                stmt = ConnectJDBC.con.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(AccountClass.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                ResultSet fn = stmt.executeQuery("update Bank set " + field + " = '" + DOB + "' where(Account= '" + Account + "')");
                JOptionPane.showMessageDialog(null, "Account Updated!!");
                dispose();
                FrontEndClass temp = new FrontEndClass();
                temp.setVisible(true);
                dispose();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error" + ex);
            }
        } else {
            if (jTextField15.getText().equals("") || jTextField14.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Invalid Input");
            } else {

                try {
                    stmt = ConnectJDBC.con.createStatement();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountClass.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    ResultSet fn = stmt.executeQuery("update Bank set " + field + " = '" + Value + "' where(Account= '" + Account + "')");
                    JOptionPane.showMessageDialog(null, "Account Updated!!");
                    dispose();
                    FrontEndClass temp = new FrontEndClass();
                    temp.setVisible(true);
                    dispose();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error" + ex);
                }
            }
    }//GEN-LAST:event_jButton4ActionPerformed
    }
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String Account = jTextField14.getText();
        String field = jComboBox2.getSelectedItem().toString();

        if (field.equals("DOB")) {
            jTextField15.setEnabled(false);
            jDateChooser2.setEnabled(true);
        } else {
            jTextField15.setEnabled(true);
            jDateChooser2.setEnabled(false);
        }
        if (jTextField14.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Invalid Input");
        } else {
            PreparedStatement pst;
            ResultSet rs;
            try {
                pst = ConnectJDBC.con.prepareStatement("SELECT " + field + " FROM Bank WHERE (Account= '" + Account + "')");
                rs = pst.executeQuery();

                if (rs.next()) {
                    String Value = rs.getString(field);
                    jTextField16.setText(Value);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String Account = jTextField17.getText();
        String Name = jTextField18.getText();
        if ((!Account.equals("null")) || (!Name.equals("null"))) {
            JOptionPane.showMessageDialog(null, "Invalid Details!!");
        } else {
            try {
                // TODO add your handling code here:

                PreparedStatement pst;
                ResultSet rs;
                pst = ConnectJDBC.con.prepareStatement("SELECT * FROM Bank WHERE (Account= '" + Account + "')");
                rs = pst.executeQuery();
                if (rs.next()) {
                    String tempName = rs.getString("Name");
                    if (Name.equals(tempName)) {
                        SingleAccount Object = new SingleAccount();
                        Object.ShowDetails(Account);
                        Object.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Details not Match");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccountClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String Account = jTextField19.getText();
        String Name = jTextField20.getText();
        if ((!Account.equals("null")) || (!Name.equals("null"))) {
            JOptionPane.showMessageDialog(null, "Invalid Details!!");
        } else {
            try {
                PreparedStatement pst;
                ResultSet rs;
                pst = ConnectJDBC.con.prepareStatement("delete from Bank WHERE (Account= '" + Account + "' AND Name= '" + Name + "')");
                rs = pst.executeQuery();
                JOptionPane.showMessageDialog(null, "Account Deleted!!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        FrontEndClass temp = new FrontEndClass();
        temp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        FrontEndClass temp = new FrontEndClass();
        temp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField17KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || jTextField17.getText().length() >= 12) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextField17KeyTyped

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField18KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c) || c == KeyEvent.VK_DELETE) || jTextField18.getText().length() >= 30)
            evt.consume();
    }//GEN-LAST:event_jTextField18KeyTyped

    private void jTextField15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyTyped
        String temp = jComboBox2.getSelectedItem().toString();
        if (temp.equals("Mobile")) {
            char c = evt.getKeyChar();
            if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || jTextField15.getText().length() >= 10) {
                getToolkit().beep();
                evt.consume();
            }
        } else if (temp.equals("DOB")) {
            char c = evt.getKeyChar();
            if (jTextField15.getText().length() >= 11) {
                evt.consume();
            }
        } else {
            char c = evt.getKeyChar();

            if (jTextField1.getText().length() >= 30) {
                evt.consume();
            }
            if (Character.isLetter(c) || Character.isISOControl(c) || c == KeyEvent.VK_SPACE) {
                evt = evt;
            } else {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jTextField15KeyTyped

    private void jTextField16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16KeyTyped

    private void jTextField19KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField19KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || jTextField19.getText().length() >= 12) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField19KeyTyped

    private void jTextField20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField20KeyTyped
        char c = evt.getKeyChar();
        if (jTextField20.getText().length() >= 30) {
            evt.consume();
        }
        if (Character.isLetter(c) || Character.isISOControl(c) || c == KeyEvent.VK_SPACE) {
            evt = evt;
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField20KeyTyped

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox2KeyTyped

    }//GEN-LAST:event_jComboBox2KeyTyped

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ItemStateChanged
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
            java.util.logging.Logger.getLogger(AccountClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
