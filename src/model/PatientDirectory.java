/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author vigneshguna
 */
public class PatientDirectory extends System{
    
    
    private Set<Patient> patientsFullList = new LinkedHashSet<Patient>();
    private Set<String> patientIdSet = new LinkedHashSet<String>();

    public PatientDirectory() {
        super();
        patientIdSet.add("--Select--");
    }
    
    

    public Set<String> getPatientIdSet() {
        return patientIdSet;
    }

    public void setPatientIdSet(Set<String> patientIdSet) {
        this.patientIdSet = patientIdSet;
    }

    public Set<Patient> getPatientsFullList() {
        return patientsFullList;
    }

    public void setPatientsFullList(Set<Patient> patientsFullList) {
        this.patientsFullList = patientsFullList;
    }
    
    public Patient addNewPatient() {
        Patient patient = new Patient();
        patient.setPatientId(patient.incrementCount());
        // no need to initialise map of encounter/vital here
        
        patientIdSet.add(String.valueOf(patient.getPatientId()));
        
        patientsFullList.add(patient);
        
        return patient;
    }

    public void deletePatient(Patient c) {
        patientsFullList.remove(c);
    }
}
