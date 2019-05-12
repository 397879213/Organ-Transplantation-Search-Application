/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.DoctorOrganization;
import Business.Organizations.Organizations;
import Business.UserAccount.UserAccount;
import UserInterface.Doctor.WorkAreaForDoctor;
import javax.swing.JPanel;

/**
 *
 * @author meetveera
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel RightPanel, UserAccount account, Organizations organization, Enterprise enterprise, EcoSystem business) {
        return new WorkAreaForDoctor(RightPanel, account,(DoctorOrganization)organization, enterprise, business); //To change body of generated methods, choose Tools | Templates.
    }

 //   @Override
 //   public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organizations organization, Enterprise enterprise, EcoSystem business) {
 //       return new WorkAreaForDoctor(userProcessContainer, account, (DoctorOrganization)organization, enterprise);
 //   }
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
