/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author vigneshguna
 */
public class Person extends House{
    
    private String name;
    private int age;
    /*private String homeAddress;
    private String city;
    private String community;*/
    private long contactDirectory;

    /*public Person(String homeAddress, String community, String city) {
        super(homeAddress, community, city);
    }*/

    public Person() {
        super();
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }*/

    public long getContactDirectory() {
        return contactDirectory;
    }

    public void setContactDirectory(long contactDirectory) {
        this.contactDirectory = contactDirectory;
    }
    
    
    
}
