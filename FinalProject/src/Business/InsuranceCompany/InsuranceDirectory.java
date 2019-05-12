/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InsuranceCompany;

import Business.Enterprise.InsuranceCompany;
import java.util.ArrayList;

/**
 *
 * @author Sanskruti
 */
public class InsuranceDirectory {
    private ArrayList<InsuranceAgent>Companies;

    public InsuranceDirectory() {
        Companies= new ArrayList<>();
    }

    public ArrayList<InsuranceAgent> getCompanies() {
        return Companies;
    }

    public InsuranceAgent createCompany()
    {
        InsuranceAgent i =new InsuranceAgent();
        Companies.add(i);
        return i;
    }
   
    
}
