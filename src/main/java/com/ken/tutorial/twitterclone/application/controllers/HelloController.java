package com.ken.tutorial.twitterclone.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }

    @PostMapping("/hello")
    public String postRequest(@RequestParam("text1s")String text1s, Model model) {
        model.addAttribute("sample", text1s);
        return "helloResponse";
    }
}
