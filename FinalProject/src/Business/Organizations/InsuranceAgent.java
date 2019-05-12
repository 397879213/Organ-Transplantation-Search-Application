/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.Role.InsuranceAdminRole;
import Business.Role.InsuranceAgentRole;
import Business.Role.PatientRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sanskruti
 */
public class InsuranceAgent extends Organizations{

    public InsuranceAgent() {
        super(Organizations.Type.InsuranceAgent.getValue());
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceAgentRole());
        return roles;//To change body of generated methods, choose Tools | Templates.
    }
    
}
