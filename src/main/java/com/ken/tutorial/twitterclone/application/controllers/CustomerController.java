package com.ken.tutorial.twitterclone.application.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class CustomerController {

    @RequestMapping("/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", "Hello from spring MVC.");
        return modelAndView;
    }
}
