/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Doctor.Doctor;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.User.User;
import java.util.ArrayList;

/**
 *
 * @author Sanskruti
 */
public class UserAccountDirectory 
{
private ArrayList<UserAccount> userAccounts;
public UserAccountDirectory()
{
    userAccounts=new ArrayList<>();
}

    public ArrayList<UserAccount> getUserAccounts() {
        return userAccounts;
    }

    public void setUserAccounts(ArrayList<UserAccount> userAccounts) {
        this.userAccounts = userAccounts;
    }
    public UserAccount createUserAccount(String username, String password, Role role)
    {
        UserAccount ua=new UserAccount();
        userAccounts.add(ua);
        //ua.setUser(user);
        ua.setUsername(username);
        ua.setRole(role);
        ua.setPassword(password);
        return ua;
    }
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccounts)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }

    public UserAccount createUserAccount(String username, String password, User user, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setUser(user);
        userAccount.setRole(role);
        userAccounts.add(userAccount);
        return userAccount;
    }
   

    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccounts){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }

}
