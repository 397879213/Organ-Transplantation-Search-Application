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
public class DoctorRequestAuthorization extends WorkRequest {
    private String Authorization;

    public String getAuthorization() {
        return Authorization;
    }

    public void setAuthorization(String Authorization) {
        this.Authorization = Authorization;
    }
    
    
}
