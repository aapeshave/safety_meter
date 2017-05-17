/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AuthorityOfficer;

import business.crime.CrimeRecord;
import business.enterprise.Enterprise;
import business.enterprise.FireArmLicenseEnterprise;
import business.license.FireArmLicense;
import business.license.LicenseDirectory;
import business.network.Network;
import business.organization.AuthorityOrganization;
import business.organization.Organization;
import business.person.Person;
import business.person.PersonDirectory;
import business.userAccount.UserAccount;
import business.workQueue.LicenseWorkRequest;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ajinkya
 */
public class AuthorityOfficerWorkArea extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount user;
    private CrimeRecord crimeRecord;
    private PersonDirectory personDirectory;
    private LicenseDirectory licenseDirectory;
    private AuthorityOrganization org;
    /**
     * Creates new form AuthorityOfficerWorkArea
     */
    public AuthorityOfficerWorkArea() {
        initComponents();
        
    }

    public AuthorityOfficerWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network) {
        this();
        welcomeJLabel.setText("Welcome "+ account.getEmployee().getPerson());
        this.userProcessContainer = userProcessContainer;
        this.user = account;
        this.crimeRecord = network.getCrimeRecords();
        this.personDirectory = network.getPersonDirectory();
        org = (AuthorityOrganization) organization;
        this.licenseDirectory = org.getLicenseDirectory();
        network.setNumOfLicenses(this.licenseDirectory.getLicenseList().size());
        //JOptionPane.showMessageDialog(jScrollPane1, network.getNumOfLicenses());
        populateQueue();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeJLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inQueueJTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        viewRequestJButton = new javax.swing.JButton();
        proceedRequestJButton = new javax.swing.JButton();
        viewLicenseJButton = new javax.swing.JButton();
        revokeJButton = new javax.swing.JButton();

        welcomeJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        welcomeJLabel.setText("Welcome Label");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel1.setText("Your Incoming Requests");

        inQueueJTable.setBackground(new java.awt.Color(238, 238, 238));
        inQueueJTable.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        inQueueJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Date", "Sender", "Person Name", "Message", "License Period", "Reason", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inQueueJTable.setToolTipText("");
        jScrollPane1.setViewportView(inQueueJTable);

        viewRequestJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        viewRequestJButton.setText("View Request");
        viewRequestJButton.setToolTipText("");
        viewRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestJButtonActionPerformed(evt);
            }
        });

        proceedRequestJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        proceedRequestJButton.setText("Proceed Request");
        proceedRequestJButton.setToolTipText("");
        proceedRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedRequestJButtonActionPerformed(evt);
            }
        });

        viewLicenseJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        viewLicenseJButton.setText("View License Holders");
        viewLicenseJButton.setToolTipText("");
        viewLicenseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLicenseJButtonActionPerformed(evt);
            }
        });

        revokeJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        revokeJButton.setText("Revoke License");
        revokeJButton.setToolTipText("");
        revokeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revokeJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcomeJLabel)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewRequestJButton)
                                .addGap(18, 18, 18)
                                .addComponent(proceedRequestJButton)
                                .addGap(18, 18, 18)
                                .addComponent(viewLicenseJButton)
                                .addGap(18, 18, 18)
                                .addComponent(revokeJButton)))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeJLabel)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewRequestJButton)
                    .addComponent(proceedRequestJButton)
                    .addComponent(viewLicenseJButton)
                    .addComponent(revokeJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestJButtonActionPerformed
        int result = inQueueJTable.getSelectedRow();
        if(result < 0){
            JOptionPane.showMessageDialog(jScrollPane1, "Please Select a Row From Table.");
        }
        else{
            LicenseWorkRequest request = (LicenseWorkRequest) inQueueJTable.getValueAt(result, 6);
            ViewWorkRequestJPanel viewRequest = new ViewWorkRequestJPanel(userProcessContainer, request);
            userProcessContainer.add(viewRequest);
            CardLayout layout  = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_viewRequestJButtonActionPerformed

    private void proceedRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedRequestJButtonActionPerformed
        int result = inQueueJTable.getSelectedRow();
        if(result < 0){
            JOptionPane.showMessageDialog(jScrollPane1, "Please Select a Row From Table.");
        }
        else{
            
            LicenseWorkRequest request = (LicenseWorkRequest) inQueueJTable.getValueAt(result, 6);
            if(request.getStatus().equals("Complete")){
                JOptionPane.showMessageDialog(jScrollPane1, "Request is already completed");
            }
            else{
              if(request.getLicensePeriod()>0){
                    ProceedRequestJPanel viewRequest = new ProceedRequestJPanel(userProcessContainer, request, licenseDirectory);
                    userProcessContainer.add(viewRequest);
                    CardLayout layout  = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                }
                else{
                    JOptionPane.showMessageDialog(jScrollPane1, "Can not give licenses to criminals");
                    request.setResolveDate(new Date());
                    request.setMessage("License Declined");
                    request.setStatus("Completed");
                    populateQueue();
                }  
            }
            
            
        }
    }//GEN-LAST:event_proceedRequestJButtonActionPerformed

    private void viewLicenseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLicenseJButtonActionPerformed
        ViewLicenseRecordsJPanel viewLicense = new ViewLicenseRecordsJPanel(userProcessContainer, licenseDirectory,personDirectory);
        userProcessContainer.add(viewLicense);
        CardLayout layout  = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewLicenseJButtonActionPerformed

    private void revokeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revokeJButtonActionPerformed
       int result = inQueueJTable.getSelectedRow();
       String message = "License Revocation Request";
       if(result>=0){
           LicenseWorkRequest selectedRequest = (LicenseWorkRequest) inQueueJTable.getValueAt(result, 6);
           //JOptionPane.showMessageDialog(jScrollPane1,selectedRequest.getMessage() );
                  
           if(selectedRequest.getMessage().equals(message)){
               Person selectedPerson = selectedRequest.getHolder();
               int i =licenseDirectory.revokeLicense(selectedPerson.getSSN());
               selectedRequest.setStatus("Completed");
               selectedRequest.setMessage("License Revoked");
               selectedRequest.setResolveDate(new Date());
               populateQueue();
               JOptionPane.showMessageDialog(jScrollPane1, i+" License(s) revoked");
               
           }
           else{
                JOptionPane.showMessageDialog(jScrollPane1, "This is not a Revocation Request");
           }
       }
       else{
           JOptionPane.showMessageDialog(jScrollPane1, "Please Select a Request From Table");
       }
    }//GEN-LAST:event_revokeJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable inQueueJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton proceedRequestJButton;
    private javax.swing.JButton revokeJButton;
    private javax.swing.JButton viewLicenseJButton;
    private javax.swing.JButton viewRequestJButton;
    private javax.swing.JLabel welcomeJLabel;
    // End of variables declaration//GEN-END:variables

    public void populateQueue() {
        DefaultTableModel model = (DefaultTableModel) inQueueJTable.getModel();
        model.setRowCount(0);
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        
        for(Integer queueKeys : user.getInQueue().getWorkRequstList().keySet()){
            LicenseWorkRequest request = (LicenseWorkRequest) user.getInQueue().getWorkRequstList().get(queueKeys);
            Object row[] = new Object[7];
            row[0] = df.format(request.getRequestDate());
            row[1] = request.getSender().getEmployee();
            row[2] = request.getHolder();
            row[3] = request.getMessage();
            row[4] = request.getLicensePeriod();
            row[5] = request.getReason();
            row[6] = request; 
            model.addRow(row);
        }    
    }
   
}
