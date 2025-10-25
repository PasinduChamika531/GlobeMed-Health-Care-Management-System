package ui;

import model.Staff;
import session.SessionManager;

/**
 *
 * @author Pasindu
 */
public class HomeFrame extends javax.swing.JFrame {

    
    public HomeFrame() {
        initComponents();
        checkLoggedUser();
    }
    
    

    private void checkLoggedUser(){
        Staff currentStaff = SessionManager.getInstance().getCurrentStaff();
        if(currentStaff != null){
            
            nameLabel1.setText("Welcome "+currentStaff.getName());
            
            if(currentStaff.getRole().equals("NURSE") || currentStaff.getRole().equals("PHARMACIST")||currentStaff.getRole().equals("RECEPTIONIST")){
                btnManageStaff.setEnabled(false);
                btnManageFacility.setEnabled(false);
                btnDoctorSchedule.setEnabled(false);
            }else if(currentStaff.getRole().equals("DOCTOR")){
                btnManageStaff.setEnabled(false);
                btnManageFacility.setEnabled(false);
            }
            
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameLabel1 = new javax.swing.JLabel();
        btnManageStaff = new javax.swing.JButton();
        btnManagePatient = new javax.swing.JButton();
        btnManageFacility = new javax.swing.JButton();
        btnScheduleAppointments = new javax.swing.JButton();
        btnDoctorSchedule = new javax.swing.JButton();
        btnSignout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        nameLabel1.setText("Welcome");

        btnManageStaff.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnManageStaff.setText("Manage Staff");
        btnManageStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStaffActionPerformed(evt);
            }
        });

        btnManagePatient.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnManagePatient.setText("Manage Patient");
        btnManagePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePatientActionPerformed(evt);
            }
        });

        btnManageFacility.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnManageFacility.setText("Manage Facility");
        btnManageFacility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageFacilityActionPerformed(evt);
            }
        });

        btnScheduleAppointments.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnScheduleAppointments.setText("Schedule Appointments");
        btnScheduleAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleAppointmentsActionPerformed(evt);
            }
        });

        btnDoctorSchedule.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDoctorSchedule.setText("Doctor's Schedule");
        btnDoctorSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorScheduleActionPerformed(evt);
            }
        });

        btnSignout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSignout.setText("Signout");
        btnSignout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageFacility, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnManageStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnManagePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnScheduleAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSignout, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDoctorSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nameLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(nameLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoctorSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManagePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnScheduleAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageFacility, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSignout, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStaffActionPerformed
        new StaffFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnManageStaffActionPerformed

    private void btnManagePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePatientActionPerformed
       new PatientFrame().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnManagePatientActionPerformed

    private void btnManageFacilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageFacilityActionPerformed
        new FacilityFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnManageFacilityActionPerformed

    private void btnScheduleAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleAppointmentsActionPerformed
        new AppointmentFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnScheduleAppointmentsActionPerformed

    private void btnDoctorScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorScheduleActionPerformed
        new DoctorScheduleFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDoctorScheduleActionPerformed

    private void btnSignoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignoutActionPerformed
        SessionManager.getInstance().clearSession();
        new SignInFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSignoutActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoctorSchedule;
    private javax.swing.JButton btnManageFacility;
    private javax.swing.JButton btnManagePatient;
    private javax.swing.JButton btnManageStaff;
    private javax.swing.JButton btnScheduleAppointments;
    private javax.swing.JButton btnSignout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel1;
    // End of variables declaration//GEN-END:variables
}
