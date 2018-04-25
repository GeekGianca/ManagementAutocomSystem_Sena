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
public class Inventory {
    private int idInventory;
    private String refProduct;
    private String nameProduct;
    private int amountIn;
    private int amountOut;
    private double totalAmountPrice;
    private Date dateIn;

    public Inventory() {
    }

    public Inventory(int idInventory, String refProduct, String nameProduct, int amountIn, int amountOut, double totalAmountPrice, Date dateIn) {
        this.idInventory = idInventory;
        this.refProduct = refProduct;
        this.nameProduct = nameProduct;
        this.amountIn = amountIn;
        this.amountOut = amountOut;
        this.totalAmountPrice = totalAmountPrice;
        this.dateIn = dateIn;
    }

    public int getIdInventory() {
        return idInventory;
    }

    public void setIdInventory(int idInventory) {
        this.idInventory = idInventory;
    }

    public String getRefProduct() {
        return refProduct;
    }

    public void setRefProduct(String refProduct) {
        this.refProduct = refProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getAmountIn() {
        return amountIn;
    }

    public void setAmountIn(int amountIn) {
        this.amountIn = amountIn;
    }

    public int getAmountOut() {
        return amountOut;
    }

    public void setAmountOut(int amountOut) {
        this.amountOut = amountOut;
    }

    public double getTotalAmountPrice() {
        return totalAmountPrice;
    }

    public void setTotalAmountPrice(double totalAmountPrice) {
        this.totalAmountPrice = totalAmountPrice;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }
    
}
