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
public class CustomerInvoice {
    private int numPurchase;
    private String refProduct;
    private String nidClient;
    private String typePurchase;
    private double costTotal;
    private String details;
    private Date datePurchase;
    private String title;

    public CustomerInvoice() {
    }

    public CustomerInvoice(int numPurchase, String refProduct, String nidClient, String typePurchase, double costTotal, String details, Date datePurchase, String title) {
        this.numPurchase = numPurchase;
        this.refProduct = refProduct;
        this.nidClient = nidClient;
        this.typePurchase = typePurchase;
        this.costTotal = costTotal;
        this.details = details;
        this.datePurchase = datePurchase;
        this.title = title;
    }

    public int getNumPurchase() {
        return numPurchase;
    }

    public void setNumPurchase(int numPurchase) {
        this.numPurchase = numPurchase;
    }

    public String getRefProduct() {
        return refProduct;
    }

    public void setRefProduct(String refProduct) {
        this.refProduct = refProduct;
    }

    public String getNidClient() {
        return nidClient;
    }

    public void setNidClient(String nidClient) {
        this.nidClient = nidClient;
    }

    public String getTypePurchase() {
        return typePurchase;
    }

    public void setTypePurchase(String typePurchase) {
        this.typePurchase = typePurchase;
    }

    public double getCostTotal() {
        return costTotal;
    }

    public void setCostTotal(double costTotal) {
        this.costTotal = costTotal;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getDatePurchase() {
        return datePurchase;
    }

    public void setDatePurchase(Date datePurchase) {
        this.datePurchase = datePurchase;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
