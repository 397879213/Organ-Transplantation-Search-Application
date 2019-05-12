/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Doctor.Doctor;
import Business.Role.Role;
import Business.Patient.patient;
import Business.Donor.Donor;
import static Business.Enterprise.Enterprise.EnterpriseType.User;
import Business.User.User;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author Sanskruti
 */
public class UserAccount 
{
   
    private String username;
    private String password;
    private Role role;
    private String securityQ;
    private String Phnumb;
    private int val =0;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getPhnumb() {
        return Phnumb;
    }

    public void setPhnumb(String Phnumb) {
        this.Phnumb = Phnumb;
    }

    public String getSecurityQ() {
        return securityQ;
    }

    public void setSecurityQ(String securityQ) {
        this.securityQ = securityQ;
    }

    public String getSecurityA() {
        return securityA;
    }

    public void setSecurityA(String securityA) {
        this.securityA = securityA;
    }
    private String securityA;
    private WorkQueue workQueue;
    private WorkQueue cq;
    private WorkQueue ClaimMoney;
    private User user;
   
    public UserAccount() {
        
        workQueue = new WorkQueue();
        cq= new WorkQueue();
        ClaimMoney =new WorkQueue();
        
    }

    public WorkQueue getClaimMoney() {
        return ClaimMoney;
    }

    public void setClaimMoney(WorkQueue ClaimMoney) {
        this.ClaimMoney = ClaimMoney;
    }

    public WorkQueue getCq() {
        return cq;
    }

    public void setCq(WorkQueue cq) {
        this.cq = cq;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    

    
    
    @Override
    public String toString() {
        return username;
    }
}
