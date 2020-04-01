package com.ken.tutorial.twitterclone.controllers;

import com.ken.tutorial.twitterclone.DAO.UserAccountJDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller

public class UserAccountController {
    @Autowired
    private UserAccountJDBC userAccountJDBC;


}
