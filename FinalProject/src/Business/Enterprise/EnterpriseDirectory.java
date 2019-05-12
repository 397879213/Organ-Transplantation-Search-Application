/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Donor.Donor;
import java.util.ArrayList;

/**
 *
 * @author Sanskruti
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriselist;
    
    public EnterpriseDirectory(){
    
        enterpriselist = new ArrayList<>();
        
    } 

    public ArrayList<Enterprise> getEnterpriselist() {
        return enterpriselist;
    }

    public void setEnterpriselist(ArrayList<Enterprise> enterpriselist) {
        this.enterpriselist = enterpriselist;
    }
   /* 
    public Enterprise addEnterprise() {
    Enterprise enterprise=new Enterprise();
    enterpriselist.add(enterprise);
    return enterprise;
    }
    
    
    
    public void removeEnterprise(Enterprise enterprise) {
        enterpriselist.remove(enterprise);
    }
   */
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.TransplantationCenter){
            enterprise=new TCEnterprise(name);
            enterpriselist.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.User){
            enterprise=new UserEnterprise(name);
            enterpriselist.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.InsuranceCompany){
            enterprise= new InsuranceCompany(name);
            enterpriselist.add(enterprise);}
        return enterprise;
    }
}
