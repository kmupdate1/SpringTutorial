package com.ken.tutorial.twitterclone.login.domain.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class SignUpForm {

    private Integer userId;
    private String password;
    private String name;

    @DateTimeFormat(pattern = "yyyy/mm/dd")
    private Date birthday;

    private Integer age;
    private Boolean marriage;
}
