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
public class Access {
    private int userId;
    private Date dateAccess;
    private String ipAccess;
    private boolean isLogued;

    public Access() {
    }

    public Access(int userId, Date dateAccess, String ipAccess, boolean isLogued) {
        this.userId = userId;
        this.dateAccess = dateAccess;
        this.ipAccess = ipAccess;
        this.isLogued = isLogued;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getDateAccess() {
        return dateAccess;
    }

    public void setDateAccess(Date dateAccess) {
        this.dateAccess = dateAccess;
    }

    public String getIpAccess() {
        return ipAccess;
    }

    public void setIpAccess(String ipAccess) {
        this.ipAccess = ipAccess;
    }

    public boolean isIsLogued() {
        return isLogued;
    }

    public void setIsLogued(boolean isLogued) {
        this.isLogued = isLogued;
    }
    
}
