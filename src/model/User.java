/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author A S U S
 */
public class User {

    private String username, noTelp, email, password, alamat;
    private int id;

    public User(String username, String noTelp, String email, String password, String alamat) {
        this.username = username;
        this.noTelp = noTelp;
        this.email = email;
        this.password = password;
        this.alamat = alamat;
    }

    public User(int id, String username, String noTelp, String email, String alamat) {
        this.id = id;
        this.username = username;
        this.noTelp = noTelp;
        this.email = email;
//        this.password = password;
        this.alamat = alamat;
    }
    
    public User(String username){
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
