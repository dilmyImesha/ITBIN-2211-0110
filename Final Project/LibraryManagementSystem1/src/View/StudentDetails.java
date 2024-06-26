/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.StudentController;
import javax.swing.JTable;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dilmi
 */
public class StudentDetails extends javax.swing.JFrame {

    private StudentController controller;

    public StudentDetails() {
        initComponents();
        controller = new StudentController(this);
        controller.autoID();
        controller.tableUpdate();
        
    }
    
    public JTable getStudentTable() {
        return jTable1;
    }

     public void setStudentID(String id) {
        txtId.setText(id);
    }

    public void updateTable(Vector<Vector<String>> data) {
        DefaultTableModel DFT = (DefaultTableModel) jTable1.getModel();
        DFT.setRowCount(0);
        for (Vector<String> row : data) {
            DFT.addRow(row);
        }
    }
    
    public void clearFields() {
        txtId.setText("");
        txtFullName.setText("");
        txtAddress.setText("");
        IT.setSelected(false);
        education.setSelected(false);
        management.setSelected(false);
        Science.setSelected(false);
    }
    
    private String getSelectedFaculty() {
    StringBuilder faculty = new StringBuilder();
    if (IT.isSelected()) faculty.append("IT,");
    if (education.isSelected()) faculty.append("Education,");
    if (management.isSelected()) faculty.append("Management,");
    if (Science.isSelected()) faculty.append("Science,");
    if (faculty.length() > 0) faculty.setLength(faculty.length() - 1);
    return faculty.toString();
}
    
    private void setSelectedFaculty(String faculty) {
    IT.setSelected(faculty.contains("IT"));
    education.setSelected(faculty.contains("Education"));
    management.setSelected(faculty.contains("Management"));
    Science.setSelected(faculty.contains("Science"));
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupRadio = new javax.swing.ButtonGroup();
        buttonGroupCheckBox = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        malebtn = new javax.swing.JRadioButton();
        femalebtn = new javax.swing.JRadioButton();
        IT = new javax.swing.JCheckBox();
        education = new javax.swing.JCheckBox();
        management = new javax.swing.JCheckBox();
        Science = new javax.swing.JCheckBox();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Student Details Form");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 37, 261, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Full Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 347, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Faculty");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 415, -1, -1));

        txtFullName.setText(" ");
        txtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 307, -1));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 307, -1));

        buttonGroupRadio.add(malebtn);
        malebtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        malebtn.setText("Male");
        malebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malebtnActionPerformed(evt);
            }
        });
        jPanel1.add(malebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 348, -1, -1));

        buttonGroupRadio.add(femalebtn);
        femalebtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        femalebtn.setText("Female");
        femalebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femalebtnActionPerformed(evt);
            }
        });
        jPanel1.add(femalebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 348, -1, -1));

        buttonGroupCheckBox.add(IT);
        IT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        IT.setText("IT");
        jPanel1.add(IT, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 416, -1, -1));

        buttonGroupCheckBox.add(education);
        education.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        education.setText("Education");
        education.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                educationActionPerformed(evt);
            }
        });
        jPanel1.add(education, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        buttonGroupCheckBox.add(management);
        management.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        management.setText("Management");
        jPanel1.add(management, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 475, -1, -1));

        buttonGroupCheckBox.add(Science);
        Science.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Science.setText("Science");
        Science.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScienceActionPerformed(evt);
            }
        });
        jPanel1.add(Science, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(102, 102, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, -1, -1));

        btnDelete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 102, 102));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, -1, -1));

        btnSubmit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(0, 0, 204));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, -1, -1));

        jButton4.setBackground(new java.awt.Color(102, 102, 255));
        jButton4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 540, 110, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "StudentID", "Student_name", "Address", "Gender", "Faculty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 670, 160));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Student Details Table");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 261, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bluenew.jpg"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 300));

        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("StudentID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 122, -1, 30));

        txtId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtId.setText("jLabel10");
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 220, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1173, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void malebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_malebtnActionPerformed

    private void femalebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femalebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femalebtnActionPerformed

    private void educationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_educationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_educationActionPerformed

    private void ScienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScienceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ScienceActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
      String studentID = txtId.getText();
        String studentName = txtFullName.getText();
        String address = txtAddress.getText();
        
        String faculty = getSelectedFaculty();
       
        
 String gender = malebtn.isSelected() ? "Male" : "Female";
        
        
        
 

        controller.addStudent(studentID, studentName, address, gender, faculty);
        clearFields();
        controller.autoID();
        controller.tableUpdate();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
Home g = new Home();
         g.setVisible(true);
         this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String studentID = txtId.getText();
        String studentName = txtFullName.getText();
        String address = txtAddress.getText();
        String gender = malebtn.isSelected() ? "Male" : "Female";
        String faculty = getSelectedFaculty();

        controller.updateStudent(studentID, studentName, address, gender, faculty);
        clearFields();
        controller.autoID();
        controller.tableUpdate();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
     String studentID = txtId.getText();
        controller.deleteStudent(studentID);
        clearFields();
        controller.autoID();
        controller.tableUpdate();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int selectedIndex = jTable1.getSelectedRow();
    if (selectedIndex != -1) {
        DefaultTableModel DFT = (DefaultTableModel) jTable1.getModel();
        txtId.setText(DFT.getValueAt(selectedIndex, 0).toString());
        txtFullName.setText(DFT.getValueAt(selectedIndex, 1).toString());
        txtAddress.setText(DFT.getValueAt(selectedIndex, 2).toString());
        String gender = DFT.getValueAt(selectedIndex, 4).toString();
        if (gender.equals("Male")) {
            malebtn.setSelected(true);
            femalebtn.setSelected(false);
        } else {
            malebtn.setSelected(false);
            femalebtn.setSelected(true);
        }
        
        String faculty = DFT.getValueAt(selectedIndex, 5).toString();
        setSelectedFaculty(faculty);
    }//GEN-LAST:event_jTable1MouseClicked
    }
    

    
    
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
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox IT;
    private javax.swing.JCheckBox Science;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroupCheckBox;
    private javax.swing.ButtonGroup buttonGroupRadio;
    private javax.swing.JCheckBox education;
    private javax.swing.JRadioButton femalebtn;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton malebtn;
    private javax.swing.JCheckBox management;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JLabel txtId;
    // End of variables declaration//GEN-END:variables

}
