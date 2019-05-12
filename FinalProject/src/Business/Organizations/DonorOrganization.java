/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.Role.DonorRole;
import Business.Role.PatientRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sanskruti
 */
public class DonorOrganization extends Organizations{

   public DonorOrganization() {
        super(Organizations.Type.Donor.getValue());
    }

   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DonorRole());
        return roles;
    }
    
    /*public DonorOrganization() {
        super(Organizations.Type.Donor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DonorRole());
        return roles;
    }
    */
}
