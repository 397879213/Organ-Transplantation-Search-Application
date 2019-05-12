/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Donor;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.TCEnterprise;
import Business.Network.Network;
import Business.Organizations.DonorOrganization;
import Business.Organizations.PatientOrganization;
import Business.Patient.PatientDirectory;
import Business.UserAccount.UserAccount;

//import UserInterface.Patient.OrganRequest;

import UserInterface.Patient.OrganRequest;
import UserInterface.Patient.ViewDetails;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author sharw
 */
public class DonorManager extends javax.swing.JPanel {

    /**
     * Creates new form DonorManager
     */
    
    private JPanel RightPanel;
    private UserAccount account;
    private Enterprise enterprise;
    //private PatientDirectory pDir;
    private EcoSystem System;
    private DonorOrganization organization;
    public DonorManager(JPanel RightPanel, UserAccount account, DonorOrganization organization,Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.RightPanel=RightPanel;
        this.account = account;
        this.organization = organization;
        this.System=business;
        this.enterprise=enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DonateOrgan = new javax.swing.JButton();
        ViewDonarDetails = new javax.swing.JButton();
        DonorAccountManager = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 51));

        DonateOrgan.setBackground(new java.awt.Color(0, 153, 153));
        DonateOrgan.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        DonateOrgan.setForeground(new java.awt.Color(255, 255, 255));
        DonateOrgan.setText("I WANT TO DONATE ");
        DonateOrgan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonateOrganActionPerformed(evt);
            }
        });

        ViewDonarDetails.setBackground(new java.awt.Color(0, 153, 153));
        ViewDonarDetails.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        ViewDonarDetails.setForeground(new java.awt.Color(255, 255, 255));
        ViewDonarDetails.setText("VIEW DETAILS");
        ViewDonarDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDonarDetailsActionPerformed(evt);
            }
        });

        DonorAccountManager.setBackground(new java.awt.Color(0, 153, 153));
        DonorAccountManager.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        DonorAccountManager.setForeground(new java.awt.Color(255, 255, 255));
        DonorAccountManager.setText("ACCOUNT MANAGER");
        DonorAccountManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonorAccountManagerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DonorAccountManager, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewDonarDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DonateOrgan, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(DonateOrgan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ViewDonarDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(DonorAccountManager, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DonateOrganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonateOrganActionPerformed
        // TODO add your handling code here:
        
        /*for(Network network: System.getNetworkList())
         {
             for(Enterprise enterprise: network.getEp().getEnterpriselist())
             {
                 if(enterprise instanceof TCEnterprise)
                 {   
                     this.enterprise=enterprise;
                     break;                  
                 }
             }
             
         }*/
        CardLayout layout = (CardLayout) RightPanel.getLayout();
        RightPanel.add("OrganDonate", new OrganDonate(RightPanel, account, enterprise, System));
        layout.next(RightPanel);
        
    }//GEN-LAST:event_DonateOrganActionPerformed

    private void DonorAccountManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonorAccountManagerActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) RightPanel.getLayout();
        RightPanel.add("AccountManager", new AccountManager(RightPanel, account, enterprise));
        layout.next(RightPanel);
        
    }//GEN-LAST:event_DonorAccountManagerActionPerformed

    private void ViewDonarDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDonarDetailsActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) RightPanel.getLayout();
      RightPanel.add("ViewStatus", new ViewStatus(RightPanel, account,enterprise, System));
      layout.next(RightPanel);
    }//GEN-LAST:event_ViewDonarDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DonateOrgan;
    private javax.swing.JButton DonorAccountManager;
    private javax.swing.JButton ViewDonarDetails;
    // End of variables declaration//GEN-END:variables
}
