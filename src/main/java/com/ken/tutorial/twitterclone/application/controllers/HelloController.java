package com.ken.tutorial.twitterclone.application.controllers;

import com.ken.tutorial.twitterclone.domain.logic.HelloService;
import com.ken.tutorial.twitterclone.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;
    // = new HelloService(); の代わりにアノテーション'@Autowired'でワイヤリングして
    //　インスタンスをDIコンテナからインジェクトしてくれる．

    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }

    @PostMapping("/hello")
    public String postRequest(@RequestParam("text1s")String text1s, Model model) {
        model.addAttribute("sample", text1s);
        return "helloResponse";
    }

    @PostMapping("hello/db")
    public String postDBRequest(@RequestParam("text2s")String text2s, Model model) {
        Integer employeeId = Integer.parseInt(text2s);
        Employee employee = helloService.findOne(employeeId);

        model.addAttribute("employee_id", employee.getEmployeeId());
        model.addAttribute("employee_name", employee.getEmployeeName());
        model.addAttribute("employee_age", employee.getEmployeeAge());

        return "helloDBResponse";
    }
}
