/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdmin;

import business.EcoSystem;
import business.network.Network;
import business.person.Person;
import java.awt.CardLayout;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JPanel;
import userInterface.receptionist.GetAppointmentJPanel;

/**
 *
 * @author ajinkya
 */
public class SendEmergencyJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem eco;
    
    /**
     * Creates new form SendEmergencyJPanel
     */
    public SendEmergencyJPanel(JPanel user, EcoSystem business) {
        initComponents();
        this.userProcessContainer = user;
        this.eco = business;
        
        populateNetwoks();
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
        netwrkComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        subjectJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageJTextArea = new javax.swing.JTextArea();
        sendJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 254, 242));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Emergency Notification");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel2.setText("Select Network");

        netwrkComboBox.setBackground(new java.awt.Color(237, 238, 225));
        netwrkComboBox.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        netwrkComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel3.setText("Subject");

        subjectJTextField.setBackground(new java.awt.Color(237, 238, 225));
        subjectJTextField.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel4.setText("Message");

        messageJTextArea.setBackground(new java.awt.Color(237, 238, 225));
        messageJTextArea.setColumns(20);
        messageJTextArea.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        messageJTextArea.setRows(5);
        messageJTextArea.setText("Your Message will appear here");
        messageJTextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                messageJTextAreaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(messageJTextArea);

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
        backJButton.setText("< Back");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sendJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(netwrkComboBox, 0, 182, Short.MAX_VALUE)
                                .addComponent(subjectJTextField)))))
                .addContainerGap(314, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(netwrkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(subjectJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendJButton)
                    .addComponent(backJButton))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendJButtonActionPerformed
        String message = messageJTextArea.getText().trim();
        String subject = subjectJTextField.getText().trim();
        Network selectedNetwork = (Network) netwrkComboBox.getSelectedItem();
        for(String personKeys : selectedNetwork.getPersonDirectory().getPersonList().keySet()){
            Person selectedPerson = selectedNetwork.getPersonDirectory().getPersonList().get(personKeys);
            String email = selectedPerson.getEmail();
            if(!email.isEmpty()){
                sendEmail(email,subject, message);
            }
        }
    }//GEN-LAST:event_sendJButtonActionPerformed

    private void messageJTextAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messageJTextAreaMouseClicked
        messageJTextArea.setText("");
    }//GEN-LAST:event_messageJTextAreaMouseClicked

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea messageJTextArea;
    private javax.swing.JComboBox netwrkComboBox;
    private javax.swing.JButton sendJButton;
    private javax.swing.JTextField subjectJTextField;
    // End of variables declaration//GEN-END:variables

    private void populateNetwoks() {
        netwrkComboBox.removeAllItems();
        for(String networkKeys : eco.getNetworkList().keySet()){
            Network newNetwork = eco.getNetworkList().get(networkKeys); 
            netwrkComboBox.addItem(newNetwork);
        }   
    }
    
    public void sendEmail(String recepient,String subject, String body){
        try{
            String from = "safetymeter@mail.com";
            String userName = "safetymeter@mail.com";
            String password = "@dmin@123";
            
            
            String to = recepient;
        
            Properties prop = System.getProperties();
            prop.put("mail.smtp.port", "587" );
            prop.put("mail.smtp.auth", "true");
            prop.put("mail.smtp.starttls.enable", "true");
            prop.put("mail.smtp.ssl.enable", "true");
            //prop.put("mail.smtp.auth", "true");
            prop.put("mail.smtp.host","smtp.mail.com");
            //JOptionPane.showMessageDialog(null, "configure done");
            //prop.put("mail.smtp.user",userName);
            //prop.put("mail.smtp.password",password);
            
            //prop.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
            //prop.put("mail.smtp.socketFactory.port","587" );  
            //prop.put("mail.smtp.socketFactory.fallback", "false");
            
            //prop.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory" );
            //prop.put("mail.smtp.socketFactory.port","587" );  
            //prop.put("mail.smtp.socketFactory.fallback","false" );
        
        
            Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication(){
                   return new PasswordAuthentication(userName, password);
                }
            });
            //Session session = Session.getDefaultInstance(prop);
            session.setDebug(true);
            Message message = new MimeMessage(session);
            
            
            
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            String messageBody;
            messageBody = body;
            message.setText(messageBody);
            message.setSentDate(new Date());
            //JOptionPane.showMessageDialog(null, "Getting SMTP Servers");
            
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.mail.com", userName, password);
            transport.send(message);
            transport.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
