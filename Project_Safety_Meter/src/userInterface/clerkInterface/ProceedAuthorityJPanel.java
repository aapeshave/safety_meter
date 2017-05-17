/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.clerkInterface;

import business.enterprise.Enterprise;
import business.organization.AuthorityOrganization;
import business.organization.Organization;
import business.person.Person;
import business.userAccount.UserAccount;
import business.workQueue.LicenseWorkRequest;
import com.sun.xml.internal.ws.developer.JAXWSProperties;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ajinkya
 */
public class ProceedAuthorityJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Person person;
    private UserAccount user;
    private Enterprise enterprise;
    private AuthorityOrganization targetOrg;
    private LicenseWorkRequest request;
    /**
     * Creates new form ProceedAuthorityJPanel
     */
    public ProceedAuthorityJPanel(JPanel upc, Person person, UserAccount user, Enterprise enterprise, LicenseWorkRequest request) {
        initComponents();
        this.userProcessContainer = upc;
        this.person = person;
        this.user = user;
        this.enterprise = enterprise;
        this.request = request;
        populateEmployeeCombo();
    }

    public void populateEmployeeCombo(){
        AuthorityOrganization organization= null;
         employeeJComboBox.removeAllItems();
        for(Integer orgnizationKeys : enterprise.getOrganizationDirectory().getOrganizationDirectory().keySet()){
            Organization org = enterprise.getOrganizationDirectory().getOrganizationDirectory().get(orgnizationKeys);
            if(org instanceof AuthorityOrganization){
                organization = (AuthorityOrganization) org; 
                break;
            }
        }
        if(organization != null){
            employeeJComboBox.removeAllItems();
            for(String userKeys : organization.getUserAccountDirectory().getUserAccountDirectory().keySet()){
                UserAccount user =organization.getUserAccountDirectory().getUserAccountDirectory().get(userKeys);
                employeeJComboBox.addItem(user);
            }
            targetOrg = organization;
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
        employeeJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        reasonTextArea = new javax.swing.JTextArea();
        proceedJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        licenseJTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 254, 242));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Decision Authorization");

        jLabel2.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel2.setText("Select Authority Officer");

        employeeJComboBox.setBackground(new java.awt.Color(237, 238, 225));
        employeeJComboBox.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel3.setText("Message");

        jLabel4.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel4.setText("Violations(if any)");

        messageJTextField.setBackground(new java.awt.Color(237, 238, 225));
        messageJTextField.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N

        reasonTextArea.setBackground(new java.awt.Color(237, 238, 225));
        reasonTextArea.setColumns(20);
        reasonTextArea.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        reasonTextArea.setRows(5);
        jScrollPane1.setViewportView(reasonTextArea);

        proceedJButton.setBackground(new java.awt.Color(237, 238, 225));
        proceedJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        proceedJButton.setText("Proceed");
        proceedJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedJButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel5.setText("Suggest License Period (Months)");

        licenseJTextField.setBackground(new java.awt.Color(237, 238, 225));
        licenseJTextField.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(237, 238, 225));
        jButton1.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jButton1.setText("< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                .addComponent(jButton1)
                .addGap(169, 169, 169)
                .addComponent(proceedJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(licenseJTextField)
                        .addGap(384, 384, 384))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(employeeJComboBox, 0, 170, Short.MAX_VALUE)
                                .addComponent(messageJTextField)))
                        .addContainerGap(246, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(employeeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(licenseJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proceedJButton)
                    .addComponent(jButton1))
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void proceedJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedJButtonActionPerformed
        String period = licenseJTextField.getText().trim();
        String message = messageJTextField.getText().trim();
        String violations = reasonTextArea.getText().trim();
        
        if(!period.isEmpty() && !message.isEmpty() && !violations.isEmpty()){
            UserAccount receiver = (UserAccount) employeeJComboBox.getSelectedItem();
            request.setLicensePeriod(Integer.parseInt(period));
            request.setReason(violations);
            request.setStatus("Sent to Authority Officer");
            request.setMessage(message);
            receiver.getInQueue().addWorkRequest(request);
            resetFields();
            JOptionPane.showMessageDialog(employeeJComboBox, "Request Sent to Authority Officer ");
        }
        else{
            JOptionPane.showMessageDialog(employeeJComboBox, "Please Enter All Fields");
        }
        
    }//GEN-LAST:event_proceedJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField licenseJTextField;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton proceedJButton;
    private javax.swing.JTextArea reasonTextArea;
    // End of variables declaration//GEN-END:variables

    private void resetFields() {
        messageJTextField.setText("");
        reasonTextArea.setText("");
        licenseJTextField.setText("");
    }
}
