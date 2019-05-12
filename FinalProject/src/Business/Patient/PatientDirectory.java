/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

/**
 *
 * @author meetveera
 */
import java.util.ArrayList;
import java.util.List;
public class PatientDirectory {
    private List<patient> patientlist;
    public PatientDirectory(){
        patientlist = new ArrayList<>();
    }

    public List<patient> getPatientlist() {
        return patientlist;
    }

    public void setPatientlist(List<patient> patientlist) {
        this.patientlist = patientlist;
    }

    public patient addPatient(){
        patient newPatient = new patient();
        patientlist.add(newPatient);
        return newPatient;
    }
    
}
