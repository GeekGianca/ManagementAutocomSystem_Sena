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
public class Users {
    private int idUser;
    private int idEmployee;
    private String username;
    private String password;
    private String typeUser;

    public Users() {
    }

    public Users(int idUser, int idEmployee, String username, String password, String typeUser) {
        this.idUser = idUser;
        this.idEmployee = idEmployee;
        this.username = username;
        this.password = password;
        this.typeUser = typeUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(String typeUser) {
        this.typeUser = typeUser;
    }
    
}
