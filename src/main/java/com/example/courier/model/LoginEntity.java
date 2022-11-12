package com.example.courier.model;/*
 * @author gauravverma
 */


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoginEntity {

    @Id
    String email;

    String password;

    LoginEntity(){

    }

    public LoginEntity(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
