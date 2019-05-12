/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sanskruti
 */
public class DoctorDirectory {
    private ArrayList<Doctor> doctorList;

    public DoctorDirectory() {
        doctorList=new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

public Doctor createDoctor()
{
    Doctor doctor=new Doctor();
    doctorList.add(doctor);
    return doctor;
}
}
