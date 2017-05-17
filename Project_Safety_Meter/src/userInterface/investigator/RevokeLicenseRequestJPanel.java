/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.investigator;

import business.enterprise.Enterprise;
import business.enterprise.FireArmLicenseEnterprise;
import business.network.Network;
import business.organization.AuthorityOrganization;
import business.organization.Organization;
import business.person.Person;
import business.person.PersonDirectory;
import business.userAccount.UserAccount;
import business.workQueue.LicenseWorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ajinkya
 */
public class RevokeLicenseRequestJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    private Person person;
    private UserAccount userAccount;
    private FireArmLicenseEnterprise fireArmsEnterprise;
    private AuthorityOrganization authorityOrg;
    
    /**
     * Creates new form RevokeLicenseRequestJPanel
     */
    public RevokeLicenseRequestJPanel(JPanel userProcessContainer, PersonDirectory personDirectory, Person person, UserAccount user, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.person = person;
        this.personDirectory = personDirectory;
        this.userAccount = user;
       
        
        
        for(int enterpriseKeys : network.getEnterpriseDirectory().getEnterpriseList().keySet()){
            Enterprise currentEnterprise  = network.getEnterpriseDirectory().getEnterpriseList().get(enterpriseKeys);
            if(currentEnterprise instanceof FireArmLicenseEnterprise){
                this.fireArmsEnterprise = (FireArmLicenseEnterprise) currentEnterprise;
                for(int organizationKeys : fireArmsEnterprise.getOrganizationDirectory().getOrganizationDirectory().keySet()){
                    Organization org = fireArmsEnterprise.getOrganizationDirectory().getOrganizationDirectory().get(organizationKeys);
                     if(org instanceof AuthorityOrganization){
                        authorityOrg = (AuthorityOrganization) org;
                        break;
                    }
                }
            }
        }
        
        
        populateEmployeeCombo();
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
        employeeJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        reasonJTextField = new javax.swing.JTextField();
        sendJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 254, 242));

        jLabel1.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel1.setText("Select Authority Officer");

        employeeJComboBox.setBackground(new java.awt.Color(237, 238, 225));
        employeeJComboBox.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("License Revocation Request");

        jLabel4.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel4.setText("Reason");

        reasonJTextField.setBackground(new java.awt.Color(237, 238, 225));
        reasonJTextField.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        reasonJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reasonJTextFieldActionPerformed(evt);
            }
        });

        sendJButton.setBackground(new java.awt.Color(237, 238, 225));
        sendJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        sendJButton.setText("Send");
        sendJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendJButtonActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(237, 238, 225));
        backJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        backJButton.setText("<< Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(202, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sendJButton)
                    .addComponent(employeeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(reasonJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(employeeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(reasonJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendJButton)
                    .addComponent(backJButton))
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reasonJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reasonJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reasonJTextFieldActionPerformed

    private void sendJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendJButtonActionPerformed
        String message = "License Revocation Request";
        String reason = reasonJTextField.getText().trim();
        UserAccount receiver = (UserAccount) employeeJComboBox.getSelectedItem();
        if(!(message.isEmpty()) && !(reason.isEmpty())){
            LicenseWorkRequest request = new LicenseWorkRequest();
            request.setHolder(person);
            request.setLicensePeriod(0);
            request.setReason(reason);
            request.setMessage(message);
            request.setStatus("New Revoke Request");
            request.setSender(userAccount);
            request.setReceiver(receiver);
            JOptionPane.showMessageDialog(backJButton, "Request Sent");
            userAccount.getOutQueue().addWorkRequest(request);
            receiver.getInQueue().addWorkRequest(request);
            //messageJTextField.setText("");
            reasonJTextField.setText("");
        }
        else{
            JOptionPane.showMessageDialog(backJButton, "Please fill Message and Reason Fields");
        }
    }//GEN-LAST:event_sendJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField reasonJTextField;
    private javax.swing.JButton sendJButton;
    // End of variables declaration//GEN-END:variables

    private void populateEmployeeCombo() {
        employeeJComboBox.removeAllItems();
        
        for(String employeeKeys : authorityOrg.getUserAccountDirectory().getUserAccountDirectory().keySet()){
            UserAccount user = authorityOrg.getUserAccountDirectory().getUserAccountDirectory().get(employeeKeys);
            employeeJComboBox.addItem(user);
        }
    }
}