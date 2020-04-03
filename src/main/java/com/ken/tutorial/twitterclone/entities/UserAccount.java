package com.ken.tutorial.twitterclone.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserAccount {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "user_password")
    private String userPassword;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_email")
    private String userEmail;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
