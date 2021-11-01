/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vigneshguna
 */
public class House extends Community {
    private String homeAddress;

    /*public House(String homeAddress, String community, String city) {
        super(community,  city);
        this.homeAddress = homeAddress;
    }*/

    public House() {
        super();
    }
    
    

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
    
}
