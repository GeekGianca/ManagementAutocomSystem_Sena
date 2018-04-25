/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autocom_final.model;

/**
 *
 * @author Geek-Programmer
 */
public class Provider {
    private String nif;
    private String cityAdress;
    private String bussinesName;
    private String phone;

    public Provider() {
    }

    public Provider(String nif, String cityAdress, String bussinesName, String phone) {
        this.nif = nif;
        this.cityAdress = cityAdress;
        this.bussinesName = bussinesName;
        this.phone = phone;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getCityAdress() {
        return cityAdress;
    }

    public void setCityAdress(String cityAdress) {
        this.cityAdress = cityAdress;
    }

    public String getBussinesName() {
        return bussinesName;
    }

    public void setBussinesName(String bussinesName) {
        this.bussinesName = bussinesName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
