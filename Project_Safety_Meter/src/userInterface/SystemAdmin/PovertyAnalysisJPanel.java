/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdmin;

import business.EcoSystem;
import business.crime.CrimeRecord;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.person.Person;
import business.person.PersonDirectory;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.CardLayout;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LayeredBarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import sun.awt.datatransfer.DataTransferer;

/**
 *
 * @author ajinkya
 */
public class PovertyAnalysisJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Network netowrk;
    private PersonDirectory personDirectory;
    private CrimeRecord crimeRecords;
    private EcoSystem ecoSystem;
    private DefaultCategoryDataset crimeDataset;
    private DefaultPieDataset pireChartDataset;
    
    /**
     * Creates new form PoveryAnalysisJPanel
     */
    public PovertyAnalysisJPanel(JPanel userProcessContianer, EcoSystem business) {
        initComponents();
        this.ecoSystem = business;
        this.userProcessContainer = userProcessContianer;
        this.crimeDataset = new DefaultCategoryDataset();
        this.pireChartDataset = new DefaultPieDataset();
        
        int averageIncome=0,num=0,crminals=0,crimeRate=0,sumIncome=0;
        int numBelowPoverty=0;
        int doesHaveLicesnse=0;
        int doesHaveLicesnsePercent=0;
        DefaultTableModel model = (DefaultTableModel) povertyJTable.getModel();
        model.setRowCount(0);
        for(String networkKeys : business.getNetworkList().keySet()){
            Network newNetwork = business.getNetworkList().get(networkKeys);   
            crimeRate=0;
            crminals=0;
            num=0;
            averageIncome=0;
            sumIncome=0;
            numBelowPoverty=0;
            doesHaveLicesnse=0;
            doesHaveLicesnsePercent=0;
            personDirectory = newNetwork.getPersonDirectory();
            crimeRecords = newNetwork.getCrimeRecords();
            //JOptionPane.showMessageDialog(this, newNetwork);
            
            for(String personKeys: personDirectory.getPersonList().keySet()){
                Person person = personDirectory.getPersonList().get(personKeys);
                if(person.getMonthlyIncome()>0){
                    sumIncome = sumIncome + person.getMonthlyIncome();
                    num++;
                }
                    
            }
            averageIncome = sumIncome/num;
            //JOptionPane.showMessageDialog(povertyJTable, "Average Income for Netowrk "+ newNetwork.getName()+" is"+averageIncome);
        
            for(String personKeys: personDirectory.getPersonList().keySet()){
                Person person = personDirectory.getPersonList().get(personKeys);
                if(person.getMonthlyIncome()>0){
                    if(person.getMonthlyIncome()<averageIncome){
                        //JOptionPane.showMessageDialog(povertyJTable, person.getFirstName() + " "+ person.getMonthlyIncome());
                        numBelowPoverty++;
                    }
                     if(person.getDoesHaveLicense()==1){
                        doesHaveLicesnse++;
                    }
                    
                }
               if(newNetwork.getCrimeRecords().searchPersonRecord(person.getSSN())!=null){
                   crminals++;
               }
            
            }
            //num++;
            //numBelowPoverty++;
            int poverty = (100 * numBelowPoverty)/num;
            crimeRate = (100*crminals)/num;
            doesHaveLicesnsePercent=(100*doesHaveLicesnse)/num;
            Object[] row = new Object[7];
            row[0] = newNetwork;
            row[1] = num;
            row[2] = averageIncome;
            row[3] = doesHaveLicesnsePercent;
            row[4] = poverty;
            row[5] = crimeRecords.getCrimeRecord().values().size();
            row[6] = crimeRate;
            model.addRow(row);
            
            
            
            crimeDataset.addValue(crimeRate, "Crime Rate", newNetwork.getName()+" Crime Rate");
            crimeDataset.addValue(poverty, "Poverty Rate", newNetwork.getName()+" Poverty Rate");
            crimeDataset.addValue(doesHaveLicesnsePercent, "People Having FireArms License", newNetwork.getName()+" FireArms Holders");
            pireChartDataset.setValue(newNetwork.getName(), crimeRecords.getCrimeRecord().values().size());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        povertyJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        povertyVsCrimejButton = new javax.swing.JButton();
        crimeAnalysisJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        downloadPDFJButton = new javax.swing.JButton();
        criminalLicenseJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 254, 242));

        povertyJTable.setBackground(new java.awt.Color(237, 238, 225));
        povertyJTable.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        povertyJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Network Name", "Number of People", "Average Income", "License Holders(%)", "Poverty Rate(%)", "Crime Incidents", "Crime Rate(%)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(povertyJTable);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Poverty Analysis");

        povertyVsCrimejButton.setBackground(new java.awt.Color(237, 238, 225));
        povertyVsCrimejButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        povertyVsCrimejButton.setText("Poverty vs Crime");
        povertyVsCrimejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                povertyVsCrimejButtonActionPerformed(evt);
            }
        });

        crimeAnalysisJButton.setBackground(new java.awt.Color(237, 238, 225));
        crimeAnalysisJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        crimeAnalysisJButton.setText("Network Crime Analysis");
        crimeAnalysisJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crimeAnalysisJButtonActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(237, 238, 225));
        backJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        downloadPDFJButton.setBackground(new java.awt.Color(237, 238, 225));
        downloadPDFJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        downloadPDFJButton.setText("Download PDF");
        downloadPDFJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadPDFJButtonActionPerformed(evt);
            }
        });

        criminalLicenseJButton.setBackground(new java.awt.Color(237, 238, 225));
        criminalLicenseJButton.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        criminalLicenseJButton.setText("Criminal License");
        criminalLicenseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criminalLicenseJButtonActionPerformed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(povertyVsCrimejButton)
                .addGap(18, 18, 18)
                .addComponent(crimeAnalysisJButton)
                .addGap(18, 18, 18)
                .addComponent(downloadPDFJButton)
                .addGap(18, 18, 18)
                .addComponent(criminalLicenseJButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(povertyVsCrimejButton)
                    .addComponent(crimeAnalysisJButton)
                    .addComponent(downloadPDFJButton)
                    .addComponent(criminalLicenseJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backJButton)
                .addContainerGap(149, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void povertyVsCrimejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_povertyVsCrimejButtonActionPerformed
        JFreeChart chart = createChart(crimeDataset);
        ChartFrame chartFrame = new ChartFrame("Poverty Rate VS Crime", chart);
        chartFrame.setVisible(true);
        chartFrame.setSize(500, 500);
        
    }//GEN-LAST:event_povertyVsCrimejButtonActionPerformed

    private void downloadPDFJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadPDFJButtonActionPerformed
        Document document = new Document();
        try{
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("AddTableExample.pdf"));
            document.open();
            
            
            Font helveticaBold = FontFactory.getFont(FontFactory.HELVETICA, 16, Font.NORMAL, new GrayColor(1));
            Font helveticaNormal = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.NORMAL, new GrayColor(1));
            
            Paragraph paragraphOne = new Paragraph("Safety Meter Report",helveticaBold);
            document.add(paragraphOne);
            document.add(new Paragraph("  "));
            DefaultTableModel model = (DefaultTableModel) povertyJTable.getModel();
            int numRows = model.getRowCount();
            int numColum = model.getColumnCount();
            int i,j=0;
            for(i=0;i<numRows;i++){
                    Paragraph info = new Paragraph("Network Name is " + model.getValueAt(i, 0), helveticaNormal);
                    Paragraph sectionContent3 = new Paragraph("Average Income of A Person is $"+ model.getValueAt(i, 2), helveticaNormal);
                    info.add(sectionContent3);
                    Paragraph sectionContent1 = new Paragraph("Crime Rate is "+ model.getValueAt(i, 6)+"%", helveticaNormal);
                    info.add(sectionContent1);
                    Paragraph sectionContent2 = new Paragraph("Poverty Rate is "+ model.getValueAt(i, 4)+"%", helveticaNormal);
                    info.add(sectionContent2);
                    Paragraph sectionContent4 = new Paragraph("Percentage of People Having FireArms "+ model.getValueAt(i, 3)+"%", helveticaNormal);
                    info.add(sectionContent4);
                    document.add(info);
                    Paragraph space = new Paragraph("   ", helveticaNormal);
                    document.add(space);
            }
            //document.add(table);
            document.close();
            writer.close();
            JOptionPane.showMessageDialog(povertyJTable, "Please visit Downloads folder to view your report");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(povertyJTable, e);
        }
    }//GEN-LAST:event_downloadPDFJButtonActionPerformed

    private void crimeAnalysisJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crimeAnalysisJButtonActionPerformed
        JFreeChart pieChart = ChartFactory.createPieChart("Crminal Incidents", pireChartDataset, true, true, true);
        PiePlot plot = (PiePlot) pieChart.getPlot();
        ChartFrame perFrame = new ChartFrame("Crminal Incidents By Network ", pieChart);
        perFrame.setVisible(true);
        perFrame.setSize(500,500);
    }//GEN-LAST:event_crimeAnalysisJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void criminalLicenseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criminalLicenseJButtonActionPerformed
        int doesHaveLicesnse =0;
        for(String networkKeys : ecoSystem.getNetworkList().keySet()){
            doesHaveLicesnse=0;
            Network network = ecoSystem.getNetworkList().get(networkKeys);
            for(String personKeys: network.getPersonDirectory().getPersonList().keySet()){
                Person person = network.getPersonDirectory().getPersonList().get(personKeys);
                if(person.getDoesHaveLicense()==1){
                    doesHaveLicesnse++;
                }
            }
            JOptionPane.showMessageDialog(povertyJTable, doesHaveLicesnse+" people have license in "+network.getName());
        }
        
    }//GEN-LAST:event_criminalLicenseJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton crimeAnalysisJButton;
    private javax.swing.JButton criminalLicenseJButton;
    private javax.swing.JButton downloadPDFJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable povertyJTable;
    private javax.swing.JButton povertyVsCrimejButton;
    // End of variables declaration//GEN-END:variables

    private JFreeChart createChart(DefaultCategoryDataset crimeDataset) {
        JFreeChart jfreechart = ChartFactory.createBarChart("Poverty Rate vs Crime Chart",
                "Network Values", "Value", crimeDataset,
                PlotOrientation.HORIZONTAL, true, true, false);
        CategoryPlot categoryplot = (CategoryPlot) jfreechart.getPlot();
        
        categoryplot.setDomainGridlinesVisible(true);
        categoryplot.setRangePannable(true);
        categoryplot.setRangeZeroBaselineVisible(true);
        categoryplot.configureRangeAxes();

        NumberAxis numberaxis = (NumberAxis) categoryplot.getRangeAxis();
        numberaxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        LayeredBarRenderer layeredbarrenderer = new LayeredBarRenderer();
        layeredbarrenderer.setDrawBarOutline(false);
        categoryplot.setRenderer(layeredbarrenderer);
        
        return jfreechart;
    }
}
