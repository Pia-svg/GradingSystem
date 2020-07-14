/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GS_SYSTEM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Locale.Category;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joyce Balagat
 */
public class Students extends javax.swing.JFrame {

    /**
     * Creates new form Students
     */
    public Students() {
        initComponents();
        table_update();
        jButtonUpdate.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldfirstname = new javax.swing.JTextField();
        jTextFieldlastname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldaddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAdd = new javax.swing.JButton();
        jButtonEnableEdit = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("ADD STUDENT");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("FIRSTNAME");

        jTextFieldfirstname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldlastname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("LASTNAME");

        jTextFieldage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("AGE");

        jTextFieldaddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("ADDRESS");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Firstname", "Lastname", "Age", "Gender", "Address"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonAdd.setBackground(new java.awt.Color(0, 204, 0));
        jButtonAdd.setText("ADD");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonEnableEdit.setBackground(new java.awt.Color(153, 153, 255));
        jButtonEnableEdit.setText("ENABLE EDIT");
        jButtonEnableEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnableEditActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(0, 0, 255));
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Gender");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));

        jButton1.setText("Main Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                        .addComponent(jSeparator1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonEnableEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox1, 0, 278, Short.MAX_VALUE)
                            .addComponent(jTextFieldage)
                            .addComponent(jTextFieldlastname)
                            .addComponent(jTextFieldfirstname)
                            .addComponent(jTextFieldaddress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldlastname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEnableEdit)
                            .addComponent(jButtonUpdate))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     Connection conn;
    PreparedStatement pst;

    private void table_update() {

        try {
            int c;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/gradingdb", "root", "");
                pst = conn.prepareStatement("select * from students");

                ResultSet rs = pst.executeQuery();

                ResultSetMetaData rsd = rs.getMetaData();
                c = rsd.getColumnCount();

                DefaultTableModel d = (DefaultTableModel) jTable1.getModel();
                d.setRowCount(0);

                while (rs.next()) {
                    Vector v2 = new Vector();

                    for (int i = 1; i <= c; i++) {
                        v2.add(rs.getString("studentID"));
                        v2.add(rs.getString("firstname"));
                        v2.add(rs.getString("lastname"));
                        v2.add(rs.getString("age"));
                        v2.add(rs.getString("gender"));                       
                        v2.add(rs.getString("address"));

                    }

                    d.addRow(v2);

                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel) jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();

        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        String fname = jTextFieldfirstname.getText();
        String lname = jTextFieldlastname.getText();
        String age = jTextFieldage.getText();
        String address = jTextFieldaddress.getText();
        String gender = jComboBox1.getSelectedItem().toString();
        String wholeName = fname + " " + lname;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gradingdb", "root", "");
            pst = conn.prepareStatement("update students set firstname=?,lastname=?,age=?,gender=?,address=?,wholeName=? where studentID=?");
            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setString(3, age);
            pst.setString(4, gender);
            pst.setString(5, address);
            pst.setString(6, wholeName);
            pst.setInt(7, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Student Updated");
            table_update();
            
            jTextFieldfirstname.setText("");
            jTextFieldlastname.setText("");
            jTextFieldage.setText("");
            jTextFieldaddress.setText("");
            jComboBox1.setSelectedIndex(-1);
            jButtonAdd.setEnabled(true);
            jButtonUpdate.setEnabled(false);
            jButtonEnableEdit.setEnabled(true);

            

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        String fname = jTextFieldfirstname.getText();
        String lname = jTextFieldlastname.getText();
        String age = jTextFieldage.getText();
        String address = jTextFieldaddress.getText();
        String wholeName = fname + " " + lname;
        String gender = jComboBox1.getSelectedItem().toString();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gradingdb", "root", "");
            pst = conn.prepareStatement("insert into students(firstname,lastname,age,gender,address,wholeName)values(?,?,?,?,?,?) ");
            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setString(3, age);
            pst.setString(4, gender);
            pst.setString(5, address);
            pst.setString(6, wholeName);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Student Added");
            table_update();

            jTextFieldfirstname.setText("");
            jTextFieldlastname.setText("");
            jTextFieldage.setText("");
            jTextFieldaddress.setText("");
            jComboBox1.setSelectedIndex(-1);
            
            jButtonUpdate.setEnabled(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel d1 = (DefaultTableModel) jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();

        jTextFieldfirstname.setText(d1.getValueAt(selectIndex, 1).toString());
        jTextFieldlastname.setText(d1.getValueAt(selectIndex, 2).toString());
        jTextFieldage.setText(d1.getValueAt(selectIndex, 3).toString());
        jComboBox1.setSelectedItem(d1.getValueAt(selectIndex,4).toString());
        jTextFieldaddress.setText(d1.getValueAt(selectIndex, 5).toString());
        
        jTextFieldfirstname.setEnabled(false);
        jTextFieldlastname.setEnabled(false);
        jTextFieldage.setEnabled(false);
        jTextFieldaddress.setEnabled(false);
        jComboBox1.setEnabled(false);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonEnableEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnableEditActionPerformed
        // TODO add your handling code here:
        jTextFieldfirstname.setEnabled(true);
        jTextFieldlastname.setEnabled(true);
        jTextFieldage.setEnabled(true);
        jTextFieldaddress.setEnabled(true);
        jButtonUpdate.setEnabled(true);
        jButtonAdd.setEnabled(false);
        jComboBox1.setEnabled(true);
        jButtonEnableEdit.setEnabled(false);
    }//GEN-LAST:event_jButtonEnableEditActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Main_Menu form = new Main_Menu();
        form.setVisible(true);
        form.pack();
        this.dispose();
        
        
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
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Students().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonEnableEdit;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldaddress;
    private javax.swing.JTextField jTextFieldage;
    private javax.swing.JTextField jTextFieldfirstname;
    private javax.swing.JTextField jTextFieldlastname;
    // End of variables declaration//GEN-END:variables
}