package com.ken.tutorial.twitterclone.controllers;

import com.ken.tutorial.twitterclone.DAO.UserAccountJDBC;
import com.ken.tutorial.twitterclone.entities.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

@Controller
// @RequestMapping("/user-account")
public class UserAccountController {
    @Autowired
    private UserAccountJDBC userAccountJDBC;

    // @RequestMapping(value = "/user-account-list", method = RequestMethod.GET)
    public String list(Model model) {
        List<UserAccount> userAccountList = userAccountJDBC.getUserList();

        model.addAttribute("userAccount", userAccountList);
        return "list-user-account";
    }

    // @RequestMapping(value = "/new-user-account", method = RequestMethod.GET)
    public String newUserAccount(Model model) {
        model.addAttribute("userAccount", new UserAccount());
        return "user-account-form";
    }

    // @RequestMapping(value = "/add-user-account", method = RequestMethod.POST)
    public String addUserAccount(/*@ModelAttribute("user-account")*/ UserAccount userAccount) {
        Integer userId      = userAccount.getUserId();
        String userPassword = userAccount.getUserPassword();
        String userName     = userAccount.getUserName();
        String userEmail    = userAccount.getUserEmail();

        userAccountJDBC.create(userId, userPassword, userName, userEmail);

        return "redirect:/user-account/user-account-list";
    }

    // @RequestMapping(value = "/view-user-account", method = RequestMethod.GET)
    public String viewUserAccount(/*@RequestParam("user_id")*/Integer userId, Model model) {
        UserAccount userAccount = userAccountJDBC.getUserAccount(userId);
        model.addAttribute("userAccount", userAccount);
        return "user-account-form";
    }
    // @RequestMapping(value = "/delete-user-account", method = RequestMethod.GET)
    public String deleteUserAccount(/*@RequestParam("user_id")*/Integer userId, Model model) {
        userAccountJDBC.deleteUser(userId);
        return "redirect:/user-account/user-list";
    }
}
