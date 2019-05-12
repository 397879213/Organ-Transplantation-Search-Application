/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.Organizations;
import Business.UserAccount.UserAccount;
import InsuranceCompany.WorkAreaForInsuranceCompany;
import javax.swing.JPanel;

/**
 *
 * @author Sanskruti
 */
public class InsuranceAgentRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel RightPanel, UserAccount account, Organizations organization, Enterprise enterprise, EcoSystem business) {
        return new WorkAreaForInsuranceCompany(RightPanel, business,organization,account); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
