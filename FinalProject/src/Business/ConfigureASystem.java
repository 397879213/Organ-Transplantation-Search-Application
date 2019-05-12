/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Role.SystemAdminRole;
import Business.User.User;
import Business.UserAccount.UserAccount;

/**
 *
 * @author meetveera
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        User user = system.getUserDirectory().createUser("OPTN");       
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("optnadmin", "optnadmin", user, new SystemAdminRole());
        
        return system;
    }
}
