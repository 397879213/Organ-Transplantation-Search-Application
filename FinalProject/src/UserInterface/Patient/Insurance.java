/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Patient;

import Business.EcoSystem;
import Business.Email.Email;
import Business.Enterprise.Enterprise;
import Business.Enterprise.InsuranceCompany;
import Business.Enterprise.TCEnterprise;
import Business.Network.Network;
import Business.Organizations.InsuranceAgent;
import Business.Organizations.Organizations;
import static Business.Organizations.Organizations.Type.InsuranceAgent;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientRequestsInsuranceCompany;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sanskruti
 */
public class Insurance extends javax.swing.JPanel {

    /**
     * Creates new form Insurance
     */
    private JPanel RightPanel;
    private UserAccount account;
    private Enterprise enterprise;
    private Network network;
    private EcoSystem system;
     private Enterprise TC;
    private Network lc;
    private String cost ;
    public Insurance(JPanel RightPanel,UserAccount account,Enterprise enterprise,Network network,EcoSystem system,Network lc, Enterprise TC,String cost ) {
        initComponents();
        this.RightPanel=RightPanel;
        this.account= account;
        this.enterprise=enterprise;
        this.network=network;
        this.system=system;
        this.lc=lc;
        this.TC=TC;
        this.cost=cost;
        populateInsuranceCompanyTable();
        populateICBox(); 
    }
    public void populateICBox()
    {
        InsuranceCompany.removeAllItems();
        for(Enterprise e: lc.getEp().getEnterpriselist()){
            if(e instanceof InsuranceCompany){
                InsuranceCompany.addItem(e);}
        }
    }
    public void populateInsuranceCompanyTable()
    {
     DefaultTableModel model = (DefaultTableModel) InsuranceCompanyTable.getModel();
        model.setRowCount(0);
        for(WorkRequest w:account.getClaimMoney().getWorkRequestList()){
            Object[] row = new Object[3];
            row[0] = w.getReceiver();
            row[1] = w.getMessage();
            row[2]=w.getStatus();
            model.addRow(row);
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

        jScrollPane3 = new javax.swing.JScrollPane();
        InsuranceCompanyTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        InsuranceCompany = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 51, 51));

        InsuranceCompanyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Receiver", "message", "status"
            }
        ));
        jScrollPane3.setViewportView(InsuranceCompanyTable);

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jButton2.setText("CLAIM REQUEST ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("<<BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        InsuranceCompany.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" SELECT INSURANCE COMPANY :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(InsuranceCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsuranceCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Organizations org =null;
        for(Network network :system.getNetworkList()){
            for(Enterprise e:network.getEp().getEnterpriselist()){
                for(Organizations o:e.getOrganizationdir().getOrganizationList()){
                    if(network.equals(lc)){
                        if(e.equals(InsuranceCompany.getSelectedItem())){
                            if(o instanceof InsuranceAgent)
                            org=o;
                            break;
                        }
                    }
                }
            }
        }
        if(org !=null){
            PatientRequestsInsuranceCompany request = new PatientRequestsInsuranceCompany();
            request.setSender(account);
            request.setMessage(String.valueOf(cost));
            request.setStatus("Sent");
            org.getClaimMoney().getWorkRequestList().add(request);
            account.getClaimMoney().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null,"claim sent to Insurance company!");
            try{
            Email emailConfig= new Email();
            Properties smtpProperties = emailConfig.loadProperties();
            String email = account.getUsername();
            emailConfig.sendEmail(smtpProperties, email, "Request Initiated", "Your request has being sent to the Insurance Company!");
        }
            catch(Exception ex){
                
            }
            populateInsuranceCompanyTable();
         
    }//GEN-LAST:event_jButton2ActionPerformed
    if(org==null){
       JOptionPane.showMessageDialog(null,"No Insurance Agent Organization created !");
    }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        RightPanel.remove(this);
        CardLayout layout = (CardLayout) RightPanel.getLayout();
        layout.previous(RightPanel);
    }//GEN-LAST:event_jButton3ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Enterprise> InsuranceCompany;
    private javax.swing.JTable InsuranceCompanyTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}