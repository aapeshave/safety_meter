/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.clerkInterface;

import business.crime.CrimeIncident;
import business.crime.CrimeRecord;
import business.person.Person;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ajinkya
 */
public class CrimeAddPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CrimeRecord crimeRecords;
    private UserAccount user;
    private Person person;
    /**
     * Creates new form CrimeAddPanel
     */
    public CrimeAddPanel(JPanel userProcessContainer, CrimeRecord crimeRecords, UserAccount user, Person person) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.crimeRecords = crimeRecords;
        this.user = user;
        this.person = person;
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
        descriptionTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        reportJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        addresJTextArea = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 254, 242));
        setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Report Criminal Incident");

        descriptionTextArea.setBackground(new java.awt.Color(237, 238, 225));
        descriptionTextArea.setColumns(20);
        descriptionTextArea.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        descriptionTextArea.setRows(5);
        descriptionTextArea.setText("Be Specific Regarding Incident");
        descriptionTextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descriptionTextAreaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(descriptionTextArea);

        jLabel2.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel2.setText("Description:");

        reportJButton.setBackground(new java.awt.Color(237, 238, 225));
        reportJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        reportJButton.setText("Report");
        reportJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportJButtonActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(237, 238, 225));
        backJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        backJButton.setText("<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel3.setText("Address");

        addresJTextArea.setBackground(new java.awt.Color(237, 238, 225));
        addresJTextArea.setColumns(20);
        addresJTextArea.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        addresJTextArea.setRows(5);
        jScrollPane2.setViewportView(addresJTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(319, 319, 319)
                        .addComponent(reportJButton)))
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backJButton)
                            .addComponent(reportJButton))))
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void descriptionTextAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descriptionTextAreaMouseClicked
        // TODO add your handling code here:
        descriptionTextArea.setText("");
        
    }//GEN-LAST:event_descriptionTextAreaMouseClicked

    private void reportJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportJButtonActionPerformed
        // TODO add your handling code here:
        
        try{
            CrimeIncident crime = new CrimeIncident();
            Person reporter = person;
            crime.setAddedBy(reporter);
            crime.setDescription(descriptionTextArea.getText());
            crime.setAddress(addresJTextArea.getText());
            crime.setStatus("Newly Reported");
            crimeRecords.addCrimeIncident(crime);
            JOptionPane.showMessageDialog(jScrollPane1, "Crime Reported");
            descriptionTextArea.setText("");
            addresJTextArea.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(descriptionTextArea, "Please fill description."+ e);
        }
    }//GEN-LAST:event_reportJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addresJTextArea;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton reportJButton;
    // End of variables declaration//GEN-END:variables
}
