package com.javaone.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class User {

    @RequestMapping("/demo.action")
    public String demo(){
        System.out.println("已进入新世界");
        return "demo";
    }

    @RequestMapping("/user.action")
    public String user(String name, String pwd){
        System.out.println(name+pwd);
        return "demo";
    }
}
