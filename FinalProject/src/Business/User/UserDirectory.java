/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author meetveera
 */
public class UserDirectory {
    private ArrayList<User> userList;

    public UserDirectory() {
        userList = new ArrayList();
    }

    public ArrayList<User> getUserList() {
        return userList;
    }
    
    public User createUser(String name){
        User user = new User();
    //    user.setUsername(name);
    //    user.setPassword(password);
        userList.add(user);
        user.setName(name); 
        return user;
    }
  //  public User authenticateUser(String username, String password){
  //      for (User u : userList){
   //         if (u.getUsername().equals(username) && u.getPassword().equals(password)){
   //             return u;
    //        }
   //     }
    //    return null;
}



