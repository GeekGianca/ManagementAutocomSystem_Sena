/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autocom_final.model;

import java.sql.Date;

/**
 *
 * @author Geek-Programmer
 */
public class Contract {
    private int idContract;
    private String nifCompany;
    private String nifProvider;
    private Date dateContract;
    private Date endContract;

    public Contract() {
    }

    public Contract(int idContract, String nifCompany, String nifProvider, Date dateContract, Date endContract) {
        this.idContract = idContract;
        this.nifCompany = nifCompany;
        this.nifProvider = nifProvider;
        this.dateContract = dateContract;
        this.endContract = endContract;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public String getNifCompany() {
        return nifCompany;
    }

    public void setNifCompany(String nifCompany) {
        this.nifCompany = nifCompany;
    }

    public String getNifProvider() {
        return nifProvider;
    }

    public void setNifProvider(String nifProvider) {
        this.nifProvider = nifProvider;
    }

    public Date getDateContract() {
        return dateContract;
    }

    public void setDateContract(Date dateContract) {
        this.dateContract = dateContract;
    }

    public Date getEndContract() {
        return endContract;
    }

    public void setEndContract(Date endContract) {
        this.endContract = endContract;
    }
    
}
