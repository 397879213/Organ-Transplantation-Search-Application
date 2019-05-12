/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donor;

//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import Business.UserAccount.UserAccount;

import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;


/**
 *
 * @author sharw
 */
public class Donor{
    
    private DonorDirectory donordirectory;
    
    private String firstname;
    private String lastname;
    private String DOB;
    private String gender;
    private String SSN;
    private String email;
    private String phoneno;
    private String city;
    private String state;
    private String zipcode;
    private String userName;
    private String typeofDonor;
    private String bloodgroup;
    private String password;
    private String secQ;
    private String secA;
    private ArrayList<String> donororganlist;
    private ArrayList<String> diseaselist;
    
    public Donor(){
        donordirectory= new DonorDirectory();
        donororganlist = new ArrayList<>();
        diseaselist= new ArrayList<>();
    }

    

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    

    public String getTypeofDonor() {
        return typeofDonor;
    }

    public void setTypeofDonor(String typeofDonor) {
        this.typeofDonor = typeofDonor;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public ArrayList<String> getDonororganlist() {
        return donororganlist;
    }

    public void setDonororganlist(ArrayList<String> donororganlist) {
        this.donororganlist = donororganlist;
    }

    public ArrayList<String> getDiseaselist() {
        return diseaselist;
    }

    public void setDiseaselist(ArrayList<String> diseaselist) {
        this.diseaselist = diseaselist;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DonorDirectory getDonordirectory() {
        return donordirectory;
    }

    public void setDonordirectory(DonorDirectory donordirectory) {
        this.donordirectory = donordirectory;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSecQ() {
        return secQ;
    }

    public void setSecQ(String secQ) {
        this.secQ = secQ;
    }

    public String getSecA() {
        return secA;
    }

    public void setSecA(String secA) {
        this.secA = secA;
    }
    
    
    @Override
    public String toString(){
    return userName;
   
    }
    
    
    
}
