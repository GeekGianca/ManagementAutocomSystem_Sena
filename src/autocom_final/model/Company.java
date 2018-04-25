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
public class Company {
    private String nif;
    private String bussinesName;
    private String nameP;
    private String lastNameP;
    private String nidP;

    public Company() {
    }

    public Company(String nif, String bussinesName, String nameP, String lastNameP, String nidP) {
        this.nif = nif;
        this.bussinesName = bussinesName;
        this.nameP = nameP;
        this.lastNameP = lastNameP;
        this.nidP = nidP;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getBussinesName() {
        return bussinesName;
    }

    public void setBussinesName(String bussinesName) {
        this.bussinesName = bussinesName;
    }

    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    public String getLastNameP() {
        return lastNameP;
    }

    public void setLastNameP(String lastNameP) {
        this.lastNameP = lastNameP;
    }

    public String getNidP() {
        return nidP;
    }

    public void setNidP(String nidP) {
        this.nidP = nidP;
    }
    
    
}
