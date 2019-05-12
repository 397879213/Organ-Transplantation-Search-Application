/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.Organizations;
import Business.Organizations.PatientOrganization;
import Business.UserAccount.UserAccount;
//import UserInterface.Donor.SelectFunction;



import UserInterface.Patient.PatientManager;


import javax.swing.JPanel;

/**
 *
 * @author meetveera
 */
public class PatientRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel RightPanel, UserAccount account, Organizations organization, Enterprise enterprise, EcoSystem business) {

        //return new PatientManager(RightPanel, account, (PatientOrganization)organization, enterprise, business);

       return new PatientManager(RightPanel, account, (PatientOrganization)organization, enterprise, business);

       
    }
    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
