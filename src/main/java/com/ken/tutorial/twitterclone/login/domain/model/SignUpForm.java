package com.ken.tutorial.twitterclone.login.domain.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SignUpForm {

    private Integer userId;
    private String password;
    private String name;

    @DateTimeFormat(pattern = "yyyy/mm/dd")
    private Date birthday;

    private Integer age;
    private Boolean marriage;

    public Integer getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getMarriage() {
        return marriage;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMarriage(Boolean marriage) {
        this.marriage = marriage;
    }
}
