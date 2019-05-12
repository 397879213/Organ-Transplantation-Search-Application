/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author meetveera
 */
public class PatientOrganWorkRequest extends WorkRequest {
    public String Organ;
    public String desease;
    public String deseasetime;
    public String complexity;
    public String teatmentdetails;

    public String getOrgan() {
        return Organ;
    }

    public void setOrgan(String Organ) {
        this.Organ = Organ;
    }

    public String getDesease() {
        return desease;
    }

    public void setDesease(String desease) {
        this.desease = desease;
    }

    public String getDeseasetime() {
        return deseasetime;
    }

    public void setDeseasetime(String deseasetime) {
        this.deseasetime = deseasetime;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    public String getTeatmentdetails() {
        return teatmentdetails;
    }

    public void setTeatmentdetails(String teatmentdetails) {
        this.teatmentdetails = teatmentdetails;
    }
    
    
}
