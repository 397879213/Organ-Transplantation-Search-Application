/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donor;

import Business.Doctor.Doctor;
import java.util.ArrayList;

/**
 *
 * @author sharw
 */
public class DonorDirectory {
    private ArrayList<Donor> donorlist;
    
    public DonorDirectory(){
    
        donorlist = new ArrayList<>();
    } 

    public ArrayList<Donor> getDonorlist() {
        return donorlist;
    }

    public void setDonorlist(ArrayList<Donor> donorlist) {
        this.donorlist = donorlist;
    }
    
    public Donor addDonor() {
    Donor donor=new Donor();
    donorlist.add(donor);
    return donor;
    }
    
    public void removeDonor(Donor donor) {
        donorlist.remove(donor);
    }
    
}
