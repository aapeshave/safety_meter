/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.receptionist;

import business.employee.Employee;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.InvestigationOrganization;
import business.organization.Organization;
import business.organization.PatrollingOrganization;
import business.organization.SuperVisionOrganization;
import business.person.PersonDirectory;
import business.role.PatrollingOfficerRole;
import business.role.Role;
import business.transaction.Transaction;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ajinkya
 */
public class ManageSalaryJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    private Enterprise enterprise;
    private PersonDirectory networkPersonDirectory;
    
    /**
     * Creates new form ManageSalaryJPanel
     */
    public ManageSalaryJPanel(JPanel userProcessContainer, PersonDirectory personDirectory, Enterprise enterprise,UserAccount user,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
        this.enterprise = enterprise;
        networkPersonDirectory = network.getPersonDirectory();
        if((user.getRole().toString().equals(Role.RoleType.Receptioist.getValue())) || 
                (user.getRole().toString().equals(Role.RoleType.Suprervisior.getValue()))){
            sendSalaryJButton.setVisible(true);
        }
        else
            sendSalaryJButton.setVisible(false);
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        salaryJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        sendSalaryJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 254, 242));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Employee Salary");

        salaryJTable.setBackground(new java.awt.Color(237, 238, 225));
        salaryJTable.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        salaryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Organization", "Employee Name", "SSN", "Salary ($)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(salaryJTable);

        backJButton.setBackground(new java.awt.Color(237, 238, 225));
        backJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        sendSalaryJButton.setBackground(new java.awt.Color(237, 238, 225));
        sendSalaryJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        sendSalaryJButton.setText("Send Salary");
        sendSalaryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendSalaryJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sendSalaryJButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(sendSalaryJButton))
                .addContainerGap(93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void sendSalaryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendSalaryJButtonActionPerformed
        Transaction salaryTransaction  = new Transaction();
        for(Integer orgnizationKeys : enterprise.getOrganizationDirectory().getOrganizationDirectory().keySet()){
            Organization organization = enterprise.getOrganizationDirectory().getOrganizationDirectory().get(orgnizationKeys);
            for(String employeeKeys : organization.getEmployeeDirectory().getEmployeeDirectory().keySet()){
                Employee employee = organization.getEmployeeDirectory().getEmployeeDirectory().get(employeeKeys);
                salaryTransaction.setAmount(employee.getMonthlyIncome());
                salaryTransaction.setType(Transaction.TransactionType.Credit);
                salaryTransaction.setStatus("Monthly Payment");
                employee.getPerson().getTransactionHistory().addTransaction(salaryTransaction);
                
                networkPersonDirectory.getPersonList().get(employee.getPerson().getSSN()).getTransactionHistory().addTransaction(salaryTransaction);
                int i=0;
            }
        }
        JOptionPane.showMessageDialog(salaryJTable , "Monthly Salary Will Be Deposited Soon");
    }//GEN-LAST:event_sendSalaryJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable salaryJTable;
    private javax.swing.JButton sendSalaryJButton;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) salaryJTable.getModel();
        model.setRowCount(0);
        
        for(Integer orgnizationKeys : enterprise.getOrganizationDirectory().getOrganizationDirectory().keySet()){
            Organization organization = enterprise.getOrganizationDirectory().getOrganizationDirectory().get(orgnizationKeys);
            for(String employeeKeys : organization.getEmployeeDirectory().getEmployeeDirectory().keySet()){
                Employee employee = organization.getEmployeeDirectory().getEmployeeDirectory().get(employeeKeys);
                Object[] row = new Object[4];
                row[0] = organization;
                row[1] = employee.getPerson();
                row[2] = employee.getPerson().getSSN();
                row[3] = employee.getMonthlyIncome();
                networkPersonDirectory.getPersonList().get(row[2]).setMonthlyIncome(employee.getMonthlyIncome());
                model.addRow(row);
            }
        }
    }
}