/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.Organizations.Organizations.Type;
import java.util.ArrayList;

/**
 *
 * @author Sanskruti
 */
public class OrganizationDirectory 
{
    private ArrayList<Organizations> organizationList;

    public OrganizationDirectory() 
    {
        organizationList=new ArrayList<>();
    }

    public ArrayList<Organizations> getOrganizationList() {
        return organizationList;
    }
    public Organizations createOrganization(Type type)
    {
     Organizations o= null;
     if(type.getValue().equals(Type.Doctor.getValue()))
     {
         o=new DoctorOrganization();
         organizationList.add(o);
     }
      
      else if(type.getValue().equals(Type.Patient.getValue()))
     {
         o=new PatientOrganization();
         organizationList.add(o);
     } 
      else if(type.getValue().equals(Type.Donor.getValue()))
      {
          o=new DonorOrganization();
         organizationList.add(o);
      }
      else if(type.getValue().equals(Type.InsuranceAgent.getValue()))
      {
       o=new InsuranceAgent();
         organizationList.add(o);   
      }
     return o;
    }
}
