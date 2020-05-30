/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ProfileController;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class Interface extends javax.swing.JFrame {
    
    // id cua nguoi dung
    int id_user;
    // loai tai khoan 0 =admin, 1 = staff
    boolean type;
    public Interface(int i, boolean t) {
        initComponents();
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setTitle("Home");
        id_user = i;  type = t;
        reloadProfile();
        if (type){
//            adminBtn.setEnabled(false);
        } else {
//            staffBtn.setEnabled(false);
        }
    }
    
    private void reloadProfile(){
        if(!type){
            try {
                //admin
                ProfileController.getAdminInfoById(id_user, idInfo, nameInfo, phoneInfo, emailInfo,
                        addrInfo, shiftInfo, wdateInfo, hiLabel, addrLabel, shiftLabel, wdateLabel);
            } catch (SQLException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                ProfileController.getStaffInfoById(id_user, idInfo, nameInfo, phoneInfo, emailInfo, 
                        addrInfo, shiftInfo, wdateInfo, hiLabel);
            } catch (SQLException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home = new javax.swing.JTabbedPane();
        profileTab = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        addrLabel = new javax.swing.JLabel();
        shiftLabel = new javax.swing.JLabel();
        wdateLabel = new javax.swing.JLabel();
        hiLabel = new javax.swing.JLabel();
        idInfo = new javax.swing.JLabel();
        nameInfo = new javax.swing.JLabel();
        phoneInfo = new javax.swing.JLabel();
        emailInfo = new javax.swing.JLabel();
        addrInfo = new javax.swing.JLabel();
        shiftInfo = new javax.swing.JLabel();
        wdateInfo = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();
        bookTab = new javax.swing.JPanel();
        billTab = new javax.swing.JPanel();
        reportTab = new javax.swing.JPanel();
        adminTab = new javax.swing.JPanel();
        staffTab = new javax.swing.JPanel();
        customerTab = new javax.swing.JPanel();
        cidLabel = new javax.swing.JLabel();
        cnameLabel = new javax.swing.JLabel();
        cphoneLabel = new javax.swing.JLabel();
        cmailLabel = new javax.swing.JLabel();
        caddrLabel = new javax.swing.JLabel();
        cregdateLabel = new javax.swing.JLabel();
        expdateLabel = new javax.swing.JLabel();
        membershipLabel = new javax.swing.JLabel();
        cidField = new javax.swing.JTextField();
        cnameField = new javax.swing.JTextField();
        cphoneField = new javax.swing.JTextField();
        cmailField = new javax.swing.JTextField();
        caddrField = new javax.swing.JTextField();
        cregdField = new javax.swing.JTextField();
        cexpdField = new javax.swing.JTextField();
        cmembershipField = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logoutBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logoutBtn.setText("Log out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        idLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idLabel.setText("ID:");

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameLabel.setText("Name:");

        phoneLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        phoneLabel.setText("Phone:");

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emailLabel.setText("Email:");

        addrLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addrLabel.setText("Address:");

        shiftLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        shiftLabel.setText("Shift count:");

        wdateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        wdateLabel.setText("Start work date:");

        hiLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hiLabel.setText("Hello");

        idInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idInfo.setText("null");

        nameInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameInfo.setText("null");

        phoneInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phoneInfo.setText("null");

        emailInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailInfo.setText("null");

        addrInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addrInfo.setText("null");

        shiftInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        shiftInfo.setText("null");

        wdateInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wdateInfo.setText("null");

        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profileTabLayout = new javax.swing.GroupLayout(profileTab);
        profileTab.setLayout(profileTabLayout);
        profileTabLayout.setHorizontalGroup(
            profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hiLabel)
                .addGap(213, 213, 213))
            .addGroup(profileTabLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(profileTabLayout.createSequentialGroup()
                        .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idLabel)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel)
                            .addComponent(phoneLabel)
                            .addComponent(emailLabel)
                            .addComponent(addrLabel)
                            .addComponent(shiftLabel)
                            .addComponent(wdateLabel))
                        .addGap(18, 18, 18)
                        .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameInfo)
                            .addComponent(phoneInfo)
                            .addComponent(emailInfo)
                            .addComponent(addrInfo)
                            .addComponent(shiftInfo)
                            .addComponent(wdateInfo)))
                    .addGroup(profileTabLayout.createSequentialGroup()
                        .addComponent(refreshBtn)
                        .addGap(122, 122, 122)))
                .addContainerGap(363, Short.MAX_VALUE))
        );
        profileTabLayout.setVerticalGroup(
            profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileTabLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(hiLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idInfo))
                .addGap(18, 18, 18)
                .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameInfo))
                .addGap(18, 18, 18)
                .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneInfo))
                .addGap(18, 18, 18)
                .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailInfo))
                .addGap(18, 18, 18)
                .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addrLabel)
                    .addComponent(addrInfo))
                .addGap(18, 18, 18)
                .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shiftLabel)
                    .addComponent(shiftInfo))
                .addGap(18, 18, 18)
                .addGroup(profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wdateLabel)
                    .addComponent(wdateInfo))
                .addGap(48, 48, 48)
                .addComponent(refreshBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        home.addTab("Profile", profileTab);

        javax.swing.GroupLayout bookTabLayout = new javax.swing.GroupLayout(bookTab);
        bookTab.setLayout(bookTabLayout);
        bookTabLayout.setHorizontalGroup(
            bookTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        bookTabLayout.setVerticalGroup(
            bookTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );

        home.addTab("Book", bookTab);

        javax.swing.GroupLayout billTabLayout = new javax.swing.GroupLayout(billTab);
        billTab.setLayout(billTabLayout);
        billTabLayout.setHorizontalGroup(
            billTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        billTabLayout.setVerticalGroup(
            billTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );

        home.addTab("Bill", billTab);

        javax.swing.GroupLayout reportTabLayout = new javax.swing.GroupLayout(reportTab);
        reportTab.setLayout(reportTabLayout);
        reportTabLayout.setHorizontalGroup(
            reportTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        reportTabLayout.setVerticalGroup(
            reportTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );

        home.addTab("Report", reportTab);

        javax.swing.GroupLayout adminTabLayout = new javax.swing.GroupLayout(adminTab);
        adminTab.setLayout(adminTabLayout);
        adminTabLayout.setHorizontalGroup(
            adminTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        adminTabLayout.setVerticalGroup(
            adminTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );

        home.addTab("Admin", adminTab);

        javax.swing.GroupLayout staffTabLayout = new javax.swing.GroupLayout(staffTab);
        staffTab.setLayout(staffTabLayout);
        staffTabLayout.setHorizontalGroup(
            staffTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        staffTabLayout.setVerticalGroup(
            staffTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );

        home.addTab("Staff", staffTab);

        cidLabel.setText("ID:");

        cnameLabel.setText("Name:");

        cphoneLabel.setText("Phone:");

        cmailLabel.setText("Email:");

        caddrLabel.setText("Address:");

        cregdateLabel.setText("Register date:");

        expdateLabel.setText("Expired date:");

        membershipLabel.setText("Membership:");

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");

        removeBtn.setText("Remove");

        javax.swing.GroupLayout customerTabLayout = new javax.swing.GroupLayout(customerTab);
        customerTab.setLayout(customerTabLayout);
        customerTabLayout.setHorizontalGroup(
            customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(membershipLabel)
                    .addComponent(expdateLabel)
                    .addComponent(cregdateLabel)
                    .addComponent(caddrLabel)
                    .addComponent(cmailLabel)
                    .addComponent(cphoneLabel)
                    .addComponent(cnameLabel)
                    .addComponent(cidLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cidField)
                    .addComponent(cnameField)
                    .addComponent(cphoneField)
                    .addComponent(cmailField)
                    .addComponent(caddrField)
                    .addComponent(cregdField)
                    .addComponent(cexpdField, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(cmembershipField))
                .addContainerGap())
            .addGroup(customerTabLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(createBtn)
                .addGap(18, 18, 18)
                .addComponent(updateBtn)
                .addGap(18, 18, 18)
                .addComponent(removeBtn)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        customerTabLayout.setVerticalGroup(
            customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerTabLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidLabel)
                    .addComponent(cidField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnameLabel)
                    .addComponent(cnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cphoneLabel)
                    .addComponent(cphoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmailLabel)
                    .addComponent(cmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caddrLabel)
                    .addComponent(caddrField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cregdateLabel)
                    .addComponent(cregdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expdateLabel)
                    .addComponent(cexpdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(membershipLabel)
                    .addComponent(cmembershipField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(customerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBtn)
                    .addComponent(updateBtn)
                    .addComponent(removeBtn))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        home.addTab("Customer", customerTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        this.dispose();
        LoginOption.getInstance().setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        reloadProfile();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        AddCustomer ac=new AddCustomer();
        ac.setVisible(true);
    }//GEN-LAST:event_createBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addrInfo;
    private javax.swing.JLabel addrLabel;
    private javax.swing.JPanel adminTab;
    private javax.swing.JPanel billTab;
    private javax.swing.JPanel bookTab;
    private javax.swing.JTextField caddrField;
    private javax.swing.JLabel caddrLabel;
    private javax.swing.JTextField cexpdField;
    private javax.swing.JTextField cidField;
    private javax.swing.JLabel cidLabel;
    private javax.swing.JTextField cmailField;
    private javax.swing.JLabel cmailLabel;
    private javax.swing.JTextField cmembershipField;
    private javax.swing.JTextField cnameField;
    private javax.swing.JLabel cnameLabel;
    private javax.swing.JTextField cphoneField;
    private javax.swing.JLabel cphoneLabel;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField cregdField;
    private javax.swing.JLabel cregdateLabel;
    private javax.swing.JPanel customerTab;
    private javax.swing.JLabel emailInfo;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel expdateLabel;
    private javax.swing.JLabel hiLabel;
    private javax.swing.JTabbedPane home;
    private javax.swing.JLabel idInfo;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel membershipLabel;
    private javax.swing.JLabel nameInfo;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel phoneInfo;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JPanel profileTab;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton removeBtn;
    private javax.swing.JPanel reportTab;
    private javax.swing.JLabel shiftInfo;
    private javax.swing.JLabel shiftLabel;
    private javax.swing.JPanel staffTab;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel wdateInfo;
    private javax.swing.JLabel wdateLabel;
    // End of variables declaration//GEN-END:variables
}
