package com.ken.tutorial.twitterclone.login.controller;

import com.ken.tutorial.twitterclone.login.domain.model.SignUpForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class SignUpController {

    private Map<String, Boolean> radioMarriage;

    private Map<String, Boolean> initRadioMarriage() {
        Map<String, Boolean> radio = new LinkedHashMap();
        radio.put("既婚", true);
        radio.put("未婚", false);

        return radio;
    }

    @GetMapping("/signup")
    public String getSignUp(@ModelAttribute SignUpForm form, Model model) {
        radioMarriage = initRadioMarriage();

        model.addAttribute("radioMarriage", radioMarriage);

        return "login/signup";
    }

    /*
    @GetMapping("/singup")
    public String getSignUp(Model model) {
        radioMarriage = initRadioMarriage();
        model.addAttribute("radioMarriage", radioMarriage);

        return "login/signup";
    }
    */

    @PostMapping("/signup")
    public String postSignUp(@ModelAttribute SignUpForm form, BindingResult bindingResult, Model model) {
        if ( bindingResult.hasErrors() ) {
            return getSignUp(form, model);
        }

        System.out.println(form);

        return "redirect:/login";
    }

    /*
    @PostMapping("/signup")
    public String postSignUp(Model model) {

        return "redirect:/login";
    }
     */
}
