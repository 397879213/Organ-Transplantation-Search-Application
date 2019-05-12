/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.Role.InsuranceAdminRole;
import Business.Role.Role;
import Business.Role.UserAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Sanskruti
 */
public class InsuranceAdmin extends Organizations{

    public InsuranceAdmin()  {
        super(Organizations.Type.InsuranceAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceAdminRole());
        return roles;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
