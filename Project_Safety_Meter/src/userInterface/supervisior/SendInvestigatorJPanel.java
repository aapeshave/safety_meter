/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.supervisior;

import business.crime.CrimeIncident;
import business.crime.CrimeRecord;
import business.employee.Employee;
import business.enterprise.Enterprise;
import business.organization.AuthorityOrganization;
import business.organization.Organization;
import business.organization.SuperVisionOrganization;
import business.userAccount.UserAccount;
import business.workQueue.InvestigationWorkRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ajinkya
 */
public class SendInvestigatorJPanel extends javax.swing.JPanel {
    private Enterprise enterprise;
    private JPanel userProcessContainer;
    private CrimeIncident incident;
    private UserAccount user;
    /**
     * Creates new form SendInvestigatorJPanel
     */
    SendInvestigatorJPanel(JPanel userProcessContainer, CrimeIncident crime, UserAccount user, Enterprise enterprise,CrimeRecord crimes) {
        initComponents();
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.incident = crime;
        this.user = user;
        popOrganizationComboBox();
    }
    
    public void popOrganizationComboBox() {
        organizationJComboBox.removeAllItems();
        for(Integer organizationkeys : enterprise.getOrganizationDirectory().getOrganizationDirectory().keySet()){
            Organization organization = enterprise.getOrganizationDirectory().getOrganizationDirectory().get(organizationkeys);
            if(!(organization instanceof AuthorityOrganization) && !(organization instanceof SuperVisionOrganization))
                organizationJComboBox.addItem(organization);
        }
    }
    public void populateEmployeeComboBox(Organization organization){
        employeeJComboBox.removeAllItems();
        
        for (String employeekeys : organization.getUserAccountDirectory().getUserAccountDirectory().keySet()){
            UserAccount employee = organization.getUserAccountDirectory().getUserAccountDirectory().get(employeekeys);
            employeeJComboBox.addItem(employee);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        assignJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 254, 242));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Crime Investigation");

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel2.setText("Select Organization");

        organizationJComboBox.setBackground(new java.awt.Color(237, 238, 225));
        organizationJComboBox.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel3.setText("Select Employee");

        employeeJComboBox.setBackground(new java.awt.Color(237, 238, 225));
        employeeJComboBox.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        assignJButton.setBackground(new java.awt.Color(237, 238, 225));
        assignJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        assignJButton.setText("Assign Case");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(237, 238, 225));
        backJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeJComboBox, 0, 251, Short.MAX_VALUE)
                    .addComponent(organizationJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(314, 314, 314))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton)
                .addGap(200, 200, 200)
                .addComponent(assignJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(employeeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignJButton)
                    .addComponent(backJButton))
                .addContainerGap(193, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SupervisiorWorkArea dwjp = (SupervisiorWorkArea) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        Organization selectedOrg = (Organization) organizationJComboBox.getSelectedItem();
        UserAccount selectedUser = (UserAccount) employeeJComboBox.getSelectedItem();
        incident.setAssignedTo(selectedUser.getEmployee().getPerson());
        incident.setStatus("Assigned to Investigator");
        
        UserAccount sender = user;
        UserAccount receiver = selectedUser;
        InvestigationWorkRequest workRequest = new InvestigationWorkRequest();
        
        workRequest.setIncident(incident);
        workRequest.setReceiver(receiver);
        workRequest.setSender(sender);
        workRequest.setStatus("Assigned to "+selectedOrg.toString());
        
        sender.getOutQueue().addWorkRequest(workRequest);
        receiver.getInQueue().addWorkRequest(workRequest);
        JOptionPane.showMessageDialog(assignJButton, "Incident Assigned to "+ selectedOrg.toString());
    }//GEN-LAST:event_assignJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox organizationJComboBox;
    // End of variables declaration//GEN-END:variables
}
