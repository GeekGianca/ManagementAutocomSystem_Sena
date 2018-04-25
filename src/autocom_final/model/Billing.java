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
public class Billing {
    private int idBilling;
    private String nifProvider;
    private String nifCompany;
    private String idContract;
    private String detail;
    private double totalValue;
    private Date date;

    public Billing() {
    }

    public Billing(int idBilling, String nifProvider, String nifCompany, String idContract, String detail, double totalValue, Date date) {
        this.idBilling = idBilling;
        this.nifProvider = nifProvider;
        this.nifCompany = nifCompany;
        this.idContract = idContract;
        this.detail = detail;
        this.totalValue = totalValue;
        this.date = date;
    }

    public int getIdBilling() {
        return idBilling;
    }

    public void setIdBilling(int idBilling) {
        this.idBilling = idBilling;
    }

    public String getNifProvider() {
        return nifProvider;
    }

    public void setNifProvider(String nifProvider) {
        this.nifProvider = nifProvider;
    }

    public String getNifCompany() {
        return nifCompany;
    }

    public void setNifCompany(String nifCompany) {
        this.nifCompany = nifCompany;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
