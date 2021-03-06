/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.clerkInterface;

import business.crime.CrimeIncident;
import business.crime.CrimeRecord;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ajinkya
 */
public class CrimeReportJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    CrimeRecord crimeRecords;
    
    /**
     * Creates new form CrimeReportJPanel
     */
    

    CrimeReportJPanel(JPanel userProcessContainer, CrimeRecord crimeRecords, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.crimeRecords = crimeRecords;
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
        crimeReportJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 254, 242));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Crime Records");

        crimeReportJTable.setBackground(new java.awt.Color(237, 238, 225));
        crimeReportJTable.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        crimeReportJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Reported By", "Status", "Description", "Crime ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(crimeReportJTable);
        if (crimeReportJTable.getColumnModel().getColumnCount() > 0) {
            crimeReportJTable.getColumnModel().getColumn(0).setResizable(false);
            crimeReportJTable.getColumnModel().getColumn(1).setResizable(false);
            crimeReportJTable.getColumnModel().getColumn(2).setResizable(false);
            crimeReportJTable.getColumnModel().getColumn(3).setResizable(false);
            crimeReportJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        backJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        backJButton.setText("<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(backJButton)
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable crimeReportJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) crimeReportJTable.getModel();
        model.setRowCount(0);
        
        for(Integer crimeKeys : crimeRecords.getCrimeRecord().keySet()){
            CrimeIncident incident = crimeRecords.getCrimeRecord().get(crimeKeys);
            Object row[] = new Object[5];
            row[0] = incident.getCrimeHappenedOn();
            row[1] = incident.getAddedBy();
            row[2] = incident.getStatus();
            row[3] = incident.getDescription();
            row[4] = incident;
            model.addRow(row);
        }

    }
}
