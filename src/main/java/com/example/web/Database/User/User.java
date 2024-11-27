package com.example.web.Database.User;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
        
    public User(
            Long id
            , String username
            , String password
            , String firstname
            , String lastname
            , Character status
            , Calendar creationDate
            , String creationUser
            , Calendar updateDate
            , String updateUser
        ) {
            this.id = id;
            this.username = username;
            this.password = password;
            this.firstname = firstname;
            this.lastname = lastname;
            this.status = status;
            this.creationDate = creationDate;
            this.creationUser = creationUser;
            this.updateDate = updateDate;
            this.updateUser = updateUser;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
        
    @Column(nullable = false, unique = true, length = 45)
    private String username;
        
    @Column(nullable = false, length = 64)
    private String password;
        
    @Column(nullable = false, name = "first_name", length = 64)
    private String firstname;

    @Column(nullable = false, name = "last_name", length = 64)
    private String lastname;

    @Column(nullable = false)
    private Character status;

    @Column(nullable = false, name = "creation_date", length = 8)
    private Calendar creationDate;

    @Column(nullable = false, name = "creation_user", length = 45)
    private String creationUser;

    @Column(nullable = false, name = "update_date", length = 8)
    private Calendar updateDate;

    @Column(nullable = false, name = "update_user", length = 45)
    private String updateUser;


    // getters & setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Calendar getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Calendar updateDate) {
        this.updateDate = updateDate;
    }

    public Calendar getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Calendar creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreationUser() {
        return creationUser;
    }

    public void setCreationUser(String creationUser) {
        this.creationUser = creationUser;
    }

}
