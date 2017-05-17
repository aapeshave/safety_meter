/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdmin;

import business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ajinkya
 */
public class SystemAdminWorkArea extends javax.swing.JPanel {
    JPanel userProcessContainer;
    EcoSystem system;
    /**
     * Creates new form SystemAdminWorkArea
     */
    public SystemAdminWorkArea() {
        initComponents();
    }

    public SystemAdminWorkArea(JPanel userProcessContainer, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageNetworkButton = new javax.swing.JButton();
        manageEnterpriseButton = new javax.swing.JButton();
        manageEnterpriseAdminButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        emergencyJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 254, 242));

        manageNetworkButton.setBackground(new java.awt.Color(237, 238, 225));
        manageNetworkButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        manageNetworkButton.setText("Manage Network");
        manageNetworkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageNetworkButtonActionPerformed(evt);
            }
        });

        manageEnterpriseButton.setBackground(new java.awt.Color(237, 238, 225));
        manageEnterpriseButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        manageEnterpriseButton.setText("Manage Enterprise");
        manageEnterpriseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseButtonActionPerformed(evt);
            }
        });

        manageEnterpriseAdminButton.setBackground(new java.awt.Color(237, 238, 225));
        manageEnterpriseAdminButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        manageEnterpriseAdminButton.setText("Manage Enterprise Admin");
        manageEnterpriseAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseAdminButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(237, 238, 225));
        jButton1.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jButton1.setText("Poverty Analysis");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        emergencyJButton.setBackground(new java.awt.Color(237, 238, 225));
        emergencyJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        emergencyJButton.setText("Emergency Situation");
        emergencyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emergencyJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(manageNetworkButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageEnterpriseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emergencyJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(manageEnterpriseAdminButton)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageNetworkButton)
                    .addComponent(manageEnterpriseButton)
                    .addComponent(manageEnterpriseAdminButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(emergencyJButton))
                .addGap(113, 113, 113))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageNetworkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageNetworkButtonActionPerformed
        // TODO add your handling code here:
        ManageNetworkJPanel manageNetworkJPanel = new ManageNetworkJPanel(userProcessContainer, system);
        userProcessContainer.add("manageNetworkJPanel", manageNetworkJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageNetworkButtonActionPerformed

    private void manageEnterpriseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseButtonActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseJPanel manageEnterpriseJPanel = new ManageEnterpriseJPanel(userProcessContainer, system);
        userProcessContainer.add("manageEnterpriseJPanel", manageEnterpriseJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEnterpriseButtonActionPerformed

    private void manageEnterpriseAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseAdminButtonActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel = new ManageEnterpriseAdminJPanel(userProcessContainer, system);
        userProcessContainer.add("manageEnterpriseAdminJPanel", manageEnterpriseAdminJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEnterpriseAdminButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PovertyAnalysisJPanel manageNetworkJPanel = new PovertyAnalysisJPanel(userProcessContainer, system);
        userProcessContainer.add("manageNetworkJPanel", manageNetworkJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void emergencyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emergencyJButtonActionPerformed
        SendEmergencyJPanel manageNetworkJPanel = new SendEmergencyJPanel(userProcessContainer, system);
        userProcessContainer.add("manageNetworkJPanel", manageNetworkJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_emergencyJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton emergencyJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton manageEnterpriseAdminButton;
    private javax.swing.JButton manageEnterpriseButton;
    private javax.swing.JButton manageNetworkButton;
    // End of variables declaration//GEN-END:variables
}