/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author meetveera
 */
public class patient {
    private String BloodTest;
    private String Xray;
    private String UrineTest;
    private String PER;
    private String ECGReports;

    public String getBloodTest() {
        return BloodTest;
    }

    public void setBloodTest(String BloodTest) {
        this.BloodTest = BloodTest;
    }

    public String getXray() {
        return Xray;
    }

    public void setXray(String Xray) {
        this.Xray = Xray;
    }

    public String getUrineTest() {
        return UrineTest;
    }

    public void setUrineTest(String UrineTest) {
        this.UrineTest = UrineTest;
    }

    public String getPER() {
        return PER;
    }

    public void setPER(String PER) {
        this.PER = PER;
    }

    public String getECGReports() {
        return ECGReports;
    }

    public void setECGReports(String ECGReports) {
        this.ECGReports = ECGReports;
    }
}
