/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author vigneshguna
 */
public class Patient {
    private static int count = 0;
    private int patientId;
    private String status;
    private int wardNumber;
    private String attenderName;
    
    private Person person;
    private Map<Encounter, VitalSigns> visit = new LinkedHashMap<Encounter, VitalSigns>();
    
    
    public static int getCount() {
        return count;
    }

    public static int incrementCount() {
        count += 1;
        return count;
    }

    
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getWardNumber() {
        return wardNumber;
    }

    public void setWardNumber(int wardNumber) {
        this.wardNumber = wardNumber;
    }

    public String getAttenderName() {
        return attenderName;
    }

    public void setAttenderName(String attenderName) {
        this.attenderName = attenderName;
    }
    
    

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Map<Encounter, VitalSigns> getVisit() {
        return visit;
    }

    public void setVisit(Map<Encounter, VitalSigns> visit) {
        this.visit = visit;
    }
    
    
}
