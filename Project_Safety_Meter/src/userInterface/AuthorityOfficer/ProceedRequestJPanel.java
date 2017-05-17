/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AuthorityOfficer;

import business.license.FireArmLicense;
import business.license.FireArmLicense.LicenseType;
import business.license.LicenseDirectory;
import business.person.Person;
import business.transaction.Transaction;
import business.workQueue.LicenseWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.apache.commons.lang3.time.DateUtils;
import userInterface.supervisior.SupervisiorWorkArea;

/**
 *
 * @author ajinkya
 */
public class ProceedRequestJPanel extends javax.swing.JPanel {
    private FireArmLicense license;
    private JPanel userProcessContainer;
    private LicenseDirectory licenseDirectory;
    private LicenseWorkRequest request;
    private Person holder;
    /**
     * Creates new form ProceedRequestJPanel
     */
    public ProceedRequestJPanel(JPanel upc, LicenseWorkRequest request,LicenseDirectory licenseDirecotry) {
        initComponents();
        
        license = new FireArmLicense();
        userProcessContainer = upc;
        this.request = request;
        holder = request.getHolder();
        this.licenseDirectory = licenseDirecotry;
        populateLicenseCombo();
        displayFields();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        personNameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        senderNameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        licenseJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        licenseTypeJComboBox = new javax.swing.JComboBox();
        backJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        priceJTextField = new javax.swing.JTextField();
        generateJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 254, 242));

        jLabel2.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel2.setText("Requested Person Name");

        personNameJTextField.setBackground(new java.awt.Color(237, 238, 225));
        personNameJTextField.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        personNameJTextField.setEnabled(false);

        jLabel1.setText("Sender Name");

        senderNameJTextField.setBackground(new java.awt.Color(237, 238, 225));
        senderNameJTextField.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        senderNameJTextField.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel5.setText("License Period (Months)");

        licenseJTextField.setBackground(new java.awt.Color(237, 238, 225));
        licenseJTextField.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        licenseJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                licenseJTextFieldFocusLost(evt);
            }
        });
        licenseJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseJTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel3.setText("Select License Type");

        licenseTypeJComboBox.setBackground(new java.awt.Color(237, 238, 225));
        licenseTypeJComboBox.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        licenseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        licenseTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseTypeJComboBoxActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(237, 238, 225));
        backJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        backJButton.setText("< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("Assign New License");

        jLabel6.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel6.setText("Price ($)");

        priceJTextField.setBackground(new java.awt.Color(237, 238, 225));
        priceJTextField.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        priceJTextField.setEnabled(false);

        generateJButton.setBackground(new java.awt.Color(237, 238, 225));
        generateJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        generateJButton.setText("Generate");
        generateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(personNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(licenseTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(licenseJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(backJButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(generateJButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(senderNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 53, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(personNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(senderNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(licenseJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(licenseTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(generateJButton))
                .addGap(69, 69, 69))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AuthorityOfficerWorkArea dwjp = (AuthorityOfficerWorkArea) component;
        dwjp.populateQueue();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void licenseTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseTypeJComboBoxActionPerformed
        try{
            LicenseType type = (LicenseType) licenseTypeJComboBox.getSelectedItem();
            int period = Integer.parseInt(licenseJTextField.getText());
            priceJTextField.setText(Integer.toString(type.getPrice()*(period)));
        }
        catch(Exception e){  
        }
        
    }//GEN-LAST:event_licenseTypeJComboBoxActionPerformed

    private void licenseJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseJTextFieldActionPerformed
       try{
            LicenseType type = (LicenseType) licenseTypeJComboBox.getSelectedItem();
            int period = request.getLicensePeriod();
            priceJTextField.setText(Integer.toString(type.getPrice()*(period)));
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_licenseJTextFieldActionPerformed

    private void licenseJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_licenseJTextFieldFocusLost
        try{
            LicenseType type = (LicenseType) licenseTypeJComboBox.getSelectedItem();
            int period = Integer.parseInt(licenseJTextField.getText());
            priceJTextField.setText(Integer.toString(type.getPrice()*(period)));
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_licenseJTextFieldFocusLost

    private void generateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateJButtonActionPerformed
        

        //Create License Part
        FireArmLicense license  = licenseDirectory.searchLicense((LicenseType) licenseTypeJComboBox.getSelectedItem(), holder.getSSN());
        int i=0;
        if(license == null){
            license = new FireArmLicense();
            license.setAssignedTo(holder);
            license.setLicensePeriod(Integer.parseInt(licenseJTextField.getText()));
            license.setPrice(Integer.parseInt(priceJTextField.getText()));
            license.setValidTill(DateUtils.addMonths(new Date(), Integer.parseInt(licenseJTextField.getText())));
            license.setType((LicenseType) licenseTypeJComboBox.getSelectedItem());
            licenseDirectory.addLicense(license);
            JOptionPane.showMessageDialog(licenseJTextField, "License Has Been Generated");
            
        }
        else{
            //license.setValidFrom(new Date());
            license.setValidTill(DateUtils.addMonths(new Date(), Integer.parseInt(licenseJTextField.getText())));
            license.setUpdatedOn(new Date());
            license.setUpdatedTime(license.getUpdatedTime()+1);
            JOptionPane.showMessageDialog(licenseJTextField, "License Renewed");
        }
        
        //JOptionPane.showMessageDialog(licenseJTextField, license.getType());
        
        //********************************************************************//
        //Edit Work Request part  
        request.setMessage("License Granted");
        request.setStatus("Complete");
        request.setResolveDate(new Date());
       
        //********************************************************************//
        //Add Transaction
        Transaction transaction  =new Transaction();
        transaction.setAmount(Integer.parseInt(priceJTextField.getText()));
        transaction.setType(Transaction.TransactionType.Debit);
        transaction.setStatus("License Transaction - Complete");
        
        holder.getTransactionHistory().addTransaction(transaction);
        //JOptionPane.showMessageDialog(licenseJTextField, holder.getTransactionHistory().getTransactionList().values());
    }//GEN-LAST:event_generateJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton generateJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField licenseJTextField;
    private javax.swing.JComboBox licenseTypeJComboBox;
    private javax.swing.JTextField personNameJTextField;
    private javax.swing.JTextField priceJTextField;
    private javax.swing.JTextField senderNameJTextField;
    // End of variables declaration//GEN-END:variables

    private void populateLicenseCombo() {
        licenseTypeJComboBox.removeAllItems();;
        for(LicenseType type : FireArmLicense.LicenseType.values()){
            licenseTypeJComboBox.addItem(type);
        }
    }

    private void displayFields() {
        licenseJTextField.setText(Integer.toString(request.getLicensePeriod()));
        personNameJTextField.setText(holder.getFirstName()+" "+holder.getLastName());
        senderNameJTextField.setText(request.getSender().toString());
    }
}
