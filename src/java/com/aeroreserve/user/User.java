/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aeroreserve.user;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Epistle
 */
@Entity
@Table(name = "users")
public class User implements Serializable{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String fullName;
    
    @Column(nullable = false)
    private String username;
    
    @Column(nullable = false)
    private String Email;
    
    @Column(nullable = false)
    private String password;
    
    public User( String fullName, String userName, String Email, String password) {
            
            this.fullName = fullName;
            this.username = userName;
            this.Email = Email;
            this.password = password;
        }
    
    public User() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", fullName=" + fullName + ", userName=" + username + ", Email=" + Email + ", password=" + password + '}';
    }
}
