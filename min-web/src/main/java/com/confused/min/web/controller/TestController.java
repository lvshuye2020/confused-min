package com.confused.min.web.controller;


import com.confused.min.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("/getHello")
    @ResponseBody
    public String getHello(){
        return userService.testService();
    }
}
