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
public class Employees {
    private int idEmployees;
    private String nifCompany;
    private String name;
    private String lastname;
    private String phone;
    private String homeAdress;
    private String position;

    public Employees() {
    }

    public Employees(int idEmployees, String nifCompany, String name, String lastname, String phone, String homeAdress, String position) {
        this.idEmployees = idEmployees;
        this.nifCompany = nifCompany;
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.homeAdress = homeAdress;
        this.position = position;
    }

    public int getIdEmployees() {
        return idEmployees;
    }

    public void setIdEmployees(int idEmployees) {
        this.idEmployees = idEmployees;
    }

    public String getNifCompany() {
        return nifCompany;
    }

    public void setNifCompany(String nifCompany) {
        this.nifCompany = nifCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
}
