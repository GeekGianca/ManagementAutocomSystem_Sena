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
public class Products {
    private String reference;
    private String name;
    private double price;
    private int itemExistence;

    public Products() {
    }

    public Products(String reference, String name, double price, int itemExistence) {
        this.reference = reference;
        this.name = name;
        this.price = price;
        this.itemExistence = itemExistence;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItemExistence() {
        return itemExistence;
    }

    public void setItemExistence(int itemExistence) {
        this.itemExistence = itemExistence;
    }
}
