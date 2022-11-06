package com.javaone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoAction {
    @RequestMapping("/demo.action")
    public String demo(){
        System.out.println("已访问到服务器");
        return "main";
    }
}
