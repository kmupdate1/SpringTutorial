package com.ken.tutorial.twitterclone.login.domain.model;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

public class SignUpForm {

    @NotBlank
    private Integer userId;

    @NotBlank
    @Length(min = 6, max = 100)
    @Pattern(regexp = "^[a-zA-Z0-9]+$")
    private String password;

    @NotBlank
    private String name;

    @NotNull
    @DateTimeFormat(pattern = "yyyy/mm/dd")
    private Date birthday;

    @Min(20)
    @Max(100)
    private Integer age;

    @AssertFalse
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
