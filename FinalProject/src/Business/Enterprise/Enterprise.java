/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organizations.OrganizationDirectory;
import Business.Organizations.Organizations;
import Business.Role.Role;
import java.util.ArrayList;


public abstract class Enterprise extends Organizations {
        
 //   private int id;
 //   private String name;
 //   private ArrayList<String> organlist;
 //   private EnterpriseDirectory enterpriseDir;
    private OrganizationDirectory organizationdir;
 //   private static int counter =1;
    private EnterpriseType enterpriseType;

    public OrganizationDirectory getOrganizationdir() {
        return organizationdir;
    }
    public enum EnterpriseType{
        TransplantationCenter("Transplantation center"),User("User"),InsuranceCompany("Insurance company");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }
     public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    
     
    public Enterprise(String name,EnterpriseType type){
    super(name);
    this.enterpriseType=type;
    organizationdir=new OrganizationDirectory();
   // enterpriseDir = new EnterpriseDirectory();
    }

   /*
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ArrayList<String> getOrganlist() {
        return organlist;
    }

    public void setOrganlist(ArrayList<String> organlist) {
        this.organlist = organlist;
    }

    public String toString()
    {
        return name;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */

}
