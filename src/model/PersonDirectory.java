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
public class PersonDirectory extends System {
    private Set<Person> personsFullList = new LinkedHashSet<Person>();

    public PersonDirectory() {
    }

    public Set<Person> getPersonsFullList() {
        return personsFullList;
    }

    public void setPersonsFullList(Set<Person> personsFullList) {
        this.personsFullList = personsFullList;
    }
}
