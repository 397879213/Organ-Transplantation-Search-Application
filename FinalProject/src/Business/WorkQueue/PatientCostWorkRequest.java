/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Sanskruti
 */
public class PatientCostWorkRequest extends WorkRequest{
    private String treatmentCost;

    public String getTreatmentCost() {
        return treatmentCost;
    }

    public void setTreatmentCost(String treatmentCost) {
        this.treatmentCost = treatmentCost;
    }

    
}
