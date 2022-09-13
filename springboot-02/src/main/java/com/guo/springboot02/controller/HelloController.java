package com.guo.springboot02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.POST ,value = "/user")
    public String postUser(){
        return "post-user";
    }

    @RequestMapping(method = RequestMethod.DELETE ,value = "/user")
    public String deleteUser(){
        return "post-user";
    }

    @RequestMapping(method = RequestMethod.PUT ,value = "/user")
    public String upDateUSer(){
        return "put-user";
    }

}
