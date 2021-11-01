/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.util.LinkedHashMap;
import java.util.Map;
import model.Encounter;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.VitalSigns;

/**
 *
 * @author vigneshguna
 */
public class LoadRecord { 
    
    PatientDirectory patientDirectory;
    
    public LoadRecord (PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public void loadAll() {
        /*Blood pressure: 90/60 mm Hg to 120/80 mm Hg.
        Breathing: 12 to 18 breaths per minute.
        Pulse: 60 to 100 beats per minute.
        Temperature: 97.8°F to 99.1°F (36.5°C to 37.3°C); average 98.6°F (37°C)*/
        
        add1();
        add2();
        add3();
        add4();
    }
    
    public void add1() {
        Person p1 = new Person();
        p1.setName("Liu"); p1.setAge(45); p1.setHomeAddress("First Street"); p1.setCity("Boston"); p1.setContactDirectory(976202345); p1.setCommunity("American");
        Encounter e1 = new Encounter(); Encounter e2 = new Encounter(); Encounter e3 = new Encounter(); Encounter e4 = new Encounter();
        e1.setDate("03/21/2020"); e1.setDoctor("Stefan");
        e2.setDate("08/21/2020"); e2.setDoctor("Pal");
        e3.setDate("03/21/2021"); e3.setDoctor("Ramu");
        e4.setDate("08/01/2021"); e4.setDoctor("Stefan");
        VitalSigns v1 = new VitalSigns(); VitalSigns v2 = new VitalSigns(); VitalSigns v3 = new VitalSigns(); VitalSigns v4 = new VitalSigns();
        v1.setBreathing(12); v1.setPulse(65); v1.setTemperature(98); v1.setSystolic(100); v1.setDiastolic(70); v1.setRemarks("Normal"); v1.setBloodPressure(v1.getSystolic()+"/"+v1.getDiastolic()); 
        v2.setBreathing(13); v2.setPulse(70); v2.setTemperature(97.9f); v2.setSystolic(133); v2.setDiastolic(85); v2.setRemarks("High BP Stage 1"); v2.setBloodPressure(v2.getSystolic()+"/"+v2.getDiastolic()); 
        v3.setBreathing(14); v3.setPulse(50); v3.setTemperature(98.2f); v3.setSystolic(85); v3.setDiastolic(55); v3.setRemarks("Pulse very low and Low BP"); v3.setBloodPressure(v3.getSystolic()+"/"+v3.getDiastolic()); 
        v4.setBreathing(15); v4.setPulse(90); v4.setTemperature(100.1f); v4.setSystolic(80); v4.setDiastolic(58); v4.setRemarks("Fever and Low BP"); v4.setBloodPressure(v4.getSystolic()+"/"+v4.getDiastolic()); 
        Map<Encounter, VitalSigns> visit = new LinkedHashMap<Encounter, VitalSigns>();
        visit.put(e1, v1); visit.put(e2, v2); visit.put(e3, v3); visit.put(e4, v4); 
        Patient patient1 = patientDirectory.addNewPatient();
        patient1.setPerson(p1);
        patient1.setVisit(visit);
    }
    public void add2() {
        Person p1 = new Person();
        p1.setName("Joshua"); p1.setAge(21); p1.setHomeAddress("Second Street"); p1.setCity("Boston"); p1.setContactDirectory(9626110636L); p1.setCommunity("Latino");
        Encounter e1 = new Encounter(); Encounter e2 = new Encounter(); Encounter e3 = new Encounter(); Encounter e4 = new Encounter();
        e1.setDate("03/21/2019"); e1.setDoctor("Stefan");
        e2.setDate("08/21/2019"); e2.setDoctor("Pal");
        e3.setDate("03/21/2021"); e3.setDoctor("Pal");
        e4.setDate("08/01/2021"); e4.setDoctor("Stefan");
        VitalSigns v1 = new VitalSigns(); VitalSigns v2 = new VitalSigns(); VitalSigns v3 = new VitalSigns(); VitalSigns v4 = new VitalSigns();
        v1.setBreathing(12); v1.setPulse(65); v1.setTemperature(98); v1.setSystolic(100); v1.setDiastolic(70); v1.setRemarks("Normal"); v1.setBloodPressure(v1.getSystolic()+"/"+v1.getDiastolic()); 
        v2.setBreathing(13); v2.setPulse(70); v2.setTemperature(97.9f); v2.setSystolic(133); v2.setDiastolic(85); v2.setRemarks("High BP Stage 1"); v2.setBloodPressure(v2.getSystolic()+"/"+v2.getDiastolic()); 
        v3.setBreathing(14); v3.setPulse(84); v3.setTemperature(98.2f); v3.setSystolic(85); v3.setDiastolic(55); v3.setRemarks("Low BP"); v3.setBloodPressure(v3.getSystolic()+"/"+v3.getDiastolic()); 
        v4.setBreathing(15); v4.setPulse(90); v4.setTemperature(95.1f); v4.setSystolic(80); v4.setDiastolic(58); v4.setRemarks("Freezing and Low BP"); v4.setBloodPressure(v4.getSystolic()+"/"+v4.getDiastolic()); 
        Map<Encounter, VitalSigns> visit = new LinkedHashMap<Encounter, VitalSigns>();
        visit.put(e1, v1); visit.put(e2, v2); visit.put(e3, v3); visit.put(e4, v4); 
        Patient patient1 = patientDirectory.addNewPatient();
        patient1.setPerson(p1);
        patient1.setVisit(visit);
    }
    public void add3() {
        Person p1 = new Person();
        p1.setName("Mary"); p1.setAge(21); p1.setHomeAddress("Third Street"); p1.setCity("Cambridge"); p1.setContactDirectory(976202345); p1.setCommunity("American");
        Encounter e1 = new Encounter(); Encounter e2 = new Encounter(); Encounter e3 = new Encounter(); Encounter e4 = new Encounter();
        e1.setDate("04/21/2020"); e1.setDoctor("Stefan");
        e2.setDate("09/21/2020"); e2.setDoctor("Stefan");
        e3.setDate("04/21/2021"); e3.setDoctor("Stefan");
        e4.setDate("09/01/2021"); e4.setDoctor("Stefan");
        VitalSigns v1 = new VitalSigns(); VitalSigns v2 = new VitalSigns(); VitalSigns v3 = new VitalSigns(); VitalSigns v4 = new VitalSigns();
        v1.setBreathing(25); v1.setPulse(65); v1.setTemperature(98); v1.setSystolic(100); v1.setDiastolic(70); v1.setRemarks("Hight breathing Stop fearing"); v1.setBloodPressure(v1.getSystolic()+"/"+v1.getDiastolic()); 
        v2.setBreathing(13); v2.setPulse(70); v2.setTemperature(97.9f); v2.setSystolic(133); v2.setDiastolic(85); v2.setRemarks("High BP Stage 1"); v2.setBloodPressure(v2.getSystolic()+"/"+v2.getDiastolic()); 
        v3.setBreathing(14); v3.setPulse(84); v3.setTemperature(98.2f); v3.setSystolic(85); v3.setDiastolic(55); v3.setRemarks("Low BP"); v3.setBloodPressure(v3.getSystolic()+"/"+v3.getDiastolic()); 
        v4.setBreathing(15); v4.setPulse(90); v4.setTemperature(100.1f); v4.setSystolic(80); v4.setDiastolic(58); v4.setRemarks("Fever and Low BP"); v4.setBloodPressure(v4.getSystolic()+"/"+v4.getDiastolic()); 
        Map<Encounter, VitalSigns> visit = new LinkedHashMap<Encounter, VitalSigns>();
        visit.put(e1, v1); visit.put(e2, v2); visit.put(e3, v3); visit.put(e4, v4); 
        Patient patient1 = patientDirectory.addNewPatient();
        patient1.setPerson(p1);
        patient1.setVisit(visit);
    }
    public void add4() {
        Person p1 = new Person();
        p1.setName("Vignesh"); p1.setAge(21); p1.setHomeAddress("Third Street"); p1.setCity("Boston"); p1.setContactDirectory(976202345); p1.setCommunity("American");
        Encounter e1 = new Encounter(); Encounter e2 = new Encounter(); Encounter e3 = new Encounter(); Encounter e4 = new Encounter();
        e1.setDate("04/21/2020"); e1.setDoctor("Pal");
        e2.setDate("09/21/2021"); e2.setDoctor("Stefan");
        VitalSigns v1 = new VitalSigns(); VitalSigns v2 = new VitalSigns();
        v1.setBreathing(25); v1.setPulse(65); v1.setTemperature(98); v1.setSystolic(100); v1.setDiastolic(70); v1.setRemarks("Hight breathing Stop fearing"); v1.setBloodPressure(v1.getSystolic()+"/"+v1.getDiastolic()); 
        v2.setBreathing(13); v2.setPulse(70); v2.setTemperature(97.9f); v2.setSystolic(100); v2.setDiastolic(75); v2.setRemarks("Normal"); v2.setBloodPressure(v2.getSystolic()+"/"+v2.getDiastolic()); 
        Map<Encounter, VitalSigns> visit = new LinkedHashMap<Encounter, VitalSigns>();
        visit.put(e1, v1); visit.put(e2, v2);
        Patient patient1 = patientDirectory.addNewPatient();
        patient1.setPerson(p1);
        patient1.setVisit(visit);
    }
    

}
